package com.solvd.pages.components;

import com.solvd.interfaces.Icomponents.ILoginComponent;
import com.solvd.pages.BasePage;
import com.solvd.utils.WebLocators;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginComponent extends BasePage implements ILoginComponent {
    private WebElement wbElement;
    private final By INPUT_USERNAME = By.cssSelector(WebLocators.INPUT_USERNAME);
    private final By INPUT_PASSWORD = By.id(WebLocators.INPUT_PASSWORD);
    public static By CSS_OPEN_LOGIN_BUTTON = By.cssSelector(WebLocators.CSS_OPEN_LOGIN_BUTTON);
    public static By LOGIN_MENU_DISPLAY = By.xpath(WebLocators.LOGIN_MENU_DISPLAY);
    public static By USERNAME_SPAN = By.xpath(WebLocators.USERNAME_SPAN);

    public LoginComponent(WebDriver wDriver) {
        super(wDriver);
    }

    @Override
    public Logger getLogger() {
        return Logger.getLogger(this.getClass().getName());
    }

    @Override
    public void setUsername(String username) {
        webDriver.switchTo().frame(0);
        webDriver.findElement(INPUT_USERNAME).sendKeys(username);
    }

    @Override
    public void setPassword(String password) {
        webDriver.findElement(INPUT_PASSWORD).sendKeys(password);
    }


    @Override
    public By getCSS_OPEN_LOGIN_BUTTON() {
        return CSS_OPEN_LOGIN_BUTTON;
    }

    @Override
    public String getUsername() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(USERNAME_SPAN));
        return webDriver.findElement(USERNAME_SPAN).getText();
    }

}
