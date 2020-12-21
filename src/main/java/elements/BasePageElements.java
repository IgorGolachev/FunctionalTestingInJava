package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class BasePageElements {

    public SelenideElement signInButton = $("a[class='login']");

}
