package vtiger.GenericUtilityPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverUtilityPractice 
{
  public void maximizeWindow(WebDriver driver)
  {
	  driver.manage().window().maximize();  
  }
public void minimizeWindow(WebDriver driver)
{
	driver.manage().window().minimize();
}
public void waitForPage(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
public void waitForElementToBeVisible(WebDriver driver, WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(element));
}
public void waitForElementToBeClickable(WebDriver driver, WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(element));
}
	
public void handleDropDown(WebElement element, int index)
{
	Select s=new Select(element);
	s.selectByIndex(index);
}
public void handleDropDown(WebElement element, String value)
{
	Select s=new Select(element);
	s.selectByValue(value);
}
public void handleDropDown (String value, WebElement element)
{
	Select s=new Select(element);
	s.selectByVisibleText(value);
}
public void mouseHover(WebDriver driver,WebElement ele)
{
	Actions a= new Actions(driver);
	a.moveToElement(ele).perform();
}
public void clickOnElement(WebDriver driver, WebElement ele)
{
	Actions a =new Actions(driver);
	a.contextClick(ele).perform();
}
public void doubleClick(WebDriver driver, WebElement ele)
{
	Actions a =new Actions(driver);
	a.doubleClick(ele).perform();
}
public void dragAndDrop(WebDriver driver, WebElement src, WebElement dest)
{
	Actions a =new Actions(driver);
a.dragAndDrop(src, dest).perform();
}

public void acceptAlert(WebDriver driver)
{
driver.switchTo().alert().accept();
}
public void dismissAlert(WebDriver driver)
{
	driver.switchTo().alert().dismiss();
}
public void getAlertText(WebDriver driver)
{
	driver.switchTo().alert().getText();
}

public void handleFrame(WebDriver driver, int index)
{
	driver.switchTo().frame(index);
}
public void handleFrame(WebDriver driver, String nameOrID)
{
	driver.switchTo().frame(nameOrID);
}
public void handleFrame(WebDriver driver, WebElement element)
{
	driver.switchTo().frame(element);
}
	public void switchToFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	public void switchToDefaultFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
public void switchToWindow(WebDriver driver, String partialWinTitle)
{
	Set<String>	winIDs=driver.getWindowHandles();
	for(String win:winIDs)
	{
		String winTitle=driver.switchTo().window(win).getTitle();
	if(winTitle.contains(partialWinTitle))
	{
		break;
	}
	}
	}
	
	/**
	 * takes screenshot and save it in req folder
	 * @param driver
	 * @param screenshotName
	 * @return
	 * @throws IOException
	 */
	public String takesScreenShot(WebDriver driver, String screenshotName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(".\\Screenshots\\"+screenshotName+".png");
		Files.copy(src,dst);
		return dst.getAbsolutePath();
		}
	
	
	public void scrollAction(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)"," ");	
	}
	
	public void scrollAction(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		int y=element.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")",element);	
	}
	
	
}
	
	
	
	
	