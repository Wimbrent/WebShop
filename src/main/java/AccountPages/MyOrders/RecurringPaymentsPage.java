package AccountPages.MyOrders;

import Base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecurringPaymentsPage extends BasePage {
    public RecurringPaymentsPage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Click on button Continue")
    public RecurringPaymentsPage Continue() {
        driver.findElement(By.linkText("Continue")).click();
        return this;
    }
}
