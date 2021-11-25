package mobileSetUp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;


import io.appium.java_client.service.local.AppiumDriverLocalService;


public class AndroidProperties {
	
	InputStream inputStream;
	
	public static Logger logger;

	public static AppiumDriver<MobileElement> driver;
	
	public static AppiumDriverLocalService service;
	
	
	public void getPropValues() throws IOException {
		
		 logger = Logger.getLogger("DocKKet");

	      Properties props = new Properties();
	      props.load(new FileInputStream("C:\\Users\\Pirai\\Desktop\\DocKKetSmokeTesting\\DocKKet\\src\\test\\resources\\log4j.properties"));
	      PropertyConfigurator.configure(props);

		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";

			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
			
		
			// get the property value and print it out

			DesiredCapabilities caps = new DesiredCapabilities();

			caps.setCapability(CapabilityType.PLATFORM_NAME, prop.getProperty("platformName") );
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, prop.getProperty("PLATFORM_VERSION") );
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty("DEVICE_NAME") );
			caps.setCapability(MobileCapabilityType.UDID, prop.getProperty("UDID") );
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 200);
			caps.setCapability("appPackage", prop.getProperty("appPackage"));
			caps.setCapability("appActivity", prop.getProperty("appActivity"));
			caps.setCapability("noReset", "true");

			URL url = new URL(prop.getProperty("appium.server.url"));

			driver = new AppiumDriver<MobileElement>(url, caps);

			driver.resetApp();   

			logger.info("Mobile Setup completed");
		
					

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
	}

	public static AppiumDriver<MobileElement> caps() throws IOException {
		
		AndroidProperties properties = new AndroidProperties();
		properties.getPropValues();		
		return driver;

	}
	
	
}



