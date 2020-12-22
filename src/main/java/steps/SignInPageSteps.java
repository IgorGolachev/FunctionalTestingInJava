package steps;

import pages.SignInPage;

import static com.codeborne.selenide.Condition.text;

public class SignInPageSteps {

    private String AUTHENTICATION = "Authentication";
    private SignInPage ui = new SignInPage();

    public void verifyThePageIsLoaded() {
        ui.authLabel.shouldHave(text(AUTHENTICATION));
    }
}
