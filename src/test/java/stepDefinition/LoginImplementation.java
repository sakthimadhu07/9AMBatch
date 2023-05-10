package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginImplementation {
	
	WebDriver driver;
	@Given("user launches the url")
	public void user_launches_the_url() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
	    
	}

	@When("user enters the username")
	public void user_enters_the_username() {
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("oranium@gmail.com");
		
	}

	@When("user enters the password")
	public void user_enters_the_password() {
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("pass@123");
	    
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
	    
		
		WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		button.click();
	}

	@Then("user lands the Homepage")
	public void user_lands_the_homepage() {
	    
		System.out.println("User successfully lands the Homepage");
		
	}


}
