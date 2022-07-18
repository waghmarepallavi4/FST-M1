package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/main/java/features/Activity6.feature",
    glue = {"stepDefinitions"},
    tags = "@SmokeTest",
    plugin = {"pretty","html: test-reports","json: test-reports/json-report.json"},
    monochrome = true
)
 

public class Activitiy6Runner {

}
