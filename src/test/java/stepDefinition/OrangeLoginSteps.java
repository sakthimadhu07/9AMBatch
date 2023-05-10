package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeLoginSteps {
	
	WebDriver driver;
	
	
	@Before("@Regression")   //Tagged hooks 
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
	}
//	
//    @Before(order=1)
//	public void  launch()
//	{
//    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}
	
@Given("User is on orange hrm page")
public void user_is_on_orange_hrm_page() {
	
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
    


@When("User enters the username as {string}")
public void user_enters_the_username_as(String uname) {
 
	driver.findElement(By.name("username")).sendKeys(uname);
}

@When("User enters the password as {string}")
public void user_enters_the_password_as(String pwd) {
    driver.findElement(By.name("password")).sendKeys(pwd);
}

@When("User clicking the login button")
public void user_clicking_the_login_button() {
   driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@Then("User should be successfully on homepage")
public void user_should_be_successfully_on_homepage() {
  
String text = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();

if(text.equals("Dashboard"))
{
	System.out.println("USER IS ON HOME PAGE SUCCESFULLY");
}
else
{
	System.out.println("User is not on home page .. ");
}


}

//@After(order=1)
//public void beforequit()
//{
//	System.out.println("Before tearing down...print this ");
//}

@After("@Regression")
public void quit()
{
	driver.close();
}
}
