package vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeOrganizationsLinkPage
{
//rule 1: create pom pages
//rule2: identify web elements
	@FindBy(linkText="Organizations") private WebElement OrganizationsLinkText;
	
//rule3: create constructor for this web element
	public HomeOrganizationsLinkPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//rule4: getters to access web elements
	public WebElement getOrganizationsLinkText()
	{
		return OrganizationsLinkText;
	}
	
	//Business Libraries - generic methods specific to current project
		/**
		 * This method will login to app with username and password
		 * @param Username
		 * @param Password
		 */	
	public void ClickOnOrganizationsLinkText()
	{
		OrganizationsLinkText.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}

