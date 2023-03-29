package practice.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPagePractice
{
@FindBy(xpath="//img[@alt='Create Contact...']")  private WebElement ContactsCreationImg;

public ContactsPagePractice(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getContactsCreationImg()
{
	return ContactsCreationImg;
}

public void clickOnContactsCreationImg()
{
	ContactsCreationImg.click();
}



















}
