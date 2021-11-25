package com.Dockket.Screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SplashScreen 	extends BaseScreen  {

	public SplashScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='NEXT']")
	public WebElement SplashScreenNext;

	@AndroidFindBy(xpath="//android.view.View[@content-desc='Get started with us..']")
	public WebElement SplashScreen3;
}


