package com.hrms.testcases;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	
	//Assertion is used instead of if condition to check condition
	// can be used to compare two booleans, two conditions, two lists ...
	
	
	@Test(priority =1)
	public void methodOne() {
		String expectedTitle="HRMS";
		String actualTitle="HRMS";
		
		// 1 way to do 
		Assert.assertEquals(actualTitle, expectedTitle);// --> is important to fail the test/ also can be used to take screenshot which we cannot do with if condition
		
		ArrayList list1=new ArrayList<>();
		list1.add("a");
		list1.add("b");
		
		ArrayList list2=new ArrayList<>();
		list2.add("a");
		list2.add("b");
		
		Assert.assertEquals(list1, list2, "List are not equal");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualTitle,expectedTitle);// Does NOT fail the test even if it does not meet the condition 
		sa.assertAll();//--> only fail the test with this method
		
		
//		//2 way to do
//		if(expectedTitle.equals(actualTitle)) {
//			Assert.assertTrue(true);
//		}else {
//			Assert.assertTrue(false);
		//}
	}
	
	
	
//	@Test(priority =2)
//	public void methodTwo() {
//		
//	}
//	
//	@Test(priority =3)
//	public void methodThree() {
//		
//	}

}
