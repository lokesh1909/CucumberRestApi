package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/feature"},
		plugin="json:target/jsonReports/cucm.json",
		glue={"stepDefination"},
		strict = true
		)
public class Testrunner {

}
