package com.solvd.tests;

import com.solvd.pages.HomePage;
import com.solvd.pages.SearchPage;
import com.solvd.utils.Constants;
import com.solvd.utils.MyDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void itTestsThatThePageOpens(){
        HomePage homePage =  new HomePage(MyDriver.getWebDriver());
        homePage.navigateToHome();
        Assert.assertEquals(homePage.getPageTitle(),"Reddit - Dive into anything","Title is not the expected");
        System.out.println(homePage.getPageTitle());
    }
    @Test
    public void itTestThatTheSearchNavWorks(){
        HomePage homepage = new HomePage(MyDriver.getWebDriver());
        homepage.navigateToHome();
        homepage.clickOnSearch();
        homepage.setSearch();
    }

}
