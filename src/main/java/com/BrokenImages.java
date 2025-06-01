package com;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImages {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C:/Users/Personal/eclipse-workspace/com/driver/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("http://the-internet.herokuapp.com/broken_images");
      driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(30)));
      List<WebElement> images = driver.findElements(By.tagName("img"));
      for(WebElement img:images) {
    	  
    	  String url = img.getAttribute("src");
    	  try {
    		  HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection(); 
    		  connection.setRequestMethod("GET");
    		  connection.connect();
    		  int responseCode = connection.getResponseCode();
    		  
    		  if(responseCode >=400) {
    			  System.out.println(url + "It is broken Image" + responseCode);
    		  }else {
    			  System.out.println(url + "It is not a broken Image" + responseCode);
    		  }
    	  }catch(Exception e) {
    		  System.out.println("Exception for Image: " + url + " | Error: " + e.getMessage());
    	  }
    	  
      }
	driver.quit();
	

}
}