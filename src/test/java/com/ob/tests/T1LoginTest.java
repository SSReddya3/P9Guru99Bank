package com.ob.tests;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;

import com.ob.BaseTest.baseTest;
import com.ob.pages.A1AdminLoginPage;
import com.ob.utilities.Utilities;
import com.relevantcodes.extentreports.LogStatus;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.logging.*;

import org.testng.annotations.Test;

import com.mongodb.diagnostics.logging.*;
import com.ob.BaseTest.baseTest;
import com.ob.pages.*;
import com.ob.utilities.Utilities;
import com.relevantcodes.extentreports.LogStatus;

public class T1LoginTest extends baseTest {
	Logger log;
	//Logger log = (Logger) LogManager.getLogger(this);

String UserName;;
	
	@Test
	public void t1logintest() throws IOException, InterruptedException {
		try {
			log = (Logger) LogManager.getLogger(T1LoginTest.class);
				String UserName;
				String Password;
				String adminURL;
				
				//Read properties file
				adminURL = Utilities.getProperty("AdminUrl");
				UserName = Utilities.getProperty("AdminUserName");
				Password = Utilities.getProperty("AdminPassword");
				
				//Navigate to Admin Login 
				log.info("Test Execution Started");
				driver.get(adminURL);

				A1AdminLoginPage al = new A1AdminLoginPage(driver,test);
				al.login(UserName, Password);
				
				
				test.log(LogStatus.PASS,"Login test is  done successfully");
				log.info("Login test is done successfully");
				//Assert.assertFalse(true);
		}catch(Exception e) {
			log.info("Login test is not successful");
			e.printStackTrace();
		}

	
	
	
	
	
	
	
	
	
	
	
	}
}
