package steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.open;

public final class Hooks {

    @Before
    public void setUp() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("incognito");
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        capabilities.setAcceptInsecureCerts(true);
        Configuration.browserCapabilities = capabilities;
        Configuration.headless = true;
        Configuration.startMaximized = true;

        open("http://automationpractice.com/index.php");
    }
}
