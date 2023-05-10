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
public class ListImplementation {
	WebDriver driver;
	@Given("user lands the url")
	public void user_lands_the_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	@When("user enter the below credentials:")
	public void user_enter_the_below_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

//	List<String> data = dataTable.asList();
//	
//	for(int i=0;i<data.size();i++)
//	{
//		
//		WebElement user = driver.findElement(By.id("email"));
//		user.sendKeys(data.get(i));
//		Thread.sleep(2000);
//		user.clear();
//		
//		
//		
//		
//	}
	
		
		List<List<String>> data = dataTable.asLists();
	
//		List<String> l = data.get(0);
//		
//			driver.findElement(By.id("email")).sendKeys(l.get(0));
//			
//			driver.findElement(By.id("pass")).sendKeys(l.get(1));
//			
		
		System.out.println("To Print all the Datas");
		
		for(int i=0;i<data.size();i++)
		{
			
			
			for(int j=0;j<data.get(i).size();j++)
			{
				
				
		//		System.out.println(data.get(i).get(j));
			
			
			//driver.findElement(By.id("email")).sendKeys(data.get(i).get(j));
			
			}
		}
		
		
		
		
	}

	@Then("user visits the home page")
	public void user_visits_the_home_page() {
		System.out.println("user lands the home page");
	}
}