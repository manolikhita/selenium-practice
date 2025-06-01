package com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinks {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Personal/eclipse-workspace/com/driver/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://int.zigzag.lk/collections/dresses");
		WebElement el1 =driver.findElement(By.xpath("//select[@name='sort_by_clone']"));
		Select sel = new Select(el1);
		sel.selectByValue("price-ascending");
		driver.findElement(By.xpath("//span[@data-value='price-ascending']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			
			
			
			
			
	
		
		

	}

}
