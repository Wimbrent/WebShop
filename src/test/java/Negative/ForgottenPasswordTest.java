package Negative;

import Base.BaseTest;
import Data.Information;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class ForgottenPasswordTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void errorEmailAddress() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToLogin();
        loginPage.forgottenPassword();
        forgottenPasswordPage.enterEmail(Information.wrongEmail)
                             .clickButtonContinue();
        loginPage.alert();
    }
}
