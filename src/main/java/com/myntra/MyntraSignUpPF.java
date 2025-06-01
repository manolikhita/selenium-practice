package com.myntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraSignUpPF {
	
	BaseClass obj = new BaseClass();

	WebDriver driver;
	
	@FindBy(xpath="//span[(text()='Profile')]")
	WebElement profileButton;
	
	@FindBy(xpath="//a[contains(text(),'login')]")
	WebElement loginButton;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement mobileNumLoc;
	
	@FindBy(xpath="//input[@class='consentCheckbox']")
	WebElement consentCheck;
	
	@FindBy(xpath="//div[text()='CONTINUE']")
	WebElement continueForm;
	
	@FindBy(xpath="//div[@class='bottomeLink']//span[contains(text(),'Password')]")
	WebElement pwdClick;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pwdInput;
	
	@FindBy(xpath="//button[contains(text(), 'LOGIN')]")
	WebElement loginBtn;
	
	public MyntraSignUpPF(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void signUpClick() {
		
		obj.actionHandling(driver,profileButton);
		obj.waitHandling(loginButton);
		loginButton.click();
	}
	
	public void signUpReal(String mobilenNum, String password) {
		 obj.userInputFields(mobileNumLoc, mobilenNum);
		 consentCheck.click();
		 continueForm.click();
		 pwdClick.click();
		 obj.userInputFields(pwdInput, password);
		 loginBtn.click();
		 
	}
}
