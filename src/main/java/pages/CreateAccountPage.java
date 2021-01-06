package pages;

import com.codeborne.selenide.SelenideElement;
import pages.forms.YourPersonalInformationForm;

import static com.codeborne.selenide.Selenide.$;

public class CreateAccountPage {

    public final SelenideElement pageHeader = $("h1[class='page-heading']");
    public final SelenideElement breadCrumbs = $("a[class='home'] ~ span ~ span");

    public final YourPersonalInformationForm personalInformation = new YourPersonalInformationForm();
}
