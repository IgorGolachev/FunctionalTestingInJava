package steps;

import java.time.Duration;
import java.util.Map;

import com.codeborne.selenide.Condition;
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
        ui.signInButton.shouldNotBe(Condition.visible, Duration.ofMillis(7000));
        return this;
    }

    public SignInPageSteps specifyNewEmail(String email) {
        ui.newEmailInput.setValue(email).pressTab();
        assertThat(ui.newEmailInput.isValidationPassed()).isTrue();
        return this;
    }

    public SignInPageSteps clickCreateAccountButton() {
        ui.createAccountButton.click();
        ui.createAccountButton.shouldNotBe(Condition.visible, Duration.ofMillis(10000));
        return this;
    }
}