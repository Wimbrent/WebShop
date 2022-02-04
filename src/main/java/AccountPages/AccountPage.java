package AccountPages;

import Base.BasePage;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountPage extends BasePage {
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Click on the link to the Edit Your Account Information page")
    public void linkToEditYourAccountInformation() {
        driver.findElement(By.linkText("Edit your account information")).click();
    }

    @Step(value = "Click on the link to the Change Your Password Page")
    public void linkToChangeYourPassword() {
        driver.findElement(By.linkText("Change your password")).click();
    }

    @Step(value = "Click on the link to the Modify Your Address Book Entries Page")
    public void linkToModifyYourAddressBookEntries() {
        driver.findElement(By.linkText("Modify your address book entries")).click();
    }

    @Step(value = "Click on the link to the Modify Your Wish List Page")
    public void linkToModifyYourWishList() {
        driver.findElement(By.linkText("Modify your wish list")).click();
    }
    @Step(value = "Click on the link to the view Your Order History Page")
    public void linkToViewYourOrderHistory() {
        driver.findElement(By.linkText("View your order history")).click();
    }

    @Step(value = "Click on the link to the Downloads Page")
    public void linkToDownloads() {
        driver.findElement(By.linkText("Downloads")).click();
    }

    @Step(value = "Click on the link to the Your Reward Points Page")
    public void linkToRewardPoints() {
        driver.findElement(By.linkText("Your Reward Points")).click();
    }

    @Step(value = "Click on the link to the view Your Return Requests Page")
    public void linkToReturnRequests() {
        driver.findElement(By.linkText("View your return requests")).click();
    }

    @Step(value = "Click on the link to the Your Transactions Page")
    public void linkToYourTransactions() {
        driver.findElement(By.linkText("Your Transactions")).click();
    }

    @Step(value = "Click on the link to the Recurring Payments Page")
    public void linkToRecurringPayments() {
        driver.findElement(By.linkText("Recurring payments")).click();
    }

    @Step(value = "Click on the link to Register For An Affiliate Account Page")
    public void linkToRegisterForAnAffiliateAccount() {
        driver.findElement(By.linkText("Register for an affiliate account")).click();
    }

    @Step(value = "Click on the link to Edit Your Affiliate Information Page")
    public void linkToEditYourAffiliateInformation() {
        driver.findElement(By.linkText("Edit your affiliate information")).click();
    }

    @Step(value = "Click on the link to Newsletter Page")
    public void linkToNewsletter() {
        driver.findElement(By.linkText("Subscribe / unsubscribe to newsletter")).click();
    }
}