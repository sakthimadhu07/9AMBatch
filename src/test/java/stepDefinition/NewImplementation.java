package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewImplementation {
	WebDriver driver;
	@Given("user navigates the url")
	public void user_navigates_the_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

	@When("user enter the username {string}")
	public void user_enter_the_username(String username) {
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(username);
	}

	@When("user enter the password {string}")
	public void user_enter_the_password(String pwd) {
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(pwd);

	}

	@When("user click the login button")
	public void user_click_the_login_button() {

		WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));

		login.click();
	}

	@Then("user verify the Home page")
	public void user_verify_the_home_page() {

		System.out.println("user verifies the home page");    
	}	

}
