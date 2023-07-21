package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Wrappers.ProjectSpecificWrappers;

public class Loginpage extends ProjectSpecificWrappers{
	
	public Loginpage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
		if(!verifyTitle("Login - PHPTRAVELS")) {
			reportStep("This is not a profile page", "FAIL");
		}
		
	}
	
	public Loginpage enterUserName() {
		enterById("inputEmail", username);
		return this;
	}
	
	public Loginpage enterPassword() {
		enterById("inputPassword", password);
		return this;
	}
	
	public Loginpage clickCheckBox() throws InterruptedException  {
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
		switchToFrame("//iframe[@title='reCAPTCHA']");
		Thread.sleep(3000);
		//driver.findElementByXPath("//div[@class='recaptcha-checkbox-border']").click();
		clickByXpath("//div[@class='recaptcha-checkbox-border']");
		defaultContent();
		Thread.sleep(25000);
		return this;
	}
	
	
	
	public Homepage clickLogin() {
		clickById("login");
		return new Homepage(driver, test);
	}

}
