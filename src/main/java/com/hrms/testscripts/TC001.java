package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.Verify_Pages;
import com.hrms.utility.BaseClass;

public class TC001 extends BaseClass {
	@Test
	public static void tc001() {
	    //Test Steps
	    BaseClass.openApplication();
	    Verify_Pages.verifyTitle("hrms");
	    LoginPage.login("nareshit", "nareshit");
	    Verify_Pages.verifyTitle("OrangeHRM");
	    LogoutPage.logout();
	    BaseClass.closeApplication();
	}
	}

