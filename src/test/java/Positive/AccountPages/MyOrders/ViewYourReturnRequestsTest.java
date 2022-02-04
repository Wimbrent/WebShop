package Positive.AccountPages.MyOrders;

import Base.BaseTest;
import Data.Information;
import Data.URLs;
import io.qameta.allure.Allure;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewYourReturnRequestsTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void ViewReturnRequest(int id) {

        accountPage.linkToReturnRequests();
        viewYourReturnRequestsPage.getID(id);
        viewYourReturnRequestsPage.view(id);
        returnInformationPage.getID();
        Allure.step("Assert ID");
        Assert.assertEquals(viewYourReturnRequestsPage.getID(id), returnInformationPage.getID());
        returnInformationPage.Continue();
        Allure.step("Assert url");
        Assert.assertEquals(driver.getCurrentUrl(), URLs.ViewYourReturnRequestsPage);
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void ButtonNextAndPrevious() {
        accountPage.linkToReturnRequests();
        viewYourReturnRequestsPage.nextPage();
        viewYourReturnRequestsPage.previousPage();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void ButtonLastAndFirst() {
        accountPage.linkToReturnRequests();
        viewYourReturnRequestsPage.lastPage();
        viewYourReturnRequestsPage.firstPage();
    }
}