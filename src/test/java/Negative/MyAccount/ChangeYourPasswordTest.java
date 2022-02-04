package Negative.MyAccount;

import Base.BaseTest;
import Data.Information;
import Data.NewInformation;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class ChangeYourPasswordTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void failedChangePassword() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToLogin();
        loginPage.enterEmail(Information.Email)
                 .enterPassword(Information.Password)
                 .clickButtonLogin();
        accountPage.linkToChangeYourPassword();
        changeYourPasswordPage.enterPassword(NewInformation.Password)
                              .enterPasswordConfirm(NewInformation.wrongPassword)
                              .clickButtonContinue();
        alert.Danger();
    }
}
