package AccountPages.MyAccount;

import Base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditYourAccountInformationPage extends BasePage {

    public EditYourAccountInformationPage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Enter new First Name")
    public EditYourAccountInformationPage enterFirstName(String firstname) {
        driver.findElement(By.id("input-firstname")).clear();
        driver.findElement(By.id("input-firstname")).sendKeys(firstname);
        return this;
    }

    @Step(value = "Enter new Last Name")
    public EditYourAccountInformationPage enterLastName(String lastname) {
        driver.findElement(By.id("input-lastname")).clear();
        driver.findElement(By.id("input-lastname")).sendKeys(lastname);
        return this;
    }

    @Step(value = "Enter new Email")
    public EditYourAccountInformationPage enterEmail(String email) {
        driver.findElement(By.id("input-email")).clear();
        driver.findElement(By.id("input-email")).sendKeys(email);
        return this;
    }

    @Step(value = "Enter new Telephone")
    public EditYourAccountInformationPage enterTelephone(String telephone) {
        driver.findElement(By.id("input-telephone")).clear();
        driver.findElement(By.id("input-telephone")).sendKeys(telephone);
        return this;
    }

    @Step(value = "Click on button Continue")
    public void clickButtonContinue() {
        driver.findElement(By.xpath("//*[@value = 'Continue' or text() = 'Continue']")).click();
    }
}
