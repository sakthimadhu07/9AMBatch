package stepDefinition;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ExampleListener implements IRetryAnalyzer {
	int failures=0;
	int limit=4;
	@Override
	public boolean retry(ITestResult result) {

		if(failures<4)
		{
			failures++;
			return true;
		}
		
		
		return false;
	}

}
