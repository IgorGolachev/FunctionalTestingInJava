package steps;

import io.cucumber.java.en.Then;

public class SignInPageDef {

    SignInPageSteps page = new SignInPageSteps();

    @Then("Sign In Page is loaded")
    public void clickSingInButton() {
        page.verifyThePageIsLoaded();
    }
}
