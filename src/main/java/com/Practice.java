package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice {
	
	
	
	public static WebDriver driver = new ChromeDriver();
	
	

	 @BeforeTest
	 public static void openBrowser() {
		 System.setProperty("webdriver.chrome.driver","C:/Users/Personal/eclipse-workspace/com/driver/chromedriver.exe");
		 driver.manage().window().maximize();
		
	 }
	 
	 @Test
	 public static void openApp() {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,500)");	 
		 
	 }
	 @Test
	 public static void enterTextInput() {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.findElement(By.xpath("//input[@name='my-text']")).sendKeys("DemoUSer");
	 WebElement el = driver.findElement(By.xpath("//select[@name='my-select']"));
	 Select select = new Select(el);
	 select.selectByValue("1");
	 driver.findElement(By.xpath("//input[@name='my-password']")).sendKeys("Man@123");
	driver.findElement(By.xpath("//input[@name='my-datalist']")).sendKeys("Los Angeles");
	
	
		 
		 
	 }
	 
	 @AfterTest(enabled=false)
	 public static void tearDown() {
		 driver.quit();
	 }
}


