package Elements;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SectionGoods extends BasePage {
    public SectionGoods(WebDriver driver) {
        super(driver);
    }

    WebDriverWait element = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void linkToCameras() {
        driver.findElement(By.linkText("Cameras")).click();
    }
    public void linkToPhonesAndPDAs() {
        element.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Phones & PDAs"))).click();
    }

    public void linkToSoftware() {
        driver.findElement(By.linkText("Software")).click();
    }

    public void linkToTablets() {
        driver.findElement(By.linkText("Tablets")).click();
    }

    public SectionGoods linkToComponents() {
        driver.findElement(By.linkText("Components")).click();
        return this;
    }

    public void linkToMiceAndTrackballs() {
        driver.findElement(By.linkText("Mice and Trackballs")).click();
    }

    public void linkToMonitors() {
        driver.findElement(By.partialLinkText("Monitors")).click();
    }

    public void linkToPrinters() {
        driver.findElement(By.linkText("Printers")).click();
    }

    public void linkToScanners() {
        driver.findElement(By.linkText("Scanners")).click();
    }

    public void linkToWebCameras() {
        driver.findElement(By.linkText("Web Cameras")).click();
    }

    public void linkToShowAllComponents() {
        driver.findElement(By.linkText("Show All Components")).click();
    }

    public SectionGoods linkToDesktops() {
        driver.findElement(By.linkText("Desktops")).click();
        return this;
    }

    public void linkToPC() {
        driver.findElement(By.linkText("PC")).click();
    }

    public void linkToMac() {
        driver.findElement(By.linkText("Mac")).click();
    }

    public void linkToShowAllDesktops() {
        driver.findElement(By.linkText("Show All Desktops")).click();
    }

    public SectionGoods linkToLaptopsAndNotebooks() {
        driver.findElement(By.linkText("Laptops & Notebooks")).click();
        return this;
    }

    public void linkToMacs(){
        driver.findElement(By.linkText("Macs")).click();
    }

    public void linkToWindows() {
        driver.findElement(By.linkText("Windows")).click();
    }

    public void linkToShowAllLaptopsAndNotebooks() {
        driver.findElement(By.linkText("Show All Laptops & Notebooks")).click();
    }

    public SectionGoods linkToMP3Players() throws InterruptedException {
        Thread.sleep(1000);
        element.until(ExpectedConditions.presenceOfElementLocated(By.linkText("MP3 Players"))).click();
        Thread.sleep(1000);
        return this;
    }

    public void linkToShowAllMP3Players() {
        element.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Show All MP3 Players"))).click();
    }
}