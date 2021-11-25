package com.Dockket.Testcases;

import org.testng.annotations.Test;
import com.Dockket.Functions.RecordPaymentFunction;

import mobileSetUp.AndroidProperties;

public class RecordPaymentTest extends AndroidProperties {
	
	@Test(description =  "Verify that the user is able to add new RecordPayment document" , priority = 9, invocationCount = 1)
	public void newDocumemntTest() throws InterruptedException {
				
		RecordPaymentFunction funcall = new RecordPaymentFunction(driver);
		funcall.RecordPaymentFunctionality();
		
		System.out.println("succesfully added document");
		
	}

}
