package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features = {"C:\\Users\\helical\\Desktop\\avi\\CucumberBasics\\src\\test\\java\\features\\hooks.feature"},
		glue = {"stepdefinations", "HooksSteps"},
		monochrome = true,
		tags = "@Smoke",
		plugin = {"pretty"},
		dryRun=false
		
		)

public class TestRunner {

	
}
