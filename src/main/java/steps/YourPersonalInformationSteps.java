package steps;

import java.util.Map;

import pages.YourPersonalInformationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class YourPersonalInformationSteps {

    private final YourPersonalInformationPage ui = page(YourPersonalInformationPage.class);

    public YourPersonalInformationSteps verifyThePageIsLoaded() {
        String breadCrumbLabel = "Your personal information";
        ui.breadCrumbs.shouldHave(text(breadCrumbLabel));
        return this;
    }

    public YourPersonalInformationSteps verifyPersonalInformation(Map<String, String> data) {
        ui.yourPersonalInformationForm.verifyFieldValues(data);
        return this;
    }
}