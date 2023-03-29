package practice.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vtiger.GenericUtilityPractice.WebDriverUtilityPractice;

public class CreatingNewContactsPage extends WebDriverUtilityPractice{
@FindBy(name="lastname") private WebElement Lastnametf;
@FindBy(name="leadsource") private WebElement Leadsourcedd;
@FindBy(xpath="//input[@title='Save [Alt+S]']") private WebElement SaveBtn;
public CreatingNewContactsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getLastnametf()
{
	return Lastnametf;
}
public WebElement getSaveBtn()
{
	return SaveBtn;
}
public WebElement getLeadsourcedd()
{
	return Leadsourcedd;
}
public void CreateNewContact(String lastname, int index)
{
	Lastnametf.sendKeys(lastname);
	Leadsourcedd.click();
	handleDropDown(Leadsourcedd,index);
	 SaveBtn.click();
}





}


