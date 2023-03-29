package vtiger.ObjectRepositoryE2E;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsInfoPage 
{
@FindBy(xpath="//span[@class='dvHeaderText']") private WebElement OrgHeaderText;

public OrganizationsInfoPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
public WebElement getOrgHeaderText()
{
	return OrgHeaderText;
}
//Business library
public String getOrgHeader()
{
	return OrgHeaderText.getText();
}
	
}
