package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import interfaces.ElementValidator;

public final class FormInput extends WrappedElement implements ElementValidator {

    @Override
    public SelenideElement setValue(String text) {
        super.clear();
        return super.setValue(text);
    }

    @Override
    public FormInput verifyElementHasValue(String expectedValue) {
        super.element.shouldHave(Condition.cssValue("value", expectedValue));
        return this;
    }

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
        this.parent().shouldHave(
                Condition.attributeMatching("class", ".*" + validatedClassValue + ".*"),
                ELEMENT_TIMEOUT);
    }

    public FormInput(String path) {
        super(path);
    }
}