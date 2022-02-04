package Authorization;

import Base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgottenPasswordPage extends BasePage {
    public ForgottenPasswordPage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Enter Email")
    public ForgottenPasswordPage enterEmail(String email) {
        driver.findElement(By.id("input-email")).sendKeys(email);
        return this;
    }

    @Step(value = "Click on button Continue")
    public ForgottenPasswordPage clickButtonContinue() {
        driver.findElement(By.xpath("//*[@value = 'Continue' or text() = 'Continue']")).click();
        return this;
    }
}
