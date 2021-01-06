package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
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
        this.parent().shouldHave(Condition.cssClass(validatedClassValue));
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