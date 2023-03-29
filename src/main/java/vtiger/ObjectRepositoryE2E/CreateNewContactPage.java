package vtiger.ObjectRepositoryE2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vtiger.GenericUtility.WebDriverUtility;

public class CreateNewContactPage extends WebDriverUtility
{
@FindBy(name="lastname") private WebElement LastNameEdt;
@FindBy(xpath="//input[@title='Save [Alt+S]']") private WebElement SaveBtn;
@FindBy(xpath="//input[@name='account_name']/following-sibling::Img[@title='Select']") private WebElement OrgLookUpImg;
@FindBy(name="search_text") private WebElement searchEdt;
@FindBy(name="search") private WebElement searchBtn;

public CreateNewContactPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
public WebElement getLastNameEdt()
{
	return LastNameEdt;
}
public WebElement getSaveBtn()
{
	return SaveBtn;
}
public WebElement getOrgLookUpImg() {
	return OrgLookUpImg;
}
public WebElement getSearchEdt() {
	return searchEdt;
}
public WebElement getSearchBtn()
{
	return searchBtn;
}

//Business library
public void createNewContact(WebDriver driver,String lastName)
{
	LastNameEdt.sendKeys(lastName);
	SaveBtn.click();
}
	public void createNewContact(WebDriver driver, String lastName, String orgName)
	
	{
		LastNameEdt.sendKeys(lastName);
		OrgLookUpImg.click();
		switchToWindow(driver,"Accounts");
		searchEdt.sendKeys(orgName);
		searchBtn.click();
		driver.findElement(By.xpath("//a[text()='"+orgName+"']")).click();
		switchToWindow(driver,"Contacts");
		SaveBtn.click();
		
	}

	
	
}
