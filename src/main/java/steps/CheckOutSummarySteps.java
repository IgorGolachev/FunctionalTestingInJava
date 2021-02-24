package steps;

import org.assertj.core.api.SoftAssertions;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import pages.CheckOutSummaryPage;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class CheckOutSummarySteps {

    private SoftAssertions softly = new SoftAssertions();
    private final CheckOutSummaryPage ui = page(CheckOutSummaryPage.class);

    public CheckOutSummarySteps verifyThePageIsLoaded() {
        String yourShoppingCart = "Your shopping cart";
        ui.breadCrumbs.shouldHave(text(yourShoppingCart));
        String pageHeader = "Shopping-cart summary";
        ui.pageHeader.shouldHave(text(pageHeader));
        return this;
    }

    public CheckOutSummarySteps verifySummaryContainsProducts(List<Map<String, String>> products) {
        softly.assertThat(products).hasSize(ui.checkOutTable.getItems().size());
        ui.checkOutTable.getItems().containsAll(products);
        return this;
    }

    public CheckOutSummarySteps verifyTotals(Map<String, String> totals) throws ParseException {

        List<String> prices = new ArrayList<>();
        ui.checkOutTable.getItems().forEach(map -> prices.add(map.get("Price")));
        List<BigDecimal> parsedPrices = new ArrayList<>();
        prices.forEach(price -> {
            try {
                parsedPrices.add(parse(price));
            } catch (ParseException e) {
                throw new IllegalArgumentException(String.format("The %s price cannot be parsed", price));
            }
        });
        parsedPrices.stream().reduce(BigDecimal::add);
        softly.assertThat(totals.get("Total products")).isEqualTo(prices);
        return this;
    }

    private BigDecimal parse(final String amount) throws ParseException {
        final NumberFormat format = NumberFormat.getNumberInstance(Locale.US);
        if (format instanceof DecimalFormat) {
            ((DecimalFormat) format).setParseBigDecimal(true);
        }

        return (BigDecimal) format.parse(amount.replaceAll("[^\\d.,]",""));
    }
}