package Positive.AccountPages;

import Base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class NewsletterTest extends BaseTest {


    @Severity(SeverityLevel.MINOR)
    @Description(value = "Subscribe on Newsletters")
    @Test
    public void Subscribe() {
        accountPage.linkToNewsletter();
        newsletterPage.selectSubscribe()
                      .clickButtonContinue();
    }

    @Severity(SeverityLevel.MINOR)
    @Description(value = "Unsubscribe from Newsletters")
    @Test
    public void Unsubscribe() {
        accountPage.linkToNewsletter();
        newsletterPage.selectUnsubscribe()
                      .clickButtonContinue();
    }
}
