package com.Dockket.Functions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import com.Dockket.Screens.LoginScreen;
import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utils.commonUitils;

public class LoginFunction extends BaseScreen {

	public LoginFunction(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	InputStream inputStream;

	public void successfulLoginFunctionality() throws IOException {

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

			// ----------------------Login using valid credentials----------------------------			

			driver.manage().timeouts().implicitlyWait(10L,TimeUnit.SECONDS);

			LoginScreen login = new LoginScreen(driver);

			commonUitils.clickByXpath(login.LoginEmailField,driver);
			
			Actions emailaction=new Actions(driver);
			emailaction.sendKeys(prop.getProperty("validEmail")).perform();

			commonUitils.clickByXpath(login.LoginNextBtn,driver);

			commonUitils.clickByXpath(login.LoinPassword,driver);
		
			Actions passwordaction=new Actions(driver);
			passwordaction.sendKeys(prop.getProperty("validPassword")).perform();
		
			commonUitils.clickByXpath(login.LoginButton,driver);
		
			System.out.println("completed login process");


		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}		

	}

	public void successfullLoginsetup() throws IOException {

		LoginFunction properties = new LoginFunction(driver);
		properties.successfullLoginsetup();

	}

}
