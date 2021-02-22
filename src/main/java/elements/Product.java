package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public final class Product extends WrappedElement {

    public String name = element.$("h5[itemprop='name'] a[class='product-name']").getAttribute("title");
    public String price = element.$("div[class='right-block'] span[itemprop='price']").getText().trim();

    public boolean verifyIsInStock() {
        return element.$("div span span[class='available-now']").
                getText().equalsIgnoreCase("In Stock");
    }

    public Product AddToBasketAndContinue() {
        element.hover().$("a[title='Add to cart'] span").click();
        SelenideElement confirmationPopUp = Selenide.$("div[id='layer_cart'] div[class='clearfix']")
                .shouldBe(Condition.visible);
        SelenideElement continueButton = confirmationPopUp.
                $("div div[class='button-container'] span[title='Continue shopping'] span");
        continueButton.click();
        return this;
    }

    public Product(String path) {
        super(path);
    }

    public Product(By by) {
        super(by);
    }

    public Product(SelenideElement container) {
        super(container);
    }
}