package steps;

import exception.NoSuchFieldException;
import pages.CreateAccountPage;

import java.util.Map;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class CreateAccountSteps {

    private final String AUTHENTICATION = "Authentication";
    private final String PAGE_HEADER = "CREATE AN ACCOUNT";
    private final CreateAccountPage ui = page(CreateAccountPage.class);

    public CreateAccountSteps verifyThePageIsLoaded() {
        ui.breadCrumbs.shouldHave(text(AUTHENTICATION));
        ui.pageHeader.shouldHave(text(PAGE_HEADER));
        return this;
    }

    public CreateAccountSteps setPersonalInformation(Map<String, String> personalInfo) throws NoSuchFieldException {
        for (String key: personalInfo.keySet()) {
            ui.personalInformation.setFieldValueByName(key, personalInfo.get(key));
        }
        return this;
    }
}