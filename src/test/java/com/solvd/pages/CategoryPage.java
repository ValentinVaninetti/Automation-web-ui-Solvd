package com.solvd.pages;

import static com.solvd.utils.Constants.REDDIT_CATEGORY_PAGE
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CategoryPage extends BasePage {

    public CategoryPage(WebDriver wDriver) {
        super(wDriver);
    }

    public void navigateToCategory() {
        webDriver.get(REDDIT_CATEGORY_PAGE);
    }

    public void clickOnCategoryButton(String locator){
        log.info("Clicking on Category");
        webDriver.findElement(By.xpath(locator)).click();
    }

    public boolean isElementDisplayed(String locator) {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        log.info("Waiting for Near you div to be displayed");
        if (webDriver.findElement(By.xpath(locator)).isDisplayed()) {
            log.info("FIRST " + locator + " DIV IS DISPLAYED");
            return true;
        } else {
            return false;
        }
    }

}
