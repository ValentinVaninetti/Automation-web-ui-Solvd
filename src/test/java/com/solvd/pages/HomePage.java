package com.solvd.pages;

import com.solvd.interfaces.Ipages.IHomePage;
import com.solvd.pages.components.CssComponent;
import com.solvd.pages.components.LoginComponent;
import com.solvd.pages.components.NavbarComponent;
import com.solvd.pages.components.PostComponent;
import com.solvd.utils.Constants;
import com.solvd.utils.MyDriver;
import com.solvd.utils.WebLocators;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends BasePage implements IHomePage {

    private final By BUTTON_FIRST_POST = By.xpath(WebLocators.BUTTON_FIRST_POST);
    private final By HEADER_USER_DROPDOWN = By.className(WebLocators.HEADER_USER_DROPDOWN);
    private final By CHAT_BOX_DISPLAYED = By.xpath(WebLocators.CHAT_BOX_DISPLAYED);

    private final By BUTTON_LOGIN_SESSION = By.cssSelector(WebLocators.BUTTON_LOGIN_SESSION);

    public HomePage(WebDriver wDriver) {
        super(wDriver);
    }

    @Override
    public Logger getLogger() {
        return Logger.getLogger(this.getClass().getName());
    }


    @Override
    public LoginComponent clickOnLogin() {
        webDriver.findElement(LoginComponent.CSS_OPEN_LOGIN_BUTTON).click();
        return new LoginComponent(webDriver);
    }

    @Override
    public NavbarComponent clickOnUserDropdown() {
        if (webDriver.findElement(HEADER_USER_DROPDOWN).isDisplayed()) {
            getLogger().info("Clicking on Dropdown Button menu");
            webDriver.findElement(HEADER_USER_DROPDOWN).click();
        }
        return new NavbarComponent(webDriver);
    }


    @Override
    public String getBodyBackgroundColor() {
        return webDriver.findElement(CssComponent.CSS_BACKGROUND)
                .getCssValue("background-color");
    }

    @Override
    public boolean isRegisterOrLoginMenuDisplayed() {
        getLogger().info("Switching to frame and checking if login menu is displayed");
        webDriver.switchTo().frame(0);
        return webDriver.findElement(LoginComponent.LOGIN_MENU_DISPLAY).isDisplayed();
    }

    @Override
    public void clickOnSearch() {
        getLogger().info("Clicking on search input");
        webDriver.findElement(CssComponent.CSS_SEARCH).click();
    }

    @Override
    public SearchPage setSearch(String SEARCH) {
        log.info("Filling Search Bar");
        webDriver.findElement(CssComponent.CSS_SEARCH).sendKeys(SEARCH);
        clickOnSearch();
        log.info("Entering search");
        webDriver.findElement(CssComponent.CSS_SEARCH).sendKeys(Keys.ENTER);
        log.info("Sending information");
        return new SearchPage(MyDriver.getWebDriver());
    }

    @Override
    public void navigateToHome() {
        webDriver.get(Constants.REDDIT_HOME_PAGE);
    }

    @Override
    public PostComponent clickFirstPost() {
        getLogger().info("Clicking on first post");
        webDriver.findElement(BUTTON_FIRST_POST).click();
        return new PostComponent(webDriver);
    }

    @Override
    public boolean isChatBoxDisplayed() {
        if (webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(CHAT_BOX_DISPLAYED)).isDisplayed()) {
            return true;
        } else return false;
    }

    @Override
    public boolean isLoginComponentDisplayed() {
        clickLoginDiv();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(BUTTON_LOGIN_SESSION));
        return webDriver.findElement(BUTTON_LOGIN_SESSION).isDisplayed();
    }

    @Override
    public void clickLoginDiv() {
        webDriver.switchTo().frame(0);
        webDriver.findElement(By.xpath("//div/main")).click();
    }

    @Override
    public boolean isLoginButtonDisplayed() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(LoginComponent.CSS_OPEN_LOGIN_BUTTON));
        return webDriver.findElement(LoginComponent.CSS_OPEN_LOGIN_BUTTON).isDisplayed();
    }

}
