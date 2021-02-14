package elements;

import java.util.List;
import java.util.stream.Collectors;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import com.codeborne.selenide.SelenideElement;

public final class ProductList extends WrappedElement {

    private List<Product> visibleProducts;
    private List<Product> inStockProducts;

    public ProductList(String path) {
        super(path);
        setProducts();
    }

    private ProductList setProducts() {
        ElementsCollection productsContainers = super.$$("div[class='product-container']");

        if (productsContainers.isEmpty())
            throw new IllegalArgumentException("There are no products on the page");

        for (var container : productsContainers) {
            visibleProducts.add(new Product(container));
        }

        inStockProducts.addAll(visibleProducts
                .stream()
                .filter(Product::verifyIsInStock)
                .collect(Collectors.toList()));

        return this;
    }

    public ProductList(By by) {
        super(by);
        setProducts();
    }

    public ProductList(SelenideElement element) {
        super(element);
        setProducts();
    }
}