package com.solvd.pages.components;
import com.solvd.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class PostComponent extends BasePage {

    private By SHARE_POST_BUTTON = By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div[6]/div[1]/div[1]/button");

    private final By SHARE_TO_CHAT = By.id("shareToChat");
    public PostComponent(WebDriver wDriver) {

        super(wDriver);
    }
    public void clickOnSharePost(){
        //  if (isDisplayed(sharePostButton))
        webDriverWait.until(ExpectedConditions.elementToBeClickable(SHARE_POST_BUTTON)).click();

    }
    public void clickOnShareOnChat(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(SHARE_TO_CHAT)).click();
    }
}
