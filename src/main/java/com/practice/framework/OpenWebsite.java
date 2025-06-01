package com.practice.framework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenWebsite extends BaseClass {
	
    WebTablePage webTablePage;

	
	@BeforeTest
	public void openBrower() {
		intializeDriver();
		webTablePage = new WebTablePage(driver);
		driver.get("http://the-internet.herokuapp.com/tables");
		
	}
	
	
	@Test(enabled=false)
	public void getData() {
	
		WebElement table = webTablePage.getTableName();  
		List<WebElement> rows = table.findElements(By.xpath("//tbody/tr"));
		System.out.println(rows);
		
		for(WebElement row:rows) {
			
			List<WebElement> colsInRow = row.findElements(By.tagName("td"));
			if (colsInRow.size()<4) {
		        continue;
		    }
			
		Map<String, String> cols = new HashMap<>();
		
		cols.put("LastName", colsInRow.get(0).getText().trim());
		cols.put("FirstName", colsInRow.get(1).getText().trim());
		cols.put("Email", colsInRow.get(3).getText().trim());
				
		System.out.println(cols);
			}	
		
	}
	
	
	
	@AfterTest
	public void closeBrowser() {
		tearDown();
		
	}
	
}
