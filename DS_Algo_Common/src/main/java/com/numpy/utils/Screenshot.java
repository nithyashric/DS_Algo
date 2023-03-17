package com.numpy.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public static void take(String tcName, WebDriver driver) {
		try
		{
		 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(screenshotFile, new File(ConfigReader.getProperty("screenshot.dir")+"\\"+tcName+".png"));
	}
		catch(Exception ex)
		{
			MyLogger.error("Unable to take Screenshot for" + tcName + ":" + ex.toString());
		}
	}
	

}
