package practice.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePractice 
{
@FindBy(name="user_name") private WebElement usernametf;
@FindBy(name="user_password") private WebElement passwordtf;
@FindBy(id="submitButton") private WebElement submitBtn;

public LoginPagePractice(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
	public WebElement getusernametf()
	{
		return usernametf;
	}
	public WebElement getpasswordtf()
	{
		return passwordtf;
	}
	public WebElement getsubmitbtn()
	{
		return submitBtn;
	}
	
	public void LoginToApp(String un, String pw)
	{
		usernametf.sendKeys(un);
		passwordtf.sendKeys(pw);
		submitBtn.click();
	}
	
}
