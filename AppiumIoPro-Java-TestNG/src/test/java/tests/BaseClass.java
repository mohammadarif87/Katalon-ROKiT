package tests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup()
	{
	try	{
			DesiredCapabilities dc = new DesiredCapabilities();

			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "IO Pro");
			dc.setCapability(MobileCapabilityType.UDID, "IOPRO0123456789A");
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
			dc.setCapability("appPackage", "com.android.settings");
			dc.setCapability("appActivity", ".Settings");

			URL url = new URL("http://0.0.0.0:4723/wd/hub");

			driver = new AppiumDriver<MobileElement>(url, dc);

		}catch(Exception exp){
			System.out.println("Cause is: " + exp.getCause());
			System.out.println("Message is: " +	exp.getMessage());
			exp.printStackTrace();
		}
	}
	
//	@Test
//	public void sampleTest()
//	{
//		System.out.println("I am inside sample Test");
//	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver.quit();
	}

}
