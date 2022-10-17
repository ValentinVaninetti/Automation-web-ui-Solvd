package com.solvd.tests;

import com.solvd.pages.CategoryPage;
import com.solvd.utils.MyDriver;
import org.testng.annotations.Test;

public class CategoryPageTests extends BaseTest{

    @Test
    public void enterCategoryNearYou(){
        CategoryPage categoryPage = new CategoryPage(MyDriver.getWebDriver());
        categoryPage.navigateToCategory();
        categoryPage.clickOnNearYouCategory();
    }
    @Test
    public void enterCategorySports() {
        CategoryPage categoryPage = new CategoryPage(MyDriver.getWebDriver());
        categoryPage.navigateToCategory();
        categoryPage.clickOnSportsCategory();
    }
    @Test
    public void enterCategoryGaming() {
        CategoryPage categoryPage = new CategoryPage(MyDriver.getWebDriver());
        categoryPage.navigateToCategory();
        categoryPage.clickOnGamingCategory();
    }
    @Test
    public void enterCategoryNews() {
        CategoryPage categoryPage = new CategoryPage(MyDriver.getWebDriver());
        categoryPage.navigateToCategory();
        categoryPage.clickOnNewsCategory();
    }
}
