package Positive.Account;

import Base.BaseTest;
import Data.Information;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class ForgottenPasswordTest extends BaseTest {

    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "Successfully reset Password")
    @Test
    public void successfulResetPassword() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToLogin();
        loginPage.forgottenPassword();
        forgottenPasswordPage.enterEmail(Information.Email)
                             .clickButtonContinue();
    }
}
