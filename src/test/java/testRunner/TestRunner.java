package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		plugin = {"pretty", "html:test-output"},
		features="src/test/java/features/Objectives.feature", 
		glue="stepDefinitions",
		dryRun=true,
		monochrome=true
		)
public class TestRunner {

}
