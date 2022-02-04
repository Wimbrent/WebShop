package Negative.MyAccount;

import Base.BaseTest;
import Data.Information;
import Data.NewInformation;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class EditYourAccountInformationTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void notEnteredFirstName() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToLogin();
        loginPage.enterEmail(Information.Email)
                 .enterPassword(Information.Password)
                 .clickButtonLogin();
        accountPage.linkToEditYourAccountInformation();
        editYourAccountInformationPage.enterLastName(NewInformation.LastName)
                                      .enterEmail(NewInformation.Email)
                                      .enterTelephone(NewInformation.Telephone)
                                      .clickButtonContinue();
        alert.Danger();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void notEnteredLastName() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToLogin();
        loginPage.enterEmail(Information.Email)
                 .enterPassword(Information.Password)
                 .clickButtonLogin();
        accountPage.linkToEditYourAccountInformation();
        editYourAccountInformationPage.enterFirstName(NewInformation.FirstName)
                                      .enterEmail(NewInformation.Email)
                                      .enterTelephone(NewInformation.Telephone)
                                      .clickButtonContinue();
        alert.Danger();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void notEnteredEmail() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToLogin();
        loginPage.enterEmail(Information.Email)
                 .enterPassword(Information.Password)
                 .clickButtonLogin();
        accountPage.linkToEditYourAccountInformation();
        editYourAccountInformationPage.enterFirstName(NewInformation.FirstName)
                                      .enterLastName(NewInformation.LastName)
                                      .enterTelephone(NewInformation.Telephone)
                                      .clickButtonContinue();
        alert.Danger();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void notEnteredTelephone() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToLogin();
        loginPage.enterEmail(Information.Email)
                 .enterPassword(Information.Password)
                 .clickButtonLogin();
        accountPage.linkToEditYourAccountInformation();
        editYourAccountInformationPage.enterFirstName(NewInformation.FirstName)
                                      .enterLastName(NewInformation.LastName)
                                      .enterEmail(NewInformation.Email)
                                      .clickButtonContinue();
        alert.Danger();
    }
}
