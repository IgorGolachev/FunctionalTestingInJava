package pages;

import com.codeborne.selenide.SelenideElement;
import elements.FormInput;

import static com.codeborne.selenide.Selenide.$;

public final class SignInPage {

    public final SelenideElement emailInput = $("input[id=email]");
    public final SelenideElement passwordInput = $("input[id=passwd]");
    public final SelenideElement signInButton = $("button[id=SubmitLogin]");
    public final SelenideElement createAccountButton = $("button[id=SubmitCreate]");
    public final SelenideElement pageHeader = $("h1[class='page-heading']");
    public final SelenideElement breadCrumbs = $("a[class='home'] ~ span ~ span");

    public final FormInput newEmailInput = new FormInput("input[id='email_create']");
}