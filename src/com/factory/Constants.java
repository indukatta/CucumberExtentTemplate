package com.factory;

public class Constants {

    public static final String PLATFORM_NAME  = System.getProperty("platformName");

    public static final String IOS_VERSION  = System.getProperty("version");

    public static final String DEVICE_NAME  = System.getProperty("device");

    public static final String APP_PATH  = System.getProperty("appPath");

    public static String Report_Directory = System.getProperty("user.dir") + System.getProperty("file.separator") + "TestReport";

    public static String Report_File_Name;

    public static String Screenshot_Folder_Path;
}