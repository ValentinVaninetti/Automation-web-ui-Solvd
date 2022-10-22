package com.solvd.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import static com.solvd.utils.CommonUtils.readPropertiesFile;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public final class MyDriver {
    private static WebDriver webDriver;

    public MyDriver() throws IOException {
        System.setProperty(
                readPropertiesFile(Constants.DRIVER_PROPERTIES_PATH,"CHROME_DRIVER"),
                readPropertiesFile(Constants.DRIVER_PROPERTIES_PATH, "CHROME_DRIVER_EXE")
        );
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);
        webDriver = new ChromeDriver(options);
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }


    public static void navigateBackwards(){
        webDriver.navigate().back();
    }
    public static void navigateForward(){
        webDriver.navigate().forward();
    }
}
