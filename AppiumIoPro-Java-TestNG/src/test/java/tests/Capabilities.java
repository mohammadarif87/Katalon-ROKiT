package tests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {

	AppiumDriver<MobileElement> driver;
//	AndroidDriver<MobileElement> driver;

//	@BeforeClass
	@BeforeTest
	public void IO_Pro_Settings_Setup() throws InterruptedException, IOException {
		
		system_shared_libs.startServer();

		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "IO Pro");
		caps.setCapability(MobileCapabilityType.UDID, "IOPRO0123456789A");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.settings");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.settings.Settings");
		caps.setCapability(MobileCapabilityType.NO_RESET, true);
		//caps.setCapability("locationServicesAuthorized", true);
		//caps.setCapability("locationServicesEnabled", true);

		driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
//		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
	}
	

//	@AfterClass
	@AfterTest
	public void afterTest() {
//		driver.resetApp();
		driver.quit();
		system_shared_libs.stopServer();
	}

}

