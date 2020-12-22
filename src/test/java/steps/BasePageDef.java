package steps;

import io.cucumber.java.en.Given;

public class BasePageDef {

    BasePageSteps page = new BasePageSteps();

    @Given("Click Sing In Button")
    public void clickSingInButton() {
        page.clickLoginButton();
    }
}