package tests;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;


public class Add_Accounts extends tests.Capabilities {

	static final Logger logger = Logger.getLogger(Add_Accounts.class);

	@Test
	public void Add_Google_Account() throws InterruptedException {				

		shared_libs.scrollToAnElementByText(driver, "Accounts");

		List<MobileElement> signedIn = driver.findElements(By.xpath("//android.widget.TextView[@resource-id = 'android:id/title']"
				+ "[@text = 'rokitphones715@gmail.com']"));

		if (signedIn.isEmpty()) {
			//Header
			Boolean Header = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Accounts']")).isDisplayed();
			System.out.println("Element Accounts is :"+ Header);
			logger.info("Element Accounts is :"+ Header);

			Boolean AccountsForOwner = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Accounts for Owner']")).isDisplayed();
			System.out.println("Element Accounts for Owner is :"+ AccountsForOwner);
			logger.info("Element Accounts for Owner is :"+ AccountsForOwner);

			//+icon
			Boolean IconPlus = driver.findElement(By.id("android:id/icon")).isDisplayed();
			System.out.println("Element Icon is :"+ IconPlus);
			logger.info("Element Icon is :"+ IconPlus);

			Boolean AddAccount = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Add account']")).isDisplayed();
			System.out.println("Element Add account is :"+ AddAccount);
			logger.info("Element Add account is :"+ AddAccount);

			Boolean AutomaticallySyncData = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Automatically sync data']")).isDisplayed();
			System.out.println("Element Automatically sync data is :"+ AutomaticallySyncData);
			logger.info("Element Automatically sync data is :"+ AutomaticallySyncData);

			Boolean LetAppsRefreshAataAutomatically = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Let apps refresh data automatically']")).isDisplayed();
			System.out.println("Element Let apps refresh data automatically is :"+ LetAppsRefreshAataAutomatically);
			logger.info("Element Let apps refresh data automatically is :"+ LetAppsRefreshAataAutomatically);

			//Toggle switch
			Boolean AutomaticallySyncDataSwitchON = driver.findElement(By.xpath("//android.widget.Switch[@text = 'ON']")).isDisplayed();
			System.out.println("Element ON is :"+ AutomaticallySyncDataSwitchON);
			logger.info("Element ON is :"+ AutomaticallySyncDataSwitchON);

			MobileElement Add_account = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Add account']"));
			Add_account.click();

			Thread.sleep(3000);

			//Header
			Boolean AddAnAccount = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Add an account']")).isDisplayed();
			System.out.println("Element Add an account is :"+ AddAnAccount);
			logger.info("Element Add an account is :"+ AddAnAccount);

			Boolean Duo = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Duo']")).isDisplayed();
			System.out.println("Element Duo is :"+ Duo);
			logger.info("Element Duo is :"+ Duo);

			Boolean Exchange = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Exchange']")).isDisplayed();
			System.out.println("Element Exchange is :"+ Exchange);
			logger.info("Element Exchange is :"+ Exchange);

			Boolean Google_text = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Google']")).isDisplayed();
			System.out.println("Element Google is :"+ Google_text);
			logger.info("Element Google is :"+ Google_text);

			Boolean Personal_IMAP = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Personal (IMAP)']")).isDisplayed();
			System.out.println("Element Personal (IMAP) is :"+ Personal_IMAP);
			logger.info("Element Personal (IMAP) is :"+ Personal_IMAP);

			Boolean Personal_POP3 = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Personal (POP3)']")).isDisplayed();
			System.out.println("Element Personal (POP3) is :"+ Personal_POP3);
			logger.info("Element Personal (POP3) is :"+ Personal_POP3);

			Boolean ROKiTHub = driver.findElement(By.xpath("//android.widget.TextView[@text = 'ROKiT Hub']")).isDisplayed();
			System.out.println("Element ROKiT Hub is :"+ ROKiTHub);
			logger.info("Element ROKiT Hub is :"+ ROKiTHub);

			MobileElement Google = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Google']"));
			Google.click();

			Thread.sleep(3000);

			shared_libs.waitTextFromClass(driver, "Sign in", "android.view.View");

			//Verify strings
			Boolean Sign_in = driver.findElement(By.xpath("//android.view.View[@text = 'Sign in']")).isDisplayed();
			System.out.println("Element Sign in is :"+ Sign_in);
			logger.info("Element Sign in is :"+ Sign_in);

			Boolean withYourGoogleAccount = driver.findElement(By.xpath("//android.widget.TextView[@text = 'with your Google Account. ']")).isDisplayed();
			System.out.println("Element with your Google Account.  is :"+ withYourGoogleAccount);
			logger.info("Element with your Google Account.  is :"+ withYourGoogleAccount);

			Boolean LearnMoreAboutGoogleAccounts = driver.findElement(By.xpath("//android.widget.Button[@text = 'Learn more about Google Accounts']")).isDisplayed();
			System.out.println("Element Learn more about Google Accounts is :"+ LearnMoreAboutGoogleAccounts);
			logger.info("Element Learn more about Google Accounts is :"+ LearnMoreAboutGoogleAccounts);

			Boolean Forgot_mail = driver.findElement(By.xpath("//android.widget.Button[@text = 'Forgot email?']")).isDisplayed();
			System.out.println("Element Forgot email? is :"+ Forgot_mail);
			logger.info("Element Forgot email? is :"+ Forgot_mail);

			Boolean CreateAccount = driver.findElement(By.xpath("//android.widget.Spinner[@text = 'Create account']")).isDisplayed();
			System.out.println("Element Create account is :"+ CreateAccount);
			logger.info("Element Create account is :"+ CreateAccount);

			Boolean Next = driver.findElement(By.xpath("//android.widget.Button[@text = 'Next']")).isDisplayed();
			System.out.println("Element Next is :"+ Next);
			logger.info("Element Next is :"+ Next);

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
			logger.info("Element Hi Rokit is :"+ HiRokit);
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
			logger.info("Element rokitphones715@gmail.com is :"+ Gmail);

			Boolean ShowPassword = driver.findElement(By.xpath("//android.view.View[@text = 'Show password']")).isDisplayed();
			System.out.println("Element Show password is :"+ ShowPassword);
			logger.info("Element Show password is :"+ ShowPassword);

			Boolean forgotPassword = driver.findElement(By.xpath("//android.view.View[@resource-id = 'forgotPassword']")).isDisplayed();
			System.out.println("Element Forgot password? is :"+ forgotPassword);
			logger.info("Element Forgot password? is :"+ forgotPassword);

			MobileElement TypePW = driver.findElement(By.xpath("//android.widget.EditText"));
			TypePW.sendKeys("$rokitmobile");

			Thread.sleep(3000);

			MobileElement click_Next = driver.findElement(By.xpath("//android.view.View[@resource-id = 'passwordNext']"));
			click_Next.click();
			Thread.sleep(5000);

			System.out.println("Element Hi Rokit is :"+ HiRokit);
			logger.info("Element Hi Rokit is :"+ HiRokit);
			System.out.println("Element rokitphones715@gmail.com is :"+ Gmail);
			logger.info("Element rokitphones715@gmail.com is :"+ Gmail);

			//		Boolean wePublish = driver.findElement(By.xpath("//*[contains@text = 'We publish the']")).isDisplayed();
			//		System.out.println("Element Forgot We publish the is :"+ wePublish);

			Boolean googleTNC = driver.findElement(By.xpath("//*[@text = 'Google Terms of Service']")).isDisplayed();
			System.out.println("Element Google Terms of Service is :"+ googleTNC);
			logger.info("Element Google Terms of Service is :"+ googleTNC);

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
			logger.info("Element Term of Service 5 is :"+ termOfService5);

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
			logger.info("Element Google Service 1 is :"+ GoogleService1);

			//		Boolean GoogleService2 = driver.findElement(By.xpath("//android.widget.TextView[@text = 'rokitphones715@gmail.com Tap "
			//				+ "to learn more about each service, such as how to turn it on or off later. Data will be used according to "
			//				+ "Google’s Privacy Policy.']")).isDisplayed();
			//		System.out.println("Element Google Service 2 is :"+ GoogleService2);

			Boolean GoogleService3 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.google.android.gms:id/"
					+ "sud_items_title'][@text = 'Backup & storage']")).isDisplayed();
			System.out.println("Element Google Service 3 is :"+ GoogleService3);
			logger.info("Element Google Service 3 is :"+ GoogleService3);

