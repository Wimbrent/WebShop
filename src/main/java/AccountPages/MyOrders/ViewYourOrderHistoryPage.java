package AccountPages.MyOrders;

import Base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ViewYourOrderHistoryPage extends BasePage {
    public ViewYourOrderHistoryPage(WebDriver driver) {
        super(driver);
    }

    public ViewYourOrderHistoryPage getID(int index) {
        List <WebElement> id = driver.findElements
                (By.xpath("//table[@class = 'table table-bordered table-hover']/tbody/tr/td[1]"));
        id.get(index).getText();
        return this;
    }

    public ViewYourOrderHistoryPage Continue() {
        driver.findElement(By.linkText("Continue")).click();
        return this;
    }

    @Step(value = "Click on selected Request")
    public void view(int index) {
        List <WebElement> view = driver.findElements(By.xpath("//a[@data-original-title='View']"));
        view.get(index).click();
    }

    public ViewYourOrderHistoryPage nextPage() {
        List<WebElement> size = driver.findElements(By.xpath("//ul[@class = 'pagination']/li/a"));
        for (int x = 1; x < size.size()-1; x++) {
            driver.findElement(By.linkText(">")).click();
        }
        return this;
    }

    public ViewYourOrderHistoryPage previousPage() {
        List<WebElement> size = driver.findElements(By.xpath("//ul[@class = 'pagination']/li/a"));
        for (int x = 1; x < size.size()-1; x++) {
            driver.findElement(By.linkText("<")).click();
        }
        return this;
    }
}
