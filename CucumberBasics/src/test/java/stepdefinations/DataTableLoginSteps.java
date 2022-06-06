package stepdefinations;

import java.util.List;
import java.util.Map;

import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class DataTableLoginSteps {
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    
	}

	@When("enter follwing details")
	public void enter_follwing_details(DataTable dataTable) {
	   List<List<String>> data = dataTable.asLists(String.class);
	   for(List<String> d : data) {
		   //System.out.println(d);
		   System.out.println(d.get(0));
	   }
	   
	}
	
	@When("enter maps login details")
	public void enter_maps_login_details(DataTable dataTable) {
	    List<Map<String, String>> list = dataTable.asMaps(String.class,String.class);
	   // System.out.println(list);
	    for(Map<String, String> l : list) {
	    	 System.out.println(l.get("username"));
	    }
	   
	}

	@When("click on login btn")
	public void click_on_login_btn() {
	   
	}

	@Then("Valid tilte as {string}")
	public void valid_tilte_as(String string) {
	  
	}

	@When("Click on logout")
	public void click_on_logout() {
	   
	}

}
