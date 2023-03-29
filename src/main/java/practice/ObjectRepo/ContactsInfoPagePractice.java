package practice.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsInfoPagePractice {
@FindBy(xpath="//span[@class='dvHeaderText']") private WebElement ContactsInfoPage;

public ContactsInfoPagePractice(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getContactsInfo()
{
	return ContactsInfoPage;
}

public String contactsInfoPage()
{
	return ContactsInfoPage.getText();
}
}
