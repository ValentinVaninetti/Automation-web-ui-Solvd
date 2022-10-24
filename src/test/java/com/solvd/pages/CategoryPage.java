package com.solvd.pages;

import static com.solvd.utils.Constants.REDDIT_CATEGORY_PAGE;

import com.solvd.utils.WebLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CategoryPage extends BasePage {

    public final By NEAR_YOU_CAT = By.xpath(WebLocators.NEAR_YOU_CAT);
    public final By SPORT_CAT = By.xpath(WebLocators.SPORT_CAT);
    public final By GAMING_CAT = By.xpath(WebLocators.GAMING_CAT);
    public final By NEWS_CAT = By.xpath(WebLocators.NEWS_CAT);

    public final By FIRST_NEAR_YOU = By.xpath(WebLocators.FIRST_NEAR_YOU);
    public final By FIRST_SPORTS = By.xpath(WebLocators.FIRST_SPORTS);
    public final By FIRST_GAMING = By.xpath(WebLocators.FIRST_GAMING);
    public final By FIRST_NEW = By.xpath(WebLocators.FIRST_NEW);

    public CategoryPage(WebDriver wDriver) {
        super(wDriver);
    }

    public void navigateToCategory() {
        webDriver.get(REDDIT_CATEGORY_PAGE);
    }

    public void clickOnNearYouCategory() throws InterruptedException {
        log.info("Clicking on Near you Category");
        Thread.sleep(10);
        webDriver.findElement(NEAR_YOU_CAT).click();
    }

    public void clickOnSportsCategory() {
        log.info("Clicking on Sports Category");
        webDriver.findElement(SPORT_CAT).click();
    }

    public void clickOnGamingCategory() {
        log.info("Clicking on Gaming Category");
        webDriver.findElement(GAMING_CAT).click();
    }

    public void clickOnNewsCategory() {
        log.info("Clicking on News Category");
        webDriver.findElement(NEWS_CAT).click();
    }

    public boolean isDivDisplayed(By locator) {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        log.info("Waiting for Near you div to be displayed");
        if (webDriver.findElement(FIRST_SPORTS).isDisplayed()) {
            log.info("FIRST " + locator + " DIV IS DISPLAYED");
            return true;
        } else {
            return false;
        }
    }

}
