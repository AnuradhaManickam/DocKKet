package com.Dockket.Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.Dockket.Functions.HomeFunctions;

import mobileSetUp.AndroidProperties;

public class HomeTest extends AndroidProperties {

	@Test(description = "Verify that a user can create a company and site using valid Data"  , priority = 3)
	public void homeScreenTests() throws IOException {

		driver.manage().timeouts().implicitlyWait(5L,TimeUnit.SECONDS);

		HomeFunctions home = new HomeFunctions(driver);
		
		home.homeScreenFunctionality();

		System.out.println("succesfully created Company and Site");
	}
}