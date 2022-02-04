package Elements;

import Base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Cart extends BasePage {
    public Cart(WebDriver driver) {
        super(driver);
    }

    WebDriverWait element = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Step(value = "Click on button Cart")
    public Cart cartTotal() throws InterruptedException {
        Thread.sleep(1000);
        element.until(ExpectedConditions.presenceOfElementLocated(By.id("cart"))).click();
        return this;
    }

    public boolean bulCart =
        driver.findElements(By.xpath("//button[@title = 'Remove']")).size() > 0;

    @Step(value = "Remove All products from Cart")
    public Cart removeAll() {
        List <WebElement> list = driver.findElements(By.xpath("//button[@title = 'Remove']"));
        for (WebElement e : list) {
            e.click();
        }
        return this;
    }

    @Step(value = "Click on button Remove")
    public void remove() {
        driver.findElement(By.xpath("//button[@title = 'Remove']")).click();
    }

    @Step(value = "Click on the link to the View Page")
    public void view() {
        element.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class = 'text-right']/a[1]"))).click();
    }

    @Step(value = "Click on the link to the Checkout Page")
    public void checkout() {
        element.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//p[@class = 'text-right']/a[2]")))).click();
    }
}
