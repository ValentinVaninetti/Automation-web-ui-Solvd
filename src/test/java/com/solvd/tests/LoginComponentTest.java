package com.solvd.tests;

import com.solvd.pages.HomePage;
import com.solvd.pages.components.LoginComponent;
import com.solvd.utils.Constants;
import com.solvd.utils.MyDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class LoginComponentTest extends BaseTest {

    @Test(priority = 1)
    public void itTestThatTheLoginComponentOpens() throws  Exception{
        MyScreenRecorder.startRecording("itTestThatTheLoginComponentOpens");
        HomePage homePage = new HomePage(MyDriver.getWebDriver());
        this.navigateTo(Constants.REDDIT_HOME_PAGE);
        homePage.clickOnLogin();
        MyScreenRecorder.stopRecording();
    }
    @Test(priority = 2,testName = "itTestThatFillingLoginFieldsContinueWithFlow")
    @Parameters({"username", "password"})
    public void itTestThatFillingLoginFieldsContinueWithFlow(String username, String password){
        HomePage homePage = new HomePage(MyDriver.getWebDriver());
        homePage.navigateToHome();
        LoginComponent loginComponent = homePage.clickOnLogin();
        MyDriver.getWebDriver().switchTo().activeElement();
        loginComponent.setUsername(username);
        loginComponent.setPassword(password);
        loginComponent.clickLoginSession();
    }
    @Test(priority = 3)
    public void itTestIsLogout(){
        HomePage homePage = new HomePage(MyDriver.getWebDriver());
        this.navigateTo(Constants.REDDIT_HOME_PAGE);
        LoginComponent loginComponent = new LoginComponent(MyDriver.getWebDriver());
        loginComponent.clickRightAccountMenu();
        MyDriver.getWebDriver().switchTo().activeElement();
        loginComponent.clickLogoutButton();
    }
}
