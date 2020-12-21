package pages;

import elements.BasePageElements;

public class BasePage {

    private BasePageElements ui = new BasePageElements();

    public void clickLoginButton() {
        ui.signInButton.click();
    }
}