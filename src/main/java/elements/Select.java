package elements;

import com.codeborne.selenide.SelenideElement;

public final class Select extends WrappedElement {

    @Override
    public SelenideElement setValue(String option) {
        super.selectOptionContainingText(option);
        return super.element;
    }

    public Select(String path) {
        super(path);
    }

}
