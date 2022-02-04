package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckPage extends BasePage {
    public CheckPage(WebDriver driver) {
        super(driver);
    }

    public CheckPage collapsPaymentAddress() {
        driver.findElement(By.xpath("//a[@href = '#collapse-payment-address']")).click();
        return this;
    }

    public CheckPage existingAddress() {
        driver.findElement(By.xpath("//input[@name = 'payment_address' and @value = 'existing']")).click();
        System.out.println("Selected: I want to use an existing address");
        return this;
    }

    public CheckPage paymentExisting(int index) {
        Select selectPayment = new Select(driver.findElement(By.xpath("//div[@id = 'payment-existing']/select")));
        selectPayment.getAllSelectedOptions();
        selectPayment.selectByIndex(index);
        return this;
    }

    public CheckPage newPaymentAddress() {
        driver.findElement(By.xpath("//input[@name = 'payment_address' and @value = 'new']")).click();
        System.out.println("Selected: I want to use a new address");
        return this;
    }

    public CheckPage enterFirstNamePaymentAddress(String firstName) {
        driver.findElement(By.id("input-payment-firstname")).sendKeys(firstName);
        return this;
    }

    public CheckPage enterLastNamePaymentAddress(String lastName) {
        driver.findElement(By.id("input-payment-lastname")).sendKeys(lastName);
        return this;
    }

    public CheckPage enterCompanyNamePaymentAddress(String company) {
        driver.findElement(By.id("input-payment-company")).sendKeys(company);
        return this;
    }

    public CheckPage enterFirstAddressPaymentAddress(String firstAddress) {
        driver.findElement(By.id("input-payment-address-1")).sendKeys(firstAddress);
        return this;
    }

    public CheckPage enterSecondAddressPaymentAddress(String lastAddress) {
        driver.findElement(By.id("input-payment-address-2")).sendKeys(lastAddress);
        return this;
    }

    public CheckPage enterCityNamePaymentAddress(String city) {
        driver.findElement(By.id("input-payment-City")).sendKeys(city);
        return this;
    }

    public CheckPage enterPostCodePaymentAddress(String postCode) {
        driver.findElement(By.id("input-payment-postcode")).sendKeys(postCode);
        return this;
    }

    public CheckPage selectCountryPaymentAddress(String country) {
        Select selectCountry = new Select(driver.findElement(By.id("input-payment-Country")));
        selectCountry.getAllSelectedOptions();
        selectCountry.selectByVisibleText(country);
        return this;
    }

    public CheckPage selectRegionPaymentAddress(String region) {
        Select selectRegion = new Select(driver.findElement(By.id("input-payment-zone")));
        selectRegion.getAllSelectedOptions();
        selectRegion.selectByVisibleText(region);
        return this;
    }

    public CheckPage buttonContinueBillingDetails() {
        driver.findElement(By.id("button-payment-address")).click();
        return this;
    }

    public CheckPage collapsShippingAddress() {
        driver.findElement(By.xpath("//a[@href = '#collapse-shipping-address']")).click();
        return this;
    }

    public CheckPage existingShippingAddress() {
        driver.findElement(By.xpath("//input[@name = 'shipping_address' and @value = 'existing']")).click();
        System.out.println("Selected: I want to use an existing address");
        return this;
    }

    public CheckPage shippingExisting(int index) {
        Select selectShipping = new Select(driver.findElement(By.xpath("//div[@id = 'shipping-existing']/select")));
        selectShipping.getAllSelectedOptions();
        selectShipping.selectByIndex(index);
        return this;
    }

    public CheckPage newShippingAddress() {
        driver.findElement(By.xpath("//input[@name = 'shipping_address' and @value = 'new']")).click();
        System.out.println("Selected: I want to use a new address");
        return this;
    }

    public CheckPage enterFirstNameShippingAddress(String firstName) {
        driver.findElement(By.id("input-shipping-firstname")).sendKeys(firstName);
        return this;
    }

    public CheckPage enterLastNameShippingAddress(String lastName) {
        driver.findElement(By.id("input-shipping-lastname")).sendKeys(lastName);
        return this;
    }

    public CheckPage enterCompanyNameShippingAddress(String company) {
        driver.findElement(By.id("input-shipping-company")).sendKeys(company);
        return this;
    }

    public CheckPage enterFirstAddressShippingAddress(String firstAddress) {
        driver.findElement(By.id("input-shipping-address-1")).sendKeys(firstAddress);
        return this;
    }

    public CheckPage enterSecondAddressShippingAddress(String secondAddress) {
        driver.findElement(By.id("input-shipping-address-2")).sendKeys(secondAddress);
        return this;
    }

    public CheckPage enterCityNameShippingAddress(String city) {
        driver.findElement(By.id("input-shipping-City")).sendKeys(city);
        return this;
    }

    public CheckPage clearPostCodeShippingAddress() {
        driver.findElement(By.id("input-shipping-postcode")).clear();
        return this;
    }

    public CheckPage enterPostCodeShippingAddress(String postcode) {
        driver.findElement(By.id("input-shipping-postcode")).sendKeys(postcode);
        return this;
    }

    public CheckPage selectCountryShippingAddress(String country) {
        Select selectCountry = new Select(driver.findElement(By.id("input-shipping-Country")));
        selectCountry.getAllSelectedOptions();
        selectCountry.selectByVisibleText(country);
        return this;
    }

    public CheckPage selectRegionShippingAddress(String region) {
        Select selectRegion = new Select(driver.findElement(By.id("input-shipping-zone")));
        selectRegion.getAllSelectedOptions();
        selectRegion.selectByVisibleText(region);
        return this;
    }

    public CheckPage buttonContinueDeliveryDetails() {
        driver.findElement(By.id("button-shipping-address")).click();
        return this;
    }

    public CheckPage collapsDeliveryMethod() {
        driver.findElement(By.xpath("//a[@href = '#collapse-shipping-method']")).click();
        return this;
    }

    public CheckPage enterCommentDeliveryMethod(String commentDelivery) {
        driver.findElement
                (By.xpath("//*[@id=\"collapse-shipping-method\"]/div/p/textarea")).sendKeys(commentDelivery);
        return this;
    }

    public CheckPage buttonContinueDeliveryMethod() {
        driver.findElement(By.id("button-shipping-method")).click();
        return this;
    }

    public CheckPage collapsPaymentMethod() {
        driver.findElement(By.xpath("//a[@href = '#collapse-payment-method']")).click();
        return this;
    }

    public CheckPage enterCommentPaymentMethod(String commentPayment) {
        driver.findElement
                (By.xpath("//*[@id=\"collapse-payment-method\"]/div/p/textarea")).sendKeys(commentPayment);
        return this;
    }

    public CheckPage checkBoxTermsAndConditions() {
        driver.findElement(By.xpath("//input[@type = 'checkbox']")).click();
        return this;
    }

    public CheckPage buttonContinuePaymentMethod() {
        driver.findElement(By.id("button-payment-method")).click();
        return this;
    }

    public CheckPage collapsCheckoutConfirm() {
        driver.findElement(By.xpath("//a[@href = '#collapse-checkout-confirm']")).click();
        return this;
    }

    public CheckPage clickConfirmOrder() {
        driver.findElement(By.id("button-confirm")).click();
        return this;
    }

    public Boolean handlingOfStockAvailability = driver.findElements
            (By.xpath("//div[@class = 'alert alert-danger alert-dismissible']")).size() > 0;

    WebElement Remove = driver.findElement(By.xpath("//button[@title = 'Remove']"));

    public CheckPage defaultAddress(int select_payment_address, int select_shipping_address) {
        if (handlingOfStockAvailability) {
            System.out.println("Product sold out");
            Remove.click();
        } else {
            paymentExisting(select_payment_address);
            buttonContinueBillingDetails();
            shippingExisting(select_shipping_address);
            buttonContinueDeliveryDetails();
            enterCommentDeliveryMethod("NothingToSay");
            buttonContinueDeliveryMethod();
            enterCommentPaymentMethod("NothingToSayAgain");
            checkBoxTermsAndConditions();
            buttonContinuePaymentMethod();
            clickConfirmOrder();
            System.out.println("Done");
        }
        return this;
    }
}