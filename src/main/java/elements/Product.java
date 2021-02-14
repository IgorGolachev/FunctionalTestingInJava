package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public final class Product extends WrappedElement {

    public boolean verifyIsInStock() {
        return super.$("div span span[class='available-now']").
                getText().equalsIgnoreCase("In Stock");
    }

    public Product(String path) {
        super(path);
    }

    public Product(By by) {
        super(by);
    }

    public Product(SelenideElement element) {
        super(element);
    }
}