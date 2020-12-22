package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    public SelenideElement authLabel = $("a[class='home'] ~ span ~ span");

}
