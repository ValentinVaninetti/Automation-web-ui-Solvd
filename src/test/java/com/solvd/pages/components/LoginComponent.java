package com.solvd.pages.components;

import com.solvd.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginComponent extends BasePage {
    private WebElement wbElement;
    private By INPUT_USERNAME = By.cssSelector("input[id=\"loginUsername\"]");
    private By INPUT_PASSWORD = By.id("loginPassword");
    private By BUTTON_LOGIN_SESSION = By.cssSelector("fieldset:nth-child(8) > button");
    private By BUTTON_LOGOUT = By.xpath("//div[@role=\"menu\"]/div/button[5]");
    private By BUTTON_DROPDOWN_USER = By.id("USER_DROPDOWN_ID");

    public static By CSS_OPEN_LOGIN_BUTTON = By.cssSelector("div > a[role=\"button\"]:nth-child(1)");
    public static By LOGIN_MENU_DISPLAY = By.xpath("//main");

    public LoginComponent(WebDriver wDriver) {
        super(wDriver);
    }

    public void setUsername(String username){
        webDriver.switchTo().frame(0);
        webDriver.findElement(INPUT_USERNAME).sendKeys(username);
    }
    public void setPassword(String password){
        webDriver.findElement(INPUT_PASSWORD).sendKeys(password);
    }
    public void clickLoginSession(){
        webDriver.findElement(BUTTON_LOGIN_SESSION).click();
    }
    public void clickRightAccountMenu(){
        webDriver.findElement(BUTTON_DROPDOWN_USER).click();
    }
    public void clickLogoutButton(){
        webDriver.findElement(BUTTON_LOGOUT).click();
    }

    public By getCSS_OPEN_LOGIN_BUTTON() {
        return CSS_OPEN_LOGIN_BUTTON;
    }

}
