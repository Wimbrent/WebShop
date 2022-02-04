package AccountPages.MyOrders;

import Base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ViewYourReturnRequestsPage extends BasePage {
    public ViewYourReturnRequestsPage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Click on selected Request")
    public void view(int id_num) {
        List <WebElement> view = driver.findElements(By.xpath("//a[@data-original-title='view']"));
        view.get(id_num).click();
    }

    @Step(value = "Select Request and get Return ID")
    public ViewYourReturnRequestsPage getID(int id_num) {
        List <WebElement> id = driver.findElements(By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[1]"));
        id.get(id_num).getText();
        return this;
    }

    @Step(value = "Click on button Next")
    public void nextPage() {
        List<WebElement> size = driver.findElements(By.xpath("//ul[@class = 'pagination']/li/a"));
        for (int x = 1; x < size.size()-1; x++) {
            driver.findElement(By.linkText(">")).click();
        }
    }

    @Step(value = "Click on button Previous")
    public void previousPage() {
        List<WebElement> size = driver.findElements(By.xpath("//ul[@class = 'pagination']/li/a"));
        for (int x = 1; x < size.size()-1; x++) {
            driver.findElement(By.linkText("<")).click();
        }
    }

    @Step(value = "Click on button Last")
    public void lastPage() {
        driver.findElement(By.linkText(">|")).click();
    }

    @Step(value = "Click on button First")
    public void firstPage() {
        driver.findElement(By.linkText("|<")).click();
    }
}
