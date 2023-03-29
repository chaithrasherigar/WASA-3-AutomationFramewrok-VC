package practice.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePractice 
{
	@FindBy(linkText="Contacts") private WebElement contactsLinkText;
	
	public HomePagePractice(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getContactsLink()
	{
		return contactsLinkText;
	}
	public void clickOnContactsLink()
	{
		contactsLinkText.click();
	}
	
}
