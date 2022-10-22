package com.solvd.pages.components;
import com.solvd.pages.BasePage;
import com.solvd.utils.WebLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class PostComponent extends BasePage {

    private final By sharePostButton = By.xpath(WebLocators.SHARE_POST_BUTTON);
    private final By shareToChat = By.id(WebLocators.SHARE_TO_CHAT_BUTTON_ID);
    public PostComponent(WebDriver wDriver) {

        super(wDriver);
    }
    public void clickOnSharePost(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(sharePostButton)).click();
    }
    public void clickOnShareOnChat(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(shareToChat)).click();
    }
}
