package elements;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import lombok.experimental.Delegate;
import lombok.Builder;

@Builder
public class WrappedElement {

    // This constructor is able to process css or xpath only
    public WrappedElement(String path) {
        if (path.startsWith("//")) {
            this.element = Selenide.$x(path);
        } else {
            this.element = Selenide.$(path);
        }
    }

    public WrappedElement(By by) {
        this.element = Selenide.$(by);
    }

    public WrappedElement(SelenideElement element) {
        this.element = element;
    }

    @Delegate
    SelenideElement element;
}