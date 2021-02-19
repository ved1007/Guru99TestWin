package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\PC User1\\Documents\\DevOps\\NPAutomationTest\\letsKodeIt\\Guru99\\src\\main\\java\\Features\\Login.feature",
		glue = { "StepDefinitions" }, plugin = { "pretty", "html:test-outout", "json:json_output/cucumber.json",
				"junit:junit_xml/cucumber.xml" },
		monochrome = true,
		strict = true,
		dryRun = false
//		tags = {"@TC2"}
		)

public class OrangeCRMloginRunner {

}

