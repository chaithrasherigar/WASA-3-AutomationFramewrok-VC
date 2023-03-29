package vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage 
{
//rule1 : create pom classes for all web pages
//rule2: identify web elements
	@FindBy(xpath="//span[@class='dvHeaderText']") private WebElement ContactInfo;
	
//rule3: create constructor to initialize these elements
	public ContactInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//rule4: getters to access the elements
	
	
	
	
	
}
