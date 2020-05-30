package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PersonalDetailsPageElement {
	
	@FindBy(id="personal_cmbNation")//specify the locator 
	public WebElement nationalityDD;
	
	
	@FindBy(name="personal[optGender]")
	public List<WebElement> genderRadioGroup;
	
	@FindBy(xpath = "//div[@id='pdMainContainer']/div[1]/h1")
	public WebElement lblPersonalDetails;

	@FindBy(id = "personal_txtEmployeeId")
	public WebElement employeeId;
	
	
	public PersonalDetailsPageElement () {//---> constructor to initialize ALL instant variables at once
		PageFactory.initElements(BaseClass.driver, this);
	}

}
