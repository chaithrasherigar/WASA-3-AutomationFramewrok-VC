package vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//rule 1: create pom pages for all webpages
//rule 2: identify webelements
	@FindBy(linkText="Contacts") private WebElement ContactsBtn;
	@FindBy(linkText="Organizations") private WebElement OrganizationsLnk;
	
//rule 3: create a constructor to initialize the webelements
	public  HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//rule 4: proivde getters to access elements
	
	public WebElement getContactsBtn() {
		return ContactsBtn;
	}
	public WebElement getOrganizationsLnk() 
	{
		return OrganizationsLnk;
	}	
//Business Libraries - generic methods specific to current project
			/**
			 * This method will login to app with username and password
			 * @param Username
			 * @param Password
			 */
public void ClickOnContactsBtn()
{
 ContactsBtn.click();
}
public void ClickOnOrganizationsLnk()
{
	OrganizationsLnk.click();
}

	
	
}
