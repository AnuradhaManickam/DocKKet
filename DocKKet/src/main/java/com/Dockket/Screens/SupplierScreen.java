package com.Dockket.Screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SupplierScreen extends BaseScreen {

	public SupplierScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc='Tab 5 of 5']")
	public WebElement SideNavigator;

	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc='Supplier']")
	public WebElement SupplierSideNavigator;

	@AndroidFindBy(xpath="//android.widget.Button[@index='12']")
	public WebElement AddSupplierButton;

	@AndroidFindBy(xpath="//android.widget.EditText[@index='1']")
	public WebElement SupplierName;

	@AndroidFindBy(xpath="//android.widget.EditText[@index='2']")
	public WebElement SupplierReff;

	@AndroidFindBy(xpath="//android.view.View[@index='3']")
	public WebElement PaymentTerms;

	@AndroidFindBy(xpath="//android.view.View[@index='2']")
	public WebElement Net7;

	@AndroidFindBy(xpath="//android.widget.EditText[@text='Address 1']")
	public WebElement SupplierAddress1;

	@AndroidFindBy(xpath="//android.widget.EditText[@text='Address 2']")
	public WebElement SupplierAddress2;

	@AndroidFindBy(xpath="//android.widget.EditText[@text='City']")
	public WebElement SupplierCity;

	@AndroidFindBy(xpath="//android.widget.EditText[@text='State / County']")
	public WebElement SupplierState;

	@AndroidFindBy(xpath="//android.widget.EditText[@text='Postcode']")	
	public WebElement SupplierPostCode;

	@AndroidFindBy(xpath="//android.view.View[@text='Country']")
	public WebElement SupplierCountry;

	@AndroidFindBy(xpath="//android.view.View[@content-desc='IRELAND']")	
	public WebElement CountryIreland;

	@AndroidFindBy(xpath="//android.view.View[@text='Invoice By']")
	public WebElement SupplierInvoiceBy;

	@AndroidFindBy(xpath="//android.view.View[@index='0']")
	public WebElement InvoiceBySupplierName;

	@AndroidFindBy(xpath="//android.widget.EditText[@text='Site Email']")	
	public WebElement siteEmail;

	@AndroidFindBy(xpath="//android.view.View[@index='8']")
	public WebElement sitePhonenumber;

	@AndroidFindBy(xpath="//android.widget.ImageView[@index='2']")
	public WebElement SupplierSave;

}



