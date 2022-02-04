package Positive.Product;

import Base.BaseTest;
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


public class MP3PlayersTest extends BaseTest {

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
    @Description(value = "Select the product, add it to the cart and then buy")
    @Test(dataProvider = "excelBD")
    @Parameters({"select_payment_address", "select_shipping_address"})
    public void AddToCartAndBuy(String name, String id, int select_payment_address, int select_shipping_address) throws InterruptedException {
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
    @Description(value = "Select the product, add it to the cart and remove from cart")
    @Test(dataProvider = "excelBD")
    public void AddToCartAndRemove(String name, String id) throws InterruptedException {
        System.out.println(name);
        sectionGoods.linkToMP3Players()
                    .linkToShowAllMP3Players();
        productCategoryPage.AddToCart(id);
        cart.cartTotal()
            .remove();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "Select the product, add it to the wishlist and then buy")
    @Test(dataProvider = "excelBD")
    @Parameters({"select_payment_address", "select_shipping_address"})
    public void AddToWishListAndBuy(String name, String id, int select_payment_address, int select_shipping_address) throws InterruptedException {
        cart.cartTotal();
        if (cart.bulCart) {
            cart.removeAll();
        }
        System.out.println(name);
        sectionGoods.linkToMP3Players()
                    .linkToShowAllMP3Players();
        productCategoryPage.AddToWishList(id)
                           .linkToWishlistPage();
        modifyYourWishListPage.AddToCart(id);
        cart.cartTotal()
            .checkout();
        if (driver.findElements
                (By.xpath("//div[@class = 'alert alert-danger alert-dismissible']")).size() != 0) {
            System.out.println("Product sold out");
            viewCartPage.Remove();
        } else {
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
    @Description(value = "Select the product, add it to the wishlist and then remove from wish list")
    @Test(dataProvider = "excelBD")
    public void AddToWishListAndRemove(String name, String id) throws InterruptedException {
        System.out.println(name);
        sectionGoods.linkToMP3Players()
                    .linkToShowAllMP3Players();
        productCategoryPage.AddToWishList(id)
                           .linkToWishlistPage();
        modifyYourWishListPage.Remove(id);
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "Select the product, add it to the comparison and then buy")
    @Test(dataProvider = "excelBD")
    @Parameters({"select_payment_address", "select_shipping_address"})
    public void CompareThisProductAndBuy(String name, String id, int select_payment_address, int select_shipping_address) throws InterruptedException {
        cart.cartTotal();
        if (cart.bulCart) {
            cart.removeAll();
        }
        System.out.println(name);
        sectionGoods.linkToMP3Players()
                    .linkToShowAllMP3Players();
        productCategoryPage.CompareThisProduct(id)
                           .linkToComparePage();
        productComparisonPage.AddToCart(id);
        cart.cartTotal()
            .checkout();
        if (driver.findElements
                (By.xpath("//div[@class = 'alert alert-danger alert-dismissible']")).size() != 0) {
            viewCartPage.Remove();
        } else {
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
    @Description(value = "Select the product, add it to the comparison and then buy")
    @Test(dataProvider = "excelBD")
    public void CompareThisProductAndRemove(String name, String id) throws InterruptedException {
        System.out.println(name);
        sectionGoods.linkToMP3Players()
                    .linkToShowAllMP3Players();
        productCategoryPage.CompareThisProduct(id)
                           .linkToComparePage();
        productComparisonPage.Remove(id);
    }
}