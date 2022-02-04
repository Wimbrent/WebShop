package AccountPages.MyAccount;

import Base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModifyYourWishListPage extends BasePage {
    public ModifyYourWishListPage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Click on button Continue")
    public ModifyYourWishListPage Continue() {
        driver.findElement(By.linkText("Continue")).click();
        return this;
    }

    @Step(value = "Click on button Remove")
    public void Remove(String id) {
        driver.findElement(By.xpath("//a[contains(@href, 'remove=" + id + "')]")).click();
    }

    @Step(value = "Click on button Add to Cart")
    public void AddToCart(String id) {
        driver.findElement(By.xpath("//button[@onclick = \"cart.add('" + id + "');\"]")).click();
    }
}
