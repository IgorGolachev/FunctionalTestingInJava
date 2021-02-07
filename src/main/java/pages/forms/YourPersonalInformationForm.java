package pages.forms;

import elements.*;

public class YourPersonalInformationForm extends BaseForm {

    public final RadioButton titleMrRadioButton = new RadioButton("input[id='id_gender1']");
    public final RadioButton titleMrsRadioButton = new RadioButton("input[id='id_gender2']");

    public final FormInput firstNameInput = new FormInput("input[id='customer_firstname']");
    public final FormInput lastNameInput = new FormInput("input[id='customer_lastname']");

    public final FormInput emailInput = new FormInput("input[id='email']");
    public final FormInput passwordInput = new FormInput("input[id='passwd']");

    public final Checkbox newsletterCheckbox = new Checkbox("input[id='newsletter']");
    public final Checkbox offerCheckbox = new Checkbox("input[id='optin']");

    public final Select daySelect = new Select("select[id='days']");
    public final Select monthSelect = new Select("select[id='months']");
    public final Select yearsSelect = new Select("select[id='years']");

    public YourPersonalInformationForm() {
        FORM_FIELDS.put("Mr", titleMrRadioButton);
        FORM_FIELDS.put("Mrs", titleMrsRadioButton);
        FORM_FIELDS.put("FirstName", firstNameInput);
        FORM_FIELDS.put("LastName", lastNameInput);
        FORM_FIELDS.put("Email", emailInput);
        FORM_FIELDS.put("Password", passwordInput);
        FORM_FIELDS.put("Newsletter", newsletterCheckbox);
        FORM_FIELDS.put("SpecialOffer", offerCheckbox);
    }
}