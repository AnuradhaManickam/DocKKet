package com.Dockket.Functions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import com.Dockket.Screens.HomeScreen;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HomeFunctions extends BaseScreen {
	
	public HomeFunctions(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	InputStream inputStream;
	
	public void homeScreenFunctionality() throws IOException {
		
		// ----------------------properties setup---------------------------
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";

			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}

			// ----------------------creating Company and site using valid data----------------------------	
			
			HomeScreen HomeScreen = new HomeScreen(driver);

			driver.manage().timeouts().implicitlyWait(15L,TimeUnit.SECONDS);
			
			HomeScreen.DashboardProfile.click();
			
			HomeScreen.CompanyDetails.click();
			
			HomeScreen.AddSite.click();
			
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}		

	}
	public void successfulHomescreenSetup() throws IOException {

		HomeFunctions properties  = new HomeFunctions(driver);
		properties.homeScreenFunctionality();

	}


}
