package com.solvd.pages;

import static com.solvd.utils.Constants.REDDIT_SEARCH_PAGE;

import com.solvd.interfaces.Ipages.ISearchPage;
import com.solvd.pages.components.CssComponent;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SearchPage extends BasePage implements ISearchPage {

    public SearchPage(WebDriver wDriver) {
        super(wDriver);
    }

    @Override
    public Logger getLogger() {
        return Logger.getLogger(this.getClass().getName());
    }

    @Override
    public void clickOnSearchComments() {
        webDriver.findElement(CssComponent.CSS_BUTTON_SEARCH_COMMENTS).click();
    }

    @Override
    public void clickOnSearchPosts() {
        webDriver.findElement(CssComponent.CSS_BUTTON_SEARCH_POSTS).click();

    }

    @Override
    public void clickOnSearchCommunities() {
        webDriver.findElement(CssComponent.CSS_BUTTON_SEARCH_COMMUNITIES).click();
    }

    @Override
    public boolean isTitle(String title) {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(CssComponent.CSS_BUTTON_SEARCH_POSTS));
        return webDriverWait.until(ExpectedConditions.titleContains(title));
    }

    @Override
    public void clickOnSearchPeople() {
        webDriver.findElement(CssComponent.CSS_BUTTON_SEARCH_PEOPLE).click();
    }

    @Override
    public void navigateToSearch() {
        webDriver.get(REDDIT_SEARCH_PAGE);
    }

    @Override
    public boolean isElementDisplayed(String locator) {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        return webDriver.findElement(By.xpath(locator)).isDisplayed();
    }
}
