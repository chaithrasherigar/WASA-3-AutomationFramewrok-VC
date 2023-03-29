package practice;

import org.testng.annotations.Test;

public class TestNGPractice {

	@Test(priority=1, invocationCount=1)
	public void SampleTestNGScript()
	{
		System.out.println("1");
	}
	
	@Test(enabled=false)
	public void SampleTestNGScript2()
	{
		System.out.println("2");
	}
	
	@Test(priority=-1, invocationCount=0)
	public void SampleTestNGScript3()
	{
		System.out.println("-1");
	}
	
	@Test(priority=0)
	public void Sample()
	{
		System.out.println("no");
	}
}
