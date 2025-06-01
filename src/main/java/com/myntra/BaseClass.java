package com.myntra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	public void launchBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/Personal/eclipse-workspace/com/driver/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:/Users/Personal/eclipse-workspace/com/driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}else {
			System.out.println("Undefined Browser"+ browser);
		}
		
	}
	
	@BeforeClass
	public void setUp() {
		String browser1 = ConfigProps.get("browser1");
		String browser2 = ConfigProps.get("browser2");
		
		String baseUrl = ConfigProps.get("baseUrl");
		launchBrowser(browser1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
	}
	
	
	
	
	@AfterClass
	public void tearDown() {
		
		if(driver!=null) {
			driver.quit();
		}else {
			System.out.println("Driver instance not found");
		}
	}
	
	public void actionHandling(WebDriver driver,WebElement el) {
		Actions act = new Actions(driver);
		act.moveToElement(el).build().perform();
	}
	
	public void waitHandling(WebElement el2) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOf(el2));
	}
	
	public void userInputFields(WebElement element, String inputField) {
		
		element.sendKeys(inputField);
	}

}
