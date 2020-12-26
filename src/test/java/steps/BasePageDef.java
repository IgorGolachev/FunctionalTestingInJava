package steps;

import io.cucumber.java.en.Given;

public final class BasePageDef {

    private final BasePageSteps page = new BasePageSteps();

    @Given("Click Sing In Button")
    public void clickSingInButton() {
        page.clickLoginButton();
    }
}