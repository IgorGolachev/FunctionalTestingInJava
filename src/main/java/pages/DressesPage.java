package pages;

import com.codeborne.selenide.SelenideElement;
import elements.ProductList;

import static com.codeborne.selenide.Selenide.$;

public final class DressesPage {

    public final SelenideElement breadCrumbs = $("div[class='breadcrumb clearfix']");
    public final ProductList productList = new ProductList("ul[class='product_list grid row']");

}