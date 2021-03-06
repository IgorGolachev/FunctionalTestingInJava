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

    public BasePageSteps accessBasketAndCheckOut() {
        ui.basketLink.hover();
        ui.checkOutLink.shouldBe(Condition.enabled).click();
        return this;
    }

    public BasePageSteps selectDressesDepartment() {
        ui.dressesLink.shouldBe(Condition.visible).click();
        return this;
    }

    public BasePageSteps selectWomenDepartment() {
        ui.womenLink.shouldBe(Condition.visible).click();
        return this;
    }

    public BasePageSteps verifyCurrentUserIs(String userName) {
        ui.currentUserLink.shouldHave(text(userName));
        return this;
    }
}