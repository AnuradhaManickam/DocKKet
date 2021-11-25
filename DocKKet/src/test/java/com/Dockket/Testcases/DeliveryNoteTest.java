package com.Dockket.Testcases;

import org.testng.annotations.Test;

import com.Dockket.Functions.DeliveryNoteFunctions;

import mobileSetUp.AndroidProperties;

public class DeliveryNoteTest extends AndroidProperties {
	
	@Test(description =  "Verify that the user is able to add new deliverynote document" , priority = 7, invocationCount = 1)
	public void newDocumemntTest() throws InterruptedException {
				
		DeliveryNoteFunctions funcall = new DeliveryNoteFunctions(driver);
		funcall.newDocumentFunctionality();
		
		System.out.println("succesfully added document");
		
	}
	

}