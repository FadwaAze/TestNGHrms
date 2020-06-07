package com.hrms.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	// Why do we need parameterization? --> to execute one test with different sets of data
	//works with Objects 2 DD Array
	
	
	
	@Test(dataProvider="getData")
	public void addEmp(String fName, String mName, String lName) {
		System.out.println(fName+" "+mName+" "+lName);
		
	}
	
	@DataProvider
	public Object [][] getData() {
		
		Object [][] data={
				{"Abdellah", "A","Allouche"},
				{"Fadwa", "B","Azeroual"},
				{"Ali","C","Tatjik"},
		};
		return data;
	}

}
