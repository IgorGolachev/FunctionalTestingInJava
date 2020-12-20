package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    public void clickLoginButton() {
        $(By.cssSelector("a[class='login']")).click();
    }
}