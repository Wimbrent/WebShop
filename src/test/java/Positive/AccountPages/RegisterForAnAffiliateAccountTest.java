package Positive.AccountPages;

import Base.BaseTest;
import Data.RegisterAffiliate;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class RegisterForAnAffiliateAccountTest extends BaseTest {

    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "Register Affiliate Account")
    @Test
    public void RegisterAffiliateAccount() {
        accountPage.linkToRegisterForAnAffiliateAccount();
        affiliateAccountPage.enterCompanyName(RegisterAffiliate.Company)
                            .enterWebSite(RegisterAffiliate.WebSite)
                            .enterTaxID(RegisterAffiliate.TaxID)
                            .enterChequePayeeName(RegisterAffiliate.ChequePayeeName)
                            .selectPaypalPaymentMethod()
                            .enterPayPalEmail(RegisterAffiliate.PayPalEmail)
                            .selectBankPaymentMethod()
                            .enterBankName(RegisterAffiliate.BankName)
                            .enterBrunchNumber(RegisterAffiliate.BrunchNumber)
                            .enterSwiftCode(RegisterAffiliate.SwiftCode)
                            .enterBankAccountName(RegisterAffiliate.AccountName)
                            .enterBankAccountNumber(RegisterAffiliate.AccountNumber)
                            .clickAgreeCheckBox()
                            .clickButtonContinue();
    }
}
