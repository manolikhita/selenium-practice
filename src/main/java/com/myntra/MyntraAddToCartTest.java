package com.myntra;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyntraAddToCartTest extends BaseClass {
	
MyntraAddToCartPF mynC;
MyntraSignUpPF mynS;
ScreenShotUtilis sc;
	
	@BeforeClass
	public void openBrowse() {
		setUp();
		mynC = new MyntraAddToCartPF(driver, this);
		sc = new ScreenShotUtilis();
	}
	
	@Test
	public void validateSearch() {
		
		String searchTerm = "watches";
        String dropdownSelection = "watches for women";
        String productToSelect = "Mast & Harbour Women Analogue Watch";

		
		mynC.searchProd(searchTerm);
		mynC.selectFromDropdown(dropdownSelection);
		mynC.clickProduct(productToSelect);
		sc.captureScreenshot(driver, "secondscreenshot");
		
	}

}
