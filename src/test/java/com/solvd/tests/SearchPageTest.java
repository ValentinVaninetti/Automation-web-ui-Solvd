package com.solvd.tests;

import com.solvd.pages.SearchPage;
import com.solvd.utils.MyDriver;
import com.solvd.utils.WebLocators;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchPageTest extends BaseTest {

    @Test
    public void itTestThatSearchCommentsWorks() {
        SearchPage searchPage = new SearchPage(MyDriver.getWebDriver());
        searchPage.navigateToSearch();
        searchPage.clickOnSearchComments();
        Assert.assertTrue(searchPage.isElementDisplayed(WebLocators.FIRST_COMMENT_DIV), "OMG");
    }

    @Test
    public void itTestThatSearchPeopleWorks() {
        SearchPage searchPage = new SearchPage(MyDriver.getWebDriver());
        searchPage.navigateToSearch();
        searchPage.clickOnSearchPeople();
        //Assert.assertTrue(searchPage.isElementDisplayed(WebLocators.ALL_PEOPLE_DIV), "AAAA");
    }

    @Test
    public void itTestThatSearchCommunitiesWorks() {
        SearchPage searchPage = new SearchPage(MyDriver.getWebDriver());
        searchPage.navigateToSearch();
        searchPage.clickOnSearchCommunities();
        Assert.assertTrue(searchPage.isElementDisplayed(WebLocators.FIRST_COMMUNITIES_DIV), "OMG");
    }

    @Test
    public void itTestThatSearchPostsWorks() {
        SearchPage searchPage = new SearchPage(MyDriver.getWebDriver());
        searchPage.navigateToSearch();
        searchPage.clickOnSearchPosts();
        Assert.assertTrue(searchPage.isElementDisplayed(WebLocators.ALL_POSTS_DIVS), "OMG");
    }
}
