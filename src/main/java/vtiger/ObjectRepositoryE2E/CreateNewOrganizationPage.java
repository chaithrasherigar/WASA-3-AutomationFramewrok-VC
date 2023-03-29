package vtiger.ObjectRepositoryE2E;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vtiger.GenericUtility.WebDriverUtility;

public class CreateNewOrganizationPage extends WebDriverUtility
{
@FindBy(name="accountname") private WebElement OrgName;
@FindBy(name="industry") private WebElement IndustryDropdwn;
@FindBy(xpath="//input[@title='Save [Alt+S]']") private WebElement SaveBtn;
public CreateNewOrganizationPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getOrgName()
{
	return OrgName;
}
	
public WebElement getSaveBtn()
{
	return SaveBtn;
}
	
//Business library
public void createOrganization(String orgName)
{
	OrgName.sendKeys(orgName);
	SaveBtn.click();
}
	
public void createOrganization(String orgName, String industryType)
{
	OrgName.sendKeys(orgName);
	IndustryDropdwn.click();
   handleDropDown(IndustryDropdwn, industryType);
   SaveBtn.click();
}
	
	
}
