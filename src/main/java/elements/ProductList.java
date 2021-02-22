package elements;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.codeborne.selenide.ElementsCollection;

public final class ProductList extends WrappedElement {

    private List<Product> inStockProducts = setProducts();

    private List<Product> setProducts() {

        ElementsCollection productsContainers = element.$$("div[class='product-container']");

        if (productsContainers.isEmpty())
            throw new IllegalArgumentException("There are no products on the page");

        List<Product> visibleProducts = new ArrayList<>();
        productsContainers.forEach(container -> visibleProducts.add(new Product(container)));

        inStockProducts = new ArrayList<>();
        inStockProducts.addAll(visibleProducts
                .stream()
                .filter(Product::verifyIsInStock)
                .collect(Collectors.toList()));

        return inStockProducts;
    }

    public ProductList selectItem(String productName, String price) {

        Product item = inStockProducts.stream()
                .filter(product -> productName.equalsIgnoreCase(product.name))
                .filter(product -> price.equalsIgnoreCase(product.price))
                .findAny()
                .orElse(null);

        if (item == null)
            throw new IllegalArgumentException("Product is not found or not in stock");

        item.AddToBasketAndContinue();
        return this;
    }

    public ProductList(String path) {
        super(path);
    }
}