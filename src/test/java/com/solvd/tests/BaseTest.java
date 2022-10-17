package com.solvd.tests;

import com.solvd.utils.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.io.IOException;

public abstract class BaseTest {
    private MyDriver myDriver;
    private WebDriverWait time;

    @BeforeTest
    public void beforeTest() throws IOException {
        myDriver = new MyDriver();
        MyDriver.getWebDriver().manage().deleteAllCookies();

        myDriver.getWebDriver();
    }
    @AfterTest
    public void afterTestActions() throws InterruptedException {
        if (this.myDriver != null) {
            MyDriver.getWebDriver().close();
        }
    }

    public MyDriver getMyDriver() {
        return myDriver;
    }
    public void navigateTo(String url) {
        MyDriver.getWebDriver().get(url);
    }
}
