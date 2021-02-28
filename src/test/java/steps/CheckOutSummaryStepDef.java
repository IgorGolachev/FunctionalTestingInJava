package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

public class CheckOutSummaryStepDef {

    private final CheckOutSummarySteps page = new CheckOutSummarySteps();

    @Then("Verify CheckOut Summary Page is loaded")
    public void verifyCheckOutSummaryPageIsLoaded() {
        page.verifyThePageIsLoaded();
    }

    @And("Verify Summary is correct for the following products")
    public void verifySummaryProducts(DataTable dresses) {
        List<Map<String, String>> dressesToBuy = dresses.asMaps(String.class, String.class);
        page.verifySummaryContainsProducts(dressesToBuy);
    }

    @And("Verify Totals of CheckOut Summary page")
    public void verifyTotals(DataTable data) throws ParseException {
        Map<String, String> totals = data.transpose().asMap(String.class, String.class);
        page.verifyTotals(totals);
    }

    @When("Proceed to Address")
    public void proceedToCheckOut() {
        page.proceedToAddress();
    }

    @And("Proceed to Shipment")
    public void proceedToShipment() {
        page.proceedToShipment();
    }

    @And("Agree on Shipment Terms")
    public void agreeOnShipmentTerms() {
        page.agreeOnShipmentTerms();
    }

    @And("Proceed to Payment")
    public void proceedToPayment() {
        page.proceedToPayment();
    }

    @And("Pay by Credit Card")
    public void payByCreditCard() {
        page.payByCreditCard();
    }

    @And("Confirm order")
    public void confirmOrder() {
        page.confirmOrder();
    }

    @Then("Verify The Order Is Complete")
    public void verifyTheOrderIsComplete() {
        page.verifyTheOrderIsComplete();
    }
}
