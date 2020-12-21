package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class BasePageElements {

    @FindBy(css="a[class='login']")
    public SelenideElement signInButton;


}
