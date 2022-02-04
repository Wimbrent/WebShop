package Authorization;

import Base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Enter First Name")
    public RegisterPage enterFirstName(String firstname) {
        driver.findElement(By.id("input-firstname")).sendKeys(firstname);
        return this;
    }

    @Step(value = "Enter Last Name")
    public RegisterPage enterLastName(String lastname) {
        driver.findElement(By.id("input-lastname")).sendKeys(lastname);
        return this;
    }

    @Step(value = "Enter Email")
    public RegisterPage enterEmail(String email) {
        driver.findElement(By.id("input-email")).sendKeys(email);
        return this;
    }

    @Step(value = "Enter Telephone")
    public RegisterPage enterTelephone(String telephone) {
        driver.findElement(By.id("input-telephone")).sendKeys(telephone);
        return this;
    }

    @Step(value = "Enter Password")
    public RegisterPage enterPassword(String password) {
        driver.findElement(By.id("input-password")).sendKeys(password);
        return this;
    }

    @Step(value = "Enter Password Confirm")
    public RegisterPage enterPasswordConfirm(String passwordconfirm) {
        driver.findElement(By.id("input-confirm")).sendKeys(passwordconfirm);
        return this;
    }

    public RegisterPage selectRadioButtonYes() {
        driver.findElement(By.xpath("//input[@name='newsletter' and @value = '1']")).click();
        return this;
    }

    @Step(value = "Select No")
    public RegisterPage selectRadioButtonNo() {
        driver.findElement(By.xpath("//input[@name='newsletter' and @value = '0']")).click();
        return this;
    }

    @Step(value = "Click checkbox Privacy Policy")
    public RegisterPage checkBoxPrivacyPolicy() {
        driver.findElement(By.xpath("//input[@type ='checkbox']")).click();
        return this;
    }

    @Step(value = "Click on button Continue")
    public RegisterPage clickButtonContinue() {
        driver.findElement(By.xpath("//*[@value = 'Continue' or text() = 'Continue']")).click();
        return this;
    }
}
