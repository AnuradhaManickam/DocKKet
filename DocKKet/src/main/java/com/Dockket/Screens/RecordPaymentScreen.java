package com.Dockket.Screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RecordPaymentScreen extends BaseScreen {
	
	public RecordPaymentScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@index='2']")
	public WebElement AddBtnDashboard;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc='Record Payment']")
	public WebElement recordPayment;
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@index='0']")
	public WebElement PaymentRadioBtn;
	
	@AndroidFindBy(xpath="//android.view.View[@index='4']")
	public WebElement Date;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='OK']")	
	public WebElement Ok;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Supplier']")			
	public WebElement SupplierNamePayment;
	
	@AndroidFindBy(xpath="//android.view.View[@index='0']")	
	public WebElement SelectSupplierNamePayment;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Amount']")		
	public WebElement AddAmount;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Payment Method']")		
	public WebElement PaymentMethod;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc='Cash']")
	public WebElement ChooserecordPayment;
	
	@AndroidFindBy(xpath="//android.widget.Button[@index='17']")
	public WebElement UploadDocument;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc='Capture Image']")	
	public WebElement Camera;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc='Take picture']")	
	public WebElement takePicture;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='OK']")	
	public WebElement Ok1;
		
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Crop']")
	public WebElement saveImage;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Complete']")
	public WebElement complete;
	
	@AndroidFindBy(xpath="//android.widget.Button[@index='3']")
	public WebElement SaveDocument;
	

}
