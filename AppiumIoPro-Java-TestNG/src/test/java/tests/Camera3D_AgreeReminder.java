package tests;

import io.appium.java_client.MobileElement;
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
import org.openqa.selenium.remote.DesiredCapabilities;
import static io.appium.java_client.touch.offset.PointOption.point;



public class Camera3D_AgreeReminder {

	public AndroidDriver<MobileElement> driver;
	  public static Logger logger;
	  
	  @BeforeTest
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("platformVersion", "9");
	    desiredCapabilities.setCapability("deviceName", "IO Pro");
	    desiredCapabilities.setCapability("udid", "IOPRO0123456789A");
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
		  
	driver.pressKey(new KeyEvent(AndroidKey.HOME));
	logger.info("Home Key pressed");
		  
	Thread.sleep(3000);
	logger.info("Wait 3 seconds");
	
	  new TouchAction(driver)
	      .press(point(540,1605))
	      .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
	      .moveTo(point(525,536))
	      .release()
	      .perform();
	  logger.info("Swipe performed");
	  
	Thread.sleep(3000);
	logger.info("Wait 3 seconds");
		
	    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("3D Camera");
	    el1.isDisplayed();
	    logger.info("3D Camera is displayed in App drawer");
	    el1.click();
	    logger.info("3D Camera is clicked");
	    
	    Thread.sleep(5000);
		logger.info("Wait 5 seconds");
		
	    MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[1]");
	    el2.isDisplayed();
	    logger.info("Reminder is displayed");
	    
	    MobileElement el3 = (MobileElement) driver.findElementById("com.wztech.camera3d.rokit:id/btn_confirm");
	    el3.isDisplayed();
	    logger.info("Accept button is displayed");
	    el3.click();
	    logger.info("Accept button is clicked");
	  }

	  @AfterTest
	  public void tearDown() {
	    driver.quit();
	  }
	}
