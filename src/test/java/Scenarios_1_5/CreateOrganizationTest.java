package Scenarios_1_5;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import vtiger.GenericUtility.BaseClass;
import vtiger.ObjectRepository.CreateOrganizationsPage;
import vtiger.ObjectRepository.OrganizationInformationPage;
import vtiger.ObjectRepository.OrganizationsPage;
import vtiger.ObjectRepositoryE2E.HomePage;
import vtiger.ObjectRepositoryE2E.OrganizationsInfoPage;

public class CreateOrganizationTest extends BaseClass {

	@Test(groups="Smoke")
	public void createOrg() throws EncryptedDocumentException, IOException
	{
		String ORGNAME = eUtil.readDataFromExcel("Contacts", 4, 2) + jUtil.getRandomNumber();
		String LASTNAME = eUtil.readDataFromExcel("Contacts", 4, 3);
		
HomePage hp=new HomePage(driver);
hp.ClickOnOrganizationsLnk();

OrganizationsPage op=new OrganizationsPage(driver);
op.ClickOnCreateOrganizationsBtn();

CreateOrganizationsPage cp=new CreateOrganizationsPage(driver);
cp.CreateNewOrganization(ORGNAME);


OrganizationsInfoPage oip=new OrganizationsInfoPage(driver);
String orgHeader=oip.getOrgHeader();
//if(orgHeader.contains(ORGNAME))
//{
//	System.out.println(orgHeader + "Organizationm created");
//} else {
//System.out.println("Organization not created");
//}

Assert.assertTrue(orgHeader.contains(ORGNAME));
System.out.println("Contact created");


	}

}
