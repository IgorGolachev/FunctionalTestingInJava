package elements;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import lombok.experimental.Delegate;
import lombok.Builder;

import java.time.Duration;

@Builder
public class WrappedElement {

    public static final Duration ELEMENT_TIMEOUT = Duration.ofMillis(3000);

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