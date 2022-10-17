package com.solvd.pages.components;

import com.solvd.pages.BasePage;
import com.solvd.pages.CoinsPage;
import com.solvd.pages.PremiumPage;
import com.solvd.pages.TalkPage;
import com.solvd.utils.WebLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class NavbarComponent extends BasePage {

    public NavbarComponent(WebDriver wDriver) {
        super(wDriver);
    }

    public boolean isNavbarDisplayed() {
        return webDriver.findElement(By.id(WebLocators.BUTTON_DROPDOWN_USER)).isDisplayed();
    }

    public void clickSettingsButton() {
        webDriver.findElement(By.xpath(WebLocators.BUTTON_DROPDOWN_USER_SETTINGS)).click();
    }

    public void clickDarkThemeButton() {
        webDriver.findElement(By.xpath(WebLocators.BUTTON_SETTINGS_DARK_THEME)).click();
    }

    public void scrollDownNavbarMenu() {
        webDriver.findElement(By.xpath(WebLocators.DROPDOWN_USER_MENU)).sendKeys(Keys.CONTROL, Keys.END);
    }

    public void clickRegisterOrLoginButton() {
        webDriver.findElement(By.xpath(WebLocators.DROPDOWN_USER_REGISTER_OR_LOGIN)).click();
    }

    public void clickMoreButton(){
        webDriver.findElement(By.xpath(WebLocators.DROPDOWN_USER_MORE_BUTTON)).click();
    }

    public void clickRedditIosButton(){
        webDriver.findElement(By.xpath(WebLocators.DROPDOWN_USER_MORE_IOS)).click();
    }

    public void clickRedditAndroidButton(){
        webDriver.findElement(By.xpath(WebLocators.DROPDOWN_USER_MORE_ANDROID)).click();
    }

    public boolean checkPageTitle(String title){
        switch (title){
            case "Reddit on the App Store", "Reddit - Aplicaciones en Google Play", "Reddit - Explora lo que quieras" -> {
                System.out.println(title);
                return true;
            }
            default -> {
                System.out.println(title);
                return false;
            }
        }
    }

    public CoinsPage clickCoinsButton(){
        webDriver.findElement(By.xpath("//a[@href=\"/coins\"]"));
        return new CoinsPage(webDriver);
    }

    public PremiumPage clickPremiumButton(){
        webDriver.findElement(By.xpath("//a[@href=\"/premium\"]"));
        return new PremiumPage(webDriver);
    }

    public TalkPage clickTalkButton(){
        webDriver.findElement(By.xpath("//a[@href=\"/talk\"]"));
        return new TalkPage(webDriver);
    }
}