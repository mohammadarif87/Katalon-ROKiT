package tests;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Account {

	AppiumDriver<MobileElement> driver;

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

		driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	

		Thread.sleep(3000);
	}

	@Test
	public void Add_Google_Account() throws InterruptedException {				

		scrollToAnElementByText("Accounts");

		List<MobileElement> signedIn = driver.findElements(By.xpath("//android.widget.TextView[@resource-id = 'android:id/title']"
				+ "[@text = 'rokitphones715@gmail.com']"));

		if (signedIn.isEmpty()) {
			//Header
			Boolean Header = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Accounts']")).isDisplayed();
			System.out.println("Element Accounts is :"+ Header);

			Boolean AccountsForOwner = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Accounts for Owner']")).isDisplayed();
			System.out.println("Element Accounts for Owner is :"+ AccountsForOwner);

			//+icon
			Boolean IconPlus = driver.findElement(By.id("android:id/icon")).isDisplayed();
			System.out.println("Element Icon is :"+ IconPlus);

			Boolean AddAccount = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Add account']")).isDisplayed();
			System.out.println("Element Add account is :"+ AddAccount);

			Boolean AutomaticallySyncData = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Automatically sync data']")).isDisplayed();
			System.out.println("Element Automatically sync data is :"+ AutomaticallySyncData);

			Boolean LetAppsRefreshAataAutomatically = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Let apps refresh data automatically']")).isDisplayed();
			System.out.println("Element Let apps refresh data automatically is :"+ LetAppsRefreshAataAutomatically);

			//Toggle switch
			Boolean AutomaticallySyncDataSwitchON = driver.findElement(By.xpath("//android.widget.Switch[@text = 'ON']")).isDisplayed();
			System.out.println("Element ON is :"+ AutomaticallySyncDataSwitchON);

			MobileElement Add_account = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Add account']"));
			Add_account.click();

			Thread.sleep(3000);

			//Header
			Boolean AddAnAccount = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Add an account']")).isDisplayed();
			System.out.println("Element Add an account is :"+ AddAnAccount);

			Boolean Duo = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Duo']")).isDisplayed();
			System.out.println("Element Duo is :"+ Duo);

			Boolean Exchange = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Exchange']")).isDisplayed();
			System.out.println("Element Exchange is :"+ Exchange);

			Boolean Google_text = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Google']")).isDisplayed();
			System.out.println("Element Google is :"+ Google_text);

			Boolean Personal_IMAP = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Personal (IMAP)']")).isDisplayed();
			System.out.println("Element Personal (IMAP) is :"+ Personal_IMAP);

			Boolean Personal_POP3 = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Personal (POP3)']")).isDisplayed();
			System.out.println("Element Personal (POP3) is :"+ Personal_POP3);

			Boolean ROKiTHub = driver.findElement(By.xpath("//android.widget.TextView[@text = 'ROKiT Hub']")).isDisplayed();
			System.out.println("Element ROKiT Hub is :"+ ROKiTHub);

			MobileElement Google = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Google']"));
			Google.click();

			Thread.sleep(3000);

			waitTextFromClass("Sign in", "android.view.View");

			//Verify strings
			Boolean Sign_in = driver.findElement(By.xpath("//android.view.View[@text = 'Sign in']")).isDisplayed();
			System.out.println("Element Sign in is :"+ Sign_in);

			Boolean withYourGoogleAccount = driver.findElement(By.xpath("//android.widget.TextView[@text = 'with your Google Account. ']")).isDisplayed();
			System.out.println("Element with your Google Account.  is :"+ withYourGoogleAccount);

			Boolean LearnMoreAboutGoogleAccounts = driver.findElement(By.xpath("//android.widget.Button[@text = 'Learn more about Google Accounts']")).isDisplayed();
			System.out.println("Element Learn more about Google Accounts is :"+ LearnMoreAboutGoogleAccounts);

			Boolean Forgot_mail = driver.findElement(By.xpath("//android.widget.Button[@text = 'Forgot email?']")).isDisplayed();
			System.out.println("Element Forgot email? is :"+ Forgot_mail);

			Boolean CreateAccount = driver.findElement(By.xpath("//android.widget.Spinner[@text = 'Create account']")).isDisplayed();
			System.out.println("Element Create account is :"+ CreateAccount);

			Boolean Next = driver.findElement(By.xpath("//android.widget.Button[@text = 'Next']")).isDisplayed();
			System.out.println("Element Next is :"+ Next);

			MobileElement EmailOrPhone = driver.findElement(By.xpath("//android.view.View[1]/android.view.View[3]/"
					+ "android.view.View/android.view.View[1]/android.view.View[2]/android.view.View"
					+ "[@index = '0']"));
			EmailOrPhone.click();
			Thread.sleep(3000);

			MobileElement TypeID = driver.findElement(By.xpath("//android.widget.EditText"));
			TypeID.sendKeys("rokitphones715@gmail.com");

			driver.hideKeyboard();
			Thread.sleep(3000);

			MobileElement clickNext = driver.findElement(By.xpath("//android.widget.Button[@text = 'Next']"));
			clickNext.click();		
			Thread.sleep(5000);

			//Verify strings
			//TODO: if statement
			Boolean HiRokit = driver.findElement(By.xpath("//android.view.View[@text = 'Hi Rokit']")).isDisplayed();
			System.out.println("Element Hi Rokit is :"+ HiRokit);
			//		if (driver.findElement(By.xpath("//android.view.View[@text = 'Welcome']")).isDisplayed()) {
			//			Boolean Welcome = driver.findElement(By.xpath("//android.view.View[@text = 'Welcome']")).isDisplayed();
			//			System.out.println("Element Welcome is :"+ Welcome);
			//		}			
			//		else {
			//			Boolean HiRokit = driver.findElement(By.xpath("//android.view.View[@text = 'Hi Rokit']")).isDisplayed();
			//			System.out.println("Element Hi Rokit is :"+ HiRokit);			
			//		}

			Boolean Gmail = driver.findElement(By.xpath("//android.view.View[@text = 'rokitphones715@gmail.com']")).isDisplayed();
			System.out.println("Element rokitphones715@gmail.com is :"+ Gmail);

			Boolean ShowPassword = driver.findElement(By.xpath("//android.view.View[@text = 'Show password']")).isDisplayed();
			System.out.println("Element Show password is :"+ ShowPassword);

			Boolean forgotPassword = driver.findElement(By.xpath("//android.view.View[@resource-id = 'forgotPassword']")).isDisplayed();
			System.out.println("Element Forgot password? is :"+ forgotPassword);

			MobileElement TypePW = driver.findElement(By.xpath("//android.widget.EditText"));
			TypePW.sendKeys("$rokitmobile");

			Thread.sleep(3000);

			MobileElement click_Next = driver.findElement(By.xpath("//android.view.View[@resource-id = 'passwordNext']"));
			click_Next.click();
			Thread.sleep(5000);

			System.out.println("Element Hi Rokit is :"+ HiRokit);
			System.out.println("Element rokitphones715@gmail.com is :"+ Gmail);

			//		Boolean wePublish = driver.findElement(By.xpath("//*[contains@text = 'We publish the']")).isDisplayed();
			//		System.out.println("Element Forgot We publish the is :"+ wePublish);

			Boolean googleTNC = driver.findElement(By.xpath("//*[@text = 'Google Terms of Service']")).isDisplayed();
			System.out.println("Element Google Terms of Service is :"+ googleTNC);

			//		Boolean termOfService1 = driver.findElement(By.xpath("//android.widget.TextView[contains@text = 'so that you know what to expect "
			//				+ "as you use our services. By clicking I Agree, you agree to these terms.']")).isDisplayed();
			//		System.out.println("Element Term of Service 1 is :"+ termOfService1);

			//		Boolean termOfService2 = driver.findElement(By.xpath("//*[@text = 'You are also agreeing to the']")).isDisplayed();
			//		System.out.println("Element Term of Service 2 is :"+ termOfService2);

			//		Boolean termOfService3 = driver.findElement(By.xpath("//*[@text = 'to enable discovery and management of apps.']")).isDisplayed();
			//		System.out.println("Element Term of Service 3 is :"+ termOfService3);

			//		Boolean termOfService4 = driver.findElement(By.xpath("//android.widget.TextView[@text = 'And remember, the Google']")).isDisplayed();
			//		System.out.println("Element Term of Service 4 is :"+ termOfService4);

			Boolean termOfService5 = driver.findElement(By.xpath("//android.widget.Button[@text = 'Privacy Policy']")).isDisplayed();
			System.out.println("Element Term of Service 5 is :"+ termOfService5);

			//		Boolean termOfService6 = driver.findElement(By.xpath("//android.view.View[@text = 'describes how Google handles "
			//				+ "information generated as you use Google services. You can always visit your Google Account "
			//				+ "(account.google.com) to take a Privacy Checkup or to adjust your privacy controls.']")).isDisplayed();
			//		System.out.println("Element Term of Service 6 is :"+ termOfService6);

			MobileElement click_agree = driver.findElement(By.xpath("//android.view.View[@resource-id = 'signinconsentNext']"));
			click_agree.click();
			Thread.sleep(5000);

			Boolean GoogleService1 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.google.android.gms:id/"
					+ "suc_layout_title'][@text = 'Google Services']")).isDisplayed();
			System.out.println("Element Google Service 1 is :"+ GoogleService1);

			//		Boolean GoogleService2 = driver.findElement(By.xpath("//android.widget.TextView[@text = 'rokitphones715@gmail.com Tap "
			//				+ "to learn more about each service, such as how to turn it on or off later. Data will be used according to "
			//				+ "Google�s Privacy Policy.']")).isDisplayed();
			//		System.out.println("Element Google Service 2 is :"+ GoogleService2);

			Boolean GoogleService3 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.google.android.gms:id/"
					+ "sud_items_title'][@text = 'Backup & storage']")).isDisplayed();
			System.out.println("Element Google Service 3 is :"+ GoogleService3);

			Boolean GoogleService4 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.google.android.gms:id/"
					+ "sud_items_title'][@text = 'Back up to Google Drive']")).isDisplayed();
			System.out.println("Element Google Service 4 is :"+ GoogleService4);

			//		Boolean GoogleService5 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.google.android.gms:id/"
			//				+ "sud_items_summary'][@text = 'Easily restore your data or switch phones at any time.']")).isDisplayed();
			//		System.out.println("Element Google Service 5 is :"+ GoogleService5);

			MobileElement more = driver.findElement(By.xpath("//android.widget.Button[@text = 'MORE']"));
			more.click();
			Thread.sleep(3000);

			Boolean GoogleService6 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.google.android.gms:id/"
					+ "sud_items_title'][@text = 'Tap �Accept� to confirm your selection of these Google services settings.']")).isDisplayed();
			System.out.println("Element Google Service 6 is :"+ GoogleService6);
			Thread.sleep(3000);

			MobileElement aceept = driver.findElement(By.xpath("//android.widget.Button[@text = 'ACCEPT']"));
			aceept.click();
			Thread.sleep(3000);

			Boolean signed_In = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'android:id/title']"
					+ "[@text = 'rokitphones715@gmail.com']")).isDisplayed();
			System.out.println("Element Signed in to rokitphones715@gmail.com is :"+ signed_In);

			Boolean google_sum = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'android:id/summary']"
					+ "[@text = 'Google']")).isDisplayed();
			System.out.println("Element Google text under added account is :"+ google_sum);

			Boolean Added_account = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Add account']")).isDisplayed();
			System.out.println("Element Add account is :"+ Added_account);
			Thread.sleep(3000);

		}

		else {
			System.out.println("Already signed Gmail account");
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

	//vertical scrolling
	//driver.findElements(By.id("android:id/title")).get(3).click(); //identify views(index) and click on it

	//ex. waitTextFromClass("Settings", "android.widget.TextView");
	public void waitTextFromClass(String text, String myClass) {
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

}
