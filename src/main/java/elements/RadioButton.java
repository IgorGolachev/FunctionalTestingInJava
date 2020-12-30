package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import config.SelenideConfig;
import interfaces.ElementValidator;

public final class RadioButton extends WrappedElement implements ElementValidator {

    @Override
    public SelenideElement setValue(String text) {
        super.selectRadio(this.getValue());
        return super.element;
    }

    @Override
    public boolean isValidationFailed() {
        checkValidation(StringUtils.EMPTY);
        return true;
    }

    @Override
    public boolean isValidationPassed() {
        checkValidation("checked");
        return true;
    }

    private void checkValidation(String validatedClassValue) {
        this.parent().waitUntil(
                Condition.attribute("class", validatedClassValue),
                SelenideConfig.DEFAULT_TIMEOUT_MS);
    }

    public RadioButton(String path) {
        super(path);
    }

    public RadioButton(By by) {
        super(by);
    }

    public RadioButton(SelenideElement element) {
        super(element);
    }
}