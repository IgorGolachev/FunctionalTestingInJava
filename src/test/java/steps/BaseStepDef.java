package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public final class BaseStepDef {

    private final BasePageSteps page = new BasePageSteps();

    @Given("Click Sing In Button")
    public void clickSingInButton() {
        page.clickLoginButton();
    }

    @Then("Verify current user is {string}")
    public void verifyUserIsLoggedIn(String userName) {
        page.verifyCurrentUserIs(userName);
    }
}