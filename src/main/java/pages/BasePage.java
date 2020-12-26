package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public final class BasePage {

    public final SelenideElement signInButton = $("a[class='login']");

}
