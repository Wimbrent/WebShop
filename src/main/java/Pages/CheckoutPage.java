package Pages;

import Base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait element = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Step(value = "Select payment existing address")
    public CheckoutPage paymentExisting(int index) {
        Select selectPayment = new Select(element.until
                (ExpectedConditions.presenceOfElementLocated
                        ((By.xpath("//div[@id = 'payment-existing']/select")))));
        selectPayment.selectByIndex(index);
        return this;
    }

    @Step(value = "Select new payment address")
    public CheckoutPage selectNewPaymentAddress() {
        element.until(ExpectedConditions.presenceOfElementLocated
                (By.xpath("//input[@name = 'payment_address' and @value = 'new']"))).click();
        return this;
    }

    @Step(value = "Billing Details: Enter First Name")
    public CheckoutPage paymentEnterFirstName(String firstname) {
        element.until(ExpectedConditions.presenceOfElementLocated(By.id("input-payment-firstname"))).sendKeys(firstname);
        return this;
    }

    @Step(value = "Billing Details: Enter Last Name")
    public CheckoutPage paymentEnterLastName(String lastname) {
        element.until(ExpectedConditions.presenceOfElementLocated(By.id("input-payment-lastname"))).sendKeys(lastname);
        return this;
    }

    @Step(value = "Billing Details: Enter Company")
    public CheckoutPage paymentEnterCompanyName(String companyname) {
        element.until(ExpectedConditions.presenceOfElementLocated(By.id("input-payment-company"))).sendKeys(companyname);
        return this;
    }

    @Step(value = "Billing Details: Enter First Address")
    public CheckoutPage paymentEnterFirstAddress(String firstaddress) {
        element.until(ExpectedConditions.presenceOfElementLocated(By.id("input-payment-address-1"))).sendKeys(firstaddress);
        return this;
    }

    @Step(value = "Billing Details: Enter City")
    public CheckoutPage paymentEnterCity(String cityname) {
        element.until(ExpectedConditions.presenceOfElementLocated(By.id("input-payment-city"))).sendKeys(cityname);
        return this;
    }

    @Step(value = "Billing Details: Enter Post Code")
    public CheckoutPage paymentEnterPostCode(String postcode) {
        element.until(ExpectedConditions.presenceOfElementLocated(By.id("input-payment-postcode"))).sendKeys(postcode);
        return this;
    }

    @Step(value = "Billing Details: Select Country")
    public CheckoutPage paymentSelectCountry(String country) {
        Select selectCountry = new Select(element.until(ExpectedConditions.presenceOfElementLocated(By.id("input-payment-country"))));
        selectCountry.getAllSelectedOptions();
        selectCountry.selectByVisibleText(country);
        return this;
    }

    @Step(value = "Billing Details: Select State")
    public CheckoutPage paymentSelectState(String state) {
        Select selectState = new Select(element.until(ExpectedConditions.presenceOfElementLocated(By.id("input-payment-zone"))));
        selectState.getAllSelectedOptions();
        selectState.selectByVisibleText(state);
        return this;
    }

    @Step(value = "Click on button Continue Billing Details")
    public CheckoutPage continueBillingDetails() {
        element.until(ExpectedConditions.presenceOfElementLocated
                (By.id("button-payment-address"))).click();
        return this;
    }

    @Step(value = "Select shipping existing address")
    public CheckoutPage shippingExisting(int index) {
        Select selectShipping = new Select(element.until
                (ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//div[@id = 'shipping-existing']/select"))));
        selectShipping.selectByIndex(index);
        return this;
    }

    @Step(value = "Select new shipping address")
    public CheckoutPage selectNewShippingAddress() {
        element.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name = 'shipping_address' and @value = 'new']"))).click();
        return this;
    }

    @Step(value = "Delivery Details: Enter First Name")
    public CheckoutPage shippingEnterFirstName(String firstname) {
        element.until(ExpectedConditions.presenceOfElementLocated(By.id("input-shipping-firstname"))).sendKeys(firstname);
        return this;
    }

    @Step(value = "Delivery Details: Enter Last Name")
    public CheckoutPage shippingEnterLastName(String lastname) {
        element.until(ExpectedConditions.presenceOfElementLocated(By.id("input-shipping-lastname"))).sendKeys(lastname);
        return this;
    }

    @Step(value = "Delivery Details: Enter Company")
    public CheckoutPage shippingEnterCompanyName(String companyname) {
        element.until(ExpectedConditions.presenceOfElementLocated(By.id("input-shipping-company"))).sendKeys(companyname);
        return this;
    }

    @Step(value = "Delivery Details: Enter First Address")
    public CheckoutPage shippingEnterFirstAddress(String firstaddress) {
        element.until(ExpectedConditions.presenceOfElementLocated(By.id("input-shipping-address-1"))).sendKeys(firstaddress);
        return this;
    }

    @Step(value = "Delivery Details: Enter City")
    public CheckoutPage shippingEnterCity(String cityname) {
        element.until(ExpectedConditions.presenceOfElementLocated(By.id("input-shipping-city"))).sendKeys(cityname);
        return this;
    }

    @Step(value = "Delivery Details: Enter Post Code")
    public CheckoutPage shippingEnterPostCode(String postcode) {
        element.until(ExpectedConditions.presenceOfElementLocated(By.id("input-shipping-postcode"))).sendKeys(postcode);
        return this;
    }

    @Step(value = "Delivery Details: Select Country")
    public CheckoutPage shippingSelectCountry(String country) {
        Select selectCountry = new Select(element.until(ExpectedConditions.presenceOfElementLocated(By.id("input-shipping-country"))));
        selectCountry.getAllSelectedOptions();
        selectCountry.selectByVisibleText(country);
        return this;
    }

    @Step(value = "Delivery Details: Select State")
    public CheckoutPage shippingSelectState(String state) {
        Select selectState = new Select(element.until(ExpectedConditions.presenceOfElementLocated(By.id("input-shipping-zone"))));
        selectState.getAllSelectedOptions();
        selectState.selectByVisibleText(state);
        return this;
    }

    @Step(value = "Click on button Continue Delivery Details")
    public CheckoutPage continueDeliveryDetails() {
        element.until(ExpectedConditions.presenceOfElementLocated
                (By.id("button-shipping-address"))).click();
        return this;
    }

    @Step(value = "Enter comment to Delivery Method")
    public CheckoutPage enterCommentDeliveryMethod(String commentDelivery) {
        element.until(ExpectedConditions.presenceOfElementLocated
                ((By.xpath("//*[@id='collapse-shipping-method']/div/p/textarea")))).sendKeys(commentDelivery);
        return this;
    }

    @Step(value = "Click on button Continue Delivery Method")
    public CheckoutPage continueDeliveryMethod() {
        element.until(ExpectedConditions.presenceOfElementLocated
                ((By.id("button-shipping-method")))).click();
        return this;
    }

    @Step(value = "Enter comment to Payment Method")
    public CheckoutPage enterCommentPaymentMethod(String commentPayment) {
        element.until(ExpectedConditions.presenceOfElementLocated
                ((By.xpath("//*[@id='collapse-payment-method']/div/p/textarea")))).sendKeys(commentPayment);
        return this;
    }

    @Step(value = "Click on checkbox Terms and Conditions")
    public CheckoutPage checkBoxTermsAndConditions() {
        element.until(ExpectedConditions.presenceOfElementLocated
                ((By.xpath("//input[@type = 'checkbox']")))).click();
        return this;
    }

    @Step(value = "Click on button Continue Payment Method")
    public CheckoutPage continuePaymentMethod() throws InterruptedException {
        Thread.sleep(2000);
        element.until(ExpectedConditions.presenceOfElementLocated
                ((By.id("button-payment-method")))).click();
        return this;
    }

    @Step(value = "Click on button Confirm Order")
    public CheckoutPage confirmOrder() throws InterruptedException {
        Thread.sleep(2000);
        element.until(ExpectedConditions.presenceOfElementLocated
                ((By.xpath("//input[@value = 'Confirm Order']")))).click();
        Thread.sleep(1000);
        return this;
    }

    public List<WebElement> elementList = driver.findElements
            (By.xpath("//div[@class = 'alert alert-danger alert-dismissible']"));
}