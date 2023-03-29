package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadInfo {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8888");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.linkText("Leads")).click();	
//	driver.findElement(By.xpath("//tr[@class='lvtColData']")).click();
	
	driver.findElement(By.xpath("//a[text()='edit']")).click();
	driver.findElement(By.name("lastname")).sendKeys(" V");
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	}
}
