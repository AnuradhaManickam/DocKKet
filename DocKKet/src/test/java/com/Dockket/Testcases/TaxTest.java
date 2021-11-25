package com.Dockket.Testcases;

import org.testng.annotations.Test;

import com.Dockket.Functions.TaxFunction;

import mobileSetUp.AndroidProperties;

public class TaxTest extends AndroidProperties {
	
	@Test(description =  "Verify that the user is able to add Tax" , priority = 8, invocationCount = 1)
	public void AddTaxTest() throws InterruptedException {
				
		TaxFunction funcall = new TaxFunction(driver);
		funcall.newTaxFunctionality();
		
		System.out.println("succesfully added document");
		
	}

}
