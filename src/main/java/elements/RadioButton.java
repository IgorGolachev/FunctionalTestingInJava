package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.apache.commons.lang3.StringUtils;
import interfaces.ElementValidator;

public final class RadioButton extends WrappedElement implements ElementValidator {

    @Override
    public SelenideElement setValue(String text) {
        super.selectRadio(this.getValue());
        return super.element;
    }

    @Override
    public RadioButton verifyElementHasValue(String value) {

        if (!String.valueOf(Boolean.TRUE).equalsIgnoreCase(value) &&
                !String.valueOf(Boolean.TRUE).equalsIgnoreCase(value))
            throw new IllegalArgumentException("Provided Radio Button value cannot be handled as boolean");

        SelenideElement parent = super.element.parent();

        if (String.valueOf(Boolean.TRUE).equalsIgnoreCase(value))
            parent.shouldHave(Condition.cssClass("checked"));
        else
            parent.shouldHave(Condition.attributeMatching("class", StringUtils.EMPTY));

        return this;
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
        this.parent().shouldHave(Condition.cssClass(validatedClassValue));
    }

    public RadioButton(String path) {
        super(path);
    }

}