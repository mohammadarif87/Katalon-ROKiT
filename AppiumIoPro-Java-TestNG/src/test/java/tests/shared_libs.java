package tests;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class shared_libs {

	static AppiumDriver<MobileElement> driver;

	static final Logger logger = Logger.getLogger(shared_libs.class);

	public static void scrollToAnElementByText(AppiumDriver<MobileElement> driver, String text) {

		MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector())" +
				".scrollIntoView(new UiSelector().text(\"" + text + "\"));"));
		element.click();
	}

	//vertical scrolling
	//driver.findElements(By.id("android:id/title")).get(3).click(); //identify views(index) and click on it

	//ex. waitTextFromClass("Settings", "android.widget.TextView");
	public static void waitTextFromClass(AppiumDriver<MobileElement> driver,String text, String myClass) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//"+myClass+"[@text='"+text+"']")));
		MobileElement element = driver.findElement(By.xpath("//"+myClass+"[@text='"+text+"']"));
		element.isDisplayed();;

		System.out.println(text);
	}

	//capturing all teh list items
	//MobileElement list = driver.findElement(By.id("android:id/title"));

	//scrolling down till get the element
	//		MobileElement listitem = (MobileElement )driver
	//				.findElement(MobileBy.AndroidUIAutomator(
	//				"new UiScrollable(new uiSelector()). scrollIntoView("
	//					+ "new UiSelector().text(\"Accounts\"));"));
	////		
	//		System.out.println(listitem.getLocation());
	//		listitem.click();

	//		MobileElement elementToClick = (MobileElement) driver
	//			    .findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()"
	//			        + ".resourceId(\"android:id/title\")).scrollIntoView("
	//			        + "new UiSelector().text(\"Accounts\"));"));
	//			elementToClick.click();


	public static void Click_ALLOW(AppiumDriver<MobileElement> driver) {
		MobileElement element = driver.findElement(By.xpath("//android.widget.Button[@text = 'ALLOW'][@resource-id = 'com.android.packageinstaller:id/permission_allow_button']"));
		element.click();
	}

	public static void Click_DENY(AppiumDriver<MobileElement> driver) {
		MobileElement element = driver.findElement(By.xpath("//android.widget.Button[@text = 'DENY'][@resource-id = 'com.android.packageinstaller:id/permission_deny_button']"));
		element.click();
	}

	public static void LongPress_element(AppiumDriver<MobileElement> driver, String myClass, String text, String contentDesc) {
		MobileElement wifiIconLong = driver.findElement(By.xpath("//"+myClass+"[@text ='"+text+"'][@content-desc = '"+contentDesc+"']"));
		TouchActions action = new TouchActions(driver);
		action.longPress(wifiIconLong).release().build().perform();		
	}

	//Horizontal Swipe by percentages
	public static void horizontalSwipeByPercentage(double startPercentage, double endPercentage, double anchorPercentage) {
		Dimension size = driver.manage().window().getSize();
		int startPoint = (int) (size.width * startPercentage);
		int endPoint = (int) (size.width * endPercentage);
		int anchor = (int) (size.height * anchorPercentage);

		new TouchAction(driver)
		.press(PointOption.point(startPoint, anchor))
		.waitAction(WaitOptions.waitOptions(ofMillis(2000)))
		.moveTo(PointOption.point(endPoint, anchor))
		.release().perform();
	}

	//Vertical Swipe by percentages
	//swipeVerticalUp((AppiumDriver)driver,0.9,0.1,0.5);
	//swipeVerticalDown((AppiumDriver)driver,0.1,0.9,0.5);
	public static void verticalSwipeByPercentages(AppiumDriver<MobileElement> driver, double startPercentage, double endPercentage,double anchorPercentage) {
		Dimension size = driver.manage().window().getSize();
		int anchor = (int) (size.width * anchorPercentage);
		int startPoint = (int) (size.height * startPercentage);
		int endPoint = (int) (size.height * endPercentage);

		new TouchAction(driver)
		.press(point(anchor, startPoint))
		.waitAction(waitOptions(ofMillis(2000)))
		.moveTo(point(anchor, endPoint))
		.release().perform();
	}

	public static void scroll(AppiumDriver<MobileElement> driver, int fromX, int fromY, int toX, int toY) {
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);

		TouchAction touchAction = new TouchAction(driver);
		touchAction.longPress(point(size.width * fromX, size.height * fromY))
		.moveTo(point(size.width * toX, size.height * toY))
		.release().perform();
	}

	//US: ROK - Wireless WiFi/rokitfone
	public static void connect_WiFi(AppiumDriver<MobileElement> driver, String WiFiName, String WiFiPW) throws InterruptedException {		

		scrollToAnElementByText(driver, "Network & internet");
		logger.info("scroll and click on Network & internet");

		List<MobileElement> WiFi_ON = driver.findElements(By.xpath("//android.widget.Switch[@text = 'ON']"));

		//if Wi-Fi button ON
		if(!WiFi_ON.isEmpty()) {
			logger.info("Wi-Fi button is ON");
			Thread.sleep(3000);

			if(driver.getPageSource().contains("Not connected")) {
				driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'android:id/summary'][@text = 'Not connected']")).click();
				logger.info("Element not connected Wi-Fi");
				Thread.sleep(3000);

				shared_libs.waitTextFromClass(driver, ""+WiFiName+"", "android.widget.TextView");

				MobileElement US_WiFi = driver.findElement(By.xpath("//android.widget.TextView[@text = '"+WiFiName+"']"));
				US_WiFi.isDisplayed();
				US_WiFi.click();
				Thread.sleep(3000);

				Boolean ROK_header = driver.findElement(By.xpath("//android.widget.TextView[@text = '"+WiFiName+"']")).isDisplayed();
				System.out.println("Element ROK header is :"+ ROK_header);
				logger.info("Element ROK header is :"+ ROK_header);

				MobileElement WiFi_PW = driver.findElement(By.xpath("//android.widget.EditText"));
				WiFi_PW.sendKeys(""+WiFiPW+"");
				logger.info("Element enter Wi-Fi PW is :"+ WiFi_PW.getText());
				Thread.sleep(3000);

				//				Boolean Mask_PW = driver.findElement(By.xpath("//android.widget.EditText[@resource-id = 'com.android.settings:id/password'][@text = '•••••••••']")).isDisplayed();
				//				System.out.println("Element mask PW is :"+ Mask_PW);
				//				logger.info("Element mask PW is :"+ Mask_PW);

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

			shared_libs.waitTextFromClass(driver, ""+WiFiName+"", "android.widget.TextView");

			MobileElement US_WiFi = driver.findElement(By.xpath("//android.widget.TextView[@text = '"+WiFiName+"']"));
			US_WiFi.isDisplayed();
			US_WiFi.click();
			Thread.sleep(3000);

			Boolean ROK_header = driver.findElement(By.xpath("//android.widget.TextView[@text = '"+WiFiName+"']")).isDisplayed();
			System.out.println("Element ROK header is :"+ ROK_header);
			logger.info("Element ROK header is :"+ ROK_header);

			MobileElement WiFi_PW = driver.findElement(By.xpath("//android.widget.EditText"));
			WiFi_PW.sendKeys(""+WiFiPW+"");
			logger.info("Element enter Wi-Fi PW is :"+ WiFi_PW.getText());
			Thread.sleep(3000);

			//			Boolean Mask_PW = driver.findElement(By.xpath("//android.widget.EditText[@resource-id = 'com.android.settings:id/password'][@text = '•••••••••']")).isDisplayed();
			//			System.out.println("Element mask PW is :"+ Mask_PW);
			//			logger.info("Element mask PW is :"+ Mask_PW);

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

	public static void disconnect_WiFi(AppiumDriver<MobileElement> driver) throws InterruptedException {

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

	protected static boolean isElementPresent(By by) {		  

		try {
			driver.findElement(by);

			return true;

		} catch (NoSuchElementException e) {

			return false;
		}

	}

	//get listElement within screen
	public static void listElements(AppiumDriver<MobileElement> driver, String myClass) {
		List<MobileElement> lists = driver.findElements(By.xpath("//"+myClass+""));

		for(MobileElement e : lists)
			System.out.println(e.getAttribute("text"));

		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int) (dimension.width * 0.5);
		int start_y = (int) (dimension.height * 0.8);

		int end_x = (int) (dimension.width * 0.5);
		int end_y = (int) (dimension.height * 0.3);

		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y))
		.waitAction(WaitOptions.waitOptions(ofMillis(1000)))
		.moveTo(PointOption.point(end_x, end_y))
		.release().perform();		
	}

}


// look for specific notification
//driver.openNotifications();
//Thread.sleep(2000);
//List<MobileElement> allnotifications = driver.findElements(By.id("android:id/title"));
//System.out.println("no of notifications " + allnotifications.size());
//
//for (MobileElement webElement : allnotifications) {
//    System.out.println(webElement.getText());
//    if(webElement.getText().contains("Dianne")){
//       System.out.println("Notification found");
//       break;


