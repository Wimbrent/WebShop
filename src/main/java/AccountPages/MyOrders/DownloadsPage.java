package AccountPages.MyOrders;

import Base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadsPage extends BasePage {
    public DownloadsPage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Click on button Continue")
    public DownloadsPage Continue() {
        driver.findElement(By.linkText("Continue")).click();
        return this;
    }
}
