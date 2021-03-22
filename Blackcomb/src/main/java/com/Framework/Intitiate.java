package com.Framework;
import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.AllUtilities.All_Files;
import com.AllUtilities.DataMgmt;
import com.aventstack.extentreports.ExtentReports;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Intitiate implements FrameworkTemplate{
	
	public static ExtentReports oExtentReports;
	public static String gTestName = "asd";
	public static String gSuiteName = "asd";
	public static String gTestingType = "Regression";
	public static String gTestDataFilePath = "asd";
	public static String gCountry = "asd";
	public static String gState = "asd";
	public static String gAppName = "asd";
	public static String gAppEnvironment = "asd";

	static String strCurrentDate = DataMgmt.getDate("dd-MM-yyy");

	static String fReport = System.getProperty("user.dir") + "\\Reports\\ExtentReport_" + strCurrentDate + ".html";
	
	String pExtentReport = gUserDir + "\\test-output\\extentreport\\" + gUserName + "\\" + "ExtentReport_"
			+ "DDMMYY" + ".html";

	LinkedHashMap<String, String> lhm_data = new LinkedHashMap<String, String>();
	public static WebDriver driver;
	public static WebDriver wdriver;
	private static AndroidDriver<MobileElement> amdriver;
	private static AndroidDriver<AndroidElement> aadriver;
	public static RemoteWebDriver rwdriver;
	protected static WebDriverWait wait = new WebDriverWait(driver, 15);

	public static void beginframework() throws Exception {
		
		Reporting.setupExtentReport(fReport);
		All_Files a = new All_Files();
		a.getValue_PropertiesFile(gAppEnvironment, fReport);
		
	}
	
	
	
}
