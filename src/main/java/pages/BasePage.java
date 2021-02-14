package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public final class BasePage {

    public final SelenideElement signInButton = $("a[class='login']");
    public final SelenideElement currentUserLink = $("div[class='header_user_info'] a span");
    public final SelenideElement dressesLink = $("a[title='Dresses']");
}
