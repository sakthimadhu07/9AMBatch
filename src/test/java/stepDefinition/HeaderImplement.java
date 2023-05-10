package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import io.cucumber.java.en.Given;

public class HeaderImplement {
	
	@Given("User passes the values")
	public void user_passes_the_values(io.cucumber.datatable.DataTable data) {
	  
		Map<String, String> asMap = data.asMap();
		String nameval = asMap.get("nam");
		
		System.out.println(nameval);
	}
	

@Given("Check with multiple  columns of headers")
public void check_with_multiple_columns_of_headers(io.cucumber.datatable.DataTable cred) 
{

	List<Map<String, String>> asMaps = cred.asMaps();
	
	for(Map<String,String> a:asMaps)
	{
		for(Entry<String, String> e:a.entrySet())
		{
			if(e.getKey().equals("Age"))
			{
				System.out.println(e.getValue());
			}
		}
	}
}



}
