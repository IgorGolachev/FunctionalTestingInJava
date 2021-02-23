package pages;

import com.codeborne.selenide.SelenideElement;
import elements.CheckOutTable;

import static com.codeborne.selenide.Selenide.$;

public class CheckOutSummaryPage {

    public final SelenideElement pageHeader = $("h1[class='page-heading']");
    public final SelenideElement breadCrumbs = $("a[class='home'] ~ span ~ span");

    public final CheckOutTable productTable = new CheckOutTable("table[id='cart_summary']");

}
