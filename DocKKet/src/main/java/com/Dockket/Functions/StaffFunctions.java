package com.Dockket.Functions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import com.Dockket.Screens.StaffScreen;
import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class StaffFunctions extends BaseScreen {
	
	public StaffFunctions(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	InputStream inputStream;

	public void addStaffScreenFunctionality() throws IOException {

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

			StaffScreen AddStaff = new StaffScreen(driver);

			driver.manage().timeouts().implicitlyWait(15L,TimeUnit.SECONDS);

			AddStaff.SideNavigator.click();
			
			AddStaff.SideNavigatorStaff.click();
			
			Thread.sleep(3000);
			
			AddStaff.StaffAddButton.click();
			
			AddStaff.StaffEmail.click();
			
			Actions action1 = new Actions(driver);
			action1.sendKeys("anum82115+003@gmail.com").perform();

			AddStaff.ViewStaffRole.click();
			
			AddStaff.SelectStaffRole.click();

			AddStaff.SaveStaff.click();

			driver.navigate().back();
			
			driver.navigate().back();


		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}		

	}

	public void addStaffScreensetup() throws IOException {

		StaffFunctions properties = new StaffFunctions(driver);
		properties.addStaffScreensetup();

	}


}
