package Pages;

import Base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ViewCartPage extends BasePage {
    public ViewCartPage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait element = new WebDriverWait(driver, Duration.ofSeconds(10));



    public ViewCartPage checkout() {
        driver.findElement(By.linkText("Checkout"));
        return this;
    }

    @Step(value = "Click on button Remove")
    public void Remove() throws InterruptedException {
        Thread.sleep(1000);
        element.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-original-title = 'Remove']"))).click();
        Thread.sleep(1000);
    }
}
