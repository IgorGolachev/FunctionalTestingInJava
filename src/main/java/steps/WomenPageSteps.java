package steps;

import pages.WomenPage;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public final class WomenPageSteps {

    private final WomenPage ui = page(WomenPage.class);

    public WomenPageSteps verifyThePageIsLoaded() {
        String WOMEN = "Women";
        ui.breadCrumbs.shouldHave(text(WOMEN));
        return this;
    }

    public WomenPageSteps addWomenProductsToBasket(List<Map<String, String>> productsToBuy) {
        productsToBuy.forEach(product -> ui.productList.selectItem(product.get("Product"), product.get("Price")));
        return this;
    }
}