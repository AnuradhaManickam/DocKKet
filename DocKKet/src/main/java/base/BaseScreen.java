package base;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseScreen {
	
	public AppiumDriver<MobileElement> driver;
	public WebDriverWait wait;
	
	public BaseScreen(AppiumDriver<MobileElement> driver) {
		
		this.driver=driver;
		
	}
	
	

}
