package com.solvd.pages.components;

import com.solvd.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssComponent extends BasePage{
    WebElement wbElement;


    public static By CSS_BACKGROUND = By.xpath("//body/div/div[1]");
    public static By CSS_SEARCH = By.cssSelector("#header-search-bar");
    public static By CSS_BUTTON_SEARCH_COMMENTS = By.cssSelector(" a:nth-child(2) > button");
    public static By CSS_BUTTON_SEARCH_COMMUNITIES = By.cssSelector(" a:nth-child(3) > button");
    public static By CSS_BUTTON_SEARCH_POSTS = By.cssSelector(" a:nth-child(1) > button");
    public static By CSS_BUTTON_SEARCH_PEOPLE = By.cssSelector(" a:nth-child(4) > button");


    public By getCSS_BACKGROUND() {
        return CSS_BACKGROUND;
    }

    public CssComponent(WebDriver wDriver) {
        super(wDriver);
    }



}

