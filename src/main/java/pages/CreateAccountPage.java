package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CreateAccountPage {

    public final SelenideElement pageHeader = $("h1[class='page-heading']");
    public final SelenideElement breadCrumbs = $("a[class='home'] ~ span ~ span");

}
