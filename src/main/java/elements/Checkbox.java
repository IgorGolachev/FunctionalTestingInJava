package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import interfaces.ElementValidator;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

public final class Checkbox extends WrappedElement implements ElementValidator {

    @Override
    public SelenideElement setValue(String checkBoxState) {
        if (!checkBoxState.equalsIgnoreCase(String.valueOf(ifTicked())))
            super.click();
        return super.element;
    }

    @Override
    public Checkbox verifyElementHasValue(String value) {

        if (!String.valueOf(Boolean.TRUE).equalsIgnoreCase(value) &&
                !String.valueOf(Boolean.TRUE).equalsIgnoreCase(value))
            throw new IllegalArgumentException("Provided Checkbox value cannot be handled as boolean");

        SelenideElement parent = super.element.parent();

        if (String.valueOf(Boolean.TRUE).equalsIgnoreCase(value))
            parent.shouldHave(Condition.cssClass("checked"));
        else
            parent.shouldHave(Condition.attributeMatching("class", StringUtils.EMPTY));

        return this;
    }

    private boolean ifTicked() {
        return this.parent().getAttribute("class").equals("checked");
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

    public Checkbox(By by) {
        super(by);
    }

    public Checkbox(SelenideElement element) {
        super(element);
    }

}
