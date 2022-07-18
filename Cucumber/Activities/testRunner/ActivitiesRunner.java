package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/main/java/features/Activity5.feature",
    glue = {"stepDefinitions"},
    tags = "@activity5"
)
 

public class ActivitiesRunner {

}
