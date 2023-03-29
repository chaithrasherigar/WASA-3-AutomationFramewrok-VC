package vtiger.GenericUtilityPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtilityPractice 
{
	public String readDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fisp=new FileInputStream(IConstantsUtilityPractice.propertyFilePath);
		Properties property=new Properties();
		property.load(fisp);
		String value=property.getProperty(key);
		return value;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
