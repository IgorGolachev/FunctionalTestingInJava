package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class YourPersonalInformationPage {

    public final SelenideElement breadCrumbs = $("a[class='home'] ~ span ~ span ~ span");

}