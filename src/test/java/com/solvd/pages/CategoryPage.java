package com.solvd.pages;

import static com.solvd.utils.Constants.REDDIT_CATEGORY_PAGE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CategoryPage extends BasePage{

    private By NEAR_YOU_CAT = By.linkText("Near You");
    private By SPORT_CAT = By.linkText("Sports");
    private By GAMING_CAT = By.linkText("Gaming");
    private By NEWS_CAT = By.linkText("News");

    private final By FIRST_NEAR_YOU = By.xpath("//div[2]/div/ol/li[1]/a");
    private final By FIRST_SPORTS = By.xpath("//div[2]/div/ol/li[1]/a");
    private final By FIRST_GAMING = By.xpath("//div[2]/div/ol/li[1]/a");
    private final By FIRST_NEW = By.xpath("//div[2]/div/ol/li[1]/a");
    public CategoryPage(WebDriver wDriver) {
        super(wDriver);
    }

    public void navigateToCategory(){
        webDriver.get(REDDIT_CATEGORY_PAGE);
    }
    public void clickOnNearYouCategory(){
        webDriver.findElement(NEAR_YOU_CAT).click();
        log.info("Click Near you Category");
    }
    public void clickOnSportsCategory(){
        webDriver.findElement(SPORT_CAT).click();
        log.info("Click Sports Category");
    }
    public void clickOnGamingCategory(){
        webDriver.findElement(GAMING_CAT).click();
        log.info("Click Gaming Category");
    }
    public void clickOnNewsCategory(){
        webDriver.findElement(NEWS_CAT).click();
        log.info("Click News Category");
    }
    public boolean isFirstNearYouDisplayed(){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(FIRST_NEAR_YOU));
        if (webDriver.findElement(FIRST_NEAR_YOU).isDisplayed()){
            log.info("FIRST NEAR YOU DIV IS DISPLAYED");
            return true;
        }else{
            return false;
        }
    }
    public boolean isFirstGamingDisplayed(){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(FIRST_GAMING));
        if (webDriver.findElement(FIRST_GAMING).isDisplayed()){
            log.info("FIRST GAMING DIV IS DISPLAYED");
            return true;
        }else{
            return false;
        }
    }
    public boolean isFirstSportsDisplayed(){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(FIRST_SPORTS));
        if (webDriver.findElement(FIRST_SPORTS).isDisplayed()){
            log.info("FIRST SPORTS DIV IS DISPLAYED");
            return true;
        }else{
            return false;
        }
    }
    public boolean isFirstNewsDisplayed(){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(FIRST_NEW));
        if (webDriver.findElement(FIRST_NEW).isDisplayed()){
            log.info("FIRST NEWS DIV IS DISPLAYED");
            return true;
        }else{
            return false;
        }
    }
}
