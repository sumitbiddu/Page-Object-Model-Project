package testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Wrappers.ProjectSpecificWrappers;
import pages.Loginpage;

public class TestCase extends ProjectSpecificWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TestCase";
		testDescription="Adding Mobile To Cart";
		authors="Sumit";
		category="Regression";
		browserName="chrome";
		
	}
	
	@Test
	public void testCase() throws InterruptedException {
		
		new Loginpage(driver, test)
		.enterUserName()
		.enterPassword()
		.clickCheckBox()
		.clickLogin()
		.clickServices()
		.clickMobile()
		.clickOrder()
		.clickAddToCart()
		.validateProduct()
		.clickCheckout()
		.clickCompleteOrder()
		.printInvoice();
		
		
		
			
	}
	

}

