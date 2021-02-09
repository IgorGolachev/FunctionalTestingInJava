package steps;

import exception.ElementValidatedException;
import exception.NoSuchFieldException;
import pages.YourPersonalInformationPage;

import java.util.Map;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class YourPersonalInformationSteps {

    private final String breadCrumbLabel = "Your personal information";
    private final YourPersonalInformationPage ui = page(YourPersonalInformationPage.class);

    public YourPersonalInformationSteps verifyThePageIsLoaded() {
        ui.breadCrumbs.shouldHave(text(breadCrumbLabel));
        return this;
    }

    public YourPersonalInformationSteps verifyPersonalInformation(Map<String, String> data)
            throws NoSuchFieldException {
        ui.yourPersonalInformationForm.verifyFieldValues(data);
        return this;
    }
}