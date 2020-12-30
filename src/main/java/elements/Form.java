package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public final class Form extends WrappedElement {

    public Form(String path) {
        super(path);
    }

    public Form(By by) {
        super(by);
    }

    public Form(SelenideElement element) {
        super(element);
    }
}