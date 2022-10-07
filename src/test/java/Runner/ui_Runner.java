package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber",
        "json:target/cucumber.json"},
        features="src/test/java/features",
        glue="step_definitions",
        tags="@mb-4",
        dryRun = false,
        monochrome = true
)
public class ui_Runner {

}
