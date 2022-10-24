package com.solvd.pages;

import com.solvd.pages.components.CssComponent;
import com.solvd.pages.components.LoginComponent;
import com.solvd.pages.components.NavbarComponent;
import com.solvd.pages.components.PostComponent;
import com.solvd.utils.Constants;
import com.solvd.utils.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class HomePage extends BasePage{


    private String TITLE_FIRST_POST =("/html/body/div[%s]/div/div[%s]/div[%s]/div/div/div/div[%s]/div[%s]/div[%s]/div[%s]/div[%s]/div/div/div[%s]/div[%s]/div[%s]/a/div/h3");
    private By BUTTON_FIRST_POST = By.xpath(String.format(TITLE_FIRST_POST,"1","2","2","2","3","1","5","1","3","2","1"));
    private By HEADER_USER_DROPDOWN = By.className("header-user-dropdown");
    private By CHAT_BOX_DISPLAYED = By.xpath("//body/div[5]/div/div");

    public HomePage(WebDriver wDriver) {
        super(wDriver);
    }


    public LoginComponent clickOnLogin(){
        webDriver.findElement(LoginComponent.CSS_OPEN_LOGIN_BUTTON).click();
        return new LoginComponent(webDriver);
    }
    public NavbarComponent clickOnUserDropdown() {
        if (webDriver.findElement(HEADER_USER_DROPDOWN).isDisplayed()){
            getLogger(HomePage.getClassName(this)).info("Clicking on Dropdown Button menu");
            webDriver.findElement(HEADER_USER_DROPDOWN).click();
        }
        return new NavbarComponent(webDriver);
    }


    public String getBodyBackgroundColor(){
        return webDriver.findElement(CssComponent.CSS_BACKGROUND)
                .getCssValue("background-color");
    }

    public boolean isRegisterOrLoginMenuDisplayed(){
        getLogger(HomePage.getClassName(this)).info("Switching to frame and checking if login menu is displayed");
        webDriver.switchTo().frame(0);
        return webDriver.findElement(LoginComponent.LOGIN_MENU_DISPLAY).isDisplayed();
    }

    public void clickOnSearch() {
        getLogger(HomePage.getClassName(this)).info("Clicking on search input");
        webDriver.findElement(CssComponent.CSS_SEARCH).click();
    }
    public SearchPage setSearch( String SEARCH) throws InterruptedException {
        getLogger(HomePage.getClassName(this)).info("Filling searchbar");
        webDriver.findElement(CssComponent.CSS_SEARCH).sendKeys(SEARCH);
        clickOnSearch();
        getLogger(HomePage.getClassName(this)).info("Entering search");
        webDriver.findElement(CssComponent.CSS_SEARCH).sendKeys(Keys.ENTER);
        return new SearchPage(MyDriver.getWebDriver());
    }
    public void navigateToHome(){
        webDriver.get(Constants.REDDIT_HOME_PAGE);
    }

    public PostComponent clickFirstPost(){
        getLogger(HomePage.getClassName(this)).info("Clicking on first post");
        webDriver.findElement(BUTTON_FIRST_POST).click();
        return new PostComponent(webDriver);
    }
    public boolean isChatBoxDisplayed(){
        //webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("body/div[5]/div/div")));
        //webDriver.switchTo().frame(0);
        if (webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(CHAT_BOX_DISPLAYED)).isDisplayed());
        return true;

    }

}
