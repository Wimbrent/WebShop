package Positive;

import Base.BaseTest;
import Data.AddressPayment;
import Data.AddressShipping;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class BuyProductTest extends BaseTest {

    @DataProvider(name = "excelBD")
    public Object[][] excelDP() {
        Object[][] arrayData = getExcelData("src/main/resources/Products.xlsx", "MP3Players");
        return arrayData;
    }

    public String[][] getExcelData(String fileName, String sheetName) {
        String[][] data = null;
        try {
            FileInputStream file = new FileInputStream(fileName);
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheet(sheetName);
            XSSFRow row = sheet.getRow(0);
            int Rows = sheet.getPhysicalNumberOfRows();
            int Cols = row.getLastCellNum();
            Cell cell;
            data = new String[Rows-1][Cols];
            for (int i = 1; i < Rows; i++) {
                for (int x = 0; x < Cols; x++) {
                    row = sheet.getRow(i);
                    cell = row.getCell(x);
                    data[i-1][x] = cell.getStringCellValue();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "Buying product with existing address")
    @Test(dataProvider = "excelBD")
    @Parameters({"select_payment_address", "select_shipping_address"})
    public void Buy_ExistingAddress(String name, String id, int select_payment_address, int select_shipping_address) throws InterruptedException {
        cart.cartTotal();
        if (cart.bulCart) {
            cart.removeAll();
        }
        System.out.println(name);
        sectionGoods.linkToMP3Players()
                .linkToShowAllMP3Players();
        productCategoryPage.AddToCart(id);
        cart.cartTotal()
                .checkout();
        if (driver.findElements
                (By.xpath("//div[@class = 'alert alert-danger alert-dismissible']")).size() != 0) {
            viewCartPage.Remove();
            System.out.println("Product sold out");
        }
        else {
            checkOutPage.paymentExisting(select_payment_address)
                        .continueBillingDetails()
                        .shippingExisting(select_shipping_address)
                        .continueDeliveryDetails()
                        .enterCommentDeliveryMethod("NothingToSay")
                        .continueDeliveryMethod()
                        .enterCommentPaymentMethod("NothingToSayAgain")
                        .checkBoxTermsAndConditions()
                        .continuePaymentMethod()
                        .confirmOrder();
            Assert.assertEquals(driver.getTitle(), "Your order has been placed!");
        }
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "Buying product with new address")
    @Test(dataProvider = "excelBD")
    @Parameters({"select_payment_address", "select_shipping_address"})
    public void Buy_NewAddress(String name, String id) throws InterruptedException {
        cart.cartTotal();
        if (cart.bulCart) {
            cart.removeAll();
        }
        System.out.println(name);
        sectionGoods.linkToMP3Players()
                .linkToShowAllMP3Players();
        productCategoryPage.AddToCart(id);
        cart.cartTotal()
                .checkout();
        if (driver.findElements
                (By.xpath("//div[@class = 'alert alert-danger alert-dismissible']")).size() != 0) {
            viewCartPage.Remove();
            System.out.println("Product sold out");
        }
        else {
            checkOutPage.selectNewPaymentAddress()
                        .paymentEnterFirstName(AddressPayment.FirstName)
                        .paymentEnterLastName(AddressPayment.LastName)
                        .paymentEnterCompanyName(AddressPayment.Company)
                        .paymentEnterFirstAddress(AddressPayment.FirstAddress)
                        .paymentEnterCity(AddressPayment.City)
                        .paymentEnterPostCode(AddressPayment.PostCode)
                        .paymentSelectCountry(AddressPayment.Country)
                        .paymentSelectState(AddressPayment.State)
                        .continueBillingDetails()
                        .selectNewShippingAddress()
                        .shippingEnterFirstName(AddressShipping.FirstName)
                        .shippingEnterLastName(AddressShipping.LastName)
                        .shippingEnterCompanyName(AddressShipping.Company)
                        .shippingEnterFirstAddress(AddressShipping.FirstAddress)
                        .shippingEnterCity(AddressShipping.City)
                        .shippingEnterPostCode(AddressShipping.PostCode)
                        .shippingSelectCountry(AddressShipping.Country)
                        .shippingSelectState(AddressShipping.State)
                        .continueDeliveryDetails()
                        .enterCommentDeliveryMethod("NothingToSay")
                        .continueDeliveryMethod()
                        .enterCommentPaymentMethod("NothingToSayAgain")
                        .checkBoxTermsAndConditions()
                        .continuePaymentMethod()
                        .confirmOrder();
            Assert.assertEquals(driver.getTitle(), "Your order has been placed!");
        }
    }
}
