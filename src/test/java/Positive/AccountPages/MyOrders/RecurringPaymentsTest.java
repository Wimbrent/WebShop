package Positive.AccountPages.MyOrders;

import Base.BaseTest;
import Data.Information;
import Data.URLs;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RecurringPaymentsTest extends BaseTest {

    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "Recurring Payments Page")
    @Test
    public void RecurringPayments() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToMyAccount();
        accountPage.linkToRecurringPayments();
        recurringPaymentsPage.Continue();
    }
}
