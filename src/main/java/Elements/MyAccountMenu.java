package Elements;


import Base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountMenu extends BasePage {

    public MyAccountMenu(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Open menu My Account")
    public MyAccountMenu myAccountMenuOpen() {
        driver.findElement(By.xpath("//a[@title = 'My Account']")).click();
        return this;
    }
    @Step(value = "Click on the link to the Login page")
    public void linkToLogin() {
        driver.findElement(By.linkText("Login")).click();
    }

    @Step(value = "Click on the link to the Register Page")
    public void linkToRegister() {
        driver.findElement(By.linkText("Register")).click();
    }

    public void linkToMyAccount() {
        driver.findElement(By.xpath("//ul[@class = 'dropdown-menu dropdown-menu-right']/li[1]/a")).click();
    }

    public void linkToOrderHistory() {
        driver.findElement(By.xpath("//ul[@class = 'dropdown-menu dropdown-menu-right']/li[2]/a")).click();
    }

    public void linkToTransactions() {
        driver.findElement(By.xpath("//ul[@class = 'dropdown-menu dropdown-menu-right']/li[3]/a")).click();
    }

    public void linkToDownloads() {
        driver.findElement(By.xpath("//ul[@class = 'dropdown-menu dropdown-menu-right']/li[4]/a")).click();
    }

    public void linkToLogout() {
        driver.findElement(By.xpath("//ul[@class = 'dropdown-menu dropdown-menu-right']/li[5]/a")).click();
    }
}
