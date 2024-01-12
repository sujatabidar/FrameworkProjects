package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/Login.feature", // Path to your feature files
    glue = {"stepdefinitions.google"}, // Package where your step definitions are located
    tags = "@smoke", // Optional: Only run scenarios with this tag
    monochrome = true,
   plugin = {"pretty", "html:target/cucumberReports/cucumberReport.html"} // Optional: Define plugins
)

public class googleRunner {

	
}
