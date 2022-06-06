package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features = {"C:\\Users\\helical\\Desktop\\avi\\CucumberBasics\\src\\test\\java\\features\\registration.feature"},
		glue = {"stepdefinations"},
		monochrome = true,
		plugin = {"pretty"}
		
		)
public class DataTable {

	
}
