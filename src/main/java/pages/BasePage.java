package pages;

import elements.Button;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    public Button signInButton = new Button("a[class='login']");

}
