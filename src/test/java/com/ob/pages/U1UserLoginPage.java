package com.ob.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class U1UserLoginPage {
	WebDriver driver;	
	ExtentTest test;	
	
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement emil;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath = "//button[@class='btn btn-sm btn-primary btn-flat']")
	WebElement SignIn;
	
	
	public U1UserLoginPage(WebDriver driver,ExtentTest test) {
		this.test = test;
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
