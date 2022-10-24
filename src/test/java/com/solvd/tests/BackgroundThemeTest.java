package com.solvd.tests;

import com.solvd.pages.CoinsPage;
import com.solvd.pages.HomePage;
import com.solvd.pages.PremiumPage;
import com.solvd.pages.TalkPage;
import com.solvd.pages.components.NavbarComponent;
import com.solvd.utils.Constants;
import com.solvd.utils.MyDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BackgroundThemeTest extends BaseTest{
    protected HomePage homePage;
    @BeforeClass
    public void setUpTests(){
        homePage =  new HomePage(MyDriver.getWebDriver());
        this.navigateTo(Constants.REDDIT_HOME_PAGE);
    }

    @Test
    public void itTestThatCoinsGoToCoinsPage() throws InterruptedException {
        NavbarComponent navbarComponent = homePage.clickOnUserDropdown();
        CoinsPage coinsPage = navbarComponent.clickCoinsButton();
        Assert.assertTrue(coinsPage.isButtonCoinDisplayed(),"OMG");
    }

    @Test
    public void itTestThatPremiumGoToPremiumPage(){
        NavbarComponent navbarComponent = homePage.clickOnUserDropdown();
        PremiumPage premiumPage = navbarComponent.clickPremiumButton();
        Assert.assertTrue(premiumPage.isButtonPremiumDisplayed(),"OMG");
    }

    @Test
    public void itTestThatTalkGoToTalkPage(){
        NavbarComponent navbarComponent = homePage.clickOnUserDropdown();
        TalkPage talkPage = navbarComponent.clickTalkButton();
        Assert.assertTrue(talkPage.isButtonTalkDisplayed(),"OMG");

    }
}
