package vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vtiger.GenericUtility.WebDriverUtility;

public class CreateOrganizationsPage extends WebDriverUtility{
@FindBy(xpath="//input[@name='accountname']") private WebElement OrganizationNameEdt;
@FindBy(xpath="//input[@title='Save [Alt+S]']") private WebElement SaveBtn;
@FindBy(xpath="//select[@name='accounttype']") private WebElement Type;

public CreateOrganizationsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getOrganizationNameEdt()
{
	return OrganizationNameEdt;
}
public WebElement getType()
{
	return Type;
}
//Business Libraries - generic methods specific to current project
	/**
	 * This method will login to app with username and password
	 * @param Username
	 * @param Password
	 */

public void CreateNewOrganization(String OrgName)
{
	OrganizationNameEdt.sendKeys(OrgName);
	SaveBtn.click();
}
public void CreateNewOrganization(String OrgName, int ttype)
{
	OrganizationNameEdt.sendKeys(OrgName);
	Type.click();
	handleDropDown(Type, ttype);
	SaveBtn.click();
}
}
