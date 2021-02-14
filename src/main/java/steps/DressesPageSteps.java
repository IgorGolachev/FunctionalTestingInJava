package steps;

import pages.DressesPage;

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

    public DressesPageSteps addDressesToBasket(Map<String, String> dressesToBuy) {
        dressesToBuy.forEach((k, v) -> System.out.println((k + ":" + v)));
        return this;
    }
}