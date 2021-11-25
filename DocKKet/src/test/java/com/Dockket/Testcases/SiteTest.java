package com.Dockket.Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Dockket.Functions.SiteFunction;

import mobileSetUp.AndroidProperties;

public class SiteTest extends AndroidProperties {
	
	
	@Test(description = "Verify that a user can create Site using valid Data" , priority = 4)
	public void addSiteScreenTests() throws IOException {

		SiteFunction  funcall = new  SiteFunction(driver);
		funcall.addSiteScreenFunctionality();

		System.out.println("succesfully created Site");
	}

}
