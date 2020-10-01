package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
					//features=".//Features/Login.feature",
					//features=".//Features/Customers.feature",
					features=".//Features/", 					//runs all freature file present in project
					//features= {".//Features/Login.feature", ".//Features/Customers.feature"},
					glue="stepDefinitions",
					dryRun=false,
					monochrome=true,
					plugin= {
			                "pretty","html:Reports/test.html",
			                "json:Reports/json_output",
			                "junit:Reports/cucum.xml"},
					tags= "@sanity or @regression"
				)


public class TestRun {

}
