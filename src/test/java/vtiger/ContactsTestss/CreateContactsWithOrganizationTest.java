package vtiger.ContactsTestss;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import vtiger.GenericUtility.BaseClass;
import vtiger.ObjectRepositoryE2E.ContactsInformationPage;
import vtiger.ObjectRepositoryE2E.ContactsPage;
import vtiger.ObjectRepositoryE2E.CreateNewContactPage;
import vtiger.ObjectRepositoryE2E.CreateNewOrganizationPage;
import vtiger.ObjectRepositoryE2E.HomePage;
import vtiger.ObjectRepositoryE2E.OrganizationsInfoPage;
import vtiger.ObjectRepositoryE2E.OrganizationsPage;

public class CreateContactsWithOrganizationTest extends BaseClass
{
	@Test
	public void CreateContactsWithOrganization() throws IOException
	{
		

				/* Read data from excel sheet - Test data */
				String ORGNAME = eUtil.readDataFromExcel("Contacts", 4, 2) + jUtil.getRandomNumber();
				String LASTNAME = eUtil.readDataFromExcel("Contacts", 4, 3);

							
		
		//Click on org link
		HomePage hp=new HomePage(driver);
	    hp.ClickOnOrganizationsLnk();
	    Reporter.log("Click on Org link is successful",true);
        //click on orglookupimg
		OrganizationsPage op=new OrganizationsPage(driver);
		op.ClickOnOrgLookUpImg();
		Reporter.log("Click on Org look up img successful",true);
		
		CreateNewOrganizationPage cnop=new CreateNewOrganizationPage(driver);
		cnop.createOrganization(ORGNAME);
		Reporter.log("Create org is successful");
		
		OrganizationsInfoPage oip=new OrganizationsInfoPage(driver);
		String orgHeader=oip.getOrgHeader();
		Assert.assertTrue(orgHeader.contains(ORGNAME));
		System.out.println(orgHeader+" --- Organization created");
		
		// Step 9: Navigate to contacts Link
		hp.ClickOnContactsLnk();
		Reporter.log("Click on contacts link is successful");
		//Assert.fail();

		// Step 10:Click on create contact look up image
		ContactsPage cp = new ContactsPage(driver);
		cp.CreateContactLookUpImg();
		Reporter.log("Create contact is successful");
		
		// Step 11: Create contact with mandatory fields and save
		CreateNewContactPage cncp = new CreateNewContactPage(driver);
				cncp.createNewContact(driver, LASTNAME, ORGNAME);
		
				// Step 16: Validate for Contacts
				ContactsInformationPage cip = new ContactsInformationPage(driver);
				String ContactHeader = cip.getContactsHeader();
			
				Assert.assertTrue(ContactHeader.contains(LASTNAME));
				System.out.println(ContactHeader+" --- Contact created ");
				                            
					}
		
	}
	
	
