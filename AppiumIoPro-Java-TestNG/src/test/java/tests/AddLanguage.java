package tests;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

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
import org.openqa.selenium.remote.DesiredCapabilities;
import static io.appium.java_client.touch.offset.PointOption.point;

public class AddLanguage {

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
	  
	Thread.sleep(3000);
	logger.info("Wait 3 seconds");
		
	//System
	MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[contains(@text, \'System\')]");
	el2.isDisplayed();
	el2.click();
	logger.info("System clicked");
	
	Thread.sleep(3000);
	logger.info("Wait 3 seconds");
	//Languages and input
	MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1]");
	el3.isDisplayed();
	el3.click();
	logger.info("Languages & input clicked");
	
	Thread.sleep(3000);
	logger.info("Wait 3 seconds");
	//Languages
	MobileElement el4 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[contains(@text, \'English\')]");
	el4.isDisplayed();
	el4.click();
	logger.info("Languages clicked");
	
	Thread.sleep(3000);
	logger.info("Wait 3 seconds");
	//Add a language
	MobileElement el5 = (MobileElement) driver.findElementById("com.android.settings:id/add_language");
	el5.isDisplayed();
	el5.click();
	logger.info("Add a language");
	
	Thread.sleep(3000);
	logger.info("Wait 3 seconds");
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
            + "new UiSelector().text(\""+"English"+"\"));"));
	
	MobileElement el6 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[contains(@text, \'Español\')]");
	el6.isDisplayed();
	el6.click();
	logger.info("Clicked Espanol");
	
	Thread.sleep(3000);
	logger.info("Wait 3 seconds");
	MobileElement el7 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[contains(@text, \'España\')]");
	el7.isDisplayed();
	el7.click();
	logger.info("Clicked Espana");
	
	Thread.sleep(3000);
	logger.info("Wait 3 seconds");
	
	Point dragHandleBottom = driver.findElementByXPath("//android.widget.ImageView[@instance = \'1\']").getCenter();
	Point dragHandleTop = driver.findElementByXPath("//android.widget.ImageView[@instance = \'0\']").getCenter();
	
	Point dragHandleTop2 = dragHandleTop.moveBy(0, -22);
	
	new TouchAction(driver)
    	.press(point(dragHandleBottom))
    	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
    	.moveTo(point(dragHandleTop2))
    	.release()
    	.perform();
	
	
	logger.info("Swipe performed - Language changed to Espanol");
	
	Thread.sleep(3000);
	logger.info("Wait 3 seconds");

	
	    
	  }

	  @AfterTest
	  public void tearDown() {
	    driver.quit();
	  }
	}
