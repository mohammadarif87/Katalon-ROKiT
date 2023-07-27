package com.mobile.keywords

import org.openqa.selenium.remote.DesiredCapabilities

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import com.kms.katalon.core.mobile.driver.MobileDriverType

public class ApplicationBehavior {

	DesiredCapabilities dc = new DesiredCapabilities();

	@Keyword
	def startInstalledApplication(String mobileType, Map deviceInformation, String appPackage, String appActivity) {
		dc.setCapability("appPackage", appPackage);
		dc.setCapability("appActivity", appActivity);
		dc.setCapability("newCommandTimeout", 120);
		deviceInformation.each{ key, value ->
			dc.setCapability("${key}", "${value}");
		}
		if (mobileType == "Android"){
			AppiumDriverManager.createMobileDriver(MobileDriverType.ANDROID_DRIVER, dc, new URL("http://localhost:4723/wd/hub"));
		}
		else if (mobileType == "iOS") {
			AppiumDriverManager.createMobileDriver(MobileDriverType.IOS_DRIVER, dc, new URL("http://localhost:4723/wd/hub"));
		}
	}
}
