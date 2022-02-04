package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchPage enterSearch(String keyword) {
        driver.findElement(By.id("input-search")).sendKeys(keyword);
        return this;
    }

    public SearchPage checkBoxDescription() {
        driver.findElement(By.id("description")).click();
        return this;
    }

    public SearchPage selectCategories(String selectCategory) {
        Select select = new Select(driver.findElement(By.name("category_id")));
        select.getAllSelectedOptions();
        select.selectByVisibleText(selectCategory);
        return this;
    }

    public SearchPage checkBoxSearchInSubCategories() {
        driver.findElement(By.name("sub_category")).click();
        return this;
    }
}