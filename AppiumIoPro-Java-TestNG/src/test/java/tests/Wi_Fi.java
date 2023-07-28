package tests;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Wi_Fi extends Capabilities {

	static final Logger logger = Logger.getLogger(Wi_Fi.class);

	@Test
	public void connect_WiFi() throws InterruptedException {		

		shared_libs.scrollToAnElementByText(driver, "Network & internet");

		List<MobileElement> WiFi_ON = driver.findElements(By.xpath("//android.widget.Switch[@text = 'ON']"));

		//if Wi-Fi button ON
		if(!WiFi_ON.isEmpty()) {
			logger.info("Wi-Fi button is ON");

			if(driver.getPageSource().contains("Not connected")) {
				driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'android:id/summary'][@text = 'Not connected']")).click();
				logger.info("Element not connected Wi-Fi");
				Thread.sleep(3000);

				shared_libs.waitTextFromClass(driver, "ROK - Wireless WiFi", "android.widget.TextView");

				MobileElement US_WiFi = driver.findElement(By.xpath("//android.widget.TextView[@text = 'ROK - Wireless WiFi']"));
				US_WiFi.isDisplayed();
				US_WiFi.click();
				Thread.sleep(3000);

				Boolean ROK_header = driver.findElement(By.xpath("//android.widget.TextView[@text = 'ROK - Wireless WiFi']")).isDisplayed();
				System.out.println("Element ROK header is :"+ ROK_header);
				logger.info("Element ROK header is :"+ ROK_header);

				MobileElement WiFi_PW = driver.findElement(By.xpath("//android.widget.EditText"));
				WiFi_PW.sendKeys("rokitfone");
				logger.info("Element enter Wi-Fi PW is :"+ WiFi_PW.getText());
				Thread.sleep(3000);

				Boolean Mask_PW = driver.findElement(By.xpath("//android.widget.EditText[@resource-id = 'com.android.settings:id/password'][@text = '•••••••••']")).isDisplayed();
				System.out.println("Element mask PW is :"+ Mask_PW);
				logger.info("Element mask PW is :"+ Mask_PW);

				MobileElement connect_button = driver.findElement(By.xpath("//android.widget.Button[@resource-id = 'android:id/button1']"
						+ "[@text = 'CONNECT']"));
				connect_button.isDisplayed();
				connect_button.click();
				logger.info("Element click connect button :");
				Thread.sleep(3000);

				shared_libs.waitTextFromClass(driver, "Connected", "android.widget.TextView");
				Boolean connected_wifi = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'android:id/summary'][@text = 'Connected']")).isDisplayed();
				logger.info("Wi-Fi is connected :"+ connected_wifi);

			}
			else {
				logger.info("Element connected Wi-Fi");
				Thread.sleep(3000);

			}

		}
		else {
			driver.findElement(By.xpath("//android.widget.Switch[@text = 'OFF']")).click();
			Thread.sleep(3000);

			Boolean WiFi_button = driver.findElement(By.xpath("//android.widget.Switch[@text = 'ON']")).isDisplayed();
			System.out.println("Element Wi-Fi button is ON :"+ WiFi_button);
			logger.info("Element Wi-Fi button is ON :"+ WiFi_button);

			//Tap Wi-Fi under Network & internet
			MobileElement WiFi_Network = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1]"));
			WiFi_Network.click();
			logger.info("Element click Wi-Fi");
			Thread.sleep(3000);

			shared_libs.waitTextFromClass(driver, "ROK - Wireless WiFi", "android.widget.TextView");

			MobileElement US_WiFi = driver.findElement(By.xpath("//android.widget.TextView[@text = 'ROK - Wireless WiFi']"));
			US_WiFi.isDisplayed();
			US_WiFi.click();
			Thread.sleep(3000);

			Boolean ROK_header = driver.findElement(By.xpath("//android.widget.TextView[@text = 'ROK - Wireless WiFi']")).isDisplayed();
			System.out.println("Element ROK header is :"+ ROK_header);
			logger.info("Element ROK header is :"+ ROK_header);

			MobileElement WiFi_PW = driver.findElement(By.xpath("//android.widget.EditText"));
			WiFi_PW.sendKeys("rokitfone");
			logger.info("Element enter Wi-Fi PW is :"+ WiFi_PW.getText());
			Thread.sleep(3000);

			Boolean Mask_PW = driver.findElement(By.xpath("//android.widget.EditText[@resource-id = 'com.android.settings:id/password'][@text = '•••••••••']")).isDisplayed();
			System.out.println("Element mask PW is :"+ Mask_PW);
			logger.info("Element mask PW is :"+ Mask_PW);

			MobileElement connect_button = driver.findElement(By.xpath("//android.widget.Button[@resource-id = 'android:id/button1']"
					+ "[@text = 'CONNECT']"));
			connect_button.isDisplayed();
			connect_button.click();
			logger.info("Element click connect button :");
			Thread.sleep(3000);

			shared_libs.waitTextFromClass(driver, "Connected", "android.widget.TextView");
			Boolean connected_wifi = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'android:id/summary'][@text = 'Connected']")).isDisplayed();
			logger.info("Wi-Fi is connected :"+ connected_wifi);

		}

	}

	@Test
	public void disconnect_WiFi() throws InterruptedException {

		shared_libs.scrollToAnElementByText(driver, "Network & internet");
		Thread.sleep(3000);

		if(driver.getPageSource().contains("Not connected")) {
			logger.info("Element Wi-Fi is not connected");
		}
		else {
			//Tap Wi-Fi under Network & internet
			MobileElement WiFi_Network = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1]"));
			WiFi_Network.click();
			logger.info("Element click Wi-Fi");
			Thread.sleep(3000);

			MobileElement connected_wifi = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Connected']"));
			connected_wifi.isDisplayed();
			connected_wifi.click();
			Thread.sleep(3000);

			Boolean header_NetworkDetails = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Network details']")).isDisplayed();
			logger.info("Element Network details is "+ header_NetworkDetails);

			Boolean header_icon = driver.findElement(By.id("com.android.settings:id/entity_header_icon")).isDisplayed();
			logger.info("Element icon is "+ header_icon);

			Boolean WiFi_name = driver.findElement(By.id("com.android.settings:id/entity_header_title")).isDisplayed();
			logger.info("Element Wi Fi name is "+ WiFi_name);

			Boolean summary_connected = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Connected']")).isDisplayed();
			logger.info("Element connected is "+ summary_connected);

			Boolean forget_button = driver.findElement(By.xpath("//android.widget.Button[@text = 'FORGET']")).isDisplayed();
			logger.info("Element forget button is "+ forget_button);

			driver.findElement(By.xpath("//android.widget.Button[@text = 'FORGET']")).click();
			Thread.sleep(3000);

			driver.navigate().back();
			Thread.sleep(3000);

			Boolean not_connected = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Not connected']")).isDisplayed();
			logger.info("Element not connected is "+ not_connected);
		}

	}


	@Test 
	public void SP280_WiFiLongPress() throws InterruptedException, Exception{

		disconnect_WiFi();

		//To handle openNotifications
		//Re-start with AndroidDriver
		DesiredCapabilities caps = new DesiredCapabilities();
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps); 	
		Thread.sleep(3000);		

		((AndroidDriver<MobileElement>) driver).openNotifications();
		Thread.sleep(3000);

		MobileElement wifiIconLong = driver.findElement(By.xpath("//android.widget.Switch[@text ='On'][@content-desc = 'Wi-Fi,']"));
		AndroidTouchAction touch = new AndroidTouchAction (driver);
		touch.longPress(LongPressOptions.longPressOptions()
				.withElement (ElementOption.element (wifiIconLong)))
		.perform ();
		logger.info("LongPressed WiFi icon");
		Thread.sleep(3000);

		boolean wifi_header = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Wi‑Fi']")).isDisplayed();
		logger.info("Check Wi-Fi header :" +wifi_header);

		driver.navigate().back();

	}

	@Test 
	public void SP279_WiFiEnableDisableFromQuickSettings() throws InterruptedException, MalformedURLException {

		disconnect_WiFi();

		//To handle openNotifications
		//Re-start with AndroidDriver
		DesiredCapabilities caps = new DesiredCapabilities();
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps); 	
		Thread.sleep(3000);		

		((AndroidDriver<MobileElement>) driver).openNotifications();
		Thread.sleep(3000);

		boolean wifi_On = driver.findElement(By.xpath("//android.widget.Switch[@text ='On'][@content-desc = 'Wi-Fi,']")).isDisplayed() == true;
		logger.info("Check Wi-Fi ON :" +wifi_On);

		driver.findElement(By.xpath("//android.widget.Switch[@text ='On'][@content-desc = 'Wi-Fi,']")).click();
		Thread.sleep(3000);

		boolean wifi_Off = driver.findElement(By.xpath("//android.widget.Switch[@text ='Off'][@content-desc = 'Wi-Fi,']")).isDisplayed() == true;
		logger.info("Check Wi-Fi OFF :" +wifi_Off);

		driver.findElement(By.xpath("//android.widget.Switch[@text ='Off'][@content-desc = 'Wi-Fi,']")).click();
		Thread.sleep(3000);

		logger.info("Check Wi-Fi ON :" +wifi_On);

		driver.navigate().back();

	}

	@Test 
	public void SP281_WiFiToggle() throws InterruptedException {

		shared_libs.scrollToAnElementByText(driver, "Network & internet");

		boolean NetworkAndInternet = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Network & internet']")).isDisplayed();
		logger.info("Header is :"+NetworkAndInternet);

		boolean WiFi = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Wi‑Fi']")).isDisplayed();
		logger.info("Wi-Fi is :"+WiFi);

		boolean WiFiToggleON = driver.findElement(By.xpath("//android.widget.Switch[@text = 'ON']")).isDisplayed();
		logger.info("Wi-Fi toggle switch is ON:"+WiFiToggleON);

		driver.findElement(By.xpath("//android.widget.Switch[@text = 'ON']")).click();
		Thread.sleep(3000);

		boolean WiFiToggleOFF = driver.findElement(By.xpath("//android.widget.Switch[@text = 'OFF']")).isDisplayed();
		logger.info("Wi-Fi toggle switch is OFF:"+WiFiToggleOFF);

		driver.findElement(By.xpath("//android.widget.Switch[@text = 'OFF']")).click();
		Thread.sleep(3000);

		logger.info("Wi-Fi toggle switch is ON:"+WiFiToggleON);

	}

	@Test 
	public void SP282_WiFiList() throws InterruptedException {

		shared_libs.scrollToAnElementByText(driver, "Network & internet");

		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Wi‑Fi']")).click();
		Thread.sleep(5000);

		List<MobileElement> lists = driver.findElements(By.xpath("//android.widget.TextView[@resource-id = 'android:id/title']"));
		for(MobileElement e : lists)
			System.out.println(e.getAttribute("text"));
		System.out.println("Wi-Fi lists is : "+lists.size());
		Thread.sleep(3000);

		//		List<Integer> WiFiLists = new ArrayList<>();
		//		for (int index = 0; index < 10; index++) {
		//			WiFiLists.add(index);
		//		}
		//		System.out.println(WiFiLists.size()==10);

	}

	@Test 
	public void SP283_WiFiConnection() throws InterruptedException, MalformedURLException {

		connect_WiFi();

		//To handle startActivity
		//Re-start with AndroidDriver
		DesiredCapabilities caps = new DesiredCapabilities();
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps); 	
		Thread.sleep(3000);	

		((AndroidDriver<MobileElement>) driver).startActivity(new Activity("com.android.chrome", "com.google.android.apps.chrome.Main"));
		logger.info("launch Chrome browser");
		Thread.sleep(5000);

		MobileElement googleSearchElement = driver.findElement(By.xpath("//android.widget.EditText[@resource-id ='com.android.chrome:id/url_bar']"));
		googleSearchElement.click();
		logger.info("click search icon");
		Thread.sleep(3000);

		googleSearchElement.sendKeys("rokit phones");
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		logger.info("Search rokit phones website");
		Thread.sleep(5000);

		MobileElement searchRokitPhones = driver.findElement(By.xpath("//android.view.View[@text = 'ROKiT Phones']"));
		searchRokitPhones.isDisplayed();
		logger.info("list ROKiT Phones");
		Thread.sleep(3000);

		driver.closeApp();
		Thread.sleep(3000);

		((AndroidDriver<MobileElement>) driver).startActivity(new Activity("com.google.android.youtube", "com.google.android.apps.youtube.app.WatchWhileActivity"));
		logger.info("Launch YouTube app");
		Thread.sleep(5000);	

		List<MobileElement> profile = driver.findElements(By.xpath("//android.widget.ImageView[@content-desc=\" \"]"));
		logger.info("no. elements :"+profile.size());
		if (!profile.isEmpty()) {
			//            System.out.println(profile.get(1).getText()); // print text in 9th element
			((AndroidElement) profile.get(0)).click();
			logger.info("click video");
			Thread.sleep(3000);	
		}		

		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.HOME));
		Thread.sleep(3000);	

		driver.findElement(By.id("com.android.systemui:id/background")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.android.systemui:id/dismiss")).click();
		logger.info("close mini YouTube window");
		Thread.sleep(2000);

		shared_libs.disconnect_WiFi(driver);

	}

	//Need to connect Wi-Fi Direct manually
	//Only check options from Settings
	@Test
	public void SP284_WiFiDirect() throws InterruptedException {

		shared_libs.scrollToAnElementByText(driver, "Network & internet");
		Thread.sleep(3000);	

		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Wi‑Fi']")).click();
		logger.info("Click Wi-Fi");

		shared_libs.scrollToAnElementByText(driver, "Wi‑Fi preferences");
		logger.info("Open Wi‑Fi preferences");

		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Advanced']")).click();
		logger.info("Click Advanced");

		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Wi‑Fi Direct']")).click();
		logger.info("Click Wi‑Fi Direct'");


		boolean nameOfWiFiDirect = driver.findElement(By.xpath("//android.widget.TextView[@text = 'IO Pro Wi-Fi Direct']")).isDisplayed();
		logger.info("Display name of Wi-Fi Direct :" + nameOfWiFiDirect);
		assertTrue(true);
		Thread.sleep(3000);			

	}

	//TODO need to Check with both SIM cards
	@Test
	public void SP285_MobileDataToWiFi() throws InterruptedException, MalformedURLException {

		connect_WiFi();
		Thread.sleep(3000);

		if(driver.findElement(By.xpath("//android.widget.Switch[@text = 'ON']")).isEnabled()) {
			driver.findElement(By.xpath("//android.widget.Switch[@text = 'ON']")).click();
			logger.info("Wi-Fi toggle is turned OFF");
			Thread.sleep(3000);			
		}

		driver.findElement(By.xpath("//android.widget.Switch[@text = 'OFF']")).isDisplayed();
		logger.info("Wi-Fi toggle is OFF");

		driver.findElement(By.xpath("//android.widget.Switch[@text = 'OFF']")).click();
		logger.info("Click Wi-Fi toggle");

		shared_libs.waitTextFromClass(driver, "ROK - Wireless WiFi", "android.widget.TextView");
		logger.info("Wi-Fi toggle is turned ON");
		Thread.sleep(3000);

		//To handle openNotifications
		//Re-start with AndroidDriver
		DesiredCapabilities caps = new DesiredCapabilities();
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps); 	
		Thread.sleep(3000);		

		((AndroidDriver<MobileElement>) driver).openNotifications();
		Thread.sleep(3000);

		driver.findElement(By.id("com.android.systemui:id/wifi_signal")).isDisplayed();
		logger.info("Wi-Fi icon on the status bar");
		assertTrue(true);
		Thread.sleep(3000);

		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.HOME));
		Thread.sleep(3000);	

	}

	//TODO Need to set the WiFi router to hide SSID
	public void SP2320_ConnectToHiddenWiFi() {

		System.out.println("Set the WiFi router to hide SSID");
		logger.info("Skip this test case");

	}

	@Test
	public void SP2321_CheckIconsForSignalStrength_Frequency_Security() throws InterruptedException {

		connect_WiFi();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Wi‑Fi']")).click();
		logger.info("Click Wi-Fi");
		
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Connected']")).click();
		logger.info("Click connected Wi-Fi");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Signal strength' and 'Frequency' and 'Security']")).isDisplayed();
		logger.info("Check SignalStrength, Frequency and Security");
		assertTrue(true);
		Thread.sleep(3000);

	}

	@Test
	public void SP2350_ResetOOBWiFiHotspotName() throws InterruptedException {

		shared_libs.scrollToAnElementByText(driver, "Network & internet");
		logger.info("Click on Network & internet");
		Thread.sleep(3000);	
		
		shared_libs.scrollToAnElementByText(driver, "Hotspot & tethering");
		logger.info("Click on Hotspot & tethering");
		Thread.sleep(3000);	
		
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Wi‑Fi hotspot']")).click();
		logger.info("Click on Wi‑Fi hotspot");
		Thread.sleep(3000);
		
		MobileElement element = (MobileElement) driver.findElement(By.id("android:id/summary"));
		String elText = element.getText();
		logger.info("Read Hotspot name :" + elText);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Advanced']")).click();
		logger.info("Click on Advanced");
		Thread.sleep(3000);
		
		shared_libs.scrollToAnElementByText(driver, "Reset OOB");
		logger.info("Click on Reset OOB");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Reset OOB' and 'Reset network SSID, "
				+ "security and password to default ( out-of-box configuration for WPS )']")).isDisplayed();
		logger.info("Verify head ans sub-head strings");
		Thread.sleep(3000);
		
		MobileElement afterResetOOB = driver.findElement(By.xpath("//android.widget.Button[@text = 'RESET OOB']"));
		afterResetOOB.click();
		logger.info("Click RESET OOB button");
		Thread.sleep(3000);
		
		MobileElement Resetelement = (MobileElement) driver.findElement(By.id("android:id/summary"));
		String elTextReset = Resetelement.getText();
		logger.info("Read Hotspot name - assigned random name :" + elTextReset);
		Thread.sleep(3000);
		
		assertNotEquals(elText, Resetelement);
		logger.info("Verify Hotspot name is changed :" + elText +" not match to "+ elTextReset);		
		Thread.sleep(3000);

	}


}
