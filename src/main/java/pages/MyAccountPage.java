package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MyAccountPage {

    public final SelenideElement breadCrumbs = $("a[class='home'] ~ span ~ span");
}