package com.solvd.tests;

import com.solvd.pages.HomePage;
import com.solvd.pages.components.LoginComponent;
import com.solvd.utils.Constants;
import com.solvd.utils.MyDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class LoginComponentTest extends BaseTest {

    @Test
    public void itTestThatTheLoginComponentOpens(){
        HomePage homePage = new HomePage(MyDriver.getWebDriver());
        this.navigateTo(Constants.REDDIT_HOME_PAGE);
        homePage.clickOnLogin();
    }
    @Test(testName = "itTestThatFillingLoginFieldsContinueWithFlow")
    @Parameters({"username", "password"})
    public void itTestThatFillingLoginFieldsContinueWithFlow(String username, String password) throws InterruptedException {
        HomePage homePage = new HomePage(MyDriver.getWebDriver());
        homePage.navigateToHome();
        LoginComponent loginComponent = homePage.clickOnLogin();
        MyDriver.getWebDriver().switchTo().activeElement();
        loginComponent.setUsername(username);
        loginComponent.setPassword(password);
        loginComponent.clickLoginSession();
    }
}
