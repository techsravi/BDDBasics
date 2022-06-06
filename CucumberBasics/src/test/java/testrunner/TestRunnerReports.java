package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features = {"C:\\Users\\helical\\Desktop\\avi\\CucumberBasics\\src\\test\\java\\features\\hooks.feature"},
		glue = {"stepdefinations", "HooksSteps"},
		monochrome = true,
		tags = "@Smoke",
		plugin = {"pretty", "json:target/cucmber-report.json","junit:target/cucmber-report.xml"},
		dryRun=false
		
		)

public class TestRunnerReports {
	
}
