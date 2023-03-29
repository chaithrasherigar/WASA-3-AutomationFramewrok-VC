package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFilePractice 
{
	public static void main(String[] args) throws IOException
	{
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
	Properties pObj=new Properties();
	pObj.load(fis);
	String URL=pObj.getProperty("URL");
	String USERNAME=pObj.getProperty("username");
	System.out.println(URL);
	System.out.println(USERNAME);	
			
	}

}
