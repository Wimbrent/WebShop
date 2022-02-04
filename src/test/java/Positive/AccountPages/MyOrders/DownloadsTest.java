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

public class DownloadsTest extends BaseTest {

    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "Downloads Page")
    @Test
    public void Downloads() {
        accountPage.linkToDownloads();
        downloadsPage.Continue();
    }
}
