package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public final class DressesStepDef {

    private final DressesPageSteps page = new DressesPageSteps();

    @Then("Dresses Page is loaded")
    public void verifyDressesPageIsLoaded() {
        page.verifyThePageIsLoaded();
    }

    @When("Add the following dresses to the basket")
    public void addDressesToBasket(DataTable dresses) {
        List<Map<String, String>> dressesToBuy = dresses.asMaps(String.class, String.class);
        page.addDressesToBasket(dressesToBuy);
    }
}