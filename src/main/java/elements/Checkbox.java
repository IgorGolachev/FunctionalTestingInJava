package elements;

import interfaces.ElementValidator;
import org.apache.commons.lang3.StringUtils;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public final class Checkbox extends WrappedElement implements ElementValidator {

    private final String CHECKED = "checked";

    @Override
    public SelenideElement setValue(String checkBoxState) {
        if (!checkBoxState.equalsIgnoreCase(String.valueOf(ifTicked())))
            super.click();
        return super.element;
    }

    @Override
    public Checkbox verifyElementHasValue(String value) {

        if (!String.valueOf(Boolean.TRUE).equalsIgnoreCase(value) &&
                !String.valueOf(Boolean.FALSE).equalsIgnoreCase(value))
            throw new IllegalArgumentException("Provided Checkbox value cannot be handled as boolean");

        SelenideElement parent = super.element.parent();

        if (String.valueOf(Boolean.TRUE).equalsIgnoreCase(value))
            parent.shouldHave(Condition.cssClass(CHECKED));
        else
            parent.shouldHave(Condition.attributeMatching("class", StringUtils.EMPTY));

        return this;
    }

    private boolean ifTicked() {
        return CHECKED.equals(this.parent().getAttribute("class"));
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
        this.parent().shouldHave(
                Condition.attributeMatching("class", ".*" + validatedClassValue + ".*"),
                ELEMENT_TIMEOUT);
    }

    public Checkbox(String path) {
        super(path);
    }
}
