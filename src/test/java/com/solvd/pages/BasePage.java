package com.solvd.pages;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {
    protected WebDriver webDriver;

    protected WebDriver getDriver() {
        return webDriver;
    }

    public BasePage(WebDriver wDriver){
        this.webDriver = wDriver;
    }

}
