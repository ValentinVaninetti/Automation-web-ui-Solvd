package com.solvd.pages;

import static com.solvd.utils.Constants.REDDIT_SEARCH_PAGE;

import com.solvd.pages.components.CssComponent;
import com.solvd.utils.WebLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SearchPage extends BasePage {

    private By FIRST_COMMENT = By.xpath(WebLocators.FIRST_COMMENT_DIV);
    private By ALL_COMMUNITIES = By.xpath(WebLocators.FIRST_COMMUNITIES_DIV);
    private By ALL_POSTS = By.xpath(WebLocators.ALL_POSTS_DIVS);


    public SearchPage(WebDriver wDriver) {
        super(wDriver);
    }

    public void clickOnSearchComments() {
        webDriver.findElement(CssComponent.CSS_BUTTON_SEARCH_COMMENTS).click();
    }

    public void clickOnSearchPosts() {
        webDriver.findElement(CssComponent.CSS_BUTTON_SEARCH_POSTS).click();

    }

    public void clickOnSearchCommunities() {
        webDriver.findElement(CssComponent.CSS_BUTTON_SEARCH_COMMUNITIES).click();
    }

    public boolean isTitle(String title) {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(CssComponent.CSS_BUTTON_SEARCH_POSTS));
        return webDriverWait.until(ExpectedConditions.titleContains(title));
    }

    public void clickOnSearchPeople() {
        webDriver.findElement(CssComponent.CSS_BUTTON_SEARCH_PEOPLE).click();
    }

    public void navigateToSearch() {
        webDriver.get(REDDIT_SEARCH_PAGE);
    }

    public boolean isCommentDivDisplayed() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(FIRST_COMMENT));
        return webDriver.findElement(FIRST_COMMENT).isDisplayed();
    }

    public boolean isCommunitiesDivDisplayed() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(ALL_COMMUNITIES));
        return webDriver.findElement(ALL_COMMUNITIES).isDisplayed();
    }

    public boolean isSearchPostDivDisplayed() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(ALL_POSTS));
        return webDriver.findElement(ALL_POSTS).isDisplayed();
    }
}
