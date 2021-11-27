package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;

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

    @When("Select Women page")
    public void selectWomen() {
        page.selectWomenDepartment();
    }

    @Then("Verify current user is {string}")
    public void verifyUserIsLoggedIn(String userName) {
        page.verifyCurrentUserIs(userName);
    }

    @An("Access basket and go to check out")
    public void accessBasketAndCheckOut() {
        page.accessBasketAndCheckOut();
    }












}