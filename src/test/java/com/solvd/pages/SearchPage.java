package com.solvd.pages;

import static com.solvd.utils.Constants.REDDIT_SEARCH_PAGE;
import com.solvd.pages.components.CssComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SearchPage extends BasePage {

    private By FIRST_COMMENT = By.xpath("//div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div/div");
    private By ALL_COMMUNITIES = By.xpath("//div/div/div[2]/div/div[2]");


    public SearchPage(WebDriver wDriver) {
        super(wDriver);
    }

    public void clickOnSearchComments(){
        webDriver.findElement(CssComponent.CSS_BUTTON_SEARCH_COMMENTS).click();
    }
    public void clickOnSearchPosts(){
        webDriver.findElement(CssComponent.CSS_BUTTON_SEARCH_POSTS).click();
    }
    public void clickOnSearchCommunities(){
        webDriver.findElement(CssComponent.CSS_BUTTON_SEARCH_COMMUNITIES).click();
    }
    public boolean isTitle(String title){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(CssComponent.CSS_BUTTON_SEARCH_POSTS));
        return webDriverWait.until(ExpectedConditions.titleContains(title));
    }
    public void clickOnSearchPeople(){
        webDriver.findElement(CssComponent.CSS_BUTTON_SEARCH_PEOPLE).click();
    }
    public void navigateToSearch(){
        webDriver.get(REDDIT_SEARCH_PAGE);
    }
    public boolean isCommentDivDisplayed(){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(FIRST_COMMENT));
        return webDriver.findElement(FIRST_COMMENT).isDisplayed();
    }
    public boolean isCommunitiesDivDisplayed(){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(ALL_COMMUNITIES));
        return webDriver.findElement(ALL_COMMUNITIES).isDisplayed();
    }
}
