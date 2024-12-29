package com.hrm.utils;

import com.hrm.listeners.MyListeners;
import com.hrm.pages.HomePage;
import com.hrm.pages.LoginPage;

public class Helper {
	public static void login() {
		LoginPage login=new LoginPage(MyListeners.getDriver());

		Common.set(login.getUsernamefield(), "Admin", "Username entered successfully");
		Common.set(login.getPasswordfield(), "admin123", "Password entered successfully");
		Common.click(login.getLoginbtn(), "Clicked on login successfully");

	}

	public static void logout() {

		HomePage home=new HomePage(MyListeners.getDriver());

		Common.click(home.getProfileicon(), "Clicked on Profileicon successfully");
		Common.click(home.getLogout(), "Clicked on Logout button successfully");

	}
}
