package com.Dockket.Functions;

import java.util.concurrent.TimeUnit;

import com.Dockket.Screens.DeliveryNoteScreen;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class DeliveryNoteFunctions extends BaseScreen {
	
	public DeliveryNoteFunctions(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	public void newDocumentFunctionality() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(15L,TimeUnit.SECONDS);
		
		DeliveryNoteScreen Deliverynote = new DeliveryNoteScreen (driver);
		
		Deliverynote.SelectSupplier.click();
		
		Deliverynote.AddDocumentButton.click();
		
		Deliverynote.UploadDocument.click();
		
		Deliverynote.Camera.click();

		Deliverynote.takePicture.click();

		Deliverynote.Ok.click();

		Deliverynote.saveImage.click();
		
		Deliverynote.complete.click();

		Deliverynote.DocumentType.click();
		
		Thread.sleep(3000);

		Deliverynote.DocumentTypeDeliveryNote.click();
		
		Deliverynote.SupplierNameDeliveryNote.click();
		
		Thread.sleep(8000);
		
		Deliverynote.SelectSupplierNameDeliveryNote.click();

		Deliverynote.SaveDocument.click();
		
		Deliverynote.DeliverynoteTile.click();
		
		driver.navigate().back();
		
		driver.navigate().back();
		
	}


}
