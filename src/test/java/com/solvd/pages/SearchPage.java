package com.solvd.pages;

import static com.solvd.utils.Constants.REDDIT_SEARCH_PAGE;
import com.solvd.utils.MyDriver;
import static com.solvd.utils.WebLocators.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage{

    public SearchPage(WebDriver wDriver) {
        super(wDriver);
    }

    public void clickOnSearchComments(){
        webDriver.findElement(By.cssSelector(CSS_BUTTON_SEARCH_COMMENTS)).click();
    }
    public void clickOnSearchPosts(){
        webDriver.findElement(By.cssSelector(CSS_BUTTON_SEARCH_POSTS)).click();
    }
    public void clickOnSearchCommunities(){
        webDriver.findElement(By.cssSelector(CSS_BUTTON_SEARCH_COMMUNITIES)).click();
    }
    public void clickOnSearchPeople(){
        webDriver.findElement(By.cssSelector(CSS_BUTTON_SEARCH_PEOPLE)).click();
    }
    public void navigateToSearch(){
        webDriver.get(REDDIT_SEARCH_PAGE);
    }
}
