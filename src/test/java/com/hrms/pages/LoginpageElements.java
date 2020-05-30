package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class LoginpageElements extends CommonMethods{
	//using page factory and @FindBy ---> to locate elements 
	
	@FindBy(id="txtUsername")
	public WebElement username;
	
	@FindBy(name="txtPassword")
	public WebElement password;
	
	
	@FindBy(css="input#btnLogin")
	public WebElement loginBtn;
	
	@FindBy(xpath="//div[@id='divLogo']/img")
	public WebElement logo;
	
	@FindBy(id="spanMessage")
	public WebElement errorMsg;
	
	
	public LoginpageElements() {
		//page Factory (class) --> to initialize all elements at once using initElements() Methods
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	

	// if we would be keeping elements as private
	//then we will need to create public getters and setter 
	//so we can access page elements from test classes.
	
	
	//this is setter
	public void sendUsername(String uid) {
		sendText(username, uid);
	}
	
	
	// this is getter
	public WebElement getUsername() {
		return username;
	}
	
	public void login(String uid, String pwd) {
		sendText(username,uid);
		sendText(password, pwd);
		click(loginBtn);
		
	}
	
	
	
	
	
	
	
	

}
