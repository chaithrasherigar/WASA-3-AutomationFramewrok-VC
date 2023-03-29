package Scenarios_1_5;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import vtiger.GenericUtility.BaseClass;
import vtiger.GenericUtility.ExcelFileUtility;
import vtiger.GenericUtility.JavaUtility;
import vtiger.GenericUtility.PropertyFileUtility;
import vtiger.GenericUtility.WebDriverUtility;
import vtiger.ObjectRepository.CreateOrganizationsPage;
import vtiger.ObjectRepository.HomePage;
import vtiger.ObjectRepository.OrganizationInformationPage;
import vtiger.ObjectRepository.OrganizationsPage;

public class CreateOrgWith1DropDownTest extends BaseClass
{
	@Test
	public void createOrgwith1dd() throws EncryptedDocumentException, IOException
	{
		//create object of all utilities
		
		//read data from excel file
		String ORGNAME=eUtil.readDataFromExcel("Organizations", 1, 2)+jUtil.getRandomNumber();
		
		HomePage hp=new HomePage(driver);
		hp.ClickOnOrganizationsLnk();
		
		OrganizationsPage op=new OrganizationsPage(driver);
		op.ClickOnCreateOrganizationsBtn();
		
		CreateOrganizationsPage cop=new CreateOrganizationsPage(driver);
		int ttype = 2;
		cop.CreateNewOrganization(ORGNAME, ttype);
		
		OrganizationInformationPage oip=new OrganizationInformationPage(driver);
		String orgHeader=oip.OrggetHeader();
		Assert.assertTrue(orgHeader.contains(ORGNAME));
		System.out.println("org created");
		
	}
}
