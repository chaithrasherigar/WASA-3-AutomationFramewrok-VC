package vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactsPage
{
// rule 1: create pom page for all web pages
// rule 2: identify web elements
	@FindBy(name="lastname") private WebElement LastNameEdt;
	@FindBy(xpath="//input[@title='Save [Alt+S]']") private WebElement SaveBtn;
	
//rule 3: create constructor for initializing these elements
	public CreateContactsPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//rule 4: getters for accessing the elements
	public WebElement getLastNameEdt()
	{
		return LastNameEdt;
	}
	
	public WebElement getSaveBtn()
	{
		return SaveBtn;
	}
	
//Business Libraries - generic methods specific to current project
		/**
		 * This method will login to app with username and password
		 * @param Username
		 * @param Password
		 */	
public void CreateNewContact(String lastname)
{
	LastNameEdt.sendKeys(lastname);
	SaveBtn.click();
}
	

	
	
}
