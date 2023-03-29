package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SearchleadUsingFirstname {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.name("user_name")).sendKeys("admin");
	    driver.findElement(By.name("user_password")).sendKeys("admin");
	    driver.findElement(By.id("submitButton")).click();
	
	    
	    /***
	   // driver.findElement(By.xpath("//img[@src='themes/images/arrow_down_black.png']")).click();
	   driver.findElement(By.xpath("//a[@href='javascript:void(0);']")).click();
	    WebElement searchbutton=driver.findElement(By.xpath("//input[@class='searchBox']"));
	    Actions a= new Actions(driver);
	    a.moveToElement(searchbutton).perform();
	    
	    WebElement dropdown=driver.findElement(By.xpath("//img[@src='themes/images/arrow_down_black.png']"));
	    Select s=new Select(dropdown);
	    s.selectByVisibleText("Leads");
	    driver.findElement(By.xpath("//input[@value='Apply']")).click();
	    driver.findElement(By.xpath("//input[@title='Find']")).click();	
	}
}
// unable to mouse hover on search tab and click on drop down 24 line onwards
**/
	    
	    driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.name("search_text")).sendKeys("Guru");
       // WebElement dropdown=driver.findElement(By.xpath("//div[@id='basicsearchcolumns_real']"));
	    //Select s=new Select(dropdown);
	    //s.selectByIndex(2);
       driver.findElement(By.xpath("//div[@id='basicsearchcolumns_real']")).click();
	    driver.findElement(By.xpath("//option[@value='lastname']")).click();
	    driver.findElement(By.xpath("//input[@value=' Search Now ']")).click();
	}
}
	    