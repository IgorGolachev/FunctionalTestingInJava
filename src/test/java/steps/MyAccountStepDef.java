package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountStepDef {

    private final MyAccountSteps page = new MyAccountSteps();

    @Then("My Account Page Is Loaded")
    public void clickSingInButton() {
        page.verifyThePageIsLoaded();
    }

    @When("Click My Personal Information Button")
    public void clickMyPersonalInformationButton() {
        page.clickMyPersonalInformationBtn();
    }
}
