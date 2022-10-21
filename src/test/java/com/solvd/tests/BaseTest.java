package com.solvd.tests;

import com.solvd.utils.MyDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.io.IOException;


public abstract class BaseTest {
    private MyDriver myDriver;


    @BeforeTest
    public void beforeTest() throws IOException {
        myDriver = new MyDriver();
        MyDriver.getWebDriver().manage().deleteAllCookies();
        myDriver.getWebDriver();
    }
    @AfterTest
    public void afterTestActions() throws InterruptedException {
        if (this.myDriver != null) {
            Thread.sleep(5000);
            MyDriver.getWebDriver().quit();
        }

    }

    public MyDriver getMyDriver() {
        return myDriver;
    }
    public void navigateTo(String url) {
        MyDriver.getWebDriver().get(url);
    }


}
