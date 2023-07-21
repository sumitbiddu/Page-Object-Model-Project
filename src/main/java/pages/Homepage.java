package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Wrappers.ProjectSpecificWrappers;

public class Homepage extends ProjectSpecificWrappers{
	
	public Homepage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
		if(!verifyTitle("Client Area - PHPTRAVELS")) {
			reportStep("This is not a profile page", "FAIL");
		}
		
	}
	
	public Cartpage clickServices() {
		clickById("Primary_Navbar-Services");
		clickById("Primary_Navbar-Services-Order_New_Services");
		return new Cartpage(driver, test);
		
	}
	

	
	
}
