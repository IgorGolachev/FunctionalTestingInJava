package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public final class WomenStepDef {

    private final WomenPageSteps page = new WomenPageSteps();

    @Then("Women Page is loaded")
    public void verifyWomenPageIsLoaded() {
        page.verifyThePageIsLoaded();
    }

    @When("Add the following women products to the basket")
    public void addWomenProductsToBasket(DataTable products) {
        List<Map<String, String>> productsToBuy = products.asMaps(String.class, String.class);
        page.addWomenProductsToBasket(productsToBuy);
    }
}