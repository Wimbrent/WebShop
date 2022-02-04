package AccountPages.MyAccount;

import Base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ModifyYourAddressBookEntriesPage extends BasePage {
    public ModifyYourAddressBookEntriesPage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Enter new First Name")
    public ModifyYourAddressBookEntriesPage enterFirstName(String firstname) {
        driver.findElement(By.id("input-firstname")).clear();
        driver.findElement(By.id("input-firstname")).sendKeys(firstname);
        return this;
    }

    @Step(value = "Enter new Last Name")
    public ModifyYourAddressBookEntriesPage enterLastName(String lastname) {
        driver.findElement(By.id("input-lastname")).clear();
        driver.findElement(By.id("input-lastname")).sendKeys(lastname);
        return this;
    }

    @Step(value = "Enter new First Address")
    public ModifyYourAddressBookEntriesPage enterFirstAddress(String firstAddress) {
        driver.findElement(By.id("input-address-1")).clear();
        driver.findElement(By.id("input-address-1")).sendKeys(firstAddress);
        return this;
    }

    public ModifyYourAddressBookEntriesPage enterSecondAddress(String secondAddress) {
        driver.findElement(By.id("input-address-2")).clear();
        driver.findElement(By.id("input-address-2")).sendKeys(secondAddress);
        return this;
    }

    @Step(value = "Enter new City")
    public ModifyYourAddressBookEntriesPage enterCity(String cityName) {
        driver.findElement(By.id("input-city")).clear();
        driver.findElement(By.id("input-city")).sendKeys(cityName);
        return this;
    }

    @Step(value = "Enter new Post Code")
    public ModifyYourAddressBookEntriesPage enterPostCode(String postcode) {
        driver.findElement(By.id("input-postcode")).clear();
        driver.findElement(By.id("input-postcode")).sendKeys(postcode);
        return this;
    }

    @Step(value = "Enter new Company")
    public ModifyYourAddressBookEntriesPage enterCompany(String Company) {
        driver.findElement(By.id("input-company")).clear();
        driver.findElement(By.id("input-company")).sendKeys(Company);
        return this;
    }

    @Step(value = "Select new Country")
    public ModifyYourAddressBookEntriesPage selectCountry(String country) {
        Select selectCountry = new Select(driver.findElement(By.id("input-country")));
        selectCountry.getAllSelectedOptions();
        selectCountry.selectByVisibleText(country);
        return this;
    }

    @Step(value = "Select new Region or State")
    public ModifyYourAddressBookEntriesPage selectRegion(String region) throws InterruptedException {
        Thread.sleep(1000);
        Select selectRegion = new Select(driver.findElement(By.id("input-zone")));
        selectRegion.getAllSelectedOptions();
        selectRegion.selectByVisibleText(region);
        return this;
    }

    @Step(value = "Select a Non-Default Address")
    public ModifyYourAddressBookEntriesPage selectDefaultAddressNo() {
        driver.findElement(By.xpath("//input[@name = 'default' and @value = '0']")).click();
        return this;
    }

    @Step(value = "Select Default Address")
    public ModifyYourAddressBookEntriesPage selectDefaultAddressYes() {
        driver.findElement(By.xpath("//input[@name = 'default' and @value = '1']")).click();
        return this;
    }

    @Step(value = "Click on button Continue")
    public void clickButtonContinue() {
        driver.findElement(By.xpath("//*[@value = 'Continue' or text() = 'Continue']")).click();
    }

    @Step(value = "Click on button New Address")
    public ModifyYourAddressBookEntriesPage NewAddress() {
        driver.findElement(By.linkText("New Address")).click();
        return this;
    }

    @Step(value = "Click on button Delete")
    public void Delete() {
        driver.findElement(By.linkText("Delete")).click();
    }

    @Step(value = "Click on button Edit")
    public ModifyYourAddressBookEntriesPage Edit() {
        driver.findElement(By.linkText("Edit")).click();
        return this;
    }

    @Step(value = "Click on button Back")
    public void clickButtonBack() {
        driver.findElement(By.linkText("Back")).click();
    }
}