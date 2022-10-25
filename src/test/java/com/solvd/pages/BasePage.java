package com.solvd.pages;

import com.solvd.utils.MyDriver;
import org.apache.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.log4j.Logger;


import java.time.Duration;

public abstract class BasePage {
    protected Logger log = LogManager.getLogger(getClass().getName());
    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    protected WebDriver getDriver() {
        return webDriver;
    }

    public BasePage(WebDriver wDriver) {
        this.webDriver = wDriver;
        this.webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(120, 1));
    }

    public static Logger getLogger(String className) {
        return Logger.getLogger(className);
    }

    public static String getClassName(Object className) {
        return className.getClass().getName();
    }

    public String getPageTitle() {
        return MyDriver.getWebDriver().getTitle();
    }

    public void clickOnButtonByXpath(String locator){
        webDriver.findElement(By.xpath(locator)).click();
    }

    public void clickOnButtonById(String locator){
        webDriver.findElement(By.id(locator)).click();
    }
    public void clickOnButtonByCss(String locator){
        webDriver.findElement(By.cssSelector(locator)).click();
    }
}
