package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import java.util.Map;

public class CreateAccountPageDef {

    private final CreateAccountSteps page = new CreateAccountSteps();

    @Then("Create Account Page is loaded")
    public void clickSingInButton() {
        page.verifyThePageIsLoaded();
    }

    @And("Fill out your personal information with values")
    public void fillOutPersonalInformationForm(DataTable data) {
        Map<String, String> personalInfo = data.transpose().asMap(String.class, String.class);

    }

    @And("Fill out your address with values")
    public void fillOutYourAddressForm(DataTable data) {
        Map<String, String> credentials = data.transpose().asMap(String.class, String.class);
    }

}
