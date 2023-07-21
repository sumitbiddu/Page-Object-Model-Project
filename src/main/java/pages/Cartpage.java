package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Wrappers.ProjectSpecificWrappers;

public class Cartpage extends ProjectSpecificWrappers{
	
	public Cartpage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
		if(!verifyTitle("Shopping Cart - PHPTRAVELS")) {
			reportStep("This is not a profile page", "FAIL");
		}
		
	}
	public Cartpage clickMobile() {
		clickById("Secondary_Sidebar-Categories-Mobile");
		return this;
		
	}
	
	public Cartpage clickOrder() {
		clickById("product1-order-button");
		return this;
	}
	
	public Checkoutpage clickAddToCart() {
		clickByXpath("//div[@class='panel-add']");
		clickById("btnCompleteProductConfig");
		return new Checkoutpage(driver, test);
	}
	
	

}
