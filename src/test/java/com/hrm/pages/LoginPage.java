package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);

	}

	@FindBy (name = "username")
	private WebElement usernamefield;

	@FindBy (name = "password")
	private WebElement passwordfield;

	@FindBy (xpath = "//button[@type='submit']")
	private WebElement loginbtn;
	
	@FindBy (xpath="(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[1]")
	private WebElement usernameerrormessage;
	
	
	@FindBy (xpath="(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[2]")
	private WebElement passworderrormessage;
	
	@FindBy (xpath="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	private WebElement invalidcredentialserrormessage;
	
	
	
	public WebElement getInvalidcredentialserrormessage() {
		return invalidcredentialserrormessage;
	}

	public WebElement getUsernameerrormessage() {
		return usernameerrormessage;
	}

	public WebElement getPassworderrormessage() {
		return passworderrormessage;
	}


	public WebElement getUsernamefield() {
		return usernamefield;
	}

	public WebElement getPasswordfield() {
		return passwordfield;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}


}
