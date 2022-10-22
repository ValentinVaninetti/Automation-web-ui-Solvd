package com.solvd.tests;

import com.solvd.pages.HomePage;
import com.solvd.pages.SearchPage;
import com.solvd.pages.components.NavbarComponent;
import com.solvd.pages.components.PostComponent;
import com.solvd.utils.Constants;
import com.solvd.utils.MyDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{
    protected HomePage homePage;

    @BeforeTest
    public void setUpTests(){
        homePage =  new HomePage(MyDriver.getWebDriver());
        this.navigateTo(Constants.REDDIT_HOME_PAGE);
    }

    @Test
    public void itTestsThatThePageOpens(){
        HomePage homePage =  new HomePage(MyDriver.getWebDriver());
        homePage.navigateToHome();
        Assert.assertEquals(this.homePage.getPageTitle(),"Reddit - Dive into anything","Title is not the expected");
    }
    @Test
    public void itTestThatTheSearchNavWorks() throws InterruptedException {
        HomePage homepage = new HomePage(MyDriver.getWebDriver());
        homepage.navigateToHome();
        homepage.clickOnSearch();
        SearchPage sp = homepage.setSearch("QA AUTOMATION");
        Assert.assertTrue(sp.isTitle("QA AUTOMATION"), "its ok");
    }
    @Test(testName = "itTestThatTheNavbarIsDisplayed")
    public void itTestThatTheNavbarIsDisplayed() {
        NavbarComponent navbarComponent = homePage.clickOnUserDropdown();
        Assert.assertTrue(navbarComponent.isNavbarDisplayed(), "Navbar is not working");
    }
    @Test(testName = "itTestThatRegisterOrLoginButtonWorks")
    public void itTestThatRegisterOrLoginButtonWorks(){
        NavbarComponent navbarComponent = homePage.clickOnUserDropdown();
        navbarComponent.scrollDownNavbarMenu();
        navbarComponent.clickRegisterOrLoginButton();
        Assert.assertTrue(homePage.isRegisterOrLoginMenuDisplayed(), "Main is not displayed!");
    }
    @Test(testName = "itTestThatDarkThemeWorks")
    public void itTestThatDarkThemeWorks(){
        NavbarComponent navbarComponent = homePage.clickOnUserDropdown();
        navbarComponent.clickSettingsButton();
        navbarComponent.clickDarkThemeButton();
        homePage.getBodyBackgroundColor();
        Assert.assertEquals(homePage.getBodyBackgroundColor(),
                "rgba(26, 26, 27, 1)", "Dark Theme doesn't work");
    }

    @Test
    public void itTestsThatSharingAPostOfflineChatboxDoesntOpens() throws InterruptedException {
        HomePage homePage = new HomePage(MyDriver.getWebDriver());
        homePage.navigateToHome();
        PostComponent postComponent = homePage.clickFirstPost();
        postComponent.clickOnSharePost();
        postComponent.clickOnShareOnChat();
        Assert.assertTrue(homePage.isChatBoxDisplayed(),"OMG");

    }

}
