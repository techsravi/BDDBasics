package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features = {"C:\\Users\\helical\\Desktop\\avi\\CucumberBasics\\src\\test\\java\\features\\logindiff.feature"},
		glue = {"stepdefinations", "DataTableLoginSteps"},
		monochrome = true,
		plugin = {"pretty"},
		dryRun=false
		
		)
public class DataTableRunner {

}
