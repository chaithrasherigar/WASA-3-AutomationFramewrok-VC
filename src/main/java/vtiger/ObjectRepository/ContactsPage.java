package vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage 
{
//rule 1: create pom pages for all webpages
//rule 2: identify web elements using @FindBy, @FindBys, @FindAll
	@FindBy(xpath="//img[@alt='Create Contact...']") private WebElement CreateContactsBtn;
	
//rule 3: create a constructor for initializing these web elements
	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//rule 4: getters for accessing the elements
	public WebElement getCreateContactsBtn()
	{
		return CreateContactsBtn;
	}

//Business Libraries - generic methods specific to current project
			/**
			 * This method will login to app with username and password
			 * @param Username
			 * @param Password
			 */
public void ClickOnCreateContactBtn()
{
	CreateContactsBtn.click();
}
	
	
}
