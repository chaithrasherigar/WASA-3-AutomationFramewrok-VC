package practice;

import org.testng.annotations.Test;

public class ReadDataFromCmdLine
{
@Test
public void readData()
{
	String BROWSER=System.getProperty("browser");
	System.out.println(BROWSER);
	
	String URL=System.getProperty("url");
	System.out.println(URL);
	
	String UN=System.getProperty("username");
	System.out.println(UN);
	
	String PW=System.getProperty("password");
	System.out.println(PW);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
