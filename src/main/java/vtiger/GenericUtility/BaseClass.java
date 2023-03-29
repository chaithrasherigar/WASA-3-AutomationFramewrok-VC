package vtiger.GenericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import vtiger.ObjectRepositoryE2E.HomePage;
import vtiger.ObjectRepositoryE2E.LoginPage;

/**
 * 
 * @author Chaithra
 *
 */
public class BaseClass
{
public static  WebDriver sDriver;
public  PropertyFileUtility pUtil=new PropertyFileUtility();
public ExcelFileUtility eUtil=new ExcelFileUtility();
public WebDriverUtility wUtil=new WebDriverUtility();
public JavaUtility jUtil=new JavaUtility();

public WebDriver driver;

@BeforeSuite	 
	public void bsConfig()
	{
	System.out.println("-----DB connection successful------");
	}
//launching the browser(browser and url)	
@BeforeClass    
    public void bcConfig() throws IOException
    {
	String BROWSER=pUtil.readDataFromPropertyFile("browser");
	String URL=pUtil.readDataFromPropertyFile("URL");
	//Launch browser
	if(BROWSER.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		System.out.println("Browser launched successfully");
	}
	else if(BROWSER.equalsIgnoreCase("firefox"))
	{ 
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		System.out.println("Browser launched successfully");
	}
	else
	{
System.out.println("Browser not launched ");
	}
	sDriver=driver;
	wUtil.maximizeWindow(driver);
	wUtil.waitForPage(driver);
	driver.get(URL);
    }
//Login to appln	
@BeforeMethod  
 public void bmConfig() throws IOException
 {
	String USERNAME=pUtil.readDataFromPropertyFile("username");
	String PASSWORD=pUtil.readDataFromPropertyFile("password");
	LoginPage lp=new LoginPage(driver);
	lp.loginToApp(USERNAME,PASSWORD);
	System.out.println("login successful");
 }
	
@AfterMethod
	public void amConfig()
	{
		HomePage hp=new HomePage(driver);
		hp.LogoutOfApp(driver);
		System.out.println("logout successful");
	}

@AfterClass
public void acConfig()
{
	driver.quit();
	System.out.println("browser closed succesfully");
}

@AfterSuite
public void asConfig()
{
	System.out.println("-----DB CONNECTION SUCCESSFULL-----");
}
	
}
