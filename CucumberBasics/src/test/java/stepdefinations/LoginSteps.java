package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginSteps {

	public static WebDriver driver;
	
	@Given("^launch browser$")
	public void launch_browser() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}

	@When("^user opens url$")
	public void user_opens_url() throws Throwable {
		driver.get("https://admin-demo.nopcommerce.com/");
		
	}

	@When("^enter valid username and password$")
	public void enter_valid_username_and_password() throws Throwable {
	  WebElement email =  driver.findElement(By.id("Email"));
	  WebElement password =  driver.findElement(By.id("Password"));
	  email.clear();
	  email.sendKeys("admin@yourstore.com");
	  password.clear();
	  password.sendKeys("admin");
	  
	}

	@When("^click on login$")
	public void click_on_login() throws Throwable {
		 WebElement submitbtn =  driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		 submitbtn.click();
	}

	@Then("^valid page title$")
	public void valid_page_title() throws Throwable {
		Thread.sleep(5000);
	    String e = "Dashboard / nopCommerce administration";
	    String a = driver.getTitle();
	    Assert.assertEquals("Test pass", e, a);
	}

	@When("^click on logout$")
	public void click_on_logout() throws Throwable {
	    WebElement logout = driver.findElement(By.linkText("Logout"));
	    logout.click();
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
	   driver.close();
	}
}
