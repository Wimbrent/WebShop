package Elements;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ListGroupItem extends BasePage {

    public ListGroupItem(WebDriver driver) {
        super(driver);
    }


    public ListGroupItem linkToMyAccount() {
        driver.findElement(By.xpath("//*[@class='list-group-item' and contains(text(),'My Account')]")).click();
        Assert.assertEquals(driver.getTitle(), "My Account");
        return this;
    }

    public ListGroupItem linkToEditAccount() {
        driver.findElement(By.xpath("//*[@class='list-group-item' and contains(text(),'Edit Account')]")).click();
        Assert.assertEquals(driver.getTitle(), "My Account Information");
        return this;
    }

    public ListGroupItem linkToPassword() {
        driver.findElement(By.xpath("//*[@class='list-group-item' and contains(text(),'Password')]")).click();
        Assert.assertEquals(driver.getTitle(), "Change Password");
        return this;
    }

    public ListGroupItem linkToAddressBook() {
        driver.findElement(By.xpath("//*[@class='list-group-item' and contains(text(),'Address Book')]")).click();
        Assert.assertEquals(driver.getTitle(), "Address Book");
        return this;
    }

    public ListGroupItem linkToWishList() {
        driver.findElement(By.xpath("//*[@class='list-group-item' and contains(text(),'Wish List')]")).click();
        Assert.assertEquals(driver.getTitle(), "My Wish List");
        return this;
    }

    public ListGroupItem linkToOrderHistory() {
        driver.findElement(By.xpath("//*[@class='list-group-item' and contains(text(),'Order History')]")).click();
        Assert.assertEquals(driver.getTitle(), "Order History");
        return this;
    }

    public ListGroupItem linkToDownloads() {
        driver.findElement(By.xpath("//*[@class='list-group-item' and contains(text(),'Downloads')]")).click();
        Assert.assertEquals(driver.getTitle(), "Account Downloads");
        return this;
    }

    public ListGroupItem linkToRecurringPayments() {
        driver.findElement(By.xpath("//*[@class='list-group-item' and contains(text(),'Recurring payments')]")).click();
        Assert.assertEquals(driver.getTitle(), "Recurring Payments");
        return this;
    }

    public ListGroupItem linkToRewardPoints() {
        driver.findElement(By.xpath("//*[@class='list-group-item' and contains(text(),'Reward Points')]")).click();
        Assert.assertEquals(driver.getTitle(), "Your Reward Points");
        return this;
    }

    public ListGroupItem linkToReturns() {
        driver.findElement(By.xpath("//*[@class='list-group-item' and contains(text(),'Returns')]")).click();
        Assert.assertEquals(driver.getTitle(), "Product Returns");
        return this;
    }

    public ListGroupItem linkToTransactions() {
        driver.findElement(By.xpath("//*[@class='list-group-item' and contains(text(),'Transactions')]")).click();
        Assert.assertEquals(driver.getTitle(), "Your Transactions");
        return this;
    }

    public ListGroupItem linkToNewsletter() {
        driver.findElement(By.xpath("//*[@class='list-group-item' and contains(text(),'Newsletter')]")).click();
        Assert.assertEquals(driver.getTitle(), "Newsletter Subscription");
        return this;
    }

    public ListGroupItem linkToLogout() {
        driver.findElement(By.xpath("//*[@class='list-group-item' and contains(text(),'Logout')]")).click();
        Assert.assertEquals(driver.getTitle(), "Account Logout");
        return this;
    }
}