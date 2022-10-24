package com.solvd.pages.components;

import com.solvd.pages.BasePage;
import com.solvd.utils.WebLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class PostComponent extends BasePage {

    private By SHARE_POST_BUTTON = By.xpath(WebLocators.SHARE_POST_BUTTON);

    private final By SHARE_TO_CHAT = By.id("shareToChat");

    public PostComponent(WebDriver wDriver) {

        super(wDriver);
    }

    public void clickOnSharePost() {
        //  if (isDisplayed(sharePostButton))
        webDriverWait.until(ExpectedConditions.elementToBeClickable(SHARE_POST_BUTTON)).click();

    }

    public void clickOnShareOnChat() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(SHARE_TO_CHAT)).click();
    }
}
