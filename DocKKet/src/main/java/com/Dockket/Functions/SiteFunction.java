package com.Dockket.Functions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;

import com.Dockket.Screens.SiteScreen;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SiteFunction extends BaseScreen {
	
	public SiteFunction(AppiumDriver<MobileElement> driver) {
		super(driver);
		
	}

	InputStream inputStream;

	public void addSiteScreenFunctionality() throws IOException {

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
			
			SiteScreen AddSite = new SiteScreen(driver);

			driver.manage().timeouts().implicitlyWait(10L,TimeUnit.SECONDS);
			
			AddSite.SiteName.click();
			
			Actions action = new Actions(driver);
			action.sendKeys(prop.getProperty("siteName")).perform(); // Site Name
		
			AddSite.Address1.click();
			
			Actions action1 = new Actions(driver);
			action1.sendKeys(prop.getProperty("siteAddress1")).perform(); // Address 1

			AddSite.Address2.click();
			
			Actions action2 = new Actions(driver);
			action2.sendKeys(prop.getProperty("siteAddress2")).perform(); //Address 2
			
			AddSite.city.click();
			
			Actions action3 = new Actions(driver);
			action3.sendKeys(prop.getProperty("siteCity")).perform(); // City
			
			AddSite.State.click();
			
			Actions action4 = new Actions(driver);
			action4.sendKeys(prop.getProperty("siteState")).perform(); //State
			
			AddSite.postcode.click();
			
			Actions action6 = new Actions(driver);
			action6.sendKeys(prop.getProperty("sitePostcode")).perform(); // Post code
		
			AddSite.ViewCountry.click();// country
            
			AddSite.CountryIreland.click(); // country 1
            
			
			//AddSite.siteEmail.click();	
			
			//Actions action7 = new Actions(driver);
			//action7.sendKeys(prop.getProperty("siteEmail")).perform();                 // cursor issue on add site screen
			
			//AddSite.sitePhonenumber.click();
			
			//Actions action8 = new Actions(driver);
			//action8.sendKeys(prop.getProperty("sitePhonenumber")).perform();
			
			Thread.sleep(5000);
		
			AddSite.SaveSite.click();
			
			System.out.println("completed site creation process");
			
			Thread.sleep(10000);
			
			AddSite.SelectSite.click();
			
			

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}		

	}

	public void successfullAddSitesetup() throws IOException {

		SiteFunction properties = new SiteFunction(driver);
		properties.successfullAddSitesetup();

	}
	
	

}
