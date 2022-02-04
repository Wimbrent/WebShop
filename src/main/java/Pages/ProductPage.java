package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait element = new WebDriverWait(driver, Duration.ofSeconds(10));

    public ProductPage AddToCart() {
        driver.findElement(By.id("button-cart")).click();
        return this;
    }

    public ProductPage AddToWishlist() {
        driver.findElement(By.xpath("//button[@data-original-title = 'Add to Wish List']")).click();
        return this;
    }

    public ProductPage CompareThisProduct() {
        driver.findElement(By.xpath("//button[@data-original-title = 'Compare this Product']")).click();
        return this;
    }

    public ProductPage alert() {
        System.out.println(driver.findElement(By.xpath("//*[@class=\"alert alert-success alert-dismissible\"]")).getText());
        return this;
    }

    public ProductPage tabDescription() {
        driver.findElement(By.xpath("//div[@id = 'content']/div/div/ul[2]/li[1]/a")).click();
        return this;
    }


    public ProductPage tabSpecification() {
        driver.findElement(By.linkText("Specification")).click();
        return this;
    }

    public ProductPage tabReviews() {
        driver.findElement(By.xpath("//div[@id = 'content']/div/div/ul[2]/li[2]/a")).click();
        return this;
    }

    public ProductPage enterYourName() {
        driver.findElement(By.id("input-name")).sendKeys();
        return this;
    }

    public ProductPage clearYourName() {
        driver.findElement(By.id("input-name")).clear();
        return this;
    }

    public ProductPage enterYourReview(String review) {
        driver.findElement(By.id("input-review")).sendKeys(review);
        System.out.println("Отзыв : " + review);
        return this;
    }

    public ProductPage clearYourReview() {
        driver.findElement(By.id("input-review")).clear();
        return this;
    }

    public ProductPage selectRadioButton(String i) {
        driver.findElement(By.xpath("//*[@id=\"form-review\"]/div[4]/div/input[" + i + "]")).click();
        System.out.println("Оценка товара : " + i);
        return this;
    }

    public ProductPage buttonReviewContinue() {
        driver.findElement(By.id("button-review")).click();
        return this;
    }

    public ProductPage quantityField(String quantity) {
        driver.findElement(By.name("quantity")).sendKeys(quantity);
        return this;
    }

    public void linkToComparePage() {
        element.until(ExpectedConditions.presenceOfElementLocated(By.linkText("product comparison"))).click();
    }

    public void linkToWishlist() {
        element.until(ExpectedConditions.presenceOfElementLocated((By.linkText("wish list")))).click();
    }
}