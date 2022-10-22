package com.solvd.tests;

import com.solvd.pages.SearchPage;
import com.solvd.utils.MyDriver;
import org.testng.annotations.Test;

public class SearchPageTest extends BaseTest{

    @Test
    public void itTestThatSearchCommentsWorks(){
        SearchPage searchPage = new SearchPage(MyDriver.getWebDriver());
        searchPage.navigateToSearch();
        searchPage.clickOnSearchComments();
        //assert
    }

    @Test
    public void itTestThatSearchPeopleWorks(){
        SearchPage searchPage = new SearchPage(MyDriver.getWebDriver());
        searchPage.navigateToSearch();
        searchPage.clickOnSearchPeople();
        //assert
    }
    @Test
    public void itTestThatSearchCommunitiesWorks() {
        SearchPage searchPage = new SearchPage(MyDriver.getWebDriver());
        searchPage.navigateToSearch();
        searchPage.clickOnSearchCommunities();
        //assert
    }
    @Test
    public void itTestThatSearchPostsWorks(){
        SearchPage searchPage = new SearchPage(MyDriver.getWebDriver());
        searchPage.navigateToSearch();
        searchPage.clickOnSearchPosts();
        //assert
    }
}
