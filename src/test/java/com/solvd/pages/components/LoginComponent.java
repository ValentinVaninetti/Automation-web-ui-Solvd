package com.solvd.pages.components;

import com.solvd.pages.BasePage;
import com.solvd.utils.WebLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginComponent extends BasePage {
    private WebElement wbElement;
    private By INPUT_USERNAME = By.cssSelector(WebLocators.INPUT_USERNAME);
    private By INPUT_PASSWORD = By.id(WebLocators.INPUT_PASSWORD);
    public static By BUTTON_LOGIN_SESSION = By.cssSelector(WebLocators.BUTTON_LOGIN_SESSION);
    private By BUTTON_LOGOUT = By.xpath(WebLocators.BUTTON_LOGOUT);
    private By BUTTON_DROPDOWN_USER = By.id(WebLocators.BUTTON_DROPDOWN_USER);

    public static By CSS_OPEN_LOGIN_BUTTON = By.cssSelector(WebLocators.CSS_OPEN_LOGIN_BUTTON);
    public static By LOGIN_MENU_DISPLAY = By.xpath(WebLocators.LOGIN_MENU_DISPLAY);
    public static By USERNAME_SPAN = By.xpath(WebLocators.USERNAME_SPAN);

    public LoginComponent(WebDriver wDriver) {
        super(wDriver);
    }

    public void setUsername(String username) {
        webDriver.switchTo().frame(0);
        webDriver.findElement(INPUT_USERNAME).sendKeys(username);
    }

    public void setPassword(String password) {
        webDriver.findElement(INPUT_PASSWORD).sendKeys(password);
    }

    public void clickLoginSession() {
        webDriver.findElement(BUTTON_LOGIN_SESSION).click();
    }

    public void clickRightAccountMenu() {
        webDriver.findElement(BUTTON_DROPDOWN_USER).click();
    }

    public void clickLogoutButton() {
        webDriver.findElement(BUTTON_LOGOUT).click();
    }

    public By getCSS_OPEN_LOGIN_BUTTON() {
        return CSS_OPEN_LOGIN_BUTTON;
    }

    public String getUsername() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(USERNAME_SPAN));
        return webDriver.findElement(USERNAME_SPAN).getText();
    }

}
