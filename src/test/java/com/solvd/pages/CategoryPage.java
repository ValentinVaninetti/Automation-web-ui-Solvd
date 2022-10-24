package com.solvd.pages;

import static com.solvd.utils.Constants.REDDIT_CATEGORY_PAGE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends BasePage{

    private By NEAR_YOU_CAT = By.linkText("Near You");
    private By SPORT_CAT = By.linkText("Sports");
    private By GAMING_CAT = By.linkText("Gaming");
    private By NEWS_CAT = By.linkText("News");
    public CategoryPage(WebDriver wDriver) {
        super(wDriver);
    }

    public void navigateToCategory(){
        webDriver.get(REDDIT_CATEGORY_PAGE);
    }
    public void clickOnNearYouCategory(){
        webDriver.findElement(NEAR_YOU_CAT).click();
    }
    public void clickOnSportsCategory(){
        webDriver.findElement(SPORT_CAT).click();
    }
    public void clickOnGamingCategory(){
        webDriver.findElement(GAMING_CAT).click();
    }
    public void clickOnNewsCategory(){
        webDriver.findElement(NEWS_CAT).click();
    }
}
