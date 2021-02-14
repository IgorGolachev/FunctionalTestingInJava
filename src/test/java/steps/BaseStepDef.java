package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public final class BaseStepDef {

    private final BasePageSteps page = new BasePageSteps();

    @Given("Click Sing In Button")
    public void clickSingInButton() {
        page.clickLoginButton();
    }

    @When("Select Dresses page")
    public void selectDresses() {
        page.selectDressesDepartment();
    }

    @Then("Verify current user is {string}")
    public void verifyUserIsLoggedIn(String userName) {
        page.verifyCurrentUserIs(userName);
    }
}