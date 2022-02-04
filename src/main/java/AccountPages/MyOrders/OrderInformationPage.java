package AccountPages.MyOrders;

import Base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderInformationPage extends BasePage {
    public OrderInformationPage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Click on button Reorder")
    public void Reorder() {
        driver.findElement(By.xpath("//a[@data-original-title = 'Reorder' and @class = 'btn btn-primary']")).click();
    }

    @Step(value = "Click on button Return")
    public void Return() {
        driver.findElement(By.xpath("//a[@data-original-title = 'Return' and @class = 'btn btn-danger']")).click();
    }
}
