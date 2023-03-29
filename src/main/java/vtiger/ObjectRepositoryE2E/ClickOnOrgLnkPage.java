package vtiger.ObjectRepositoryE2E;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vtiger.GenericUtility.WebDriverUtility;

public class ClickOnOrgLnkPage extends WebDriverUtility{

	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']") private WebElement OrgLnk;
	
	public ClickOnOrgLnkPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getOrgLnk()
	{
		return OrgLnk;
	}
	public void clickOnOrgLnk()
	{
		OrgLnk.click();
	}
}
