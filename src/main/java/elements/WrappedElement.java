package elements;

import java.time.Duration;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import lombok.experimental.Delegate;
import lombok.Builder;

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

    protected WrappedElement verifyElementHasValue(String value) {
        System.out.println("default implementation for value field check");
        return this;
    }

    public WrappedElement(SelenideElement element) {
        this.element = element;
    }

    @Delegate
    SelenideElement element;
}