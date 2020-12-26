package steps;

import io.cucumber.java.Before;
import static com.codeborne.selenide.Selenide.open;

public final class Hooks {

    @Before
    public void setUp() {
        open("http://automationpractice.com/index.php");
    }
}
