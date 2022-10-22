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

    public NavbarComponent(WebDriver wDriver) {
        super(wDriver);
    }

    public boolean isNavbarDisplayed() {
        return webDriver.findElement(By.id(WebLocators.BUTTON_DROPDOWN_USER)).isDisplayed();
    }

    public void clickSettingsButton() {
        WebElement settingsBtn = webDriver.findElement(By.xpath(WebLocators.BUTTON_DROPDOWN_USER_SETTINGS));
        if (settingsBtn.isDisplayed()){
            settingsBtn.click();
        }
    }

    public void clickDarkThemeButton() {
        WebElement darkTheme = webDriver.findElement(By.xpath("//button[@role=\"switch\"]"));
        if(darkTheme.isDisplayed()){
            darkTheme.click();
        }
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
        if(title.equals("Reddit on the App Store")){
            System.out.println(title);
            return true;
        }
        return false;

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