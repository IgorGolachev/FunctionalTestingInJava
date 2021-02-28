package pages.forms;

import com.codeborne.selenide.Condition;
import elements.Checkbox;
import elements.Input;
import elements.RadioButton;
import elements.WrappedElement;
import exception.ElementValidatedException;
import exception.NoSuchFieldException;
import interfaces.ElementValidator;

import java.util.HashMap;
import java.util.Map;

public class BaseForm {

    protected Map<String, WrappedElement> FORM_FIELDS = new HashMap<>();

    public BaseForm setFieldValues(Map<String, String> info) {

        info.keySet().forEach(key -> {
            try {
                this.setFieldValueByName(key, info.get(key));
            } catch (NoSuchFieldException e) {
                throw new NoSuchFieldException("No such field on the current form to set value");
            } catch (ElementValidatedException e) {
                throw new ElementValidatedException("Element value cannot be set up or invalid styles applied");
            }
        });
        return this;
    }

    public BaseForm verifyFieldValues(Map<String, String> info) {
        info.keySet().forEach(key -> this.verifyFieldValueByName(key, info.get(key)));
        return this;
    }

    private BaseForm verifyFieldValueByName(String fieldName, String fieldValue) {
        WrappedElement element = FORM_FIELDS.get(fieldName);

        if (element == null)
            throw new NoSuchFieldException(String.format("%s field doesn't exist", fieldName));

        if (element instanceof Input)
            element.shouldHave(Condition.value(fieldValue));
        else if (element instanceof Checkbox)
            ((Checkbox) element).verifyElementHasValue(fieldValue);
        else if (element instanceof RadioButton)
            ((RadioButton) element).verifyElementHasValue(fieldValue);

        return this;
    }

    private BaseForm setFieldValueByName(String fieldName, String value)
            throws NoSuchFieldException, ElementValidatedException {
        WrappedElement element = FORM_FIELDS.get(fieldName);

        if (element == null)
            throw new NoSuchFieldException(String.format("%s field doesn't exist", fieldName));

        element.setValue(value).pressTab();

        if ((element instanceof ElementValidator) && !((ElementValidator) element).isValidationPassed())
            throw new ElementValidatedException(String.format("%s field is validated", fieldName));

        return this;
    }
}