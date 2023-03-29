package vtiger.ContactsTestss;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
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

import practice.ObjectRepo.BaseClassPractice;
import practice.ObjectRepo.ContactsInfoPagePractice;
import practice.ObjectRepo.ContactsPagePractice;
import practice.ObjectRepo.CreatingNewContactsPage;
import practice.ObjectRepo.HomePagePractice;
import vtiger.ObjectRepositoryE2E.HomePage;

public class CreateContactsTest extends BaseClassPractice{

	@Test
public void createContacts() throws EncryptedDocumentException, IOException
{
		String ORGNAME = e.readDataFromExcelFileUtilityPractice("Contacts", 4, 2) + j.getRandomNum();
		String LASTNAME = e.readDataFromExcelFileUtilityPractice("Contacts", 4, 3);


	HomePagePractice hp=new HomePagePractice(driver);
hp.clickOnContactsLink();
ContactsPagePractice cp=new ContactsPagePractice(driver);
cp.clickOnContactsCreationImg();
CreatingNewContactsPage cn=new CreatingNewContactsPage(driver);
cn.CreateNewContact(LASTNAME, 2);

ContactsInfoPagePractice cip=new ContactsInfoPagePractice(driver);
String contactHeader=cip.contactsInfoPage();
Assert.assertTrue(contactHeader.contains(LASTNAME));
System.out.println(contactHeader+" --- Contact created ");
}
}