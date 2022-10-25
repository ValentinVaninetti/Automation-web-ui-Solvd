package com.solvd.pages;

import com.solvd.utils.WebLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CoinsPage extends BasePage {

    private final By BUTTON_COINS = By.xpath(WebLocators.BUTTON_COINS);

    public CoinsPage(WebDriver wDriver) {
        super(wDriver);
    }

    public boolean isButtonCoinDisplayed() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_COINS));
        return webDriver.findElement(BUTTON_COINS).isDisplayed();
    }
}

