package Positive.AccountPages.MyOrders;

import Base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ViewYourOrderHistoryTest extends BaseTest {

    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "Reorder Product")
    @Parameters({"id", "select_payment_address", "select_shipping_address"})
    @Test
    public void ReorderProduct(int id, int select_payment_address, int select_shipping_address) throws InterruptedException {
        myAccountMenu.myAccountMenuOpen()
                     .linkToMyAccount();
        accountPage.linkToViewYourOrderHistory();
        viewYourOrderHistoryPage.view(id);
        orderInformationPage.Reorder();
        cart.cartTotal()
            .checkout();
        if (checkOutPage.elementList.size() > 0) {
            System.out.println("Product sold out");
            viewCartPage.Remove();
        } else {
            checkOutPage.paymentExisting(select_payment_address)
                        .continueBillingDetails()
                        .shippingExisting(select_shipping_address)
                        .continueDeliveryDetails()
                        .enterCommentDeliveryMethod("NothingToSay")
                        .continueDeliveryMethod()
                        .enterCommentPaymentMethod("NothingToSayAgain")
                        .checkBoxTermsAndConditions()
                        .continuePaymentMethod()
                        .confirmOrder();
            Assert.assertEquals(driver.getTitle(), "Your order has been placed!");
        }
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "Return Product")
    @Test
    @Parameters({"id"})
    public void ReturnProduct(int id) {
        myAccountMenu.myAccountMenuOpen()
                     .linkToMyAccount();
        accountPage.linkToViewYourOrderHistory();
        viewYourOrderHistoryPage.view(id);
        orderInformationPage.Return();
        productReturnsPage.selectReasonDeadOnArrival()
                          .Submit();
    }
}