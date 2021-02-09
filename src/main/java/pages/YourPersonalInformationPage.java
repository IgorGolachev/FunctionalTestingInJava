package pages;

import com.codeborne.selenide.SelenideElement;
import pages.forms.YourPersonalInformationForm;

import static com.codeborne.selenide.Selenide.$;

public class YourPersonalInformationPage {

    public final SelenideElement breadCrumbs = $("a[class='home'] ~ span ~ span ~ span");
    public final YourPersonalInformationForm yourPersonalInformationForm = new YourPersonalInformationForm();
}