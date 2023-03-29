package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPractice2 
{

	@Test()
	public void createUser()
	{
		System.out.println("created");
		Assert.fail();
	}
	@Test()
	public void updateUser()
	{
		System.out.println("updated");
	}
	
	@Test(dependsOnMethods="createUser")
	public void deleteUser()
	{
		System.out.println("deleted");
	}

	
}
