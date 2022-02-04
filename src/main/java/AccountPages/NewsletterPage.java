package AccountPages;

import Base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewsletterPage extends BasePage {
    public NewsletterPage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Select Subscribe on Newsletter")
    public NewsletterPage selectSubscribe() {
        driver.findElement(By.xpath("//input[@name='newsletter' and @value = '1']")).click();
        return this;
    }

    @Step(value = "Select Unsubscribe from Newsletter")
    public NewsletterPage selectUnsubscribe() {
        driver.findElement(By.xpath("//input[@name='newsletter' and @value = '0']")).click();
        return this;
    }

    @Step(value = "Click on button Continue")
    public void clickButtonContinue() {
        driver.findElement(By.xpath("//*[@value = 'Continue' or text() = 'Continue']")).click();
    }

    public void clickButtonBack() {
        driver.findElement(By.linkText("Back")).click();
    }
}
