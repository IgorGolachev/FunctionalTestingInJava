package steps;

import pages.DressesPage;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public final class DressesPageSteps {

    private final String DRESSES = "Dresses";
    private final DressesPage ui = page(DressesPage.class);

    public DressesPageSteps verifyThePageIsLoaded() {
        ui.breadCrumbs.shouldHave(text(DRESSES));
        return this;
    }

    public DressesPageSteps addDressesToBasket(List<Map<String, String>> dressesToBuy) {
        dressesToBuy.forEach(dress -> ui.productList.selectItem(dress.get("Product"), dress.get("Price")));
        return this;
    }
}