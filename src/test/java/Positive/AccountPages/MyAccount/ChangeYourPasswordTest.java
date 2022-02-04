package Positive.AccountPages.MyAccount;

import Base.BaseTest;
import Data.NewInformation;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class ChangeYourPasswordTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void successfullyChangePassword() {
        accountPage.linkToChangeYourPassword();
        changeYourPasswordPage.enterPassword(NewInformation.Password)
                              .enterPasswordConfirm(NewInformation.Password)
                              .clickButtonContinue();
        alert.Successfully();
    }
}
