package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public final class SignInPage {

    public final SelenideElement breadCrumbs = $("a[class='home'] ~ span ~ span");
    public final SelenideElement emailInput = $("input[id=email]");
    public final SelenideElement passwordInput = $("input[id=passwd]");
    public final SelenideElement signInButton = $("button[id=SubmitLogin]");
    public final SelenideElement createAccountButton = $("button[id=SubmitCreate]");
    public final SelenideElement newEmailInput = $("input[id='email_create']");
}