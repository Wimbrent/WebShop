package Positive.Account;

import Base.BaseTest;
import Data.Information;
import Data.NewInformation;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "Successfully Login")
    @Test
    public void successfullyLogin() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToLogin();
        loginPage.enterEmail(Information.Email)
                 .enterPassword(Information.Password)
                 .clickButtonLogin();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "Successfully Logout")
    @Test
    public void successfullyLogout() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToLogout();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "Successfully Login with new Login and Password")
    @Test
    public void successfullyLoginWithNewLoginAndPassword() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToLogin();
        loginPage.enterEmail(NewInformation.Email)
                 .enterPassword(NewInformation.Password)
                 .clickButtonLogin();
    }
}
