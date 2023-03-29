package vtiger.OrganizationTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import vtiger.GenericUtility.BaseClass;
import vtiger.ObjectRepository.HomePage;
import vtiger.ObjectRepository.OrganizationsPage;
import vtiger.ObjectRepositoryE2E.ClickOnOrgLnkPage;
import vtiger.ObjectRepositoryE2E.CreateNewOrganizationPage;
import vtiger.ObjectRepositoryE2E.OrganizationsInfoPage;

public class CreateOrganizationTest extends BaseClass{
	@Test
	public void CreateOrganization() throws IOException{
		
		String ORGNAME=eUtil.readDataFromExcel("Organizations",4,2)+jUtil.getRandomNumber();
		HomePage hp=new HomePage(driver);
hp.ClickOnOrganizationsLnk();

ClickOnOrgLnkPage cool=new ClickOnOrgLnkPage(driver);
cool.clickOnOrgLnk();

CreateNewOrganizationPage cnop=new CreateNewOrganizationPage(driver);
cnop.createOrganization(ORGNAME);

OrganizationsInfoPage oip=new OrganizationsInfoPage(driver);
String orgHeader=oip.getOrgHeader();
Assert.assertTrue(orgHeader.contains(ORGNAME));
System.out.println("Org created");
}
}		
