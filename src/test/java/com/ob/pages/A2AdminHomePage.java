package com.ob.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.relevantcodes.extentreports.*;

public class A2AdminHomePage {

	ExtentTest test;
	WebDriver driver;
	
	




	@FindBy(xpath="//i[@class='fas fa-bars']")
	WebElement expandbutton;
	@FindBy(xpath="//p[normalize-space()='Account Management']")
	WebElement accountmanagement;
	
	@FindBy(xpath="//a[@class='nav-link nav-manage_account']")
	WebElement newaccount;
	
	@FindBy(xpath="//input[@name='account_number']")
	WebElement accountnumber;
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@placeholder='(optional)']")
	WebElement middlename;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='generated_password']")
	WebElement password;
	
	@FindBy(xpath="//button[@id='generate_pass']")
	WebElement autopasswordgeneratedbutton;
	
	@FindBy(xpath="//input[@name='pin']")
	WebElement pin;
	
	@FindBy(xpath="//input[@name='balance']")
	WebElement balance;
	
	@FindBy(xpath="//button[@class='btn btn-primary mr-2']")
	WebElement save;
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	WebElement cancel;
	
	@FindBy(xpath="//p[normalize-space()='Manage Account']")
	WebElement manageaccount;
	
	@FindBy(xpath="//a[@class='btn btn-flat btn-primary']")
	WebElement createnew;
	
	@FindBy(xpath="//select[@name='indi-list_length']")
	WebElement showentries;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement search;
	
	@FindBy(xpath="//span[@class='ml-3']")
	WebElement adminstratoradmin;
	
	@FindBy(xpath="//a[normalize-space()='My Account']")
	WebElement myaccount;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement logout;
	
	
	
	public A2AdminHomePage(WebDriver driver,ExtentTest test) {
		this.test = test;
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
