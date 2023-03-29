package Scenarios_1_5;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import vtiger.GenericUtility.BaseClass;
import vtiger.ObjectRepositoryE2E.ContactsInformationPage;
import vtiger.ObjectRepositoryE2E.ContactsPage;
import vtiger.ObjectRepositoryE2E.CreateNewContactPage;
import vtiger.ObjectRepositoryE2E.HomePage;
@Listeners(vtiger.GenericUtility.ListenersImplementation.class)
public class CreateContactTest extends BaseClass{
	@Test
	public void createContact1() throws EncryptedDocumentException, IOException
	{
		
		
		String LASTNAME = eUtil.readDataFromExcel("Contacts", 4, 3);
		
		
	HomePage hp=new HomePage(driver);
	hp.ClickOnContactsLnk();
	
	ContactsPage cop=new ContactsPage(driver);
	cop.CreateContactLookUpImg();
	
	CreateNewContactPage cnp=new CreateNewContactPage(driver);
	cnp.createNewContact(driver,LASTNAME);
		
	ContactsInformationPage cip=new ContactsInformationPage(driver);
	String contactsHeader=cip.getContactsHeader();
	Assert.assertTrue(contactsHeader.contains(LASTNAME));
	System.out.println("contact created");
	
	//Assert.fail();
	}

}
