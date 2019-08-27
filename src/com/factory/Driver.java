package com.factory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
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

    @SuppressWarnings("rawtypes")
	public void createDriver(){
        try {
   
        	String APP ="C:\\Users\\Indu Katta\\AndroidStudioProjects\\shoppinglist-master\\ShoppingList\\tstore\\release\\org.openintents.shopping-2.2.0-tstore-release.apk";
        	
        	DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion","9.0");
            caps.setCapability("deviceName", "Android Emulator");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("app", APP);
            caps.setCapability("avd","Nexus_5X_API_29_x86");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            caps.setCapability(MobileCapabilityType.FULL_RESET, false);
            caps.setCapability(MobileCapabilityType.NO_RESET, true);

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
         

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
