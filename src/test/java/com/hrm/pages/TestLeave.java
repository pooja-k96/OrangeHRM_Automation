package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hrm.listeners.MyListeners;
import com.hrm.utils.Common;
import com.hrm.utils.Helper;

@Listeners(MyListeners.class)

public class TestLeave {
	
	static WebDriver driver;
	
	@Test
	public static void verifyleavepageelements() {
		Helper.login();
		
		HomePage home=new HomePage(MyListeners.getDriver());
		home.getLeave().isDisplayed();
		Common.click(home.getLeave(), "Clicked on Leave button successfully");
		LeavePage leave=new LeavePage(MyListeners.getDriver());
		
		leave.getApplybtn().isDisplayed();
		leave.getMyleavebtn().isDisplayed();
		leave.getEntitlementsbtn().isDisplayed();
		leave.getReportsbtn().isDisplayed();
		leave.getConfigure().isDisplayed();
		leave.getLeavelistbtn().isDisplayed();
		leave.getAssignleavebtn().isDisplayed();
		leave.getLeavetypedropdown().isDisplayed();
		leave.getFromdatecalendarpicker().isDisplayed();
		leave.getTodatecalendarpicker().isDisplayed();
		//leave.getCommenttextfield().isDisplayed();
		
		Helper.logout();
		
		
	}

}
