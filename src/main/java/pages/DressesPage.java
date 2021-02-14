package pages;

import com.codeborne.selenide.SelenideElement;
import elements.ProductList;

import static com.codeborne.selenide.Selenide.$;

public final class DressesPage {

    public final SelenideElement breadCrumbs = $("a[class='home'] ~ a[title='Women']");
    public final ProductList productList = new ProductList("class='product_list grid row'");

}