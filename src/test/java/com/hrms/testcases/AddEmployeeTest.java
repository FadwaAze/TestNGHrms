package com.hrms.testcases;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class AddEmployeeTest extends CommonMethods {

//	@BeforeMethod
//	public void openBrowserAndNavigate() {
//		setUp();
//		initialize();
//	}
//
//	@AfterMethod
//	public void quitBrowser() {
//		tearDown();
	
//	}--> don't need because we add @BeforeMethode and @Aftermethod in our base class before setUp () Method and tearDown() Method

	public void addEmployeePage() {

		//LoginpageElements login = new LoginpageElements();

//		login.username.sendKeys(ConfigsReader.getProperty("username"));
//		login.password.sendKeys(ConfigsReader.getProperty("password"));
//		login.loginBtn.click(); --> will use instead login Methods from LoginpageElements
		
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
         dashboard.navigateToAddEmployee();
         wait(7);
         
         //sendText(addEmp.empFirstName, ConfigsReader.getProperty("employeeFirstName"));
         
		

	}

}
