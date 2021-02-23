package steps;

import exception.ElementValidatedException;
import exception.NoSuchFieldException;
import org.apache.commons.lang3.StringUtils;
import pages.CreateAccountPage;
import util.DateTimeUtils;

import java.time.LocalDate;
import java.util.Map;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class CreateAccountSteps {

    private final String AUTHENTICATION = "Authentication";
    private final String PAGE_HEADER = "Create an account";
    private final CreateAccountPage ui = page(CreateAccountPage.class);

    public CreateAccountSteps verifyThePageIsLoaded() {
        ui.breadCrumbs.shouldHave(text(AUTHENTICATION));
        ui.pageHeader.shouldHave(text(PAGE_HEADER));
        return this;
    }

    public CreateAccountSteps setPersonalInformation(Map<String, String> personalInfo)
            throws NoSuchFieldException, ElementValidatedException {
        ui.personalInformation.setFieldValues(personalInfo);
        return this;
    }

    public CreateAccountSteps setAddressInformation(Map<String, String> addressInfo)
            throws NoSuchFieldException, ElementValidatedException {
        ui.addressInformation.setFieldValues(addressInfo);
        return this;
    }

    public CreateAccountSteps submitAccount() {
        ui.registerButton.click();
        return this;
    }

    public CreateAccountSteps setBirthDate(String birthDate) {
        LocalDate parsedDate = DateTimeUtils.parseDate(birthDate);

        ui.personalInformation.daySelect.setValue(String.valueOf(parsedDate.getDayOfMonth()));

        String monthName = parsedDate.getMonth().name();
        monthName = StringUtils.capitalize(monthName.toLowerCase());
        ui.personalInformation.monthSelect.setValue(monthName);

        ui.personalInformation.yearsSelect.setValue(String.valueOf(parsedDate.getYear()));
        return this;
    }
}