package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		tags = "@firstfeaturefile", features = "src/test/resources/featurefiles", glue = {
				"stepDefentions","appHooks"}, 
		stepNotifications = true,
		plugin = { "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class TestRunner {

}
