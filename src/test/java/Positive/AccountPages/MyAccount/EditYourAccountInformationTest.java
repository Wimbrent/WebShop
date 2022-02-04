package Positive.AccountPages.MyAccount;

import Base.BaseTest;
import Data.NewInformation;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class EditYourAccountInformationTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void successfullyEditYourAccountInformation() {
        accountPage.linkToEditYourAccountInformation();
        editYourAccountInformationPage.enterFirstName(NewInformation.FirstName)
                                      .enterLastName(NewInformation.LastName)
                                      .enterEmail(NewInformation.Email)
                                      .enterTelephone(NewInformation.Telephone)
                                      .clickButtonContinue();
        alert.Successfully();
    }
}
