package com.solvd.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public abstract class BasePage {
    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    protected WebDriver getDriver() {
        return webDriver;
    }

    public BasePage(WebDriver wDriver){
        this.webDriver = wDriver;
        this.webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(120,1));
    }

}
