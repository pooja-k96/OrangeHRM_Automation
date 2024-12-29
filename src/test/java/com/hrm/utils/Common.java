package com.hrm.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.hrm.listeners.MyListeners;

public class Common {

	ExtentTest test=MyListeners.getExtenttest();
	
	public static void click(WebElement ele,String stepmessage) {
		ele.click();
		try {
			MyListeners.getExtenttest().log(Status.PASS, stepmessage,MediaEntityBuilder.createScreenCaptureFromPath(capture(MyListeners.getDriver())).build() );
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	public static void set(WebElement ele,String value,String stepmessage) {
		ele.sendKeys(value);
		try {
			MyListeners.getExtenttest().log(Status.PASS, stepmessage,MediaEntityBuilder.createScreenCaptureFromPath(capture(MyListeners.getDriver())).build() );
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static String capture(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("./scrshots/Image" + System.currentTimeMillis() + ".png");
		String errssflpath = Dest.getAbsolutePath();
		Files.copy(scrFile.toPath(), Dest.toPath());

		return errssflpath;
	}	
	
}
