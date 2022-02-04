package Elements;

import Base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HeaderElements extends BasePage {

    public HeaderElements(WebDriver driver) {
        super(driver);
    }

    WebDriverWait element = new WebDriverWait(driver, Duration.ofSeconds(10));

    public HeaderElements enterSearch(String product) {
        driver.findElement(By.name("search")).sendKeys(product);
        return this;
    }

    public void buttonSearch() {
        driver.findElement(By.xpath("//button[@class = 'btn btn-default btn-lg']")).click();
    }


    public void ButtonCurrency() {
        driver.findElement(By.linkText("Currency")).click();
    }

    public void buttonEuro() {
        driver.findElement(By.name("EUR")).click();
    }

    public void buttonPoundSterling() {
        driver.findElement(By.name("GBP")).click();
    }

    public void buttonUSDollar() {
        driver.findElement(By.name("USD")).click();
    }

    public void linkToWishList() {
        driver.findElement(By.id("wishlist-total")).click();
    }

    public void linkToShoppingCart() {
        driver.findElement(By.xpath("//a[@title = 'Shopping Cart']")).click();
    }

    public void linkToCheckout() {
        driver.findElement(By.xpath("//a[@title = 'Checkout']")).click();
    }

    public void linkToProductPage() {
        driver.findElement(By.xpath("//table[@class = 'table table-striped']/tbody/tr/td[2]/a")).click();
    }
}
