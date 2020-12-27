package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import config.SelenideConfig;
import interfaces.ElementValidator;
import org.openqa.selenium.By;

public final class FormInput extends WrappedElement implements ElementValidator {

    @Override
    public boolean isValidationFailed() {
        checkValidation("form-group form-error");
        return true;
    }

    @Override
    public boolean isValidationPassed() {
        checkValidation("form-group form-ok");
        return true;
    }

    private void checkValidation(String validatedClassValue) {
        this.parent().waitUntil(
                Condition.attribute("class", validatedClassValue),
                SelenideConfig.DEFAULT_TIMEOUT_MS);
    }

    public FormInput(String path) {
        super(path);
    }

    public FormInput(By by) {
        super(by);
    }

    public FormInput(SelenideElement element) {
        super(element);
    }
}