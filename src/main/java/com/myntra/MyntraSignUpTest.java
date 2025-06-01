package com.myntra;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListener.class)
public class MyntraSignUpTest extends BaseClass {
	
	MyntraSignUpPF myn;
	
	@BeforeClass
	public void openBrowse() {
		myn = new MyntraSignUpPF(driver);
	}
	
	@Test(priority=0)
	public void signUpCheck() {
		
		myn.signUpClick();
		myn.signUpReal("7396404252", "Mano@29121996");
	}
	
	

	
}
