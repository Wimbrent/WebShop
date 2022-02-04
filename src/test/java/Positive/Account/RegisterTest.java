package Positive.Account;

import Base.BaseTest;
import Data.Information;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "Successfully Register new Customer")
    @Test
    public void successfullyRegister() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToRegister();
        registerPage.enterFirstName(Information.FirstName)
                    .enterLastName(Information.LastName)
                    .enterEmail(Information.Email)
                    .enterTelephone(Information.Telephone)
                    .enterPassword(Information.Password)
                    .enterPasswordConfirm(Information.Password)
                    .selectRadioButtonNo()
                    .checkBoxPrivacyPolicy()
                    .clickButtonContinue();
    }
}
