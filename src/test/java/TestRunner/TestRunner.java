package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Admin Portal/1Login Page",
		         glue = { "StepDefinitions","Hooks"},
				 plugin = {"pretty","html:target/Cucumber Report/Cucumber.html" }
		)


public class TestRunner {

}
