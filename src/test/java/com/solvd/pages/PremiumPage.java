package com.solvd.pages;

import com.solvd.utils.WebLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PremiumPage extends BasePage {

    private final By BUTTON_PREMIUM = By.xpath(WebLocators.BUTTON_PREMIUM);

    public PremiumPage(WebDriver wDriver) {
        super(wDriver);
    }

    public boolean isButtonPremiumDisplayed() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_PREMIUM));
        return webDriver.findElement(BUTTON_PREMIUM).isDisplayed();

    }
}
