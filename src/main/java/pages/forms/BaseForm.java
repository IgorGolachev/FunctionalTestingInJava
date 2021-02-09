package pages.forms;

import com.codeborne.selenide.Condition;
import elements.WrappedElement;
import exception.ElementValidatedException;
import exception.NoSuchFieldException;
import interfaces.ElementValidator;

import java.util.HashMap;
import java.util.Map;

public class BaseForm {

    protected Map<String, WrappedElement> FORM_FIELDS = new HashMap<>();

    public BaseForm setFieldValues(Map<String, String> info)
            throws NoSuchFieldException, ElementValidatedException {
        for (String key : info.keySet()) {
            this.setFieldValueByName(key, info.get(key));
        }
        return this;
    }

    public BaseForm verifyFieldValues(Map<String, String> info) throws NoSuchFieldException {
        for (String key : info.keySet()) {
            this.verifyFieldValueByName(key, info.get(key));
        }
        return this;
    }

    private BaseForm verifyFieldValueByName(String fieldName, String value) throws NoSuchFieldException {
        WrappedElement element = FORM_FIELDS.get(fieldName);

        if (element == null)
            throw new NoSuchFieldException(String.format("%s field doesn't exist", fieldName));

        //element.shouldHave(Condition.);
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