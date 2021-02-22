package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public final class BasePage {

    public final SelenideElement signInButton = $("a[class='login']");
    public final SelenideElement currentUserLink = $("div[class='header_user_info'] a span");
    public final SelenideElement dressesLink = $x("(//a[@title='Dresses'])[2]");
    public final SelenideElement basketLink = $("a[title='View my shopping cart']");
    public final SelenideElement checkOutLink = $("a[id='button_order_cart']");
}
