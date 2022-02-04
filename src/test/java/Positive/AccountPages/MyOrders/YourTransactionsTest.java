package Positive.AccountPages.MyOrders;

import Base.BaseTest;
import Data.Information;
import Data.URLs;
import io.qameta.allure.Allure;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YourTransactionsTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void YourTransactions() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToMyAccount();
        accountPage.linkToYourTransactions();
        yourTransactionsPage.Continue();
    }
}
