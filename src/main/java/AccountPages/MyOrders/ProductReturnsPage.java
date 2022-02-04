package AccountPages.MyOrders;

import Base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class ProductReturnsPage extends BasePage {
    public ProductReturnsPage(WebDriver driver) {
        super(driver);
    }

    public ProductReturnsPage date() {
        driver.findElement(By.xpath("//i[@class = 'fa fa-calendar']")).click();
        return this;
    }
    public ProductReturnsPage enterOrderID() {
        driver.findElement(By.id("input-order-id")).sendKeys();
        return this;
    }
    public ProductReturnsPage clearOrderID() {
        driver.findElement(By.id("input-order-id")).clear();
        return this;
    }
    public ProductReturnsPage enterProductName() {
        driver.findElement(By.id("input-product")).sendKeys();
        return this;
    }
    public ProductReturnsPage clearProductName() {
        driver.findElement(By.id("input-product")).clear();
        return this;
    }
    public ProductReturnsPage enterProductCode() {
        driver.findElement(By.id("input-model")).sendKeys();
        return this;
    }
    public ProductReturnsPage clearProductCode() {
        driver.findElement(By.id("input-model")).clear();
        return this;
    }
    public ProductReturnsPage enterQuanity() {
        driver.findElement(By.id("input-quantity")).sendKeys();
        return this;
    }

    @Step(value = "Select Reason for Return: Dead on Arrival")
    public ProductReturnsPage selectReasonDeadOnArrival() {
        driver.findElement(By.xpath("//input[@name = 'return_reason_id' and @value = '1']")).click();
        return this;
    }
    @Step(value = "Select Reason for Return: Received Wrong Item")
    public ProductReturnsPage selectReasonReceivedWrongItem() {
        driver.findElement(By.xpath("//input[@name = 'return_reason_id' and @value = '2']")).click();
        return this;
    }

    @Step(value = "Select Reason for Return: Order Error")
    public ProductReturnsPage selectReasonOrderError() {
        driver.findElement(By.xpath("//input[@name = 'return_reason_id' and @value = '3']")).click();
        return this;
    }

    @Step(value = "Select Reason for Return: OReason Faulty")
    public ProductReturnsPage selectReasonFaulty() {
        driver.findElement(By.xpath("//input[@name = 'return_reason_id' and @value = '4']")).click();
        return this;
    }

    public ProductReturnsPage selectReasonOther() {
        driver.findElement(By.xpath("//input[@name = 'return_reason_id' and @value = '5']")).click();
        return this;
    }
    public ProductReturnsPage selectProductIsOpen() {
        driver.findElement(By.xpath("//label[@class = 'radio-inline'][1]")).click();
        return this;
    }
    public ProductReturnsPage selectProductIsNoOpen() {
        driver.findElement(By.xpath("//label[@class = 'radio-inline'][2]")).click();
        return this;
    }
    public ProductReturnsPage enterComment(String comment) {
        driver.findElement(By.id("input-comment")).sendKeys(comment);
        return this;
    }
    public ProductReturnsPage assertProductReturns() {
        Assert.assertEquals(driver.getTitle(), "Product Returns");
        return this;
    }

    public ProductReturnsPage alert() {
        By actualDanger = By.xpath("//div[@class = 'text-danger']");
        String actual = driver.findElement(actualDanger).getText();
        String expectedDangerProductName = "Product Name must be greater than 3 and less than 255 characters!";
        String expectedDangerProductCode = "Product Model must be greater than 3 and less than 64 characters!";
        String expectedDangerReasonForReturn = "You must select a return product reason!";
        String expectedDangerOrderID = "Order ID required!";
        if (actual.equals(expectedDangerOrderID)) {
            System.out.println(actual);
        }
        else if (actual.equals(expectedDangerProductName)) {
            System.out.println(actual);
        }
        else if (actual.equals(expectedDangerProductCode)) {
            System.out.println(actual);
        }
        else if (actual.equals(expectedDangerReasonForReturn)) {
            System.out.println(actual);
        }
        return this;
    }

    @Step(value = "Click on button Submit")
    public ProductReturnsPage Submit() {
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();
        return this;
    }
}
