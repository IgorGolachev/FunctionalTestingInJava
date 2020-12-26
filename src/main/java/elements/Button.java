package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public final class Button extends WrappedElement {

    public Button(String path) {
        super(path);
    }

    public Button(By by) {
        super(by);
    }

    public Button(SelenideElement element) {
        super(element);
    }
}