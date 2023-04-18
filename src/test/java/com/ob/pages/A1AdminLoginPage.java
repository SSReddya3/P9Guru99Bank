package com.ob.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.*;

public class A1AdminLoginPage {

WebDriver driver;	
ExtentTest test;	
	
@FindBy(name="Admin Login")
WebElement AdminLogin;

@FindBy(xpath="//input[@name='userName']")
WebElement Username;

@FindBy(xpath="//input[@name='password']")
WebElement password;


@FindBy(xpath="//input[@name='submit']")
WebElement signin;	
	
	
public A1AdminLoginPage(WebDriver driver,ExtentTest test) {
	this.test = test;
	this.driver = driver;
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	PageFactory.initElements(driver, this);
}

	
public void login(String UN,String Pwd) {
	try {
		Username.sendKeys(UN);
		password.sendKeys(Pwd);
		signin.click();
		Assert.assertTrue(true, "User is clicked on sign in button");
		test.log(LogStatus.PASS, "User is clicked on sign in button");
	}catch(Exception e) {
		Assert.assertTrue(false, "User is unable to click on sign in button");
		test.log(LogStatus.FAIL, "User is unable to click on sign in button");
		e.printStackTrace();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
