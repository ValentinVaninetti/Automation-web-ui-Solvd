package com.solvd.pages.components;

import com.solvd.pages.BasePage;
import com.solvd.utils.WebLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginComponent extends BasePage {
    private WebElement wbElement;
    public LoginComponent(WebDriver wDriver) {
        super(wDriver);
    }

    public void setUsername(String username) throws InterruptedException {
        webDriver.switchTo().frame(0);
        webDriver.findElement(By.cssSelector(WebLocators.INPUT_USERNAME)).sendKeys(username);
    }
    public void setPassword(String password){
        webDriver.findElement(By.id(WebLocators.INPUT_PASSWORD)).sendKeys(password);
    }
    public void clickLoginSession(){
        webDriver.findElement(By.cssSelector(WebLocators.BUTTON_LOGIN_SESSION)).click();
    }

}
