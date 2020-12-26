package steps;

import context.Context;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Map;

public final class SignInPageDef {

    private final SignInPageSteps page = new SignInPageSteps();

    @Then("Sign In Page is loaded")
    public void clickSingInButton() {
        page.verifyThePageIsLoaded();
    }

    @When("Sign in with credentials")
    public void specifyCredentials(DataTable data) {
        Map<String, String> credentials = data.transpose().asMap(String.class, String.class);
        page.signInWithCredentials(credentials);
    }

    @When("Create a new account with random email")
    public void createAccountWithRandomEmail() {
        String email = String.format("Auto_%s@mail.com", RandomStringUtils.randomAlphabetic(5));
        page.specifyNewEmail(email);
        Context.put("email", email);
        page.clickCreateAccountButton();
    }
}