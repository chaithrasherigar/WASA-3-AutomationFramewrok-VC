package practice.ObjectRepo;

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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import vtiger.GenericUtilityPractice.ExcelFileUtilityPractice;
import vtiger.GenericUtilityPractice.JavaUtilityPractice;
import vtiger.GenericUtilityPractice.PropertyFileUtilityPractice;
import vtiger.GenericUtilityPractice.WebDriverUtilityPractice;

public class BaseClassPractice 
{

public	PropertyFileUtilityPractice p=new PropertyFileUtilityPractice();
public	ExcelFileUtilityPractice e=new ExcelFileUtilityPractice();
public	WebDriverUtilityPractice w=new WebDriverUtilityPractice();
public	JavaUtilityPractice j=new JavaUtilityPractice();
public static WebDriver sDriver;	//listener
public WebDriver driver;

@BeforeSuite (groups={"SmokeSuite","RegressionSuite"})
public void bs()
{
	System.out.println("-----DB connection successful------");
}

//@Parameters("browser")
@BeforeClass(groups={"SmokeSuite","RegressionSuite"})
//@BeforeTest
public void bc(/*String BROWSER*/) throws IOException
{
	String BROWSER=p.readDataFromPropertyFile("browser");
	String URL= p.readDataFromPropertyFile("URL");
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
		sDriver=driver; //listeners
		w.maximizeWindow(driver);
		w.waitForPage(driver);
		driver.get(URL);
	    }
	

	
@BeforeMethod(groups={"SmokeSuite","RegressionSuite"})
public void bm() throws IOException
{
	String USERNAME=p.readDataFromPropertyFile("username");
	String PASSWORD=p.readDataFromPropertyFile("password");
	LoginPagePractice lp=new LoginPagePractice(driver);
	lp.LoginToApp(USERNAME, PASSWORD);
	System.out.println("login successful");
}


@AfterMethod(groups={"SmokeSuite","RegressionSuite"})
public void am()
{
	
	System.out.println("logout successful");
}

@AfterClass (groups={"SmokeSuite","RegressionSuite"})
public void ac()
{
	driver.quit();
	System.out.println("browser closed succesfully");
}

@AfterSuite	(groups={"SmokeSuite","RegressionSuite"})
public void as()
{
	System.out.println("-----DB connection successful------");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
