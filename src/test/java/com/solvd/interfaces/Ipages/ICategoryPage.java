package com.solvd.interfaces.Ipages;

public interface ICategoryPage {

    void navigateToCategory();
    void clickOnCategoryButton(String locator);
    boolean isElementDisplayed(String locator);
}
