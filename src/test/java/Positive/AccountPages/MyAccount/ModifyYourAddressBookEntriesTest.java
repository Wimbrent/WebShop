package Positive.AccountPages.MyAccount;

import Base.BaseTest;
import Data.Information;
import Data.NewInformation;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;


public class ModifyYourAddressBookEntriesTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void addNewAddress() throws InterruptedException {
        myAccountMenu.myAccountMenuOpen()
                     .linkToMyAccount();
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
        alert.Successfully();
        modifyYourAddressBookEntriesPage.clickButtonBack();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void editAddress() throws InterruptedException {
        myAccountMenu.myAccountMenuOpen()
                     .linkToMyAccount();
        accountPage.linkToModifyYourAddressBookEntries();
        modifyYourAddressBookEntriesPage.NewAddress()
                                        .enterFirstName(NewInformation.FirstName)
                                        .enterLastName(NewInformation.LastName)
                                        .enterCompany(NewInformation.Company)
                                        .enterFirstAddress(NewInformation.FirstAddress)
                                        .enterCity(NewInformation.City)
                                        .enterPostCode(NewInformation.PostCode)
                                        .selectCountry(NewInformation.Country)
                                        .selectRegion(NewInformation.Region)
                                        .clickButtonContinue();
        alert.Successfully();
        modifyYourAddressBookEntriesPage.clickButtonBack();
    }

    @Test
    public void successfullyDeletedAddress() {
        myAccountMenu.myAccountMenuOpen()
                     .linkToMyAccount();
        accountPage.linkToModifyYourAddressBookEntries();
        modifyYourAddressBookEntriesPage.Delete();
        alert.Successfully();
        modifyYourAddressBookEntriesPage.clickButtonBack();
    }
}