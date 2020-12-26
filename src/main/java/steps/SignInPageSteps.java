package steps;

import java.util.Map;
import pages.SignInPage;

import static com.codeborne.selenide.Condition.text;

public final class SignInPageSteps {

    private final String AUTHENTICATION = "Authentication";
    private final SignInPage ui = new SignInPage();

    public void verifyThePageIsLoaded() {
        ui.breadCrumbs.shouldHave(text(AUTHENTICATION));
    }

    public void signInWithCredentials(Map<String, String> credentials) {
        ui.emailInput.setValue(credentials.get("Email"));
        ui.passwordInput.setValue(credentials.get("Password"));
        ui.signInButton.click();
    }

    public void specifyNewEmail(String email) {
        ui.newEmailInput.setValue(email);
    }

    public void clickCreateAccountButton() {
        ui.createAccountButton.click();
    }
}