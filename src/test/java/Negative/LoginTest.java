package Negative;

import Base.BaseTest;
import Data.Information;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void wrongPasswordLogin() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToLogin();
        loginPage.enterEmail(Information.Email)
                 .enterPassword(Information.wrongPassword)
                 .clickButtonLogin();
        loginPage.alert();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void wrongEmailLogin() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToLogin();
        loginPage.enterEmail(Information.wrongEmail)
                 .enterPassword(Information.Password)
                 .clickButtonLogin();
        loginPage.alert();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)

    public void accountAttemps() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToLogin();
        loginPage.enterEmail(Information.wrongEmail)
                 .enterPassword(Information.wrongPassword)
                 .clickButtonLogin();
        loginPage.alert();
    }
}
