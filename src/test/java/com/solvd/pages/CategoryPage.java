package com.solvd.pages;

import static com.solvd.utils.Constants.REDDIT_CATEGORY_PAGE;

import com.solvd.interfaces.Ipages.ICategoryPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CategoryPage extends BasePage implements ICategoryPage {

    public CategoryPage(WebDriver wDriver) {
        super(wDriver);
    }

    @Override
    public Logger getLogger() {
        return Logger.getLogger(this.getClass().getName());
    }

    @Override
    public void navigateToCategory() {
        webDriver.get(REDDIT_CATEGORY_PAGE);
    }

    @Override
    public void clickOnCategoryButton(String locator){
        log.info("Clicking on Category");
        webDriver.findElement(By.xpath(locator)).click();
    }
    @Override
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
