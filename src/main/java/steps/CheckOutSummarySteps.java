package steps;

import org.assertj.core.api.SoftAssertions;
import pages.CheckOutSummaryPage;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;
import static org.assertj.core.api.Assertions.*;

public class CheckOutSummarySteps {

    private final SoftAssertions softly = new SoftAssertions();
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

        List<BigDecimal> parsedPrices = new ArrayList<>();
        ui.checkOutTable.getItems().forEach(map -> {
            try {
                String price = map.get("Price");
                parsedPrices.add(parse(price));
            } catch (ParseException e) {
                throw new IllegalArgumentException(String.format("The provided %s price cannot be parsed", map.get("Price")));
            }
        });
        Optional<BigDecimal> sum = parsedPrices.stream().reduce(BigDecimal::add);
        assertThat(parse(totals.get("Total products"))).isEqualTo(sum.get());
        assertThat(parse(totals.get("Total shipping"))).isEqualTo(new BigDecimal("2.00"));
        assertThat(parse(totals.get("Total"))).isEqualTo(new BigDecimal("2.00").add(sum.get()));
        assertThat(parse(totals.get("Tax"))).isEqualTo(new BigDecimal("0.00"));
        return this;
    }

    public CheckOutSummarySteps proceedToCheckOut() {
        ui.proceedToCheckoutLink.click();
        return this;
    }

    private BigDecimal parse(final String amount) throws ParseException {
        final NumberFormat format = NumberFormat.getNumberInstance(Locale.US);
        if (format instanceof DecimalFormat) {
            ((DecimalFormat) format).setParseBigDecimal(true);
        }

        return (BigDecimal) format.parse(amount.replaceAll("[^\\d.,]", ""));
    }
}