package com.solvd.pages.components;

import com.solvd.pages.BasePage;
import com.solvd.utils.WebLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CssComponent extends BasePage {

    public static By CSS_BACKGROUND = By.xpath(WebLocators.CSS_BACKGROUND);
    public static By CSS_SEARCH = By.cssSelector(WebLocators.CSS_SEARCH);
    public static By CSS_BUTTON_SEARCH_COMMENTS = By.cssSelector(WebLocators.CSS_BUTTON_SEARCH_COMMENTS);
    public static By CSS_BUTTON_SEARCH_COMMUNITIES = By.cssSelector(WebLocators.CSS_BUTTON_SEARCH_COMMUNITIES);
    public static By CSS_BUTTON_SEARCH_POSTS = By.cssSelector(WebLocators.CSS_BUTTON_SEARCH_POSTS);
    public static By CSS_BUTTON_SEARCH_PEOPLE = By.cssSelector(WebLocators.CSS_BUTTON_SEARCH_PEOPLE);


    public By getCSS_BACKGROUND() {
        return CSS_BACKGROUND;
    }

    public CssComponent(WebDriver wDriver) {
        super(wDriver);
    }

}

