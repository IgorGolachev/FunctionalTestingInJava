package pages.forms;

import elements.Input;
import elements.Select;

public class YourAddressInformationForm extends BaseForm {

    public final Input firstNameInput = new Input("input[id='firstname']");
    public final Input lastNameInput = new Input("input[id='lastname']");
    public final Input companyInput = new Input("input[id='company']");
    public final Input addressLineOneInput = new Input("input[id='address1']");
    public final Input addressLineTwoInput = new Input("input[id='address2']");
    public final Input cityInput = new Input("input[id='city']");
    public final Select stateSelect = new Select("select[id='id_state']");
    public final Input zipInput = new Input("input[id='postcode']");
    public final Select countrySelect = new Select("select[id='id_country']");
    public final Input addInfoTextBox = new Input("textarea[id='other']");
    public final Input homePhoneInput = new Input("input[id='phone']");
    public final Input mobilePhoneInput = new Input("input[id='phone_mobile']");
    public final Input addressAliasInput = new Input("input[id='alias']");

    public YourAddressInformationForm() {
        FORM_FIELDS.put("FirstName", firstNameInput);
        FORM_FIELDS.put("LastName", lastNameInput);
        FORM_FIELDS.put("Company", companyInput);
        FORM_FIELDS.put("Address", addressLineOneInput);
        FORM_FIELDS.put("AddressLine2", addressLineTwoInput);
        FORM_FIELDS.put("City", cityInput);
        FORM_FIELDS.put("State", stateSelect);
        FORM_FIELDS.put("Zip", zipInput);
        FORM_FIELDS.put("Country", countrySelect);
        FORM_FIELDS.put("AdditionalInformation", addInfoTextBox);
        FORM_FIELDS.put("HomePhone", homePhoneInput);
        FORM_FIELDS.put("MobilePhone", mobilePhoneInput);
        FORM_FIELDS.put("AddressAlias", addressAliasInput);
    }
}
