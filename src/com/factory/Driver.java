package com.factory;

//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.Activity;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
//import pageobjects.ShoppingListPage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    public static WebDriver driver;

    public Driver() {
    }

    public WebDriver createDriver() {

        String browser = System.getProperty("browser");
        if (browser == null) {
            browser = "chrome";
        }
        switch (browser) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("['start-maximized']");
                File file = new File("C:\\selenium\\chromedriver.exe");
                ChromeDriverService service = new ChromeDriverService.Builder()
                        .usingDriverExecutable(file)
                        .usingAnyFreePort()
                        .build();
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                driver = new ChromeDriver(service, chromeOptions);
                break;
            case "firefox":
                break;
            default:
                throw new IllegalArgumentException("Browser \"" + browser + "\" isn't supported.");
        }
        return driver;
    }

}
