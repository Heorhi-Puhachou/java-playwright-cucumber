package by.heorhi.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "not @ignored",
        glue = {
                "by.heorhi.example.hooks",
                "by.heorhi.example.steps"
        },
        plugin = {
                "pretty"
        }
)
public class RunCucumberTest {
}
