import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        //glue = "features.stepdefinitions",
        monochrome = true,
        plugin = {
                "pretty", "html:report/cucumber-html-report.html"
        }
)
public class TestRunner {

}