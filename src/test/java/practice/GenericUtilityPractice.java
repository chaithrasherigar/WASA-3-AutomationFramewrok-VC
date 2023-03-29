package practice;

import java.io.IOException;

import vtiger.GenericUtility.ExcelFileUtility;
import vtiger.GenericUtility.JavaUtility;
import vtiger.GenericUtility.PropertyFileUtility;

public class GenericUtilityPractice {

	public static void main(String[] args) throws IOException {
	
	PropertyFileUtility pUtil=new PropertyFileUtility();
	String URL=pUtil.readDataFromPropertyFile("URL");
	System.out.println(URL);
	String BROWSER=pUtil.readDataFromPropertyFile("browser");
	System.out.println(BROWSER);
	String USERNAME=pUtil.readDataFromPropertyFile("username");
	System.out.println(USERNAME);
	String PASS=pUtil.readDataFromPropertyFile("password");
	System.out.println(PASS);
	
	
	
	ExcelFileUtility eUtil=new ExcelFileUtility();
	String value =eUtil.readDataFromExcel("Contacts",4,2);
	System.out.println(value);

	System.out.println(eUtil.getRowCount("Contacts"));
	eUtil.writeDataIntoExcel("Contacts", 4, 6,"Batman");
	
	JavaUtility jUtil=new JavaUtility();
	System.out.println(jUtil.getSystemDate());
	System.out.println(jUtil.getSystemDateInFormat());
	
	}

}
