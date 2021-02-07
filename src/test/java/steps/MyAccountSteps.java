package steps;

import pages.MyAccountPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class MyAccountSteps {

    private final String breadCrumbLabel = "My Account";
    private final MyAccountPage ui = page(MyAccountPage.class);

    public MyAccountSteps verifyThePageIsLoaded() {
        ui.breadCrumbs.shouldHave(text(breadCrumbLabel));
        return this;
    }

    public MyAccountSteps clickMyPersonalInformationBtn() {
        ui.personalInfoButton.click();
        return this;
    }
}