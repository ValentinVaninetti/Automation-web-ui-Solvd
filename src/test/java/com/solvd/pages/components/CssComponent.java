package com.solvd.pages.components;

import com.solvd.interfaces.Icomponents.ICssComponent;
import com.solvd.pages.BasePage;
import com.solvd.utils.WebLocators;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CssComponent extends BasePage implements ICssComponent {

    public static By CSS_BACKGROUND = By.xpath(WebLocators.CSS_BACKGROUND);
    public static By CSS_SEARCH = By.cssSelector(WebLocators.CSS_SEARCH);
    public static By CSS_BUTTON_SEARCH_COMMENTS = By.cssSelector(WebLocators.CSS_BUTTON_SEARCH_COMMENTS);
    public static By CSS_BUTTON_SEARCH_COMMUNITIES = By.cssSelector(WebLocators.CSS_BUTTON_SEARCH_COMMUNITIES);
    public static By CSS_BUTTON_SEARCH_POSTS = By.cssSelector(WebLocators.CSS_BUTTON_SEARCH_POSTS);
    public static By CSS_BUTTON_SEARCH_PEOPLE = By.cssSelector(WebLocators.CSS_BUTTON_SEARCH_PEOPLE);


    @Override
    public By getCSS_BACKGROUND() {
        return CSS_BACKGROUND;
    }

    public CssComponent(WebDriver wDriver) {
        super(wDriver);
    }

    @Override
    public Logger getLogger() {
        return Logger.getLogger(this.getClass().getName());
    }

}

