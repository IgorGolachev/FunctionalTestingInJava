package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public final class Select extends WrappedElement {

    @Override
    public SelenideElement setValue(String option) {
        super.selectOptionContainingText(option);
        return super.element;
    }

    public Select(String path) {
        super(path);
    }

    public Select(By by) {
        super(by);
    }

    public Select(SelenideElement element) {
        super(element);
    }

}
