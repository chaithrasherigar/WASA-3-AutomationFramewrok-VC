package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice 
{

	@Test(dataProvider="phone1")
	public void dataProviderPractice(String phone,int price)
	{
		System.out.println(phone+"------"+price);
	}
	
	@DataProvider(name="phone")
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="samsung";
		data[0][1]=1200;
		data[1][0]="Iphone";
		data[1][1]=9000;
		data[2][0]="nokia";
		data[2][1]=1000;
		
		return data;
		
	}
	
	@DataProvider(name="electronics")
	public Object[][] getData1()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="mixie";
		data[0][1]=1200;
		data[1][0]="tv";
		data[1][1]=9000;
		data[2][0]="nokia";
		data[2][1]=1000;
		
		return data;
	}
	
	}
