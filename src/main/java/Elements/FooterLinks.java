package Elements;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FooterLinks extends BasePage {
    public FooterLinks(WebDriver driver) {
        super(driver);
    }


    public FooterLinks linkToAboutUs() {
        driver.findElement(By.xpath("//footer/div/div/div[1]/ul[1]/li[1]/a")).click();
        Assert.assertEquals(driver.getTitle(), "About Us");
        return this;
    }

    public FooterLinks linkToDeliveryInformation() {
        driver.findElement(By.xpath("//footer/div/div/div[1]/ul[1]/li[2]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Delivery Information");
        return this;
    }

    public FooterLinks linkToPrivacyPolicy() {
        driver.findElement(By.xpath("//footer/div/div/div[1]/ul[1]/li[3]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Privacy Policy");
        return this;
    }

    public FooterLinks linkToTermsAndConditions() {
        driver.findElement(By.xpath("//footer/div/div/div[1]/ul[1]/li[4]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Terms & Conditions");
        return this;
    }

    public FooterLinks linkToContactUS() {
        driver.findElement(By.xpath("//footer/div/div/div[2]/ul[1]/li[1]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Contact Us");
        return this;
    }

    public FooterLinks linkToReturns() {
        driver.findElement(By.xpath("//footer/div/div/div[2]/ul[1]/li[2]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Product Returns");
        return this;
    }

    public FooterLinks linkToSiteMap() {
        driver.findElement(By.xpath("//footer/div/div/div[2]/ul[1]/li[3]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Site Map");
        return this;
    }

    public FooterLinks linkToBrands() {
        driver.findElement(By.xpath("//footer/div/div/div[3]/ul[1]/li[1]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Find Your Favorite Brand");
        return this;
    }

    public FooterLinks linkToGiftCerificates() {
        driver.findElement(By.xpath("//footer/div/div/div[3]/ul[1]/li[2]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Purchase a Gift Certificate");
        return this;
    }

    public FooterLinks linkToAffiliate() {
        driver.findElement(By.xpath("//footer/div/div/div[3]/ul[1]/li[3]/a")).click();
        Assert.assertEquals(driver.getTitle(), "");
        return this;
    }

    public FooterLinks linkToSpecials() {
        driver.findElement(By.xpath("//footer/div/div/div[3]/ul[1]/li[4]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Special Offers");
        return this;
    }

    public FooterLinks linkToMyAccount() {
        driver.findElement(By.xpath("//footer/div/div/div[4]/ul[1]/li[1]/a")).click();
        Assert.assertEquals(driver.getTitle(), "My Account");
        return this;
    }

    public FooterLinks linkToOrderHistory() {
        driver.findElement(By.xpath("//footer/div/div/div[4]/ul[1]/li[2]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Order History");
        return this;
    }

    public FooterLinks linkToWishList() {
        driver.findElement(By.xpath("//footer/div/div/div[4]/ul[1]/li[3]/a")).click();
        Assert.assertEquals(driver.getTitle(), "My Wish List");
        return this;
    }

    public FooterLinks LinkToNewsletter() {
        driver.findElement(By.xpath("//footer/div/div/div[4]/ul[1]/li[4]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Newsletter Subscription");
        return this;
    }
}