package steps;

import com.codeborne.selenide.Condition;
import pages.BasePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public final class BasePageSteps {

    private final BasePage ui = page(BasePage.class);

    public BasePageSteps clickLoginButton() {
        ui.signInButton.shouldBe(Condition.visible).click();
        return this;
    }

    public BasePageSteps verifyCurrentUserIs(String userName) {
        ui.currentUserLink.shouldHave(text(userName));
        return this;
    }
}