package Elements;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alert extends BasePage {

    public Alert(WebDriver driver) {
        super(driver);
    }

    public Alert Warning() {
        By actualWarning = By.xpath("//div[@class = 'alert alert-warning']");
        String actual = driver.findElement(actualWarning).getText();
        String expectedWarningDeleteDefaultAddress = " Warning: You can not delete your default address!";
        if (actual.equals(expectedWarningDeleteDefaultAddress)) {
            System.out.println(actual);
        }
        return this;
    }

    public Alert Error() {
        By actualError = By.xpath("//div[@class = 'alert alert-danger alert-dismissible']");
        String actual = driver.findElement(actualError).getText();
        String expectedDangerEmailRegistred = "Warning: E-Mail Address is already registered!";
        String expectedDangerPrivacyPolicy = "Warning: You must agree to the Privacy Policy!";
        if (actual.equals(expectedDangerEmailRegistred)) {
            System.out.println(actual);
        }
        else if (actual.equals(expectedDangerPrivacyPolicy)) {
            System.out.println(actual);
        }
        return this;
    }

    public Alert Danger() {
        By actualDanger = By.xpath("//div[@class = 'text-danger']");
        String actual = driver.findElement(actualDanger).getText();
        String expectedDangerFirstName = "First Name must be between 1 and 32 characters!";
        String expectedDangerLastName = "Last Name must be between 1 and 32 characters!";
        String expectedDangerEmail = "E-Mail Address does not appear to be valid!";
        String expectedDangerTelephone = "Telephone must be between 3 and 32 characters!";
        String expectedDangerPassword = "Password must be between 4 and 20 characters!";
        String expectedDangerConfirmPassword = "Password confirmation does not match Password!";
        String expectedDangerCity = "City must be between 2 and 128 characters!";
        String expectedDangerPostCode = "Postcode must be between 2 and 10 characters!";
        String expectedDangerRegionOrState = "Please select a Region / state!";
        String expectedDangerFirstAddress = "Address must be between 3 and 128 characters!";

        if (actual.equals(expectedDangerFirstName)) {
            System.out.println(actual);
        }
        else if (actual.equals(expectedDangerLastName)) {
            System.out.println(actual);
        }
        else if (actual.equals(expectedDangerEmail)) {
            System.out.println(actual);
        }
        else if (actual.equals(expectedDangerTelephone)) {
            System.out.println(actual);
        }
        else if (actual.equals(expectedDangerPassword)) {
            System.out.println(actual);
        }
        else if (actual.equals(expectedDangerCity)) {
            System.out.println(actual);
        }
        else if (actual.equals(expectedDangerRegionOrState)) {
            System.out.println(actual);
        }else if (actual.equals(expectedDangerPostCode)) {
            System.out.println(actual);
        }
        else if (actual.equals(expectedDangerConfirmPassword)) {
            System.out.println(actual);
        }
        else if (actual.equals(expectedDangerFirstAddress)) {
            System.out.println(actual);
        }
        return this;
    }

    public Alert Successfully() {
        By actualSuccess = By.xpath("//div[@class = 'alert alert-success alert-dismissible']");
        String actual = driver.findElement(actualSuccess).getText();
        String expectedAlertEditInformation = "Success: Your account has been successfully updated.";
        String expectedAlertPasswordUpdated = "Success: Your Password has been successfully updated.";
        String expectedAlertSubscriptionUpdated = "Success: Your newsletter subscription has been successfully updated!";
        String expectedAlertAddressUpdated = "Your address has been successfully updated";
        String expectedAlertAddressDeleted = "Your address has been successfully deleted";
        String expectedAlertAddressAdded = "Your address has been successfully added";
        String expectedAlertWishListUpdated = "Success: You have modified your wish list!";

        if (actual.equals(expectedAlertEditInformation)) {
            System.out.println(actual);
        }
        else if (actual.equals(expectedAlertPasswordUpdated)) {
            System.out.println(actual);
        }
        else if (actual.equals(expectedAlertSubscriptionUpdated)) {
            System.out.println(actual);
        }
        else if (actual.equals(expectedAlertAddressUpdated)) {
            System.out.println(actual);
        }
        else if (actual.equals(expectedAlertAddressDeleted)) {
            System.out.println(actual);
        }
        else if (actual.equals(expectedAlertAddressAdded)) {
            System.out.println(actual);
        }
        else if (actual.equals(expectedAlertWishListUpdated)) {
            System.out.println(actual);
        }
        return this;
    }
}