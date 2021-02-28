package pages;

import com.codeborne.selenide.SelenideElement;
import elements.ProductList;

import static com.codeborne.selenide.Selenide.$;

public final class WomenPage {

    public final SelenideElement breadCrumbs = $("div[class='breadcrumb clearfix'] span[class='navigation_page']");
    public final ProductList productList = new ProductList("ul[class='product_list grid row']");

}