package com.practice.framework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass{

	public static WebDriver driver;
	

	public void intializeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Personal/eclipse-workspace/com/driver/chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
	}
	
	
	public void openAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void tearDown() {
		if(driver!=null) {
		driver.quit();
		}
	}

}
