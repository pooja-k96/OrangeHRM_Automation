package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {
	
	public WebDriver driver;
	
	public LeavePage(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
	
	}
	

	@FindBy(xpath="//a[text()='Apply']")
	private WebElement applybtn;
	
	@FindBy(xpath="//a[text()='My Leave']")
	private WebElement myleavebtn;
	
	@FindBy(xpath="//span[text()='Entitlements ']")
	private WebElement entitlementsbtn;
	
	@FindBy(xpath="//span[text()='Reports ']")
	private WebElement reportsbtn;
	
	@FindBy(xpath="//span[text()='Configure ']")
	private WebElement configure;
	
	@FindBy(xpath="//a[text()='Leave List']")
	private WebElement leavelistbtn;
	
	@FindBy(xpath="//a[text()='Assign Leave']")
	private WebElement assignleavebtn;
	
	@FindBy(xpath="//div[@class='oxd-select-text--after']")
	private WebElement leavetypedropdown;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]")
	private WebElement fromdatecalendarpicker;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[2]")
	private WebElement todatecalendarpicker;
	
	//@FindBy(xpath="//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
	//private WebElement commenttextfield;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getApplybtn() {
		return applybtn;
	}

	public WebElement getMyleavebtn() {
		return myleavebtn;
	}

	public WebElement getEntitlementsbtn() {
		return entitlementsbtn;
	}

	public WebElement getReportsbtn() {
		return reportsbtn;
	}

	public WebElement getConfigure() {
		return configure;
	}

	public WebElement getLeavelistbtn() {
		return leavelistbtn;
	}

	public WebElement getAssignleavebtn() {
		return assignleavebtn;
	}

	public WebElement getLeavetypedropdown() {
		return leavetypedropdown;
	}

	public WebElement getFromdatecalendarpicker() {
		return fromdatecalendarpicker;
	}

	public WebElement getTodatecalendarpicker() {
		return todatecalendarpicker;
	}

	//public WebElement getCommenttextfield() {
		//return commenttextfield;
	//}	
}
