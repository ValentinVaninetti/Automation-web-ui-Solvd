package com.solvd.pages.components;

import com.solvd.pages.BasePage;
import com.solvd.pages.CoinsPage;
import com.solvd.pages.PremiumPage;
import com.solvd.pages.TalkPage;
import com.solvd.utils.WebLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavbarComponent extends BasePage {

    private final By BUTTON_DROPDOWN_USER = By.id(WebLocators.BUTTON_DROPDOWN_USER);
    private final By DROPDOWN_USER_MENU = By.xpath(WebLocators.DROPDOWN_USER_MENU);
    private final By BUTTON_DROPDOWN_USER_SETTINGS = By.xpath(WebLocators.BUTTON_DROPDOWN_USER_SETTINGS);
    private final By BUTTON_SETTINGS_DARK_THEME = By.xpath(WebLocators.BUTTON_SETTINGS_DARK_THEME);
    private final By DROPDOWN_USER_REGISTER_OR_LOGIN = By.xpath(WebLocators.DROPDOWN_USER_REGISTER_OR_LOGIN);
    private final By DROPDOWN_USER_MORE_BUTTON = By.xpath(WebLocators.DROPDOWN_USER_MORE_BUTTON);
    private final By DROPDOWN_USER_MORE_IOS = By.xpath(WebLocators.DROPDOWN_USER_MORE_IOS);
    private final By DROPDOWN_USER_MORE_ANDROID = By.xpath(WebLocators.DROPDOWN_USER_MORE_ANDROID);
    private final By CLICK_COINS_BUTTON = By.xpath(WebLocators.CLICK_COINS_BUTTON);
    private final By CLICK_PREMIUM_BUTTON = By.xpath(WebLocators.CLICK_PREMIUM_BUTTON);
    private final By CLICK_TALK_BUTTON = By.xpath(WebLocators.CLICK_TALK_BUTTON);
    private String PAGE_TITLE = "Reddit on the App Store";
    private WebElement darkTheme = webDriver.findElement(BUTTON_SETTINGS_DARK_THEME);
    private WebElement settingsBtn = webDriver.findElement(BUTTON_DROPDOWN_USER_SETTINGS);


    public NavbarComponent(WebDriver wDriver) {
        super(wDriver);
    }

    public boolean isNavbarDisplayed() {
        return webDriver.findElement(BUTTON_DROPDOWN_USER).isDisplayed();
    }

    public void clickSettingsButton() {
        if (settingsBtn.isDisplayed()) {
            settingsBtn.click();
        }
    }

    public void clickDarkThemeButton() {
        if (darkTheme.isDisplayed()) {
            darkTheme.click();
        }
    }

    public void scrollDownNavbarMenu() {
        webDriver.findElement(DROPDOWN_USER_MENU).sendKeys(Keys.CONTROL, Keys.END);
    }

    public void clickRegisterOrLoginButton() {
        webDriver.findElement(DROPDOWN_USER_REGISTER_OR_LOGIN).click();
    }

    public CoinsPage clickCoinsButton() {
        webDriver.findElement(CLICK_COINS_BUTTON).click();
        return new CoinsPage(webDriver);
    }

    public PremiumPage clickPremiumButton() {
        webDriver.findElement(CLICK_PREMIUM_BUTTON).click();
        return new PremiumPage(webDriver);
    }

    public TalkPage clickTalkButton() {
        webDriver.findElement(CLICK_TALK_BUTTON).click();
        return new TalkPage(webDriver);
    }
}