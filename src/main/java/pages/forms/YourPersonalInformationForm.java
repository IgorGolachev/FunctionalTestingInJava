package pages.forms;

import elements.Checkbox;
import elements.FormInput;
import elements.RadioButton;

public class YourPersonalInformationForm extends BaseForm {

    public final RadioButton titleMrRadioButton = new RadioButton("input[id='id_gender1']");
    public final RadioButton titleMrsRadioButton = new RadioButton("input[id='id_gender2']");

    public final FormInput firstNameInput = new FormInput("input[id='firstname']");
    public final FormInput lastNameInput = new FormInput("input[id='lastname']");

    public final FormInput emailInput = new FormInput("input[id='email']");

    public final Checkbox newsletterCheckbox = new Checkbox("input[id='newsletter']");
    public final Checkbox offerCheckbox = new Checkbox("input[id='optin']");

    public YourPersonalInformationForm() {
        FORM_FIELDS.put("Mr", titleMrRadioButton);
        FORM_FIELDS.put("Mrs", titleMrsRadioButton);
        FORM_FIELDS.put("FirstName", firstNameInput);
        FORM_FIELDS.put("LastName", lastNameInput);
        FORM_FIELDS.put("Email", emailInput);
        FORM_FIELDS.put("Newsletter", newsletterCheckbox);
        FORM_FIELDS.put("SpecialOffer", offerCheckbox);
    }
}