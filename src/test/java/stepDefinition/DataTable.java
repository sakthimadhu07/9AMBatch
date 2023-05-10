package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTable {
	
	WebDriver driver;
	
	@Given("user reaches the browser url")
	public void user_reaches_the_browser_url() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
	   
	}

	@When("user enters the below credentials:")
	public void user_enters_the_below_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<String> data = dataTable.asList();
		
		
		
		for(int i=0;i<data.size();i++)
		{
			
			WebElement user = driver.findElement(By.id("email"));
			
			user.sendKeys(data.get(i));
			
			Thread.sleep(2000);
			
			user.clear();
			
			
		}
		
		
		
//		WebElement user = driver.findElement(By.id("email"));
//		user.sendKeys(data.get(0));
//	
//		WebElement user = driver.findElement(By.id("email"));
//		user.sendKeys(data.get(1));
		
	   
	}

	@Then("user Reaches the Home page")
	public void user_reaches_the_home_page() {
		
		System.out.println("User Reaches the Home page");
	   
	}

}
