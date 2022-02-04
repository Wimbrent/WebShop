package AccountPages.MyAccount;

import Base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangeYourPasswordPage extends BasePage {
    public ChangeYourPasswordPage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Enter new Password")
    public ChangeYourPasswordPage enterPassword(String password) {
        driver.findElement(By.id("input-password")).sendKeys(password);
        return this;
    }

    @Step(value = "Enter new Password Confirm")
    public ChangeYourPasswordPage enterPasswordConfirm(String passwordconfirm) {
        driver.findElement(By.id("input-confirm")).sendKeys(passwordconfirm);
        return this;
    }

    @Step(value = "Click on button Continue")
    public void clickButtonContinue() {
        driver.findElement(By.xpath("//*[@value = 'Continue' or text() = 'Continue']")).click();
    }

    public ChangeYourPasswordPage Back() {
        driver.findElement(By.linkText("Back")).click();
        return this;
    }
}
