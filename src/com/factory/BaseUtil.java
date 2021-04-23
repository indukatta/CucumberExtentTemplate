package com.factory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

/**
 * Created by Karthik on 21/09/2019.
 */

public class BaseUtil {

    public static WebDriver driver;

    public ExtentReports extent;

    public static ExtentTest scenarioDef;

    public static ExtentTest features;

    public static String reportLocation = "C:\\Users\\Indu Katta\\Desktop\\TestReportFolder";

}
