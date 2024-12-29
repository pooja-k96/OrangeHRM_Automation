package com.hrm.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hrm.listeners.MyListeners;
import com.hrm.pages.HomePage;
import com.hrm.pages.LeavePage;
import com.hrm.utils.Helper;

@Listeners(MyListeners.class)
public class TestHomePage {

	static WebDriver driver;
	@Test
	public static void verifypanelelements() {
		Helper.login();
		HomePage home=new HomePage(MyListeners.getDriver());
		home.getAdmin().isDisplayed();
		home.getPim().isDisplayed();
		home.getBuzz().isDisplayed();
		home.getClaim().isDisplayed();
		home.getDashboard().isDisplayed();
		home.getMaintenance().isDisplayed();
		//home.getDirectory().isDisplayed();
		home.getLeave().isDisplayed();
		home.getMyinfo().isDisplayed();
		
		home.getPerformance().isDisplayed();
		
		Helper.logout();
	}

	@Test
	public static void verifyPanelElementsAreClickable() throws InterruptedException {

		Helper.login();
		HomePage home=new HomePage(MyListeners.getDriver());
		driver=MyListeners.getDriver();
		
		home.getAdmin().click();
		Thread.sleep(3000);
		driver.navigate().back();

		home.getBuzz().click();
		Thread.sleep(3000);
		driver.navigate().back();

		home.getClaim().click();
		Thread.sleep(3000);
		driver.navigate().back();

		home.getDashboard().click();
		Thread.sleep(3000);

		home.getDirectory().click();
		Thread.sleep(3000);
		driver.navigate().back();

		home.getLeave().click();
		Thread.sleep(3000);
		driver.navigate().back();

		home.getMaintenance().click();
		Thread.sleep(3000);
		driver.navigate().back();

		home.getMyinfo().click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		Helper.logout();

	}
	
	@Test
	public static void verifyRightPanelElements() throws InterruptedException {
		Helper.login();
		HomePage home=new HomePage(MyListeners.getDriver());
		driver=MyListeners.getDriver();
		
		home.getAssignleave().click();
		Thread.sleep(4000);
		driver.navigate().back();
		
		home.getLeavelist().click();
		Thread.sleep(4000);
		driver.navigate().back();
		
		home.getApplyleave().click();
		Thread.sleep(4000);
		driver.navigate().back();
		
		home.getTimesheets().click();
		Thread.sleep(4000);
		driver.navigate().back();
		
		home.getMytimesheets().click();
		Thread.sleep(4000);
		driver.navigate().back();
		
		home.getMyleave().click();
		Thread.sleep(4000);
		driver.navigate().back();
		
		Helper.logout();
		
	}
	
	public static void verifyleavepageelements() {
		Helper.login();
		LeavePage leave=new LeavePage(MyListeners.getDriver());
		
		
		
	}


}
