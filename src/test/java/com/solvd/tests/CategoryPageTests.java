package com.solvd.tests;

import com.solvd.pages.CategoryPage;
import com.solvd.utils.MyDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoryPageTests extends BaseTest{

    @Test
    public void enterCategoryNearYou(){
        CategoryPage categoryPage = new CategoryPage(MyDriver.getWebDriver());
        categoryPage.navigateToCategory();
        categoryPage.clickOnNearYouCategory();
        Assert.assertTrue(categoryPage.isFirstNearYouDisplayed(), "OMG");
    }
    @Test
    public void enterCategorySports() {
        CategoryPage categoryPage = new CategoryPage(MyDriver.getWebDriver());
        categoryPage.navigateToCategory();
        categoryPage.clickOnSportsCategory();
        Assert.assertTrue(categoryPage.isFirstSportsDisplayed(), "OMG");
    }
    @Test
    public void enterCategoryGaming() {
        CategoryPage categoryPage = new CategoryPage(MyDriver.getWebDriver());
        categoryPage.navigateToCategory();
        categoryPage.clickOnGamingCategory();
        Assert.assertTrue(categoryPage.isFirstGamingDisplayed(), "OMG");
    }
    @Test
    public void enterCategoryNews() {
        CategoryPage categoryPage = new CategoryPage(MyDriver.getWebDriver());
        categoryPage.navigateToCategory();
        categoryPage.clickOnNewsCategory();
        Assert.assertTrue(categoryPage.isFirstNewsDisplayed(), "OMG");
    }
}
