package com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonWebsite  {
	static String chromePath = "C:/Users/Personal/eclipse-workspace/com/driver/chromedriver.exe";
	
	static WebDriver driver = new ChromeDriver();
	

	
	@BeforeTest
	public static void intializeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "chromePath");

		
		
		
		
		driver.manage().window().maximize();
		
	}
	
	@Test(enabled=false)
	public static void openApp() {
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement el1 = driver.findElement(By.xpath("//span[@class='_1XjE3T']//span[contains(text(),'Fashion')]"));
		Actions act = new Actions(driver);
		act.moveToElement(el1).build().perform();
		driver.findElement(By.xpath("//a[text()='Women Ethnic']")).click();
        boolean flag = driver.findElement(By.xpath("//div[contains(text(),'Beauty Chikan Emporium')]")).isDisplayed();
        System.out.println(flag);		
	}
	@Test
    public static void openGoogle() {
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("isqtb");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		List<WebElement> ls = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li//div[@role='option']")));
		for(WebElement l:ls) {
			String text = l.getText();
			System.out.println(text);
			if(text.toLowerCase().contains("certification cost")) {
				l.click();
			}
		}
		
		
		
}
}