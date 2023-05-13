package stepDefinition;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DemoSample {
	
	
	
	
	@Test
	public void testOne()
	{
   System.out.println("New changes"); 
		System.out.println("Test One");
		Assert.assertTrue(false);
		
	}
	@Test
	public void testTwo()
	{
		System.out.println("Changes made on remote repository");
		System.out.println("Test Two");
		Assert.assertTrue(false);
	}
}