			Boolean GoogleService4 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.google.android.gms:id/"
					+ "sud_items_title'][@text = 'Back up to Google Drive']")).isDisplayed();
			System.out.println("Element Google Service 4 is :"+ GoogleService4);
			logger.info("Element Google Service 4 is :"+ GoogleService4);

			//		Boolean GoogleService5 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.google.android.gms:id/"
			//				+ "sud_items_summary'][@text = 'Easily restore your data or switch phones at any time.']")).isDisplayed();
			//		System.out.println("Element Google Service 5 is :"+ GoogleService5);

			MobileElement more = driver.findElement(By.xpath("//android.widget.Button[@text = 'MORE']"));
			more.click();
			Thread.sleep(3000);

			Boolean GoogleService6 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.google.android.gms:id/"
					+ "sud_items_title'][@text = 'Tap “Accept” to confirm your selection of these Google services settings.']")).isDisplayed();
			System.out.println("Element Google Service 6 is :"+ GoogleService6);
			logger.info("Element Google Service 6 is :"+ GoogleService6);
			Thread.sleep(3000);

			MobileElement aceept = driver.findElement(By.xpath("//android.widget.Button[@text = 'ACCEPT']"));
			aceept.click();
			Thread.sleep(3000);

			Boolean signed_In = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'android:id/title']"
					+ "[@text = 'rokitphones715@gmail.com']")).isDisplayed();
			System.out.println("Element Signed in to rokitphones715@gmail.com is :"+ signed_In);
			logger.info("Element Signed in to rokitphones715@gmail.com is :"+ signed_In);

			Boolean google_sum = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'android:id/summary']"
					+ "[@text = 'Google']")).isDisplayed();
			System.out.println("Element Google text under added account is :"+ google_sum);
			logger.info("Element Google text under added account is :"+ google_sum);

			Boolean Added_account = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Add account']")).isDisplayed();
			System.out.println("Element Add account is :"+ Added_account);
			logger.info("Element Add account is :"+ Added_account);
			Thread.sleep(3000);

		}

		else {
			System.out.println("Already signed Gmail account");
			logger.info("Already signed Gmail account");
		}
		
		driver.close();

	}

	@Test
	public void Add_Duo_Account() throws InterruptedException {
		
		shared_libs.scrollToAnElementByText(driver, "Accounts");
		
		//Header
		Boolean Header = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Accounts']")).isDisplayed();
		System.out.println("Element Accounts is :"+ Header);
		logger.info("Element Accounts is :"+ Header);

		Boolean AccountsForOwner = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Accounts for Owner']")).isDisplayed();
		System.out.println("Element Accounts for Owner is :"+ AccountsForOwner);
		logger.info("Element Accounts for Owner is :"+ AccountsForOwner);

		//+icon
		Boolean IconPlus = driver.findElement(By.id("android:id/icon")).isDisplayed();
		System.out.println("Element Icon is :"+ IconPlus);
		logger.info("Element Icon is :"+ IconPlus);

		Boolean AddAccount = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Add account']")).isDisplayed();
		System.out.println("Element Add account is :"+ AddAccount);
		logger.info("Element Add account is :"+ AddAccount);

		Boolean AutomaticallySyncData = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Automatically sync data']")).isDisplayed();
		System.out.println("Element Automatically sync data is :"+ AutomaticallySyncData);
		logger.info("Element Automatically sync data is :"+ AutomaticallySyncData);

		Boolean LetAppsRefreshAataAutomatically = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Let apps refresh data automatically']")).isDisplayed();
		System.out.println("Element Let apps refresh data automatically is :"+ LetAppsRefreshAataAutomatically);
		logger.info("Element Let apps refresh data automatically is :"+ LetAppsRefreshAataAutomatically);

		//Toggle switch
		Boolean AutomaticallySyncDataSwitchON = driver.findElement(By.xpath("//android.widget.Switch[@text = 'ON']")).isDisplayed();
		System.out.println("Element ON is :"+ AutomaticallySyncDataSwitchON);
		logger.info("Element ON is :"+ AutomaticallySyncDataSwitchON);

		MobileElement Add_account = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Add account']"));
		Add_account.click();

		Thread.sleep(3000);

		//Header
		Boolean AddAnAccount = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Add an account']")).isDisplayed();
		System.out.println("Element Add an account is :"+ AddAnAccount);
		logger.info("Element Add an account is :"+ AddAnAccount);

		Boolean Duo = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Duo']")).isDisplayed();
		System.out.println("Element Duo is :"+ Duo);
		logger.info("Element Duo is :"+ Duo);

		Boolean Exchange = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Exchange']")).isDisplayed();
		System.out.println("Element Exchange is :"+ Exchange);
		logger.info("Element Exchange is :"+ Exchange);

		Boolean Google_text = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Google']")).isDisplayed();
		System.out.println("Element Google is :"+ Google_text);
		logger.info("Element Google is :"+ Google_text);

		Boolean Personal_IMAP = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Personal (IMAP)']")).isDisplayed();
		System.out.println("Element Personal (IMAP) is :"+ Personal_IMAP);
		logger.info("Element Personal (IMAP) is :"+ Personal_IMAP);

		Boolean Personal_POP3 = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Personal (POP3)']")).isDisplayed();
		System.out.println("Element Personal (POP3) is :"+ Personal_POP3);
		logger.info("Element Personal (POP3) is :"+ Personal_POP3);

		Boolean ROKiTHub = driver.findElement(By.xpath("//android.widget.TextView[@text = 'ROKiT Hub']")).isDisplayed();
		System.out.println("Element ROKiT Hub is :"+ ROKiTHub);
		logger.info("Element ROKiT Hub is :"+ ROKiTHub);

		MobileElement Duo_acc = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Duo']"));
		Duo_acc.click();

		Thread.sleep(3000);
		
		if (driver.findElement(By.xpath("//android.widget.TextView[@text = 'High quality video calling with Google Duo']")).isDisplayed()) {
			MobileElement I_Agree = driver.findElement(By.xpath("//android.widget.Button[@text = 'I agree']"));
			I_Agree.click();

			Boolean GetStarted = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Get started']")).isDisplayed();
			System.out.println("Element Get started is :"+ GetStarted);
			logger.info("Element Get started is :"+ GetStarted);
			
			Boolean Sub_text = driver.findElement(By.xpath("//android.widget.TextView[@text = 'To make video calls, give access to your microphone and camera. To find friends & sync your contacts across devices, give access to your contacts. Plus, make it easy to verify your phone number and keep track of Duo calls by letting Duo manage phone calls. Learn more']")).isDisplayed();
			System.out.println("Element Sub text is :"+ Sub_text);
			logger.info("Element Sub text is :"+ Sub_text);
			
			MobileElement GiveAccess = driver.findElement(By.xpath("//android.widget.Button[@text = 'Give access']"));
			GiveAccess.click();
		}
			
		
		Boolean Duo_Header = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Set up Duo with your phone number']")).isDisplayed();
		System.out.println("Element Duo Header is :"+ Duo_Header);
		logger.info("Element Duo Header is :"+ Duo_Header);
		
		Boolean Country_Code = driver.findElement(By.xpath("//android.widget.Spinner[@text = 'US (+1)']")).isDisplayed();
		System.out.println("Element Country Code is :"+ Country_Code);
		logger.info("Element Country Code is :"+ Country_Code);
		
		Boolean Your_Phone_Number = driver.findElement(By.xpath("//android.widget.EditText[@text = 'Your phone number']")).isDisplayed();
		System.out.println("Element Your phone number is :"+ Your_Phone_Number);
		logger.info("Element Your phone number is :"+ Your_Phone_Number);
		
		Boolean Sub_Desc = driver.findElement(By.xpath("//android.widget.TextView[@text = 'People who know your number "
				+ "can reach you across Google services. Duo will send you a one time SMS message, "
				+ "carrier rates may apply.']")).isDisplayed();
		System.out.println("Element Sub-text is :"+ Sub_Desc);
		logger.info("Element Sub-text is :"+ Sub_Desc);
		
//		Boolean Having_Problems = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Having problems? \r\n']")).isDisplayed();
		Boolean Having_Problems = driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.google.android.apps.tachyon:id/phone_having_problems_text']")).isDisplayed();
		System.out.println("Element Having problems is :"+ Having_Problems);
		logger.info("Element Having problems is :"+ Having_Problems);
		
//		MobileElement YOurPhoneNumber = driver.findElement(By.xpath("//android.view.View[1]/android.view.View[3]/"
//				+ "android.view.View/android.view.View[1]/android.view.View[2]/android.view.View"
//				+ "[@index = '0']"));
		MobileElement YOurPhoneNumber = driver.findElement(By.id("com.google.android.apps.tachyon:id/textinput_placeholder"));
		YOurPhoneNumber.click();
		Thread.sleep(3000);

		MobileElement TypeYourPhoneNumber = driver.findElement(By.xpath("//android.widget.EditText"));
		TypeYourPhoneNumber.sendKeys("4787777307");

		driver.hideKeyboard();
		Thread.sleep(3000);
		
		MobileElement click_Agree = driver.findElement(By.xpath("//android.widget.Button[@text = 'Agree'][@resource-id = 'com.google.android.apps.tachyon:id/footer_registration_send_button']"));
		click_Agree.click();
		Thread.sleep(5000);
		
		shared_libs.waitTextFromClass(driver, "Allow Duo to access your contacts?", "android.widget.TextView");
		
		Boolean Allow_Duo = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Allow Duo to access your contacts?']")).isDisplayed();
		System.out.println("Element Allow Duo to access your contacts? is :"+ Allow_Duo);
		logger.info("Element Allow Duo to access your contacts? is :"+ Allow_Duo);
		
		Boolean OneofThree = driver.findElement(By.xpath("//android.widget.TextView[@text = '1 of 3']")).isDisplayed();
		System.out.println("Element 1 of 3 is :"+ OneofThree);
		logger.info("Element 1 of 3 is :"+ OneofThree);
		
		Boolean Deny = driver.findElement(By.xpath("//android.widget.Button[@text = 'DENY']")).isDisplayed();
		System.out.println("Element Deny is :"+ Deny);
		logger.info("Element Deny is :"+ Deny);
		
		Boolean Allow = driver.findElement(By.xpath("//android.widget.Button[@text = 'ALLOW']")).isDisplayed();
		System.out.println("Element Allow is :"+ Allow);
		logger.info("Element Allow is :"+ Allow);
		
		MobileElement click_Allow = driver.findElement(By.xpath("//android.widget.Button[@text = 'ALLOW'][@resource-id = 'com.android.packageinstaller:id/permission_deny_button']"));
		click_Allow.click();
		Thread.sleep(3000);
		
		Boolean Allow_Duo_pix = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Allow Duo to take pictures and record video?']")).isDisplayed();
		System.out.println("Element Allow Duo to take pictures and record video? is :"+ Allow_Duo_pix);
		logger.info("Element Allow Duo to take pictures and record video? is :"+ Allow_Duo_pix);
		
		Boolean TwoOfThree = driver.findElement(By.xpath("//android.widget.TextView[@text = '2 of 3']")).isDisplayed();
		System.out.println("Element 2 of 3 is :"+ TwoOfThree);
		logger.info("Element 2 of 3 is :"+ TwoOfThree);
		
		System.out.println("Element Deny is :"+ Deny);
		logger.info("Element Deny is :"+ Deny);
		
		System.out.println("Element Allow is :"+ Allow);
		logger.info("Element Allow is :"+ Allow);
		
		click_Allow.click();
		Thread.sleep(3000);
		
		Boolean Allow_Duo_Audio = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Allow Duo to record audio?']")).isDisplayed();
		System.out.println("Element Allow Duo to record audio? is :"+ Allow_Duo_Audio);
		logger.info("Element Allow Duo to record audio? is :"+ Allow_Duo_Audio);
		
		Boolean ThreeOfThree = driver.findElement(By.xpath("//android.widget.TextView[@text = '3 of 3']")).isDisplayed();
		System.out.println("Element 3 of 3 is :"+ ThreeOfThree);
		logger.info("Element 3 of 3 is :"+ ThreeOfThree);
		
		System.out.println("Element Deny is :"+ Deny);
		logger.info("Element Deny is :"+ Deny);
		
		System.out.println("Element Allow is :"+ Allow);
		logger.info("Element Allow is :"+ Allow);
		
		click_Allow.click();
		Thread.sleep(3000);
		
		Boolean Duo_SearchBar = driver.findElement(By.xpath("//android.widget.EditText[@text = 'Search contacts or dial']")).isDisplayed();
		System.out.println("Element Search contacts or dial is :"+ Duo_SearchBar);
		logger.info("Element Search contacts or dial is :"+ Duo_SearchBar);
		
		Boolean Swipe_Down = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Swipe down to record a message']")).isDisplayed();
		System.out.println("Element Swipe down to record a message is :"+ Swipe_Down);
		logger.info("Element Swipe down to record a message is :"+ Swipe_Down);
		
		Boolean Create_Group = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Create group']")).isDisplayed();
		System.out.println("Element Create group is :"+ Create_Group);
		logger.info("Element Create group is :"+ Create_Group);
		
		Boolean Invite_Friends = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Invite friends']")).isDisplayed();
		System.out.println("Element Invite friends is :"+ Invite_Friends);
		logger.info("Element Invite friends is :"+ Invite_Friends);
		
		driver.close();
	}

}
