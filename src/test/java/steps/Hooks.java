package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public final class Hooks {

    @Before
    public void setUp() {
        Configuration.headless = true;
        Configuration.startMaximized = true;

        open("http://automationpractice.com/index.php");
    }

    @After
    public void tearDown() {
        closeWebDriver();
    }
}