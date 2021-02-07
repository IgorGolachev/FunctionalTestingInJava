package definitions;

import context.Context;
import exception.ElementValidatedException;
import exception.NoSuchFieldException;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import steps.CreateAccountSteps;

import java.util.HashMap;
import java.util.Map;

public class CreateAccountStepDef {

    private final CreateAccountSteps page = new CreateAccountSteps();

    @Then("Create Account Page is loaded")
    public void clickSingInButton() {
        page.verifyThePageIsLoaded();
    }

    @And("Fill out your personal information with values")
    public void fillOutPersonalInformationForm(DataTable data)
            throws NoSuchFieldException, ElementValidatedException {
        Map<String, String> personalInfo = data.transpose().asMap(String.class, String.class);
        page.setPersonalInformation(personalInfo);
    }

    @And("Set email and password for new account")
    public void setEmailAndPasswordForNewAccount() throws NoSuchFieldException, ElementValidatedException {
        Map<String, String> credentials = new HashMap<>();
        credentials.put("Email", Context.get("email", String.class));
        credentials.put("Password", Context.get("password", String.class));
        page.setPersonalInformation(credentials);
    }

    @And("Set {string} as birth date")
    public void setBirthDate(String birthDate) {
        page.setBirthDate(birthDate);
    }

    @And("Fill out your address with values")
    public void fillOutYourAddressForm(DataTable data)
            throws NoSuchFieldException, ElementValidatedException {
        Map<String, String> addressInfo = data.transpose().asMap(String.class, String.class);
        page.setAddressInformation(addressInfo);
    }

    @And("Submit Account")
    public void submitAccount() {
        page.submitAccount();
    }
}
