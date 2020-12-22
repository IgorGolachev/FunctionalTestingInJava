package steps;

import pages.BasePage;

public class BasePageSteps {

    private BasePage ui = new BasePage();

    public void clickLoginButton() {
        ui.signInButton.click();
    }
}