package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OutlineImplementation {
	
WebDriver driver=null;
@Given("user reaches the url")
public void user_reaches_the_url() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
    
}

@When("user enters the username {string} and password {string}")
public void user_enters_the_username_and_password(String uname, String pwd) {
   
	
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys(uname);
	
	WebElement pass = driver.findElement(By.id("pass"));
	
	pass.sendKeys(pwd);
}

@Then("user verifies the Dashboard")
public void user_verifies_the_dashboard() {
	
	System.out.println("User reaches the Dashboard");
    
}



}
