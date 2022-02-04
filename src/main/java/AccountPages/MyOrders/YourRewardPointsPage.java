package AccountPages.MyOrders;

import Base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourRewardPointsPage extends BasePage {
    public YourRewardPointsPage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Click on button Continue")
    public YourRewardPointsPage Continue() {
        driver.findElement(By.linkText("Continue")).click();
        return this;
    }
}
