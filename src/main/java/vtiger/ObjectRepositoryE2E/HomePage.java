package vtiger.ObjectRepositoryE2E;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vtiger.GenericUtility.WebDriverUtility;

public class HomePage extends WebDriverUtility
{
@FindBy(linkText="Organizations") private WebElement OrganizationsLnk;
@FindBy(linkText="Contacts") private WebElement ContactsLnk;
@FindBy(linkText="Opportunities") private WebElement OpportunitiesLnk;
@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']") private WebElement AdministratorImg;
@FindBy(linkText="Sign Out") private WebElement SignOutLnk;

public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
public WebElement getOrganizationsLnk() 
{
	return OrganizationsLnk;
}

public WebElement getContactsLnk()
{
	return ContactsLnk;
}

public WebElement getOpportunitiesLnk()
{
	return OpportunitiesLnk;
}

public WebElement getAdministratorImg()
{
	return AdministratorImg;
}

public WebElement getSignOutLnk()
{
	return SignOutLnk;
}

//Business Libraries
public void ClickOnOrganizationsLnk()
{
	OrganizationsLnk.click();
}

public void ClickOnContactsLnk()
{
	ContactsLnk.click();
}

public void ClickOnOpportunitiesLnk()
{
	OpportunitiesLnk.click();
}

public void LogoutOfApp(WebDriver driver)
{
	mouseHoverAction(driver, AdministratorImg);
	SignOutLnk.click();
}


}
