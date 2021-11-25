package com.Dockket.Functions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.interactions.Actions;
import com.Dockket.Screens.SupplierScreen;
import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class SupplierFunctions extends BaseScreen {
	
	public SupplierFunctions(AppiumDriver<MobileElement> driver) {
		super(driver);
		
	}

	InputStream inputStream;


	public void AddSupplierFunctionality() throws IOException {

		// ----------------------properties setup---------------------------
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";

			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}

			// ----------------------creating a new supplier----------------------------		

			SupplierScreen AddSupplier = new SupplierScreen(driver);

			AddSupplier.SideNavigator.click();

			AddSupplier.SupplierSideNavigator.click();

			AddSupplier.AddSupplierButton.click();

			AddSupplier.SupplierName.click();

			Actions supplierName = new Actions(driver);
			supplierName.sendKeys(prop.getProperty("supplierName")).perform();

			AddSupplier.SupplierReff.click();

			Actions supplierAccRef = new Actions(driver);
			supplierAccRef .sendKeys(prop.getProperty("suplierAccRef")).perform();

			AddSupplier.PaymentTerms.click();			

			AddSupplier.Net7.click();

			AddSupplier.SupplierAddress1.click();

			Actions supplierAddress1= new Actions(driver);
			supplierAddress1.sendKeys(prop.getProperty("supplierAddress1")).perform();

			AddSupplier.SupplierAddress2.click();

			Actions supplierAddress2= new Actions(driver);
			supplierAddress2.sendKeys(prop.getProperty("supplierAddress2")).perform();

			AddSupplier.SupplierCity.click();

			Actions supplierCity= new Actions(driver);
			supplierCity.sendKeys(prop.getProperty("supplierCity")).perform();


			AddSupplier.SupplierState.click();

			Actions supplierState= new Actions(driver);
			supplierState.sendKeys(prop.getProperty("supplierState")).perform();		 

			AddSupplier.SupplierPostCode.click();

			Actions supplierPostal= new Actions(driver);
			supplierPostal.sendKeys(prop.getProperty("supplierPostcode")).perform();

			AddSupplier.SupplierCountry.click();

			AddSupplier.CountryIreland.click();

			AddSupplier.SupplierInvoiceBy.click();
			
			Thread.sleep(3000);

			AddSupplier.InvoiceBySupplierName.click();

			//AddSupplier.siteEmail.click();	

			//Actions action7 = new Actions(driver);
			//action7.sendKeys(prop.getProperty("siteEmail")).perform();                 // cursor issue on add site screen

			//AddSupplier.sitePhonenumber.click();

			//Actions action8 = new Actions(driver);
			//action8.sendKeys(prop.getProperty("sitePhonenumber")).perform();

			AddSupplier.SupplierSave.click();

			Thread.sleep(6000);


		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}		

	}
	public void successfulAddSupplierScreenSetup() throws IOException {

		SupplierFunctions properties  = new SupplierFunctions(driver);
		properties.AddSupplierFunctionality();

	}


}
