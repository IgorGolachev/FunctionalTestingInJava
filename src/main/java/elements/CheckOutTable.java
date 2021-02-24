package elements;

import com.codeborne.selenide.ElementsCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class CheckOutTable extends WrappedElement {

    private final List<Map<String, String>> items = setItems();

    public final String totalProducts = element.$("tfoot tr[class='cart_total_price'] td[id='total_product']").getText();
    public final String totalShipping = element.$("tfoot tr[class='cart_total_delivery'] td[id='total_shipping']").getText();
    public final String total = element.$("tfoot tr[class='cart_total_price'] td[id='total_price_without_tax']").getText();
    public final String tax = element.$("tfoot tr[class='cart_total_tax'] td[id='total_tax']").getText();

    private List<Map<String, String>> setItems() {

        ElementsCollection productsContainers = element.$$("tr[class~='cart_item']");

        if (productsContainers.isEmpty())
            throw new IllegalArgumentException("There are no products to checkout");

        List<Map<String, String>> productsToCheckOut = new ArrayList<>();
        productsContainers.forEach(container -> productsToCheckOut.add(
                new HashMap<>() {{
                    put("Product", container.$("td[class='cart_description'] p[class='product-name'] a").getText());
                    put("Price", container.$("td[class='cart_unit'] span span").getText());
                }}
        ));

        return productsToCheckOut;
    }

    public List<Map<String, String>> getItems() {
        return items;
    }

    public CheckOutTable(String path) {
        super(path);
    }
}