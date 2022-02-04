package Negative;

import Base.BaseTest;
import Data.Information;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void notEnteredFirstName() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToRegister();
        registerPage.enterLastName(Information.LastName)
                    .enterEmail(Information.Email)
                    .enterTelephone(Information.Telephone)
                    .enterPassword(Information.Password)
                    .enterPasswordConfirm(Information.Password)
                    .selectRadioButtonNo()
                    .checkBoxPrivacyPolicy()
                    .clickButtonContinue();
        alert.Danger();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void notEnteredLastName() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToRegister();
        registerPage.enterFirstName(Information.FirstName)
                    .enterEmail(Information.Email)
                    .enterTelephone(Information.Telephone)
                    .enterPassword(Information.Password)
                    .enterPasswordConfirm(Information.Password)
                    .selectRadioButtonNo()
                    .checkBoxPrivacyPolicy()
                    .clickButtonContinue();
        alert.Danger();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void notEnteredEmailName() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToRegister();
        registerPage.enterFirstName(Information.FirstName)
                    .enterLastName(Information.LastName)
                    .enterTelephone(Information.Telephone)
                    .enterPassword(Information.Password)
                    .enterPasswordConfirm(Information.Password)
                    .selectRadioButtonNo()
                    .checkBoxPrivacyPolicy()
                    .clickButtonContinue();
        alert.Danger();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void notEnteredTelephone() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToRegister();
        registerPage.enterFirstName(Information.FirstName)
                    .enterLastName(Information.LastName)
                    .enterEmail(Information.Email)
                    .enterPassword(Information.Password)
                    .enterPasswordConfirm(Information.Password)
                    .selectRadioButtonNo()
                    .checkBoxPrivacyPolicy()
                    .clickButtonContinue();
        alert.Danger();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void notEnteredPassword() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToRegister();
        registerPage.enterFirstName(Information.FirstName)
                    .enterLastName(Information.LastName)
                    .enterEmail(Information.Email)
                    .enterTelephone(Information.Telephone)
                    .enterPasswordConfirm(Information.Password)
                    .selectRadioButtonNo()
                    .checkBoxPrivacyPolicy()
                    .clickButtonContinue();
        alert.Danger();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void wrongPassword() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToRegister();
        registerPage.enterFirstName(Information.FirstName)
                    .enterLastName(Information.LastName)
                    .enterEmail(Information.Email)
                    .enterTelephone(Information.Telephone)
                    .enterPassword(Information.Password)
                    .enterPasswordConfirm(Information.wrongPassword)
                    .selectRadioButtonNo()
                    .checkBoxPrivacyPolicy()
                    .clickButtonContinue();
        alert.Danger();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void errorPrivacyPolicy() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToRegister();
        registerPage.enterFirstName(Information.FirstName)
                    .enterLastName(Information.LastName)
                    .enterEmail(Information.Email)
                    .enterTelephone(Information.Telephone)
                    .enterPassword(Information.Password)
                    .enterPasswordConfirm(Information.Password)
                    .selectRadioButtonNo()
                    .clickButtonContinue();
        alert.Danger();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void emailRegistered() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToRegister();
        registerPage.enterFirstName(Information.FirstName)
                    .enterLastName(Information.LastName)
                    .enterEmail(Information.wrongEmail)
                    .enterTelephone(Information.Telephone)
                    .enterPassword(Information.Password)
                    .enterPasswordConfirm(Information.Password)
                    .selectRadioButtonNo()
                    .checkBoxPrivacyPolicy()
                    .clickButtonContinue();
        alert.Danger();
    }
}