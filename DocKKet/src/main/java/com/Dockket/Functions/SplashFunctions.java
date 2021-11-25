package com.Dockket.Functions;

import com.Dockket.Screens.SplashScreen;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utils.commonUitils;

public class SplashFunctions extends BaseScreen {

	public SplashFunctions(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	SplashScreen splash = new SplashScreen(driver);

	public void NextButton1() throws Exception {

		//splash.SplashScreenNext.click();
		
		commonUitils.clickByXpath(splash.SplashScreenNext,driver);
		
	}

	public void NextButton2() throws Exception {

		commonUitils.clickByXpath(splash.SplashScreenNext,driver);

	}

	public void GetStartBtn() throws Exception {

		commonUitils.clickByXpath(splash.SplashScreen3,driver);

	}

}
