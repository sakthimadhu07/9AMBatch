package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		
		
	features = "C:\\Users\\91807\\eclipse-workspace\\NewDemo\\DemoCucumber\\src\\test\\resources\\Features\\orangehrmlogin.feature",
	glue= {"stepDefinition"},
	plugin = { "pretty", "html:target/cucumber-reports/report.HTML",
			
			"json:target/cucumber-reports/Cucumber.json",
			
			"junit:target/cucumber-reports/Cucumber.xml"
	},
	publish=true,
	monochrome = true, 
	dryRun = false, 
tags="not @Regression"
		
		
		)

public class TestRunner {

}
