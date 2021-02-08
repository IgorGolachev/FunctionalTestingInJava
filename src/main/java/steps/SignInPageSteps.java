package steps;

import java.util.Map;

import pages.SignInPage;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Condition.text;
import static org.assertj.core.api.Assertions.*;

public final class SignInPageSteps {

    private final String AUTHENTICATION = "Authentication";
    private final SignInPage ui = page(SignInPage.class);

    public SignInPageSteps verifyThePageIsLoaded() {
        ui.breadCrumbs.shouldHave(text(AUTHENTICATION));
        ui.pageHeader.shouldHave(text(AUTHENTICATION.toUpperCase()));
        return this;
    }

    public SignInPageSteps signInWithCredentials(Map<String, String> credentials) {
        ui.emailInput.setValue(credentials.get("Email"));
        ui.passwordInput.setValue(credentials.get("Password"));
        ui.signInButton.click();
        return this;
    }

    public SignInPageSteps specifyNewEmail(String email) {
        ui.newEmailInput.setValue(email).pressTab();
        assertThat(ui.newEmailInput.isValidationPassed()).isTrue();
        return this;
    }

    public SignInPageSteps clickCreateAccountButton() {
        ui.createAccountButton.click();
        return this;
    }
}