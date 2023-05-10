package stepDefinition;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	public void onTestStart(ITestResult result) {

		System.out.println("execute");

	}


	public void onTestSuccess(ITestResult result) {
		System.out.println(" success");
	}


	public void onTestFailure(ITestResult result) {
		System.out.println("failure");
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped");
	}





	public void onStart(ITestContext context) {
		System.out.println("on start");
	}


	public void onFinish(ITestContext context) {
		System.out.println("On Finish");
	}




}
