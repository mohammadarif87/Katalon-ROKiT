package tests;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class Remove_Accounts extends Capabilities {
	
	static final Logger logger = Logger.getLogger(Add_Accounts.class);
	
	@Test
	public void Remove_Google_Account() throws InterruptedException {

		shared_libs.scrollToAnElementByText(driver, "Accounts");
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
			logger.info("Element Google header is :"+ header);

			Boolean verifyAccount = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.android.settings:id/"
					+ "entity_header_title'][@text = 'rokitphones715@gmail.com']")).isDisplayed();
			System.out.println("Element verify account is :"+ verifyAccount);
			logger.info("Element verify account is :"+ verifyAccount);

			Boolean GoogleAccount = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'android:id/title']"
					+ "[@text = 'Google Account']")).isDisplayed();
			System.out.println("Element Google Accountis :"+ GoogleAccount);
			logger.info("Element Google Accountis :"+ GoogleAccount);

			Boolean AccountSync = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'android:id/title']"
					+ "[@text = 'Account sync']")).isDisplayed();
			System.out.println("Element Account sync is :"+ AccountSync);
			logger.info("Element Account sync is :"+ AccountSync);

			MobileElement REMOVEACCOUNT = driver.findElement(By.xpath("//android.widget.Button[@resource-id = "
					+ "'com.android.settings:id/button'][@text = 'REMOVE ACCOUNT']"));
			REMOVEACCOUNT.click();
			Thread.sleep(3000);

			boolean RemoveAccount = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'android:id/alertTitle']"
					+ "[@text = 'Remove account?']")).isDisplayed();
			System.out.println("Element Remove account? is :"+ RemoveAccount);
			logger.info("Element Remove account? is :"+ RemoveAccount);

			boolean message = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'android:id/message']"
					+ "[@text = 'Removing this account will delete all of its messages, contacts, and other data from the phone!']")).isDisplayed();
			System.out.println("Element message is :"+ message);
			logger.info("Element message is :"+ message);

			boolean CANCEL = driver.findElement(By.xpath("//android.widget.Button[@resource-id = 'android:id/button2']"
					+ "[@text = 'CANCEL']")).isDisplayed();
			System.out.println("Element CANCEL is :"+ CANCEL);
			logger.info("Element CANCEL is :"+ CANCEL);

			boolean REMOVE_ACCOUNT = driver.findElement(By.xpath("//android.widget.Button[@resource-id = 'android:id/button1']"
					+ "[@text = 'REMOVE ACCOUNT']")).isDisplayed();
			System.out.println("Element REMOVE ACCOUNT is :"+ REMOVE_ACCOUNT);
			logger.info("Element REMOVE ACCOUNT is :"+ REMOVE_ACCOUNT);

			MobileElement removeAccountButton = driver.findElement(By.xpath("//android.widget.Button[@resource-id = 'android:id/button1']"
					+ "[@text = 'REMOVE ACCOUNT']"));
			removeAccountButton.click();			
			Thread.sleep(5000);

			Boolean verifyRemoveAccount = driver.findElements(By.xpath("//android.widget.TextView[@resource-id = 'com.android.settings:id/"
					+ "entity_header_title'][@text = 'rokitphones715@gmail.com']")).isEmpty();
			System.out.println("Element Verify NO signed account is :"+ verifyRemoveAccount);
			logger.info("Element Verify NO signed account is :"+ verifyRemoveAccount);
		}

		else {
			System.out.println("No signed Gmail account");
			logger.info("No signed Gmail account");
			
		}
		
		driver.close();
		
	}
	
	@Test
		public void Remove_Duo_Account() throws InterruptedException {
			
			shared_libs.scrollToAnElementByText(driver, "Accounts");
			Thread.sleep(3000);		

//			List<MobileElement> Duo_signedIn = driver.findElements(By.xpath("//android.widget.TextView[@resource-id = 'android:id/title']"
//					+ "[@text = 'Duo']"));
			
			MobileElement Duo_signedInClick = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'android:id/title']"
					+ "[@text = 'Duo']"));
			Duo_signedInClick.click();
			Thread.sleep(3000);

			Boolean header = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Duo']")).isDisplayed();
			System.out.println("Element Duo header is :"+ header);

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
					+ "entity_header_title'][@text = 'Duo']")).isEmpty();
			System.out.println("Element Verify NO signed account is :"+ verifyRemoveAccount);
			
			driver.close();
			
		}

	
}