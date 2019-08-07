package com.factory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pageobjects.ShoppingListPage;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    public static AppiumDriver driver;

    public ShoppingListPage shoppingListPage;
    
    public Driver() {
    	
    }

    public void createDriver(){
        try {

           // String APP = "C:\\Users\\Indu Katta\\AndroidStudioProjects\\shoppinglist-master\\ShoppingList\\build\\outputs\\apk\\play\\debug\\org.openintents.shopping-2.2.0-play-debug.apk";
        	String APP = "C:\\Users\\Indu Katta\\AndroidStudioProjects\\shoppinglist-master\\ShoppingList\\play\\release\\org.openintents.shopping-2.2.0-play-release.apk";
            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion","9.0");
            caps.setCapability("deviceName", "Android Emulator");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("app", APP);
            caps.setCapability("avd","Nexus_5X_API_29_x86");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);


            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
