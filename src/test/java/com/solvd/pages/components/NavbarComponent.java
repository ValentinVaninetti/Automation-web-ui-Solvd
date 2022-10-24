package com.solvd.pages.components;

import com.solvd.pages.BasePage;
import com.solvd.pages.CoinsPage;
import com.solvd.pages.PremiumPage;
import com.solvd.pages.TalkPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavbarComponent extends BasePage {

    private By BUTTON_DROPDOWN_USER = By.id("USER_DROPDOWN_ID");
    private By DROPDOWN_USER_MENU = By.xpath("//div[@role=\"menu\"]");
    private By BUTTON_DROPDOWN_USER_SETTINGS = By.xpath("//div[@role=\"menu\"]/div/button[2]");
    private By BUTTON_SETTINGS_DARK_THEME = By.xpath("//button[@role=\"switch\"]");
    private By DROPDOWN_USER_REGISTER_OR_LOGIN = By.xpath("//div[@role=\"menu\"]/div/button[5]");
    private By DROPDOWN_USER_MORE_BUTTON = By.xpath("//div[@role=\"menu\"]/div/button[3]");
    private By DROPDOWN_USER_MORE_IOS = By.xpath( "//a[@href=\"https://reddit.onelink.me/MRHZ/b3d845e\"]");
    private By DROPDOWN_USER_MORE_ANDROID = By.xpath("//a[@href=\"https://reddit.onelink.me/MRHZ/4c212f61\"]");
    private By CLICK_COINS_BUTTON = By.xpath("//a[@href=\"/coins\"]");
    private By CLICK_PREMIUM_BUTTON = By.xpath("//a[@href=\"/premium\"]");
    private By CLICK_TALK_BUTTON = By.xpath("//a[@href=\"/talk\"]");
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
        if (settingsBtn.isDisplayed()){
            settingsBtn.click();
        }
    }

    public void clickDarkThemeButton() {
        if(darkTheme.isDisplayed()){
            darkTheme.click();
        }
    }

    public void scrollDownNavbarMenu() {
        webDriver.findElement(DROPDOWN_USER_MENU).sendKeys(Keys.CONTROL, Keys.END);
    }

    public void clickRegisterOrLoginButton() {
        webDriver.findElement(DROPDOWN_USER_REGISTER_OR_LOGIN).click();
    }

    public void clickMoreButton(){
        webDriver.findElement(DROPDOWN_USER_MORE_BUTTON).click();
    }

    public void clickRedditIosButton(){
        webDriver.findElement(DROPDOWN_USER_MORE_IOS).click();
    }

    public void clickRedditAndroidButton(){
        webDriver.findElement(DROPDOWN_USER_MORE_ANDROID).click();
    }

    public boolean checkPageTitle(String title){
        if(title.equals(PAGE_TITLE)){
            System.out.println(title);
            return true;
        }
        return false;

    }

    public CoinsPage clickCoinsButton(){
        webDriver.findElement(CLICK_COINS_BUTTON);
        return new CoinsPage(webDriver);
    }

    public PremiumPage clickPremiumButton(){
        webDriver.findElement(CLICK_PREMIUM_BUTTON);
        return new PremiumPage(webDriver);
    }

    public TalkPage clickTalkButton(){
        webDriver.findElement(CLICK_TALK_BUTTON);
        return new TalkPage(webDriver);
    }
}