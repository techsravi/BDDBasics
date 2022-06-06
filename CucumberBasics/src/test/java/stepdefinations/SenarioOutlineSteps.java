package stepdefinations;

import io.cucumber.java.en.*;

public class SenarioOutlineSteps {

	@Given("user is on login page in firefox browser")
	public void user_is_on_login_page_in_firefox_browser() {
	   System.out.println("User is on login page");
	}

	@When("enter username as {string}")
	public void enter_username_as(String string) {
	   System.out.println("Enter username : "+string);
	}

	@When("enter password as {string}")
	public void enter_password_as(String string) {
		 System.out.println("Enter password : "+string);
	}

	@When("click signin btn")
	public void click_signin_btn() {
		 System.out.println("Click on Signin");
	}
}
