package com.solvd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PremiumPage extends BasePage {

    private final By BUTTON_PREMIUM = By.xpath("//div[2]/div[2]/div/div/div[1]/div/div/button[1]");
    public PremiumPage (WebDriver wDriver){
        super(wDriver);
    }
    public boolean isButtonPremiumDisplayed() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_PREMIUM));
        return webDriver.findElement(BUTTON_PREMIUM).isDisplayed();

    }
}
