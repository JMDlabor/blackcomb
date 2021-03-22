package com.Framework;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends Intitiate{

	public static ExtentReports setupExtentReport(String pExtentReport) throws Exception {
		
		ExtentHtmlReporter ehr = new ExtentHtmlReporter(pExtentReport);
		
		oExtentReports.attachReporter(ehr);
		oExtentReports.setSystemInfo("Executed on OS: ", gOS);
		oExtentReports.setSystemInfo("Executed by User: ", gUserName);
		oExtentReports.setSystemInfo("Hostname: ", ghostname);
		
		ehr.config().setDocumentTitle("Automation Testing Report");
		ehr.config().setTheme(Theme.STANDARD);
		ehr.config().setReportName("gProjectName");
		ehr.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

		
		return oExtentReports;
	}
	
	
	public static void takeScreenshot() {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scrFile, new File(currentDir + "/Screenshots/" + System.currentTimeMillis() + ".png"));
	}
}
