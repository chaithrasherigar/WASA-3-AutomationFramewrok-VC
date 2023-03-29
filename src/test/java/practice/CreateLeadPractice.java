package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateLeadPractice {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8888/");
driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
driver.findElement(By.id("submitButton")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
driver.findElement(By.name("lastname")).sendKeys("Guru");
driver.findElement(By.name("company")).sendKeys("QSP");
driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

String ele=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
System.out.println(ele);
	if(ele.contains("Guru"))
	{
		System.out.println(ele+"--pass--");
	}
	else
	{
		System.out.println("--fail--");
	}
	
WebElement e=	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	Actions a=new Actions(driver);
	a.moveToElement(e).perform();
	driver.findElement(By.linkText("Sign Out")).click();
	System.out.println("signout successful");
	
	}

}
