package com.practice.framework;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertPractice extends BaseClass {
	
	WebTablePage webPage;
	@BeforeTest
	public void openBrower() {
		intializeDriver();
		webPage	= new WebTablePage(driver);
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
	}

	@Test
	public void testAlert() {
		
		
		webPage.alertCheck();
		
	}

}
