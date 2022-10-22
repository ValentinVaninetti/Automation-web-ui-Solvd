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
import org.openqa.selenium.support.ui.ExpectedConditions;


import static com.solvd.utils.WebLocators.*;

public class HomePage extends BasePage{

    public HomePage(WebDriver wDriver) {
        super(wDriver);
    }


    public LoginComponent clickOnLogin(){
        webDriver.findElement(By.cssSelector(WebLocators.CSS_OPEN_LOGIN_BUTTON)).click();
        return new LoginComponent(webDriver);
    }
    public NavbarComponent clickOnUserDropdown() {
        if (webDriver.findElement(By.className("header-user-dropdown")).isDisplayed()){
            getLogger(HomePage.getClassName(this)).info("Clicking on Dropdown Button menu");
            webDriver.findElement(By.className("header-user-dropdown")).click();
        }
        return new NavbarComponent(webDriver);
    }


    public String getBodyBackgroundColor(){
        return webDriver.findElement(By.xpath(WebLocators.CSS_BACKGROUND))
                .getCssValue("background-color");
    }

    public boolean isRegisterOrLoginMenuDisplayed(){
        getLogger(HomePage.getClassName(this)).info("Switching to frame and checking if login menu is displayed");
        webDriver.switchTo().frame(0);
        return webDriver.findElement(By.xpath("//main")).isDisplayed();
    }

    public void clickOnSearch() {
        getLogger(HomePage.getClassName(this)).info("Clicking on search input");
        webDriver.findElement(By.cssSelector(CSS_SEARCH)).click();
    }
    public SearchPage setSearch( String search) throws InterruptedException {
        getLogger(HomePage.getClassName(this)).info("Filling searchbar");
        webDriver.findElement(By.cssSelector(CSS_SEARCH)).sendKeys(search);
        clickOnSearch();
        getLogger(HomePage.getClassName(this)).info("Entering search");
       webDriver.findElement(By.cssSelector(CSS_SEARCH)).sendKeys(Keys.ENTER);
        return new SearchPage(MyDriver.getWebDriver());
    }
    public void navigateToHome(){
        webDriver.get(Constants.REDDIT_HOME_PAGE);
    }

    public PostComponent clickFirstPost(){
        String button_first_post = String.format(TITLE_FIRST_POST,"1","2","2","2","3","1","5","1","3","2","1");
        getLogger(HomePage.getClassName(this)).info("Clicking on first post");
        webDriver.findElement(By.xpath(button_first_post)).click();
        return new PostComponent(webDriver);
    }
    public boolean isChatBoxDisplayed(){
        //webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("body/div[5]/div/div")));
        //webDriver.switchTo().frame(0);

        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("body/div[5]/div/div"))).isDisplayed();

    }

}
