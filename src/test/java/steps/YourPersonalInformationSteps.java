package steps;

import pages.YourPersonalInformationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class YourPersonalInformationSteps {

    private final String breadCrumbLabel = "Your personal information";
    private final YourPersonalInformationPage ui = page(YourPersonalInformationPage.class);

    public YourPersonalInformationSteps verifyThePageIsLoaded() {
        ui.breadCrumbs.shouldHave(text(breadCrumbLabel));
        return this;
    }
}