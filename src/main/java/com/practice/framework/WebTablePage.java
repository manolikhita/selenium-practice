package com.practice.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {
	WebDriver driver;
	
	
	@FindBy(xpath="//table[@id='table1']")
	WebElement table1Name;
	
	@FindBy(xpath="//button[contains(text(),'JS Alert')]")
	WebElement alertClick;

	public WebTablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getTableName() {
		return table1Name;
	}
	
	public void alertCheck() {
		
		alertClick.click();
	}
	


}

