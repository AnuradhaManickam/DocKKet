package com.Dockket.Testcases;

import mobileSetUp.AndroidProperties;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.Dockket.Functions.LoginFunction;


public class LoginTest extends AndroidProperties {
	
	@Test(priority=2)
	public void LoginFunctionality() throws IOException {
		
		
		driver.manage().timeouts().implicitlyWait(5L,TimeUnit.SECONDS);

		LoginFunction login = new LoginFunction(driver);
		
		login.successfulLoginFunctionality();
		
		logger.info("Log into the application successfully!!");
		

	}

	
}
