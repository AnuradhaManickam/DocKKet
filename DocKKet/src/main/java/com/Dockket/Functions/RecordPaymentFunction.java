package com.Dockket.Functions;

import java.util.concurrent.TimeUnit;
import com.Dockket.Screens.RecordPaymentScreen;
import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class RecordPaymentFunction extends BaseScreen {

	public RecordPaymentFunction(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	public void RecordPaymentFunctionality() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		
		RecordPaymentScreen recordPayment = new RecordPaymentScreen(driver);
		
		recordPayment.AddBtnDashboard.click();
		
		recordPayment.recordPayment.click();
		
		recordPayment.PaymentRadioBtn.click();
		
		recordPayment.Date.click();
		
		recordPayment.Ok.click();
		
		recordPayment.SupplierNamePayment.click();
		
		recordPayment.AddAmount.click();
		
		recordPayment.PaymentMethod.click();
		
		recordPayment.ChooserecordPayment.click();
		
		recordPayment.UploadDocument.click();
		
		recordPayment.Camera.click();

		recordPayment.takePicture.click();

		recordPayment.Ok1.click();

		recordPayment.saveImage.click();
		
		recordPayment.complete.click();

		
		
	}
	
}

