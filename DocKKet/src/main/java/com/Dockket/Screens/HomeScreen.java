package com.Dockket.Screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class HomeScreen extends BaseScreen {
	
	public HomeScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath="//android.widget.ImageView[@index='1']")
	public WebElement DashboardProfile;
	
	@AndroidFindBy(xpath="//android.view.View[@index='3']")
	public WebElement CompanyDetails;
	
	@AndroidFindBy(xpath="//android.widget.Button[@index='2']")
	public WebElement AddSite;

}
