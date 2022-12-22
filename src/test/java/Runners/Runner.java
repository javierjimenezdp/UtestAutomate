package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "StepDefinitions",
        tags = "@Scenario4",
        snippets = SnippetType.CAMELCASE
)
public class Runner {

}
