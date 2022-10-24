package com.solvd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CoinsPage extends BasePage {

    private final By BUTTON_COINS = By.xpath("//div[2]/div/div/div[1]/div/button");
    public CoinsPage(WebDriver wDriver){
        super(wDriver);
    }
    public boolean isButtonCoinDisplayed(){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_COINS));
        if (webDriver.findElement(BUTTON_COINS).isDisplayed()){
            return true;
        }else{
            return false;
        }
    }
}

