package com.myntra;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtilis {
	
	
	
	public void captureScreenshot(WebDriver driver, String screenshotName) {
		
		try {
		String screenshotTimeFormat = new SimpleDateFormat("yyyyDDMM_HHmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String destinationName = System.getProperty("user.dir") + "/screenshots/"+ screenshotName + " "+ screenshotTimeFormat + ".png";
		File des = new File(destinationName); 
		FileUtils.copyFile(src, des);
		des.getParentFile().mkdirs();
		}catch(IOException e) {
	        System.out.println("Exception while taking screenshot: " + e.getMessage());

		}
		
	}

}
