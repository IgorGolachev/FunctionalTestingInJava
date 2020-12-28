package steps;

import io.cucumber.java.en.Then;

public class CreateAccountPageDef {

    private final CreateAccountSteps page = new CreateAccountSteps();

    @Then("Sign In Page is loaded")
    public void clickSingInButton() {
        page.verifyThePageIsLoaded();
    }

}
