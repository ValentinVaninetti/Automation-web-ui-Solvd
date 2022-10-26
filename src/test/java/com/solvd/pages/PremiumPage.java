package com.solvd.pages;

import com.solvd.interfaces.Ipages.IPremiumPage;
import com.solvd.utils.WebLocators;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PremiumPage extends BasePage implements IPremiumPage {

    private final By BUTTON_PREMIUM = By.xpath(WebLocators.BUTTON_PREMIUM);

    public PremiumPage(WebDriver wDriver) {
        super(wDriver);
    }

    @Override
    public Logger getLogger() {
        return Logger.getLogger(this.getClass().getName());
    }

    @Override
    public boolean isButtonPremiumDisplayed() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_PREMIUM));
        return webDriver.findElement(BUTTON_PREMIUM).isDisplayed();
    }
}
