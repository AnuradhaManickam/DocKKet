package com.Dockket.Screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginScreen extends BaseScreen {
	
	public LoginScreen(AppiumDriver<MobileElement> driver) {
		super(driver);

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}	

	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Email ID']")
	public WebElement LoginEmailField;

	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Next']")
	public WebElement LoginNextBtn;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Password']")
	public WebElement LoinPassword;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Log In']")
	public WebElement LoginButton;


}
