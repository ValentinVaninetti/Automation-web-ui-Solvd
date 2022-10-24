package com.solvd.pages;

import com.solvd.pages.components.CssComponent;
import com.solvd.pages.components.LoginComponent;
import com.solvd.pages.components.NavbarComponent;
import com.solvd.pages.components.PostComponent;
import com.solvd.utils.Constants;
import com.solvd.utils.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class HomePage extends BasePage{

    private By BUTTON_FIRST_POST = By.xpath("//div[1]/div[5]/div[1]/div/div");
    private By HEADER_USER_DROPDOWN = By.className("header-user-dropdown");
    private By CHAT_BOX_DISPLAYED = By.xpath("//body/div[5]/div/div");

    public HomePage(WebDriver wDriver) {
        super(wDriver);
    }


    public LoginComponent clickOnLogin(){
        webDriver.findElement(LoginComponent.CSS_OPEN_LOGIN_BUTTON).click();
        return new LoginComponent(webDriver);
    }
    public NavbarComponent clickOnUserDropdown() {
        if (webDriver.findElement(HEADER_USER_DROPDOWN).isDisplayed()){
            getLogger(HomePage.getClassName(this)).info("Clicking on Dropdown Button menu");
            webDriver.findElement(HEADER_USER_DROPDOWN).click();
        }
        return new NavbarComponent(webDriver);
    }


    public String getBodyBackgroundColor(){
        return webDriver.findElement(CssComponent.CSS_BACKGROUND)
                .getCssValue("background-color");
    }

    public boolean isRegisterOrLoginMenuDisplayed(){
        getLogger(HomePage.getClassName(this)).info("Switching to frame and checking if login menu is displayed");
        webDriver.switchTo().frame(0);
        return webDriver.findElement(LoginComponent.LOGIN_MENU_DISPLAY).isDisplayed();
    }

    public void clickOnSearch() {
        getLogger(HomePage.getClassName(this)).info("Clicking on search input");
        webDriver.findElement(CssComponent.CSS_SEARCH).click();
    }
    public SearchPage setSearch( String SEARCH) {
        log.info("Filling Search Bar");
        webDriver.findElement(CssComponent.CSS_SEARCH).sendKeys(SEARCH);
        clickOnSearch();
        log.info("Entering search");
        webDriver.findElement(CssComponent.CSS_SEARCH).sendKeys(Keys.ENTER);
        log.info("Sending information");
        return new SearchPage(MyDriver.getWebDriver());
    }
    public void navigateToHome(){
        webDriver.get(Constants.REDDIT_HOME_PAGE);
    }

    public PostComponent clickFirstPost(){
        getLogger(HomePage.getClassName(this)).info("Clicking on first post");
        webDriver.findElement(BUTTON_FIRST_POST).click();
        return new PostComponent(webDriver);
    }
    public boolean isChatBoxDisplayed(){
        if (webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(CHAT_BOX_DISPLAYED)).isDisplayed()){
            return true;
        }
        else return false;
    }

}
