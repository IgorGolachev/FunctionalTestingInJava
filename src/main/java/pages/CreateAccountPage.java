package pages;

import com.codeborne.selenide.SelenideElement;
import pages.forms.YourAddressInformationForm;
import pages.forms.YourPersonalInformationForm;

import static com.codeborne.selenide.Selenide.$;

public class CreateAccountPage {

    public final SelenideElement pageHeader = $("h1[class='page-heading']");
    public final SelenideElement breadCrumbs = $("a[class='home'] ~ span ~ span");
    public final SelenideElement registerButton = $("button[id='submitAccount']");

    public final YourPersonalInformationForm personalInformation = new YourPersonalInformationForm();
    public final YourAddressInformationForm addressInformation = new YourAddressInformationForm();
}
