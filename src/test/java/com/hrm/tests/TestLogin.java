package com.hrm.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hrm.listeners.MyListeners;
import com.hrm.pages.LoginPage;
import com.hrm.utils.Common;
import com.hrm.utils.Helper;

@Listeners(MyListeners.class)
public class TestLogin {
	
	@Test(priority = 3)
	public static void validlogin() {
		LoginPage login=new LoginPage(MyListeners.getDriver());
		
		Common.set(login.getUsernamefield(), "Admin", "Username entered successfully");
		Common.set(login.getPasswordfield(), "admin123", "Password entered successfully");
		Common.click(login.getLoginbtn(), "Clicked on login successfully");
		
		Helper.logout();
		
	}

	@Test(priority = 1)
	public static void verifyerrormessagesforblankfields() {
		LoginPage login=new LoginPage(MyListeners.getDriver());
				
		Common.click(login.getLoginbtn(), "Clicked on Login button with Username and Password blank");
		
		String error1 = login.getUsernameerrormessage().getText();
		String error2 = login.getPassworderrormessage().getText();
		
		Common.click(login.getUsernameerrormessage(), "Error messages are displayed ");
		
		String experror1 = "Required";
		String experror2 = "Required";
		Assert.assertEquals(error1, experror1);
		Assert.assertEquals(error2, experror2);
		
		
	}
	
	@Test(priority = 2)
	public static void invalidCredentialsVerification() {
		LoginPage login=new LoginPage(MyListeners.getDriver());
		
		Common.set(login.getUsernamefield(), "admin", "Invalid Username entered successfully");
		Common.set(login.getPasswordfield(), "admin189", "Invalid Password entered successfully");
		Common.click(login.getLoginbtn(), "Clicked on login successfully");
		
		String error1 = login.getInvalidcredentialserrormessage().getText();
		Common.click(login.getInvalidcredentialserrormessage(), "Error message is displayed");
		
		String exp1 = "Invalid credentials";
		Assert.assertEquals(error1, exp1);
	}
	
}
