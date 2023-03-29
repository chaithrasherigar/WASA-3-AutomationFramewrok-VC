package vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformationPage 
{

@FindBy(xpath="//span[@class='dvHeaderText']") private WebElement ContactInfo;

//rule3: create constructor to initialize these elements
public OrganizationInformationPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
	public WebElement OrgGetHeader()
	{
		return ContactInfo;
	}
	public String OrggetHeader()
	{
		return ContactInfo.getText();
	}
}
