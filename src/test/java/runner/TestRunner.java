import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
   features = "src/test/java/features", // Path to the feature files
   glue = "stepdefinitions", // Package containing the step definitions
   plugin = {"pretty", "html:target/cucumber-reports.html"},
   monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
