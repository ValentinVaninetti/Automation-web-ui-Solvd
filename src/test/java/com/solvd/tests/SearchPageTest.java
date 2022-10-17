package com.solvd.tests;

import com.solvd.pages.SearchPage;
import com.solvd.utils.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchPageTest extends BaseTest{

    @Test
    public void itTestThatSearchCommentsWorks(){
        SearchPage searchPage = new SearchPage(MyDriver.getWebDriver());
        searchPage.navigateToSearch();
        searchPage.clickOnSearchComments();
    }

    @Test
    public void itTestThatSearchPeopleWorks(){
        SearchPage searchPage = new SearchPage(MyDriver.getWebDriver());
        searchPage.navigateToSearch();
        searchPage.clickOnSearchPeople();
    }
    @Test
    public void itTestThatSearchCommunitiesWorks() {
        SearchPage searchPage = new SearchPage(MyDriver.getWebDriver());
        searchPage.navigateToSearch();
        searchPage.clickOnSearchCommunities();
    }
    @Test
    public void itTestThatSearchPostsWorks(){
        SearchPage searchPage = new SearchPage(MyDriver.getWebDriver());
        searchPage.navigateToSearch();
        searchPage.clickOnSearchPosts();
    }
}
