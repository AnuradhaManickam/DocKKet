package com.Dockket.Testcases;

import io.appium.java_client.AppiumDriver;
import mobileSetUp.AndroidProperties;
import mobileSetUp.AppiumServer;
import io.appium.java_client.MobileElement;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.Dockket.Functions.SplashFunctions;

public class SplashTest extends AndroidProperties {
	
	@Test(priority=1)
	public void splashFunctionality() throws Exception {
		
		AppiumServer.start();
		
		AppiumDriver<MobileElement> driver= caps();
		
		driver.manage().timeouts().implicitlyWait(5L,TimeUnit.SECONDS);

		SplashFunctions splash = new SplashFunctions(driver);
		
		splash.NextButton1();
		logger.info("Next button clicked");
		 
		splash.NextButton2();
		logger.info("Next button clicked");
		
		splash.GetStartBtn();
		logger.info("Get Started! button clicked");
       
	}

	
	
}
