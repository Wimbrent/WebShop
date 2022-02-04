package Positive.AccountPages.MyOrders;

import Base.BaseTest;
import Data.URLs;
import Data.Information;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YourRewardPointsTest extends BaseTest {

    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "Your reward points page")
    @Test
    public void YourRewardPoints() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToMyAccount();
        accountPage.linkToRewardPoints();
        yourRewardPointsPage.Continue();
    }
}
