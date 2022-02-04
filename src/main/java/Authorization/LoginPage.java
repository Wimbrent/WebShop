package Authorization;

import Base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Enter Email")
    public LoginPage enterEmail(String email) {
        driver.findElement(By.id("input-email")).sendKeys(email);
        return this;
    }
    @Step(value = "Enter Password")
    public LoginPage enterPassword(String password) {
        driver.findElement(By.id("input-password")).sendKeys(password);
        return this;
    }
    @Step(value = "Click on button Login")
    public void clickButtonLogin() {
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @Step(value = "Click on the link to the Forgotten Password Page")
    public void forgottenPassword() {
        driver.findElement(By.linkText("Forgotten Password")).click();
    }

    By actualError = By.xpath("//div[@class = 'alert alert-danger alert-dismissible']");

    public LoginPage alert() {
        String actual = driver.findElement(actualError).getText();
        String wrongEmailOrPassword = "Warning: No match for E-Mail Address and/or Password.";
        String attemps = "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.";
        String alertErrorEmail = "Warning: The E-Mail Address was not found in our records, please try again!";

        if (actual.equals(wrongEmailOrPassword)) {
            System.out.println(actual);
        } else if (actual.equals(attemps)) {
            System.out.println(actual);
        } else if (actual.equals(alertErrorEmail)) {
            System.out.println(actual);
        }
        return this;
    }

    By actualSuccess = By.xpath("//div[@class = 'alert alert-success alert-dismissible']");
    public LoginPage successfulResetPassword() {
        String actual = driver.findElement(actualSuccess).getText();
        String expected = "An Email with a confirmation link has been sent your Email address.";
        Assert.assertEquals(actual, expected);
        System.out.println(expected);
        return this;
    }
}