package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Sign_out_Gmail {

	public AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException {

		DesiredCapabilities caps = new DesiredCapabilities();

		//caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "IO Pro");
		caps.setCapability(MobileCapabilityType.UDID, "IOPRO3D105120");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.settings");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.settings.Settings");
		caps.setCapability(MobileCapabilityType.NO_RESET, true);
		//caps.setCapability("locationServicesAuthorized", true);
		//caps.setCapability("locationServicesEnabled", true);

		driver = new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	

		Thread.sleep(3000);
	}
	
	@Test
	public void Remove_Google_Account() throws InterruptedException {
		
		scrollToAnElementByText("Accounts");
		Thread.sleep(3000);		
		
		List<MobileElement> signedIn = driver.findElements(By.xpath("//android.widget.TextView[@resource-id = 'android:id/title']"
				+ "[@text = 'rokitphones715@gmail.com']"));
		
		if (!signedIn.isEmpty()) {
			MobileElement signedInClick = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'android:id/title']"
					+ "[@text = 'rokitphones715@gmail.com']"));
			signedInClick.click();
			Thread.sleep(3000);
			
			Boolean header = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Google']")).isDisplayed();
			System.out.println("Element Google header is :"+ header);
			
			Boolean verifyAccount = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.android.settings:id/"
					+ "entity_header_title'][@text = 'rokitphones715@gmail.com']")).isDisplayed();
			System.out.println("Element verify account is :"+ verifyAccount);
			
			Boolean GoogleAccount = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'android:id/title']"
					+ "[@text = 'Google Account']")).isDisplayed();
			System.out.println("Element Google Accountis :"+ GoogleAccount);
			
			Boolean AccountSync = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'android:id/title']"
					+ "[@text = 'Account sync']")).isDisplayed();
			System.out.println("Element Account sync is :"+ AccountSync);
			
			MobileElement REMOVEACCOUNT = driver.findElement(By.xpath("//android.widget.Button[@resource-id = "
					+ "'com.android.settings:id/button'][@text = 'REMOVE ACCOUNT']"));
			REMOVEACCOUNT.click();
			Thread.sleep(3000);
			
			boolean RemoveAccount = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'android:id/alertTitle']"
					+ "[@text = 'Remove account?']")).isDisplayed();
			System.out.println("Element Remove account? is :"+ RemoveAccount);
			
			boolean message = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'android:id/message']"
					+ "[@text = 'Removing this account will delete all of its messages, contacts, and other data from the phone!']")).isDisplayed();
			System.out.println("Element message is :"+ message);
			
			boolean CANCEL = driver.findElement(By.xpath("//android.widget.Button[@resource-id = 'android:id/button2']"
					+ "[@text = 'CANCEL']")).isDisplayed();
			System.out.println("Element CANCEL is :"+ CANCEL);
			
			boolean REMOVE_ACCOUNT = driver.findElement(By.xpath("//android.widget.Button[@resource-id = 'android:id/button1']"
					+ "[@text = 'REMOVE ACCOUNT']")).isDisplayed();
			System.out.println("Element REMOVE ACCOUNT is :"+ REMOVE_ACCOUNT);
			
			MobileElement removeAccountButton = driver.findElement(By.xpath("//android.widget.Button[@resource-id = 'android:id/button1']"
					+ "[@text = 'REMOVE ACCOUNT']"));
			removeAccountButton.click();			
			Thread.sleep(5000);
			
			Boolean verifyRemoveAccount = driver.findElements(By.xpath("//android.widget.TextView[@resource-id = 'com.android.settings:id/"
					+ "entity_header_title'][@text = 'rokitphones715@gmail.com']")).isEmpty();
			System.out.println("Element Verify NO signed account is :"+ verifyRemoveAccount);
		}
		
		else {
			System.out.println("No signed Gmail account");
		}
		
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
	
	//////###########################################################
	//////##################### FUNCTIONS ###########################
    //////###########################################################
	
	public void scrollToAnElementByText(String text) {
		MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector())" +
				".scrollIntoView(new UiSelector().text(\"" + text + "\"));"));
		element.click();
	}
	
}
