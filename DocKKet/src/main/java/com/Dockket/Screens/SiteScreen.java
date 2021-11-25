package com.Dockket.Screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SiteScreen extends BaseScreen {

	public SiteScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath="//android.widget.EditText[@text='Site Name *']")
	public WebElement SiteName;

	@AndroidFindBy(xpath="//android.widget.EditText[@text='Address 1']")
	public WebElement Address1;

	@AndroidFindBy(xpath="//android.widget.EditText[@text='Address 2']")
	public WebElement Address2;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='City']")
	public WebElement city;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='State / County']")	
	public WebElement State;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Postcode']")	
	public WebElement postcode;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Country']")	
	public WebElement ViewCountry;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc='IRELAND']")	
	public WebElement CountryIreland;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Site Email']")	
	public WebElement siteEmail;
	
	@AndroidFindBy(xpath="//android.view.View[@index='8']")
	public WebElement sitePhonenumber;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@index='2']")
	public WebElement SaveSite;
	
	@AndroidFindBy(xpath="//android.view.View[@index='1']")
	public WebElement SelectSite;
	

}
