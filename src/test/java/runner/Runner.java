package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "/base2/src/test/java/feature/Login.feature", "/base2/src/test/java/feature/ReportIssue.feature" }, glue = {
		"/base2/src/test/java/steps" }, tags = { "@teste" })

public class Runner {

}
