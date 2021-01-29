package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public final class Hooks {

    @Before
    public void setUp() {

        Configuration.browser = "chrome";
        Configuration.timeout = 5000;
        Configuration.remote = "http://172.17.0.2:4444/wd/hub";
        Configuration.browserVersion = "87.0";
        Configuration.browserSize = "1920x1080";

        open("http://automationpractice.com/index.php");
    }

    @After
    public void tearDown() {
        closeWebDriver();
    }


}