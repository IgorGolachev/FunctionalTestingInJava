import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        monochrome = true,
        plugin = {
                "pretty", "html:report/cucumber-html-report.html",
                "json:report/cucumber.json",
                "pretty:report/cucumber-pretty.txt"
        }
)
public class TestRunner {

}