package steps;

import org.assertj.core.api.SoftAssertions;
import pages.CheckOutSummaryPage;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class CheckOutSummarySteps {

    private final CheckOutSummaryPage ui = page(CheckOutSummaryPage.class);

    public CheckOutSummarySteps verifyThePageIsLoaded() {
        String yourShoppingCart = "Your shopping cart";
        ui.breadCrumbs.shouldHave(text(yourShoppingCart));
        String pageHeader = "Shopping-cart summary";
        ui.pageHeader.shouldHave(text(pageHeader));
        return this;
    }

    public CheckOutSummarySteps verifySummaryContainsProducts(List<Map<String, String>> products) {
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(products).hasSize(ui.productTable.getItems().size());
        ui.productTable.getItems().containsAll(products);
        return this;
    }
}