package AccountPages.MyOrders;

import Base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReturnInformationPage extends BasePage {
    public ReturnInformationPage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Get Return ID on the Product Returns Page")
    public ReturnInformationPage getID() {
        driver.findElement(By.xpath("//div[@id='content']/table/tbody/tr/td[1]/text()[1]")).getText();
        return this;
    }

    @Step(value = "Click on button Continue")
    public ReturnInformationPage Continue() {
        driver.findElement(By.linkText("Continue")).click();
        return this;
    }
}
