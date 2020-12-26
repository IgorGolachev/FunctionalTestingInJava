package steps;

import pages.BasePage;

public final class BasePageSteps {

    private final BasePage ui = new BasePage();

    public void clickLoginButton() {
        ui.signInButton.click();
    }
}