package AccountPages;

import Base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AffiliateAccountPage extends BasePage {
    public AffiliateAccountPage(WebDriver driver) {
        super(driver);
    }


    public AffiliateAccountPage clearCompanyName() {
        driver.findElement(By.id("input-company")).clear();
        return this;
    }

    @Step(value = "Enter Company name")
    public AffiliateAccountPage enterCompanyName(String companyName) {
        driver.findElement(By.id("input-company")).sendKeys(companyName);
        return this;
    }

    @Step(value = "Clear Company name")
    public AffiliateAccountPage clearWebSite() {
        driver.findElement(By.id("input-website")).clear();
        return this;
    }

    @Step(value = "Enter Website")
    public AffiliateAccountPage enterWebSite(String webSite) {
        driver.findElement(By.id("input-website")).sendKeys(webSite);
        return this;
    }

    @Step(value = "Clear Tax ID")
    public AffiliateAccountPage clearTaxID() {
        driver.findElement(By.id("input-tax")).clear();
        return this;
    }

    @Step(value = "Enter Tax ID")
    public AffiliateAccountPage enterTaxID(String taxID) {
        driver.findElement(By.id("input-tax")).sendKeys(taxID);
        return this;
    }

    @Step(value = "Select Cheque")
    public AffiliateAccountPage selectCheque() {
        driver.findElement(By.xpath("//input[@value = 'cheque']")).click();
        return this;
    }

    @Step(value = "ClearCheque Payee name")
    public AffiliateAccountPage clearChequePayeeName() {
        driver.findElement(By.id("input-cheque")).clear();
        return this;
    }

    @Step(value = "Enter Cheque Payee name")
    public AffiliateAccountPage enterChequePayeeName(String chequePayeeName) {
        driver.findElement(By.id("input-cheque")).sendKeys(chequePayeeName);
        return this;
    }

    @Step(value = "Select PayPal Payment")
    public AffiliateAccountPage selectPaypalPaymentMethod() {
        driver.findElement(By.xpath("//input[@value = 'paypal']")).click();
        return this;
    }

    @Step(value = "Clear PayPal email")
    public AffiliateAccountPage clearPayPalEmail() {
        driver.findElement(By.id("input-paypal")).clear();
        return this;
    }

    @Step(value = "Enter PayPal email")
    public AffiliateAccountPage enterPayPalEmail(String payPalEmail) {
        driver.findElement(By.id("input-paypal")).sendKeys(payPalEmail);
        return this;
    }

    @Step(value = "Select Bank Payment")
    public AffiliateAccountPage selectBankPaymentMethod() {
        driver.findElement(By.xpath("//input[@value = 'bank']")).click();
        return this;
    }

    @Step(value = "Clear Bank name")
    public AffiliateAccountPage clearBankName() {
        driver.findElement(By.id("input-bank-name")).clear();
        return this;
    }

    @Step(value = "Enter Bank name")
    public AffiliateAccountPage enterBankName(String bankName) {
        driver.findElement(By.id("input-bank-name")).sendKeys(bankName);
        return this;
    }

    @Step(value = "Clear Brunch number")
    public AffiliateAccountPage clearBrunchNumber() {
        driver.findElement(By.id("input-bank-branch-number")).clear();
        return this;
    }

    @Step(value = "Enter Brunch number")
    public AffiliateAccountPage enterBrunchNumber(String brunchNumber) {
        driver.findElement(By.id("input-bank-branch-number")).sendKeys(brunchNumber);
        return this;
    }

    @Step(value = "Clear Swift code")
    public AffiliateAccountPage clearSwiftCode() {
        driver.findElement(By.id("input-bank-swift-code")).clear();
        return this;
    }

    @Step(value = "Enter Swift code")
    public AffiliateAccountPage enterSwiftCode(String swiftCode) {
        driver.findElement(By.id("input-bank-swift-code")).sendKeys(swiftCode);
        return this;
    }

    @Step(value = "Clear Bank Account name")
    public AffiliateAccountPage clearBankAccountName() {
        driver.findElement(By.id("input-bank-account-name")).clear();
        return this;
    }

    @Step(value = "Enter Bank Account name")
    public AffiliateAccountPage enterBankAccountName(String accountName) {
        driver.findElement(By.id("input-bank-account-name")).sendKeys(accountName);
        return this;
    }

    @Step(value = "Clear Bank Account number")
    public AffiliateAccountPage clearBankAccountNumber() {
        driver.findElement(By.id("input-bank-account-number")).clear();
        return this;
    }

    @Step(value = "Enter Bank Account name")
    public AffiliateAccountPage enterBankAccountNumber(String accountNumber) {
        driver.findElement(By.id("input-bank-account-number")).sendKeys(accountNumber);
        return this;
    }

    @Step(value = "Click Agree Check box")
    public AffiliateAccountPage clickAgreeCheckBox() {
        driver.findElement(By.name("agree")).click();
        return this;
    }

    @Step(value = "Click on the link to the About Us page")
    public AffiliateAccountPage linkToAboutUS() {
        driver.findElement(By.xpath("//a[@class = 'agree']")).click();
        return this;
    }

    @Step(value = "Click on button Continue")
    public void clickButtonContinue() {
        driver.findElement(By.xpath("//input[@value = 'Continue']"));
    }

    By actualSuccess = By.xpath("//div[@class = 'alert alert-success alert-dismissible']");

    public AffiliateAccountPage successfullyAffiliateAccountUpdated() {
        String actual = driver.findElement(actualSuccess).getText();
        String expected = "Success: Your account has been successfully updated.";
        Assert.assertEquals(actual, expected);
        System.out.println(expected);
        return this;
    }

    By actualError = By.xpath("//div[@class = 'alert alert-danger alert-dismissible']");

    public AffiliateAccountPage notAgreedCheckBoxTheAboutUS() {
        String actual = driver.findElement(actualError).getText();
        String expected = "Warning: You must agree to the About Us!";
        Assert.assertEquals(actual, expected);
        System.out.println(expected);
        return this;
    }

    By actualDanger = By.xpath("//div[@class = 'text-danger']");


    public AffiliateAccountPage Danger() {
        String actual = driver.findElement(actualDanger).getText();
        String expectedDangerChequePayyName = "Cheque Payee Name required!";
        String expectedDangerPayPalEmailAccount = "PayPal Email Address does not appear to be valid!";
        String expectedDangerBankAccountName = "Account Name required!";
        String expectedDangerBankAccountNumber = "Account Number required!";

        if (actual.equals(expectedDangerChequePayyName)) {
            System.out.println(actual);
        } else if (actual.equals(expectedDangerPayPalEmailAccount)) {
            System.out.println(actual);
        } else if (actual.equals(expectedDangerBankAccountName)) {
            System.out.println(actual);
        } else if (actual.equals(expectedDangerBankAccountNumber)) {
            System.out.println(actual);
        }
        return this;
    }
}