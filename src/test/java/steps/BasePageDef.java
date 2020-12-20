package steps;

import io.cucumber.java.en.Given;
import pages.BasePage;

public class BasePageDef {

    BasePage page = new BasePage();

    @Given("Click Sing In Button")
    public void clickSingInButton() {
        page.clickLoginButton();
    }
}
