package com.solvd.tests;

import com.solvd.pages.CategoryPage;
import com.solvd.utils.MyDriver;
import com.solvd.utils.WebLocators;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoryPageTests extends BaseTest {

    @Test
    public void enterCategoryNearYou(){
        CategoryPage categoryPage = new CategoryPage(MyDriver.getWebDriver());
        categoryPage.navigateToCategory();
        categoryPage.clickOnCategoryButton(WebLocators.NEAR_YOU_CAT);
        Assert.assertTrue(categoryPage.isElementDisplayed(WebLocators.FIRST_NEAR_YOU), "OMG");
    }

    @Test
    public void enterCategorySports() {
        CategoryPage categoryPage = new CategoryPage(MyDriver.getWebDriver());
        categoryPage.navigateToCategory();
        categoryPage.clickOnCategoryButton(WebLocators.SPORT_CAT);
        Assert.assertTrue(categoryPage.isElementDisplayed(WebLocators.FIRST_SPORTS), "OMG");
    }

    @Test
    public void enterCategoryGaming() {
        CategoryPage categoryPage = new CategoryPage(MyDriver.getWebDriver());
        categoryPage.navigateToCategory();
        categoryPage.clickOnCategoryButton(WebLocators.GAMING_CAT);
        Assert.assertTrue(categoryPage.isElementDisplayed(WebLocators.FIRST_GAMING), "OMG");
    }

    @Test
    public void enterCategoryNews() {
        CategoryPage categoryPage = new CategoryPage(MyDriver.getWebDriver());
        categoryPage.navigateToCategory();
        categoryPage.clickOnCategoryButton(WebLocators.NEWS_CAT);
        Assert.assertTrue(categoryPage.isElementDisplayed(WebLocators.FIRST_NEW), "OMG");
    }
}
