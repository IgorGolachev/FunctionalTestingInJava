package pages.forms;

import elements.Checkbox;
import elements.FormInput;
import elements.RadioButton;
import elements.WrappedElement;
import exception.ElementValidatedException;
import exception.NoSuchFieldException;
import interfaces.ElementValidator;

import java.util.HashMap;
import java.util.Map;

public class YourPersonalInformationForm {

    private static final Map<String, WrappedElement> FORM_FIELDS = new HashMap<>();

    public final RadioButton titleMrRadioButton = new RadioButton("input[id='id_gender1']");
    public final RadioButton titleMrsRadioButton = new RadioButton("input[id='id_gender2']");

    public final FormInput firstNameInput = new FormInput("input[id='customer_firstname']");
    public final FormInput lastNameInput = new FormInput("input[id='customer_lastname']");

    public final Checkbox newsletterCheckbox = new Checkbox("input[id='newsletter']");
    public final Checkbox offerCheckbox = new Checkbox("input[id='optin']");

    public YourPersonalInformationForm setFieldValueByName(String fieldName, String value)
            throws NoSuchFieldException, ElementValidatedException {
        WrappedElement element = FORM_FIELDS.get(fieldName);

        if (element == null)
            throw new NoSuchFieldException(String.format("%s field doesn't exist", fieldName));
        element.setValue(value).pressTab();

        if ((element instanceof ElementValidator) && !((ElementValidator) element).isValidationPassed())
            throw new ElementValidatedException(String.format("%s field is validated", fieldName));

        return this;
    }

    public YourPersonalInformationForm() {
        FORM_FIELDS.put("Mr", titleMrRadioButton);
        FORM_FIELDS.put("Mrs", titleMrsRadioButton);
        FORM_FIELDS.put("FirstName", firstNameInput);
        FORM_FIELDS.put("LastName", lastNameInput);
        FORM_FIELDS.put("Newsletter", newsletterCheckbox);
        FORM_FIELDS.put("SpecialOffer", offerCheckbox);
    }
}