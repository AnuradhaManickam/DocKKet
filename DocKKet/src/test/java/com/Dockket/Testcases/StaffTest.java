package com.Dockket.Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Dockket.Functions.StaffFunctions;

import mobileSetUp.AndroidProperties;

public class StaffTest extends AndroidProperties {

	@Test(description = "Verify that a user can add staff usinfg valid credentials" , priority = 5)
	public void addStaffScreenTest() throws IOException {
				
		StaffFunctions funcall = new StaffFunctions(driver);
		funcall.addStaffScreenFunctionality();
		
		System.out.println("succesfully added staff using valid credential");
		
	}

	
}
