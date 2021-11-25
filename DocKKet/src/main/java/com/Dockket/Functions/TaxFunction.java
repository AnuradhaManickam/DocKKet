package com.Dockket.Functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;

import com.Dockket.Screens.TaxScreen;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TaxFunction extends BaseScreen {

	public TaxFunction(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	public void newTaxFunctionality() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		
		TaxScreen tax = new TaxScreen (driver);
		
		tax.SideNavigator.click();
		
		tax.Settings.click();
		
		tax.Tax.click();
		
		tax.AddTax.click();
		
		tax.AddTaxPercent.click();
		
		Actions action1 = new Actions(driver);
		action1.sendKeys("9").perform();
		
		tax.SaveTax.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);

		driver.navigate().back();

		
		
	}	
}
