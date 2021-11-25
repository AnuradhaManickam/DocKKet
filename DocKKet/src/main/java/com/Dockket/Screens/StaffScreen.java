package com.Dockket.Screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StaffScreen extends BaseScreen {
	
	public StaffScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc='Tab 5 of 5']")
	public WebElement SideNavigator;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc='Staff']")
	public WebElement SideNavigatorStaff;
	
	@AndroidFindBy(xpath="//android.widget.Button[@index='3']")
	public WebElement StaffAddButton;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@index='0']")
	public WebElement StaffEmail;       	
	
	@AndroidFindBy(xpath="//android.view.View[@text='Role']")
	public WebElement ViewStaffRole;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc='STAFF']")
	public WebElement SelectStaffRole;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@index='2']")
	public WebElement SaveStaff;

}
