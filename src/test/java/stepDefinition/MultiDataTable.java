package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiDataTable {
	WebDriver driver;
	@Given("User reach the destinated url")
	public void user_reach_the_destinated_url() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	    
	}

	@When("user provides the below credentials")
	public void user_provides_the_below_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
	   
//		WebElement user = driver.findElement(By.id("email"));
//		user.sendKeys(data.get(0).get("username"));
//		
//		WebElement pass = driver.findElement(By.id("pass"));
//		pass.sendKeys(data.get(1).get("password"));
		
		
		for(int i=0;i<data.size();i++)
		{
			
			for(int j=0;j<data.get(i).size();j++)
			{
				
				
				WebElement user = driver.findElement(By.id("email"));
				
				user.sendKeys(data.get(i).get("username"));
				
				WebElement pass = driver.findElement(By.id("pass"));
				pass.sendKeys(data.get(j).get("password"));
				
				Thread.sleep(2000);
				user.clear();
				pass.clear();
				
				break;
				
			}
			
			
		}
		
		
		
		
	}

	@Then("user reached Destinated Home page")
	public void user_reached_destinated_home_page() {
		
		System.out.println("User reached home page");
	    
	}


}
