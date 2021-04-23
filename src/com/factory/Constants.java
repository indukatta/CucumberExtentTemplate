package com.factory;

import org.openqa.selenium.WebDriver;

public class Constants {

    public static String Report_Directory = System.getProperty("user.dir") + System.getProperty("file.separator") + "TestReport";

    public static String Report_File_Name;

    public static String Screenshot_Folder_Path;

    public static WebDriver driver;
}