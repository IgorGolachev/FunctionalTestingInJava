package pages.forms;

import elements.FormInput;
import elements.RadioButton;
import elements.WrappedElement;
import exception.NoSuchFieldException;

import java.util.HashMap;
import java.util.Map;

public class YourPersonalInformation {

    private static final Map<String, WrappedElement> FORM_FIELDS = new HashMap<>();

    public final RadioButton titleMrRadioButton = new RadioButton("input[id='id_gender1']");
    public final RadioButton titleMrsRadioButton = new RadioButton("input[id='id_gender2']");

    public final FormInput firstNameInput = new FormInput("input[id='customer_firstname']");
    public final FormInput lastNameInput = new FormInput("input[id='customer_lastname']");

    public YourPersonalInformation setFieldValueByName(String fieldName, String value) throws NoSuchFieldException {
        WrappedElement element = FORM_FIELDS.get(fieldName);
        if (element == null)
            throw new NoSuchFieldException(String.format("%s field doesn't exist", fieldName));
        element.setValue(value);
        return this;
    }

    public YourPersonalInformation() {
        FORM_FIELDS.put("Mr", titleMrRadioButton);
        FORM_FIELDS.put("Mrs", titleMrsRadioButton);
        FORM_FIELDS.put("First name", firstNameInput);
        FORM_FIELDS.put("Last name", lastNameInput);
    }
}