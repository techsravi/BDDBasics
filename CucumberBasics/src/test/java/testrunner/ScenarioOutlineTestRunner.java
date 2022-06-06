package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features = {"C:\\Users\\helical\\Desktop\\avi\\CucumberBasics\\src\\test\\java\\features\\loginsenariooutline.feature"},
		glue = {"stepdefinations", "SenarioOutlineSteps"},
		monochrome = true,
		plugin = {"pretty"},
		dryRun=false,
		publish=true
		
		)
public class ScenarioOutlineTestRunner {

}
