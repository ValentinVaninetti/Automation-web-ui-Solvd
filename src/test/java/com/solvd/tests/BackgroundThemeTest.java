package com.solvd.tests;

import com.solvd.pages.CoinsPage;
import com.solvd.pages.HomePage;
import com.solvd.pages.PremiumPage;
import com.solvd.pages.TalkPage;
import com.solvd.pages.components.NavbarComponent;
import com.solvd.utils.Constants;
import com.solvd.utils.MyDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BackgroundThemeTest extends BaseTest{
    protected HomePage homePage;
    @BeforeTest
    public void setUpTests(){
        homePage =  new HomePage(MyDriver.getWebDriver());
        this.navigateTo(Constants.REDDIT_HOME_PAGE);
    }

   /* @Test
    public void itTestThatRedirectLinkWorks(){
        NavbarComponent navbarComponent = homePage.clickOnUserDropdown();
        navbarComponent.clickMoreButton();
        navbarComponent.clickRedditIosButton();
        Assert.assertTrue(navbarComponent.checkPageTitle(getPageTitle()), "Redirect error!");
        MyDriver.navigateBackwards();
        homePage.clickOnUserDropdown();
        navbarComponent.clickMoreButton();
        navbarComponent.clickRedditAndroidButton();
        Assert.assertTrue(navbarComponent.checkPageTitle(MyDriver.getPageTitle()), "Redirect error!");
        MyDriver.navigateBackwards();
        Assert.assertTrue(navbarComponent.checkPageTitle(MyDriver.getPageTitle()), "Redirect error!");
    }*/

    @Test
    public void itTestThatCoinsGoToCoinsPage(){
        NavbarComponent navbarComponent = homePage.clickOnUserDropdown();
        CoinsPage coinsPage = navbarComponent.clickCoinsButton();
    }

    @Test
    public void itTestThatPremiumGoToPremiumPage(){
        NavbarComponent navbarComponent = homePage.clickOnUserDropdown();
        PremiumPage premiumPage = navbarComponent.clickPremiumButton();
    }

    @Test
    public void itTestThatTalkGoToTalkPage(){
        NavbarComponent navbarComponent = homePage.clickOnUserDropdown();
        TalkPage talkPage = navbarComponent.clickTalkButton();
    }
}
