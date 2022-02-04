package Pages;


import Base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductComparisonPage extends BasePage {
    public ProductComparisonPage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Click on button Remove")
    public void Remove(String id) {
        driver.findElement(By.xpath("//a[contains(@href, 'remove=" + id + "')]")).click();
    }

    @Step(value = "Click on button Add to Cart")
    public void AddToCart(String id) {
        driver.findElement(By.xpath("//*[@onclick = \"cart.add('" + id + "', '1');\"]")).click();
    }

    @Step(value = "Click on the link to the Product Page")
    public void linkToProduct() {
        driver.findElement(By.xpath("//table[@class = 'table table-bordered']/tbody/tr/td[2]/a")).click();
    }
}
