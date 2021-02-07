package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public final class Input extends WrappedElement {

    public Input(String path) {
        super(path);
    }

    public Input(By by) {
        super(by);
    }

    public Input(SelenideElement element) {
        super(element);
    }
}