package stepDefinition;

import org.junit.Assert;
import org.testng.annotations.Test;

public class SampleTestCase {
	
	@Test
	public void testCaseOne()
	{
		
		System.out.println("TEst Case One");
		Assert.assertTrue(false);
		System.out.println("Ending of Assertion");
	}
	@Test
	public void testCaseTwo()
	{
		
		System.out.println("Test Case Two");
	}

}
