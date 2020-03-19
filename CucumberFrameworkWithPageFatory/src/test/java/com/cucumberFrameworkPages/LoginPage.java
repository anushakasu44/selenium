package com.cucumberFrameworkPages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	ChromeDriver driver;

	@FindBy(xpath="//input[@name='txtUsername']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='txtPassword']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterusername(String value) {
		username.sendKeys(value);
	}
	public void enterPassword(String value) {
		password.sendKeys(value);
	}
		public void clickonsubmit() {
		submit.click();
	}
		public void takeScreenshot(String filename) throws Exception {
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(file, new File("C:\\Users\\anush\\eclipse-workspace\\CucumberFrameworkWithPageFatory\\target"+filename+".jpg"));
		}
}
