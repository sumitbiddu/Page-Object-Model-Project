package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Wrappers.ProjectSpecificWrappers;

public class Checkoutpage extends ProjectSpecificWrappers{
	
	public Checkoutpage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
		if(!verifyTitle("Shopping Cart - PHPTRAVELS")) {
			reportStep("This is not a profile page", "FAIL");
		}
		
	}
	
	public Checkoutpage validateProduct() {
		verifyTextByXpath("//span[@class='item-title']", "Mobile Applications");
		return this;
		
	}
	public Checkoutpage clickCheckout() {
		clickById("checkout");
		return this;
	}
	
	public Invoicepage clickCompleteOrder() {
		clickById("btnCompleteOrder");
		return new Invoicepage(driver, test);
	}

}
