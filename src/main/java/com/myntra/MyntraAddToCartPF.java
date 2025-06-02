package com.myntra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraAddToCartPF {
	
	WebDriver driver;
	BaseClass ob;
	
	@FindBy(xpath="//input[@class='desktop-searchBar']")
	WebElement searchBar;
	
	private By dropdownOptions = By.xpath("//ul[@class='desktop-group']/li");
	private By searchResults= By.xpath("//div[@class='search-searchProductsContainer row-base']/section/ul/li");	
	public MyntraAddToCartPF(WebDriver driver, BaseClass ob) {
	       this.driver = driver;
	       this.ob = ob;
		PageFactory.initElements(driver, this);
	
	}
	
	public void searchProd(String productName) {
		ob.userInputFields(searchBar, productName);
		
	}
	
	public void selectFromDropdown(String valueToSelect) {
		ob.dynamicDropDown(dropdownOptions, valueToSelect);
	}
	
	public void clickProduct(String productN) {
		ob.clickingMatchResult(searchResults, productN);
	}

}
