package com;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static void main(String[] args) throws AWTException {
		
       System.setProperty("webdrvier.chrome.driver", "C:/Users/Personal/eclipse-workspace/com/driver/chromedriver.exe");


		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("isqtb");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		List<WebElement> ls = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@jsname='aajZCb']")));
		for(WebElement s:ls) {
			if(s.)
		}
		
	}

}
