package com.hrms.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotaionsDemo {
// testNg use @ annotation to run code/ no need for main Method
	// ---> each @test represent ONE test case --> execute on alphabetic order 	
	// using priority the alphabetic order get ignored
	// @ BeforeMethod always get execute before 
	
	//@BeforeClass --> to open browser only one time in order to execute all test case. 
	//If we use @BeforeMethod it will open browser every time before running EACh Test
	
	
	@BeforeClass
	public void executeBeforeMethod() {
		System.out.println("I open browser and lunch url");
	}
	
	@Test(priority =1)
	public void methodOne() {
		System.out.println("My first testCase = login");
	}
	
	@Test(priority =2)
	public void methodTwo() {
		System.out.println("My second testCase = dashboard");
	}
	
	@Test(priority =3)
	public void methodThree() {
		System.out.println("My third testCase= add emp");
	}

}
