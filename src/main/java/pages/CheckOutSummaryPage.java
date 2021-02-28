package pages;

import com.codeborne.selenide.SelenideElement;
import elements.CheckOutTable;
import elements.Checkbox;

import static com.codeborne.selenide.Selenide.$;

public class CheckOutSummaryPage {

    public final SelenideElement pageHeader = $("h1[class='page-heading']");
    public final SelenideElement breadCrumbs = $("a[class='home'] ~ span ~ span");

    public final CheckOutTable checkOutTable = new CheckOutTable("table[id='cart_summary']");
    public final SelenideElement proceedToAddressLink = $("p a[title='Proceed to checkout'] span");
    public final SelenideElement proceedToShipmentLink = $("button[name='processAddress'] span");
    public final Checkbox shipmentAgreementCheckbox = new Checkbox("input[id='cgv']");
    public final SelenideElement proceedToPaymentLink = $("button[name='processCarrier'] span");
    public final SelenideElement payByBankWireLink = $("a[class='bankwire']");
    public final SelenideElement confirmOrderButton = $("p[id='cart_navigation'] button span");
    public final SelenideElement confirmationLabel = $("p[class='cheque-indent'] strong");

}
