package AccountPages.MyOrders;

import Base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourTransactionsPage extends BasePage {
    public YourTransactionsPage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Click on button Continue")
    public YourTransactionsPage Continue() {
        driver.findElement(By.linkText("Continue")).click();
        return this;
    }
}
