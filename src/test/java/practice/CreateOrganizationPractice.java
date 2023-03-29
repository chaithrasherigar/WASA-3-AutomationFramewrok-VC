package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateOrganizationPractice {

	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8888");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.linkText("Organizations")).click();
	driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	//driver.findElement(By.name("Organization Name")).sendKeys("PSPIDERS");
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Z2");
	WebElement dd=driver.findElement(By.xpath("//select[@name='industry']"));
	Select s=new Select(dd);
	s.selectByVisibleText("Energy");
	WebElement dd2=driver.findElement(By.xpath("//select[@name='accounttype']"));
	Select s1=new Select(dd2);
	s.selectByVisibleText("Customer");
	
	
	
	
driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
String element=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
if(element.contains("Z2"))
{
	System.out.println(element+"pass");
}
else
{
	System.out.println("fail");
}

WebElement ele=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
	driver.findElement(By.linkText("Sign Out")).click();
	System.out.println("signout successful");
	
	
	}

}
