package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy (xpath="//span[text()='Admin']")
	private WebElement admin;
	
	@FindBy (xpath="//span[text()='PIM']")
	private WebElement pim;
	
	@FindBy(xpath= "//span[text()='Leave']")
	private WebElement leave;
	
	@FindBy (xpath="//a[@class='oxd-main-menu-item active']")
	private WebElement time;
	
	@FindBy (xpath="//span[text()='Recruitment']")	
	private WebElement recruitment;
	
	@FindBy(xpath="//span[text()='My Info']")
	private WebElement myinfo;
	
	@FindBy(xpath="//a[@href='/web/index.php/performance/viewPerformanceModule']")
	private WebElement performance;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement dashboard;
	
	@FindBy(xpath="//span[text()='Directory']")
	private WebElement directory;
	
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement maintenance;
	
	@FindBy(xpath="//span[text()='Claim']")
	private WebElement claim;
	
	@FindBy(xpath="//span[text()='Buzz']")
	private WebElement buzz;
	
	@FindBy(xpath= "//button[@title='Assign Leave']")
	private WebElement assignleave;
	
	@FindBy(xpath="//button[@title='Leave List']")
	private WebElement leavelist;
	
	@FindBy(xpath="//button[@title='Timesheets']")
	private WebElement timesheets;
	
	
	public WebElement getTimesheets() {
		return timesheets;
	}

	public WebElement getApplyleave() {
		return applyleave;
	}

	public WebElement getMyleave() {
		return myleave;
	}

	public WebElement getMytimesheets() {
		return mytimesheets;
	}

	@FindBy(xpath="//button[@title='Apply Leave']")
	private WebElement applyleave;
	
	@FindBy(xpath="//button[@title='My Leave']")
	private WebElement myleave;
	
	@FindBy(xpath="//button[@title='My Timesheet']")
	private WebElement mytimesheets;
	
	@FindBy(xpath="//img[@class='oxd-userdropdown-img']")
	private WebElement profileicon;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	
	public WebElement getProfileicon() {
		return profileicon;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getAssignleave() {
		return assignleave;
	}

	public WebElement getLeavelist() {
		return leavelist;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAdmin() {
		return admin;
	}

	public WebElement getPim() {
		return pim;
	}

	public WebElement getLeave() {
		return leave;
	}

	public WebElement getTime() {
		return time;
	}

	public WebElement getRecruitment() {
		return recruitment;
	}

	public WebElement getMyinfo() {
		return myinfo;
	}

	public WebElement getPerformance() {
		return performance;
	}

	public WebElement getDashboard() {
		return dashboard;
	}

	public WebElement getDirectory() {
		return directory;
	}

	public WebElement getMaintenance() {
		return maintenance;
	}

	public WebElement getClaim() {
		return claim;
	}

	public WebElement getBuzz() {
		return buzz;
	}
	
}
