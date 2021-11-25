package com.Dockket.Screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TaxScreen extends BaseScreen {
	
	public TaxScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc='Tab 5 of 5']")
	public WebElement SideNavigator;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc='Settings']")
	public WebElement Settings;	
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc='Tax']")
	public WebElement Tax;	
	
	@AndroidFindBy(xpath="//android.widget.Button[@index='2']")
	public WebElement AddTax;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Tax %']")
	public WebElement AddTaxPercent;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='SAVE']")
	public WebElement SaveTax;	
	
	
}
