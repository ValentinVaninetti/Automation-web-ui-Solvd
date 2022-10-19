package com.solvd.pages;

import com.solvd.pages.components.LoginComponent;
import com.solvd.pages.components.NavbarComponent;
import com.solvd.pages.components.PostComponent;
import com.solvd.utils.Constants;
import com.solvd.utils.MyDriver;
import com.solvd.utils.WebLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import static com.solvd.utils.WebLocators.*;

public class HomePage extends BasePage{

    public HomePage(WebDriver wDriver) {
        super(wDriver);
    }

    public String getPageTitle(){
       return this.webDriver.getTitle();
    }

    public LoginComponent clickOnLogin(){
        webDriver.findElement(By.cssSelector(WebLocators.CSS_OPEN_LOGIN_BUTTON)).click();
        return new LoginComponent(webDriver);
    }
    public NavbarComponent clickOnUserDropdown() {
        webDriver.findElement(By.className("header-user-dropdown")).click();
        return new NavbarComponent(webDriver);
    }

    public String getBodyBackgroundColor(){
        return webDriver.findElement(By.xpath(WebLocators.CSS_BACKGROUND)).getCssValue("background-color");
    }

    public boolean isRegisterOrLoginMenuDisplayed(){
        webDriver.switchTo().frame(0);
        return webDriver.findElement(By.xpath("//main")).isDisplayed();
    }

    public void clickOnSearch() {
        webDriver.findElement(By.cssSelector(CSS_SEARCH)).click();
    }
    public SearchPage setSearch(){
        String search = "QA AUTOMATION";
        webDriver.findElement(By.cssSelector(CSS_SEARCH)).sendKeys(search);
        webDriver.findElement(By.cssSelector(CSS_SEARCH)).click();
        webDriver.findElement(By.cssSelector(CSS_SEARCH)).sendKeys(Keys.ENTER);
        return new SearchPage(MyDriver.getWebDriver());
    }
    public void navigateToHome(){
        webDriver.get(Constants.REDDIT_HOME_PAGE);
    }

    public PostComponent clickFirstPost(){
        String button_first_post = String.format(TITLE_FIRST_POST,"1","2","2","2","3","1","5","1","3","2","1");
        webDriver.findElement(By.xpath(button_first_post)).click();
        return new PostComponent(webDriver);
    }

}
