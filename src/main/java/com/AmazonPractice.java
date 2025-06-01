package com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPractice {
	
	
	static WebDriver driver;
	
	@BeforeTest
	public static void openBrowser() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		
	}
	
	@Test
	public static void openUrl() {
		
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement el = driver.findElement(By.xpath("//span[contains(text(), 'Medical Care')]"));
		Actions act = new Actions(driver);
		act.moveToElement(el).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Medical care and pharmacy')]")));
		driver.findElement(By.xpath("//strong[contains(text(),'Get your meds')]")).click();
		
		
		
	}

	@AfterTest
	public static void tearDown() {
		driver.quit();
		
	}
}
