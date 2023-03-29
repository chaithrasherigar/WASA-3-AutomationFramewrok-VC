package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindDuplicateLead {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8888");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.xpath("//img[@src='themes/images/findduplicates.gif']")).click();
	driver.findElement(By.xpath("//option[text()='Last Name']"));
	driver.findElement(By.xpath("//input[@name='Button']")).click();
	driver.findElement(By.xpath("//input[@value='Find Duplicates']")).click();
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@class='crmbutton small edit']")).click();	
	}
}

////not able to select the checkbox of leads and perform merge opertaion