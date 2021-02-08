package steps;

import io.cucumber.java.en.Then;

public class YourPersonalInformationStepDef {

    private final YourPersonalInformationSteps page = new YourPersonalInformationSteps();

    @Then("Your Personal Information Page Is Loaded")
    public void verifyPersonalInfoPageIsLoaded() {
        page.verifyThePageIsLoaded();
    }
}