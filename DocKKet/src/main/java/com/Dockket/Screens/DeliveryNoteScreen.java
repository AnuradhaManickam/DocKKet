package com.Dockket.Screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DeliveryNoteScreen extends BaseScreen {
	
	public DeliveryNoteScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath="//android.view.View[@index='0']")
	public WebElement SelectSupplier;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Speed Dial']")
	public WebElement AddDocumentButton;
	
	@AndroidFindBy(xpath="//android.widget.Button[@index='17']")
	public WebElement UploadDocument;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc='Capture Image']")	
	public WebElement Camera;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc='Take picture']")	
	public WebElement takePicture;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Ok']")	
	public WebElement Ok;
		
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Crop']")
	public WebElement saveImage;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Complete']")
	public WebElement complete;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Document Type']")	
	public WebElement DocumentType;
	
	@AndroidFindBy(xpath="//android.view.View[@index='2']")	
	public WebElement DocumentTypeDeliveryNote;

	@AndroidFindBy(xpath="//android.view.View[@text='Supplier']")		
	public WebElement SupplierNameDeliveryNote;
	
	@AndroidFindBy(xpath="//android.view.View[@index='0']")	
	public WebElement SelectSupplierNameDeliveryNote;
	
	@AndroidFindBy(xpath="//android.view.View[@index='2']")	
	public WebElement DocDateDocumentType;
	
	@AndroidFindBy(xpath="//android.widget.Button[@index='6']")
	public WebElement CalenderOk;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@index='3']")
	public WebElement ReffDeliveryNote;
	

	@AndroidFindBy(xpath="//android.widget.Button[@index='3']")
	public WebElement SaveDocument;
	
	
	@AndroidFindBy(xpath="//android.view.View[@index='2']")
	public WebElement DeliverynoteTile;
	
	

}
