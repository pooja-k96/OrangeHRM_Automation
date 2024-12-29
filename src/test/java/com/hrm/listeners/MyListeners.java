package com.hrm.listeners;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyListeners implements ITestListener{

	private static WebDriver driver;
	private ExtentReports extent;
	private ExtentSparkReporter spark;
	private static ExtentTest extenttest;

	public ExtentReports getExtent() {
		return extent;
	}

	public ExtentSparkReporter getSpark() {
		return spark;
	}

	public static ExtentTest getExtenttest() {
		return extenttest;
	}

	public static WebDriver getDriver() {
		
		return driver;
	}

	public void onStart(ITestContext context) {
		extent=new ExtentReports();
		spark=new ExtentSparkReporter(new File("./reports/"+ getcurrentdate()+"/OrangeHRM_" + getcurrentdatewithtime()+".html"));
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Report - Orange HRM ");
		spark.config().setTimeStampFormat("dd MMM yyyy, hh:mm:ss a");
		spark.config().setReportName("Regression Report");
		
		extent.attachReporter(spark);
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	public void onTestStart(ITestResult result) {
		extenttest = extent.createTest(result.getName());
		extenttest.info("Test Details");
		
		System.out.println("Test started is: "+ result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		extenttest.log(Status.PASS, "Test Passed");
		
		System.out.println("Test pass is: "+ result.getName());
	}


	public void onTestFailure(ITestResult result) {
		Throwable var = result.getThrowable();
		try {
			extenttest.log(Status.FAIL, "Test step Failed: "+var.getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(capture(MyListeners.getDriver())).build());
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		System.out.println("Test failed is: "+ result.getName());
	}


	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped is: "+ result.getName());
	}

	public void onFinish(ITestContext context) {
		extent.flush();
		driver.quit();
	}

	private String capture(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("./scrshots/Image" + System.currentTimeMillis() + ".png");
		String errssflpath = Dest.getAbsolutePath();
		Files.copy(scrFile.toPath(), Dest.toPath());

		return errssflpath;
	}	
	
	public static String getcurrentdate() {
		LocalDate ld=LocalDate.now();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		return dtf.format(ld);
		
	}
	
	public static String getcurrentdatewithtime() {
		LocalDateTime ld=LocalDateTime.now();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MMM-yyyy_hh-mm-ss_a");
		return dtf.format(ld);
		
	}

	
}
