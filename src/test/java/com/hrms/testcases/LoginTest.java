package com.hrms.testcases;

import org.testng.annotations.Test;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class LoginTest extends CommonMethods {
	
//	@BeforeMethod
//	public void openBrowserAndNavigate() {
//		setUp();
//		initialize();//Initialize all objs so we don't need to create 
//
//	}
//
//	@AfterMethod
//	public void quitBrowser() {
//		tearDown();
//
//	}
	
//testing functionality based on user stories that will be given to us
	@Test (groups="smoke")
	public void validAdminLogin() {
		//LoginpageElements login = new LoginpageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		wait(2);
    //--> for every test we need to add assertion to verify if the test pass or failed
		//DashBoardPageElements dashboard = new DashBoardPageElements();
		
		String expectedUser="Welcome Admin";
		String actualUser=dashboard.welcome.getText();
		Assert.assertEquals(actualUser, expectedUser, "Admin is NOT Logged in");
		//either first or the second assert to verify the login validation
		Assert.assertTrue(actualUser.contains(ConfigsReader.getProperty("username")));
	}
	
	
	@Test(groups="regression")
	public void invalidPasswordLogin() {//negative login with wrong password
		//LoginpageElements login = new LoginpageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password,"bnvbcn");// pass on wrong password
		click(login.loginBtn);
		
		
		String expected="Invalid credentials";
		Assert.assertEquals(login.errorMsg.getText(), expected, "Error message text is not matched");
	}
	
	@Test(groups="regression")
	public void emptyUsernameLogin() {// negative login with empty username
		//LoginpageElements login = new LoginpageElements();
		
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		
		String expected="Username cannot be empty";
		Assert.assertEquals(login.errorMsg.getText(), expected,"Error message text is not matched");
		
	}
	
	
	

}
