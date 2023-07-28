package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Airplane_Mode extends Capabilities {

	static final Logger logger = Logger.getLogger(Airplane_Mode.class);

	@Test
	public void SP168_AeroplaneModeOn() throws InterruptedException, MalformedURLException {

		shared_libs.disconnect_WiFi(driver);

		driver.navigate().back();

		List<MobileElement> AirplaneModeIsON = driver.findElements(By.xpath("//android.widget.TextView[@text = 'Airplane mode is on']"));

		if(!AirplaneModeIsON.isEmpty()) {
			logger.info("Airplane mode is on");
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Airplane mode is on']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.Button[@text = 'TURN OFF'][@resource-id = 'com.android.settings:id/first_action']")).click();
			Thread.sleep(3000);
		}

		shared_libs.scrollToAnElementByText(driver, "Network & internet");

		Boolean Advanced = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Advanced']")).isDisplayed();
		logger.info("Element Advanced is :" + Advanced);

		Boolean SubText = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Airplane mode, VPN, Private DNS']")).isDisplayed();
		logger.info("Element Sub strings is :" + SubText);

		MobileElement AdvancedClick = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Airplane mode, VPN, Private DNS']"));
		logger.info("Element Advanced is clicked");
		AdvancedClick.click();
		Thread.sleep(3000);

		Boolean AirplaneMode = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Airplane mode']")).isDisplayed();
		logger.info("Element Airplane Mode is :" + AirplaneMode);

		Boolean AirplaneModeOFF = driver.findElement(By.xpath("//android.widget.Switch[@text = 'OFF'][@resource-id = 'android:id/switch_widget']")).isDisplayed();
		logger.info("Element Airplane Mode is OFF by default:" + AirplaneModeOFF);

		MobileElement AirplaneModeSwitch = driver.findElement(By.xpath("//android.widget.Switch[@text = 'OFF'][@resource-id = 'android:id/switch_widget']"));
		logger.info("Element Airplane Mode is clicked");
		AirplaneModeSwitch.click();
		Thread.sleep(3000);

		//Step #1: Confirm airplane mode is switched on
		Boolean AirplaneModeON = driver.findElement(By.xpath("//android.widget.Switch[@text = 'ON'][@resource-id = 'android:id/switch_widget']")).isDisplayed();
		logger.info("Element Airplane Mode is ON :" + AirplaneModeON);

		//Step #2: Confirm mobile data and GSM connecton is not available
		Boolean MobileNetwork = !driver.findElement(By.xpath("//android.widget.TextView[@text = 'Mobile network']")).isEnabled();
		logger.info("Confrim mobile data and GSM connecton is not available :" + MobileNetwork);

		driver.navigate().back();

		Boolean AirplaneModeON_MSG = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Airplane mode is on']")).isDisplayed();
		logger.info("Element Airplane Mode is ON under Settings menu :" + AirplaneModeON_MSG);
		Thread.sleep(3000);

		//Step #3: Confirm WiFi can be enabled and connected.
		shared_libs.connect_WiFi(driver, "MySpectrumWiFi20-2G", "modernlight945");
		logger.info("Confrim WiFi can be enabled and connected.");
		Thread.sleep(3000);	

	}

	@Test
	public void SP169_AeroplaneModeOff() throws InterruptedException {

		shared_libs.disconnect_WiFi(driver);

		driver.navigate().back();

		List<MobileElement> AirplaneModeIsON = driver.findElements(By.xpath("//android.widget.TextView[@text = 'Airplane mode is on']"));

		if(!AirplaneModeIsON.isEmpty()) {
			logger.info("Airplane mode is on");
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Airplane mode is on']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.Button[@text = 'TURN OFF'][@resource-id = 'com.android.settings:id/first_action']")).click();
			Thread.sleep(3000);
		}

		shared_libs.scrollToAnElementByText(driver, "Network & internet");

		Boolean Advanced = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Advanced']")).isDisplayed();
		logger.info("Element Advanced is :" + Advanced);

		Boolean SubText = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Airplane mode, VPN, Private DNS']")).isDisplayed();
		logger.info("Element Sub strings is :" + SubText);

		MobileElement AdvancedClick = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Airplane mode, VPN, Private DNS']"));
		logger.info("Element Advanced is clicked");
		AdvancedClick.click();
		Thread.sleep(3000);

		Boolean AirplaneMode = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Airplane mode']")).isDisplayed();
		logger.info("Element Airplane Mode is :" + AirplaneMode);

		//Step #1: Confirm airplane mode is switched off.
		Boolean AirplaneModeOFF = driver.findElement(By.xpath("//android.widget.Switch[@text = 'OFF'][@resource-id = 'android:id/switch_widget']")).isDisplayed();
		logger.info("Element Airplane Mode is OFF by default:" + AirplaneModeOFF);

		//Step #2: Confirm mobile data and GSM connecton is available.
		Boolean MobileNetwork = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Mobile network']")).isEnabled();
		logger.info("Confrim mobile data and GSM connecton is not available :" + MobileNetwork);

		//Step #3: Confirm WiFi can be enabled and connected.
		shared_libs.connect_WiFi(driver, "MySpectrumWiFi20-2G", "modernlight945");
		logger.info("Confrim WiFi can be enabled and connected.");
		Thread.sleep(3000);

	}

	@Test
	public void AirplaneModeOnOffFromQuickSettings() throws InterruptedException, MalformedURLException {
		
		//If airplane mode is ON
		List<MobileElement> AirplaneModeIsON = driver.findElements(By.xpath("//android.widget.TextView[@text = 'Airplane mode is on']"));

		if(!AirplaneModeIsON.isEmpty()) {
			logger.info("Airplane mode is on");
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Airplane mode is on']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.Button[@text = 'TURN OFF'][@resource-id = 'com.android.settings:id/first_action']")).click();
			Thread.sleep(3000);
		}
		
		shared_libs.disconnect_WiFi(driver);

		//To handle openNotifications
		//Re-start with AndroidDriver
		DesiredCapabilities caps = new DesiredCapabilities();
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps); 	
		Thread.sleep(3000);		

		((AndroidDriver<MobileElement>) driver).openNotifications();
		Thread.sleep(3000);
		
		shared_libs.verticalSwipeByPercentages(driver, 0.1,0.9,0.5);

		List<MobileElement> quickSetting_airplaneON = driver.findElements(By.xpath("//android.widget.Switch[@text ='On']"
				+ "[@content-desc = 'Airplane mode']"));
		
		if(!quickSetting_airplaneON.isEmpty()) {
			driver.findElement(By.xpath("//android.widget.Switch[@text ='On'][@content-desc = 'Airplane mode']")).click();
			Thread.sleep(3000);	
			
			boolean airplaneOFF = driver.findElement(By.xpath("//android.widget.Switch[@text ='Off']"
					+ "[@content-desc = 'Airplane mode']")).isDisplayed();
			logger.info("Airplane switch is OFF :" +airplaneOFF);
		}
		boolean airplaneOFF = driver.findElement(By.xpath("//android.widget.Switch[@text ='Off']"
				+ "[@content-desc = 'Airplane mode']")).isDisplayed();
		logger.info("Airplane switch is OFF :" +airplaneOFF);
		
		MobileElement airplaneOFF_clickIcon = driver.findElement(By.xpath("//android.widget.Switch[@text ='Off']"
				+ "[@content-desc = 'Airplane mode']"));
		airplaneOFF_clickIcon.click();
		Thread.sleep(5000);
		
		boolean SPN_airplaneMode = driver.findElement(By.xpath("//android.widget.TextView[@text ='Airplane mode']"
				+ "[@resource-id = 'com.android.systemui:id/qs_carrier_text']")).isDisplayed();
		logger.info("SPN - Airplane mode :" +SPN_airplaneMode);
		
		boolean airplaneON = driver.findElement(By.xpath("//android.widget.Switch[@text ='On']"
				+ "[@content-desc = 'Airplane mode']")).isDisplayed();
		logger.info("Airplane switch is ON :" +airplaneON);
		
		MobileElement airplaneON_clickIcon = driver.findElement(By.xpath("//android.widget.Switch[@text ='On']"
				+ "[@content-desc = 'Airplane mode']"));
		airplaneON_clickIcon.click();
		Thread.sleep(3000);
		
		shared_libs.waitTextFromClass(driver, "T-MOBILE — AT&T", "android.widget.TextView");
		
		boolean SPN_carrier = driver.findElement(By.xpath("//android.widget.TextView[@text ='T-MOBILE — AT&T']"
				+ "[@resource-id = 'com.android.systemui:id/qs_carrier_text']")).isDisplayed();
		logger.info("SPN - carrier name :" +SPN_carrier);
		
		logger.info("Airplane switch is OFF :" +airplaneOFF);
		Thread.sleep(3000);
		
		shared_libs.verticalSwipeByPercentages(driver, 0.9,0.1,0.5);
		driver.navigate().back();
		Thread.sleep(3000);

	}

}
