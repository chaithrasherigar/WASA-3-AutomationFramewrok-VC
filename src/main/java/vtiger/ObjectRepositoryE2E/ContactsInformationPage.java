package vtiger.ObjectRepositoryE2E;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsInformationPage {
@FindBy(xpath="//span[@class='dvHeaderText']") private WebElement ContactsHeaderText;
public ContactsInformationPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
public WebElement getContactsHeaderText()
{
	return ContactsHeaderText;
}
//Business library
public String getContactsHeader()
{
	return ContactsHeaderText.getText();
}	
}

