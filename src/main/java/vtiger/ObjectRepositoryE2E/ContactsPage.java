package vtiger.ObjectRepositoryE2E;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage
{
@FindBy(xpath="//img[@alt='Create Contact...']") private WebElement CreateContactLookUpImg;

public ContactsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	public WebElement getCreateContactLookUpImg()
	{
		return CreateContactLookUpImg;
	}
	
	
	//Business Library
	
	public void CreateContactLookUpImg()
	{
		CreateContactLookUpImg.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
