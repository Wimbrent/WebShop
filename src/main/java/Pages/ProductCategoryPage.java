package Pages;

import Base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ProductCategoryPage extends BasePage {
    public ProductCategoryPage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait element = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Step(value = "Click on button Add to Cart")
    public ProductCategoryPage AddToCart(String id) {
        driver.findElement(By.xpath("//*[@onclick = \"cart.add('" + id + "', '1');\" or @onclick = \"cart.add('\" + id + \"', '2');\"]")).click();
        return this;
    }

    @Step(value = "Click on button Add to Wish List")
    public ProductCategoryPage AddToWishList(String id) {
        driver.findElement(By.xpath("//button[@onclick = \"wishlist.add('" + id + "');\"]")).click();
        return this;
    }

    @Step(value = "Click on button Compare This Product")
    public ProductCategoryPage CompareThisProduct(String id) {
        driver.findElement(By.xpath("//button[@onclick = \"compare.add('" + id + "');\"]")).click();
        return this;
    }

    @Step(value = "Click on the link to the Compare Page")
    public void linkToComparePage() {
        driver.findElement(By.id("compare-total")).click();
    }

    @Step(value = "Click on the link to the Wishlist Page")
    public void linkToWishlistPage() {
        element.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("wish list"))).click();
    }

    @Step(value = "Select Refine Search")
    public ProductCategoryPage refineSearch(String category) {
        driver.findElement(By.linkText(category)).click();
        return this;
    }

    @Step(value = "Select list view")
    public ProductCategoryPage listView() {
        driver.findElement(By.id("list-view")).click();
        return this;
    }

    @Step(value = "Select grid view")
    public ProductCategoryPage gridView() {
        driver.findElement(By.id("grid-view")).click();
        return this;
    }

    @Step(value = "Click on the link to the Product Page")
    public void linkToProductPage(String nameProduct) {
        driver.findElement(By.partialLinkText(nameProduct)).click();
    }

    @Step(value = "Select Sort By")
    public ProductCategoryPage sortBy(String sorting) {
        new Select(driver.findElement(By.id("input-sort"))).selectByVisibleText(sorting);
        return this;
    }

    @Step(value = "Select Limit")
    public ProductCategoryPage limit(String limits) {
        new Select(driver.findElement(By.id("input-limit"))).selectByVisibleText(limits);
        return this;
    }

    public ProductCategoryPage alert() {
        System.out.println(driver.findElement(By.xpath("//*[@class=\"alert alert-success alert-dismissible\"]")).getText());
        return this;
    }

}