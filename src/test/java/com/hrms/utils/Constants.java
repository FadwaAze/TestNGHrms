package com.hrms.utils;

public class Constants {

	public static final String CHROME_DRIVER_PATH=System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver";
	
	public static final String GECKO_DRIVER_PATH=System.getProperty("user.dir")+"/src/test/resources/drivers/geckodriver";
	
	public static final String CONFIGURATION_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/configs/configuration.properties";
	
	public static final int IMPLICIT_WAIT_TIME=10;// DON'T MAKE IT TOO LONG 
	
	public static final int EXPLICIT_WAIT_TIME=30;// NO MORE THAN 30 
	
}
//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");