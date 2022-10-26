package com.solvd.pages;

import com.solvd.utils.WebLocators;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TalkPage extends BasePage {
    private final By BUTTON_TALK_IN_PROGRESS = By.xpath(WebLocators.BUTTON_TALK_IN_PROGRESS);

    public TalkPage(WebDriver wDriver) {
        super(wDriver);
    }

    @Override
    public Logger getLogger() {
        return Logger.getLogger(this.getClass().getName());
    }

    public boolean isButtonTalkDisplayed() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_TALK_IN_PROGRESS));
        return webDriver.findElement(BUTTON_TALK_IN_PROGRESS).isDisplayed();
    }
}
