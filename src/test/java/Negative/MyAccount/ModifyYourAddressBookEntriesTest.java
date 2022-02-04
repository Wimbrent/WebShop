package Negative.MyAccount;

import Base.BaseTest;
import Data.Information;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;


public class ModifyYourAddressBookEntriesTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void notEnteredFirstName() throws InterruptedException {
        myAccountMenu.myAccountMenuOpen()
                     .linkToLogin();
        loginPage.enterEmail(Information.Email)
                 .enterPassword(Information.Password)
                 .clickButtonLogin();
        accountPage.linkToModifyYourAddressBookEntries();
        modifyYourAddressBookEntriesPage.NewAddress()
                                        .enterLastName(Information.LastName)
                                        .enterCompany(Information.Company)
                                        .enterFirstAddress(Information.FirstAddress)
                                        .enterCity(Information.City)
                                        .enterPostCode(Information.PostCode)
                                        .selectCountry(Information.Country)
                                        .selectRegion(Information.Region)
                                        .clickButtonContinue();
        alert.Danger();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void notEnteredLastName() throws InterruptedException {
        myAccountMenu.myAccountMenuOpen()
                     .linkToLogin();
        loginPage.enterEmail(Information.Email)
                 .enterPassword(Information.Password)
                 .clickButtonLogin();
        accountPage.linkToModifyYourAddressBookEntries();
        modifyYourAddressBookEntriesPage.NewAddress()
                                        .enterFirstName(Information.FirstName)
                                        .enterCompany(Information.Company)
                                        .enterFirstAddress(Information.FirstAddress)
                                        .enterCity(Information.City)
                                        .enterPostCode(Information.PostCode)
                                        .selectCountry(Information.Country)
                                        .selectRegion(Information.Region)
                                        .clickButtonContinue();
        alert.Danger();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void notEnteredFirstAddress() throws InterruptedException {
        myAccountMenu.myAccountMenuOpen()
                     .linkToLogin();
        loginPage.enterEmail(Information.Email)
                 .enterPassword(Information.Password)
                 .clickButtonLogin();
        accountPage.linkToModifyYourAddressBookEntries();
        modifyYourAddressBookEntriesPage.NewAddress()
                                        .enterFirstName(Information.FirstName)
                                        .enterLastName(Information.LastName)
                                        .enterCompany(Information.Company)
                                        .enterCity(Information.City)
                                        .enterPostCode(Information.PostCode)
                                        .selectCountry(Information.Country)
                                        .selectRegion(Information.Region)
                                        .clickButtonContinue();
        alert.Danger();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void notEnteredCity() throws InterruptedException {
        myAccountMenu.myAccountMenuOpen()
                     .linkToLogin();
        loginPage.enterEmail(Information.Email)
                 .enterPassword(Information.Password)
                 .clickButtonLogin();
        accountPage.linkToModifyYourAddressBookEntries();
        modifyYourAddressBookEntriesPage.NewAddress()
                                        .enterFirstName(Information.FirstName)
                                        .enterLastName(Information.LastName)
                                        .enterCompany(Information.Company)
                                        .enterFirstAddress(Information.FirstAddress)
                                        .enterPostCode(Information.PostCode)
                                        .selectCountry(Information.Country)
                                        .selectRegion(Information.Region)
                                        .clickButtonContinue();
        alert.Danger();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void notEnteredPostCode() throws InterruptedException {
        myAccountMenu.myAccountMenuOpen()
                     .linkToLogin();
        loginPage.enterEmail(Information.Email)
                 .enterPassword(Information.Password)
                 .clickButtonLogin();
        accountPage.linkToModifyYourAddressBookEntries();
        modifyYourAddressBookEntriesPage.NewAddress()
                                        .enterFirstName(Information.FirstName)
                                        .enterLastName(Information.LastName)
                                        .enterCompany(Information.Company)
                                        .enterFirstAddress(Information.FirstAddress)
                                        .enterCity(Information.City)
                                        .enterPostCode(Information.PostCode)
                                        .selectCountry(Information.Country)
                                        .selectRegion(Information.Region)
                                        .clickButtonContinue();
        alert.Danger();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void notSelectedRegionOrState() throws InterruptedException {
        myAccountMenu.myAccountMenuOpen()
                     .linkToLogin();
        loginPage.enterEmail(Information.Email)
                 .enterPassword(Information.Password)
                 .clickButtonLogin();
        accountPage.linkToModifyYourAddressBookEntries();
        modifyYourAddressBookEntriesPage.NewAddress()
                                        .enterFirstName(Information.FirstName)
                                        .enterLastName(Information.LastName)
                                        .enterCompany(Information.Company)
                                        .enterFirstAddress(Information.FirstAddress)
                                        .enterCity(Information.City)
                                        .enterPostCode(Information.PostCode)
                                        .selectCountry(Information.Country)
                                        .selectRegion(Information.Region)
                                        .clickButtonContinue();
        alert.Danger();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void errorDeleteAddress() {
        accountPage.linkToModifyYourAddressBookEntries();
        modifyYourAddressBookEntriesPage.Delete();
        alert.Warning();
    }
}