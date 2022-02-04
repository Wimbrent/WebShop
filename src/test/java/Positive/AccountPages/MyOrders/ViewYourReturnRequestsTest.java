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

public class ViewYourReturnRequestsTest extends BaseTest {

    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "View your return request")
    @Test
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

    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "Click on buttons next and previous")
    @Test
    public void ButtonNextAndPrevious() {
        accountPage.linkToReturnRequests();
        viewYourReturnRequestsPage.nextPage();
        viewYourReturnRequestsPage.previousPage();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "Click on buttons last and first")
    @Test
    public void ButtonLastAndFirst() {
        accountPage.linkToReturnRequests();
        viewYourReturnRequestsPage.lastPage();
        viewYourReturnRequestsPage.firstPage();
    }
}