package com.solvd.pages;

import static com.solvd.utils.Constants.REDDIT_CATEGORY_PAGE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends BasePage{

    public CategoryPage(WebDriver wDriver) {
        super(wDriver);
    }

    public void navigateToCategory(){
        webDriver.get(REDDIT_CATEGORY_PAGE);
    }
    public void clickOnNearYouCategory(){
        webDriver.findElement(By.linkText("Near You")).click();
    }
    public void clickOnSportsCategory(){
        webDriver.findElement(By.linkText("Sports")).click();
    }
    public void clickOnGamingCategory(){
        webDriver.findElement(By.linkText("Gaming")).click();
    }
    public void clickOnNewsCategory(){
        webDriver.findElement(By.linkText("News")).click();
    }
}
