package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.Map;

public class YourPersonalInformationStepDef {

    private final YourPersonalInformationSteps page = new YourPersonalInformationSteps();

    @Then("Your Personal Information Page Is Loaded")
    public void verifyPersonalInfoPageIsLoaded() {
        page.verifyThePageIsLoaded();
    }

    @And("Personal Information is as following")
    public void verifyPersonalInformation(DataTable data) {
        Map<String, String> info = data.transpose().asMap(String.class, String.class);
        page.verifyPersonalInformation(info);
    }
}