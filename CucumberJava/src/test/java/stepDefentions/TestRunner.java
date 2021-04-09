package stepDefentions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		tags = "@firstfeaturefile", features = "src/test/resources/featurefiles", glue = {
				"stepDefentions" }, monochrome = true, plugin = { "pretty",
						"json:target/reprots/jsonreport/report.json" })

public class TestRunner {

}
