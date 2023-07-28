package tests;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import static io.appium.java_client.touch.offset.PointOption.point;

public class ScreenPinning {

	public AndroidDriver<MobileElement> driver;
	  public static Logger logger;
	  
	  @BeforeTest
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("platformVersion", "9");
	    desiredCapabilities.setCapability("deviceName", "IO Pro");
	    desiredCapabilities.setCapability("udid", "IOPRO3D105120");
	    desiredCapabilities.setCapability("newCommandTimeout", "120");
	    desiredCapabilities.setCapability("appPackage", "com.android.settings");
	    desiredCapabilities.setCapability("appActivity", ".Settings");

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
	  }

	  @Test
	  public void sampleTest() throws InterruptedException {
      
		  logger = Logger.getLogger("AppiumIoPro");
		  PropertyConfigurator.configure("Log4j.properties");
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  logger.info("Define the wait to 10 seconds per element");
		  
	//driver.pressKey(new KeyEvent(AndroidKey.HOME));
			
	Thread.sleep(3000);
	logger.info("Wait 3 seconds");
	
	  new TouchAction(driver)
	      .press(point(540,1700))
	      .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
	      .moveTo(point(540,400))
	      .release()
	      .perform();
	  logger.info("Swipe performed");
	  
	Thread.sleep(5000);
	logger.info("Wait 3 seconds");
		
	//Security & location
	MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[contains(@text, \'Security & location\')]");
	el2.isDisplayed();
	el2.click();
	logger.info("Security & location clicked");
	
	Thread.sleep(3000);
	logger.info("Wait 3 seconds");
	
	new TouchAction(driver)
    .press(point(540,1700))
    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
    .moveTo(point(540,400))
    .release()
    .perform();
	logger.info("Swipe performed");
	
	//Advanced
	MobileElement el3 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[contains(@text, \'Advanced\')]");
	el3.isDisplayed();
	el3.click();
	logger.info("Advanced clicked");
	
	Thread.sleep(3000);
	logger.info("Wait 3 seconds");
	
	new TouchAction(driver)
    .press(point(540,1700))
    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
    .moveTo(point(540,400))
    .release()
    .perform();
	logger.info("Swipe performed");
	
	//Screen pinning
	MobileElement el4 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[contains(@text, \'Screen pinning\')]");
	el4.isDisplayed();
	el4.click();
	logger.info("Screen pinning clicked");
	
	Thread.sleep(3000);
	logger.info("Wait 3 seconds");
	
	//Click Off so it turns On
	MobileElement el5 = (MobileElement) driver.findElementById("com.android.settings:id/switch_text");
	el5.isDisplayed();
	el5.click();
	logger.info("Off clicked so switch is On");
	
	//On is displayed
	MobileElement el6 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[contains(@text, \'On\')]");
	el6.isDisplayed();
	
	Thread.sleep(3000);
	logger.info("Wait 3 seconds");
	
	//Press App switch key
	driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	logger.info("App switch button pressed");
	
	Thread.sleep(3000);
	logger.info("Wait 3 seconds");
	
	MobileElement el7 = (MobileElement) driver.findElementById("com.android.launcher3:id/icon");
	el7.isDisplayed();
	el7.click();
	logger.info("Clicked Settings icon on App switch");
	
	Thread.sleep(2000);
	logger.info("Wait 2 seconds");
	
	//Click Pin
	MobileElement el8 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[contains(@text, \'Pin\')]");
	el8.isDisplayed();
	el8.click();
	logger.info("Clicked Pin");
	
	Thread.sleep(3000);
	logger.info("Wait 3 seconds");
	
	//Tap GOT IT on the prompt
	new TouchAction(driver)
	.press(point(840,1860))
	.release()
	.perform();
	logger.info("GOT IT clicked");
	
	Thread.sleep(10000);
	logger.info("Wait 10 seconds");
	
//	backButton = driver.longPressKey(new KeyEvent(AndroidKey.BACK));
//
//	overviewButton = driver.longPressKey(new KeyEvent(AndroidKey.APP_SWITCH));
//
//	MultiTouchAction multiTouch = new MultiTouchAction(driver);
//
//	TouchAction action1 = new TouchAction(driver);
//
//	TouchAction action2 = new TouchAction(driver);
//
//	action1 = press(backButton).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).release();
//
//	action2 = press(overviewButton).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).release();
//	
//	multiTouch.add(action1).add(action2).perform();

	TouchAction actionOne = new TouchAction(driver);
	actionOne.press(point(290, 2100));
	actionOne.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)));
	actionOne.release();
	TouchAction actionTwo = new TouchAction(driver);
	actionTwo.press(point(820, 2100));
	actionTwo.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)));
	actionTwo.release();
	MultiTouchAction action = new MultiTouchAction(driver);
	action.add(actionOne);
	action.add(actionTwo);
	action.perform();
	
	    
	  }

	  @AfterTest
	  public void tearDown() {
	    driver.quit();
	  }
	}
