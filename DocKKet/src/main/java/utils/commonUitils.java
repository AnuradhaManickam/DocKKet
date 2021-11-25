package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class commonUitils {
	
	public static Logger logger;
	
	public enum ProjectConst {
		EXCEPTIONTEXT("**** Exception Occurred ****"),
		ELEMENTNOTFOUNDEXCEPTIONTXT("**** Element Not Found or Xpath String passed in null ****"),
		EXCEPTIONTEXTMETHOD("**** Exception Occurred in the Method ****"), VALUE(" ======> ");

		private String msg;

		ProjectConst(String s) {
			msg = s;
		}

		public String getMsg() {
			return msg;
		}
	}
	
	public static synchronized boolean clickByXpath(WebElement elementToClick, RemoteWebDriver driver) throws Exception {
		boolean status = false;
		try {
			elementToClick.click();
			status = true;
			
		} catch (Exception e) {
			logger.error(ProjectConst.EXCEPTIONTEXTMETHOD.getMsg() + "\n"
					+ ProjectConst.ELEMENTNOTFOUNDEXCEPTIONTXT.getMsg(), e);
			
			throw e;
		}
		return status;
	}
	
	public static synchronized void inputTextByXpathWithOutClear(WebElement element, String text,
			String storeVar, RemoteWebDriver driver) {
		try {
			logger.info("Input by xpath");
			element.sendKeys(text);
			
		} catch (Exception e) {
			logger.error(ProjectConst.EXCEPTIONTEXTMETHOD.getMsg() + " " + "inputTextByXpath", e);
		
	}

	}
}
