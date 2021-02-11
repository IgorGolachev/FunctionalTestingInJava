package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public final class HooksStepDef {

    @Before
    public void setUp() {

        Configuration.browser = "chrome";
        Configuration.timeout = 5000;
        Configuration.browserSize = "1920x1080";

        if (String.valueOf(Boolean.TRUE).equalsIgnoreCase(System.getProperty("REMOTE")))
            Configuration.remote = "http://selenoid:4444/wd/hub";

        open("http://automationpractice.com/index.php");
    }

    @After
    public void tearDown() {
        closeWebDriver();
    }

}