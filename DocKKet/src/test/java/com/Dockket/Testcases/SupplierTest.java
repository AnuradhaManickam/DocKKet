package com.Dockket.Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Dockket.Functions.SupplierFunctions;

import mobileSetUp.AndroidProperties;

public class SupplierTest extends AndroidProperties {
	
	@Test(description = "Verify that a user is able to create supplier using valid Data"  , priority = 6)	
	public void addSupplierScreenTests() throws IOException {

		SupplierFunctions  funcall = new  SupplierFunctions(driver);
		funcall.AddSupplierFunctionality();

		System.out.println("succesfully created supplier");
	}

}
