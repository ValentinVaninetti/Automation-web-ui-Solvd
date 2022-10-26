package com.solvd.interfaces.Ipages;

public interface ISearchPage {
    void clickOnSearchComments();

    void clickOnSearchPosts();

    void clickOnSearchCommunities();

    boolean isTitle(String title);

    void clickOnSearchPeople();

    void navigateToSearch();

    boolean isElementDisplayed(String locator);
}
