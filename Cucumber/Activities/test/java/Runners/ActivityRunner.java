package Runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        tags = "@activity5",
        glue = {"stepDefinitions"},
        plugin = {"json: target/test-reports/json-report.json"},
        monochrome = true
)

public class ActivityRunner {
}
