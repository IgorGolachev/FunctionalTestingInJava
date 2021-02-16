package elements;

import java.util.List;
import java.util.stream.Collectors;

import com.codeborne.selenide.ElementsCollection;

public final class ProductList extends WrappedElement {

    private List<Product> visibleProducts;
    private List<Product> inStockProducts;

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
}