package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public final class Product extends WrappedElement {

    public String name = element.$("h5[itemprop='name'] a[class='product-name']").getAttribute("title");
    public String price = element.$("span[itemprop='price']").getText().trim();

    public boolean verifyIsInStock() {
        return super.$("div span span[class='available-now']").
                getText().equalsIgnoreCase("In Stock");
    }

    public Product AddToBasketAndContinue() {
        element.hover().$("a[title='Add to cart'] span");
        $("div[class='clearfix'] div div span[class='product-name']").shouldBe(Condition.visible);
        $("span[title='Continue shopping']").click();
        return this;
    }

    public Product(String path) { super(path); }

    public Product(By by) {
        super(by);
    }

    public Product(SelenideElement element) {
        super(element);
    }
}