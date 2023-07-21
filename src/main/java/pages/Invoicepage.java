package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Wrappers.ProjectSpecificWrappers;

public class Invoicepage extends ProjectSpecificWrappers{
	
	public Invoicepage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
		if(!verifyTitle("PHPTRAVELS - Invoice #11933")) {
			reportStep("This is not a profile page", "FAIL");
		}
		
	}
	
	public Invoicepage printInvoice() {
		clickByXpath("//a[@class='btn btn-default']");
		return this;
	}

}