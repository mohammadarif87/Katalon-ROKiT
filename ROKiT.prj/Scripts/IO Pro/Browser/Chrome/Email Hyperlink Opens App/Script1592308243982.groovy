import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import testlink.api.java.client.TestLinkAPIResults as TestLinkAPIResults
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('udid') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.TextView0 - Welcome to Chrome'), 3)

    'Chrome Logo'
    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.ImageView0'), 4)

    Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Chrome App Pre-Installed/android.widget.TextView0 - By using Chrome you agree to the Google Terms of Service and the Google Chrome and Chrome OS Additional Terms of Service.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.CheckBox0 - Help make Chrome better by sending usage statistics and crash reports to Google.'), 
        3)

    Mobile.tap(findTestObject('Apps/Chrome/android.widget.CheckBox0 - Help make Chrome better by sending usage statistics and crash reports to Google.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.Button0 - Accept  continue'), 3)

    Mobile.tap(findTestObject('Apps/Chrome/android.widget.Button0 - Accept  continue'), 3)

    Mobile.verifyElementVisible(findTestObject('Browser/Accept Cookies/android.widget.Button0 - No thanks'), 3)

    Mobile.tap(findTestObject('Browser/Accept Cookies/android.widget.Button0 - No thanks'), 3)

    'Google Logo'
    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.FrameLayout8'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.EditText0 - Search or type web address'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.TextView0 - Facebook'), 3)

    Mobile.tap(findTestObject('Apps/Chrome/android.widget.EditText0 - Search or type web address'), 3)

    Mobile.setText(findTestObject('Browser/Add Delete Bookmarks on Chrome/android.widget.EditText0 - Search or type web address'), 
        'https://rokitphones.com/us/', 0)

    'Tick on keyboard'
    Mobile.tapAtPosition(990, 1930)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    'Swipe in Rokitphones.com to Email'
    device_Height = Mobile.getDeviceHeight()

    device_Width = Mobile.getDeviceWidth()

    int startX = device_Width / 2

    int endX = startX

    int startY = device_Height * 0.95 // starts almost at the bottom of the screen

    int endY = device_Height * 0.1 // stops scrolling almost at the top of the screen

    Mobile.swipe(startX, startY, endX, endY)

    Mobile.swipe(startX, startY, endX, endY)

    Mobile.swipe(startX, startY, endX, endY)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Browser/Email Hyperlink Opens App/android.widget.TextView0 - Email'), 3)

    Mobile.verifyElementVisible(findTestObject('Browser/Email Hyperlink Opens App/android.widget.TextView0 - supportrokitphones.com'), 
        3)

    Mobile.tap(findTestObject('Browser/Email Hyperlink Opens App/android.widget.TextView0 - supportrokitphones.com'), 3)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    not_run: if (Mobile.verifyElementVisible(findTestObject('Browser/Email Hyperlink Opens App/android.widget.TextView0 - Smart Compose'), 
        3, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Browser/Email Hyperlink Opens App/android.widget.TextView0 - Smart Compose'), 
            3)

        Mobile.verifyElementVisible(findTestObject('Browser/Email Hyperlink Opens App/android.widget.TextView0 - Writing suggestions appear as you type. Swipe right to accept.'), 
            3)

        Mobile.verifyElementVisible(findTestObject('Browser/Email Hyperlink Opens App/android.widget.Button0 - Got it'), 
            3)

        Mobile.tap(findTestObject('Browser/Email Hyperlink Opens App/android.widget.Button0 - Got it'), 3)
    }
    
    AndroidDriver<MobileElement> driverEmail = MobileDriverFactory.getDriver()

    if (Mobile.verifyElementVisible(findTestObject('Browser/Email Hyperlink Opens App/android.widget.TextView0 - Smart Compose'), 
        3, FailureHandling.OPTIONAL)) {
        driverEmail.findElementByXPath('//android.widget.TextView[contains(@text, \'Smart Compose\')]').isDisplayed()

        driverEmail.findElementByXPath('//android.widget.TextView[contains(@text, \'Writing suggestions appear as you type. Swipe right to accept.\')]').isDisplayed()

        driverEmail.findElementByXPath('//android.widget.Button[contains(@text, \'Got it\')]').isDisplayed()

        driverEmail.findElementByXPath('//android.widget.Button[contains(@text, \'Got it\')]').click()
    } else {
        Mobile.delay(3)
    }
    
    Mobile.pressBack()

    Mobile.verifyElementVisible(findTestObject('Browser/Email Hyperlink Opens App/android.widget.TextView0 - Compose'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Browser/Email Hyperlink Opens App/android.widget.MultiAutoCompleteTextView0 - supportrokitphones.com'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Browser/Email Hyperlink Opens App/android.widget.EditText0 - Support Request'), 
        3)

    not_run: Mobile.verifyElementVisible(findTestObject('Browser/Email Hyperlink Opens App/android.widget.EditText1 - Compose email'), 
        0)
} else {
    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.TextView0 - Welcome to Chrome'), 0)

    'Chrome Logo'
    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.ImageView0'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Chrome App Pre-Installed/android.widget.TextView0 - By using Chrome you agree to the Google Terms of Service and the Google Chrome and Chrome OS Additional Terms of Service.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.CheckBox0 - Help make Chrome better by sending usage statistics and crash reports to Google.'), 
        0)

    Mobile.tap(findTestObject('Apps/Chrome/android.widget.CheckBox0 - Help make Chrome better by sending usage statistics and crash reports to Google.'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.Button0 - Accept  continue'), 0)

    Mobile.tap(findTestObject('Apps/Chrome/android.widget.Button0 - Accept  continue'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.Button0 - No thanks'), 0)

    Mobile.tap(findTestObject('Apps/Chrome/android.widget.Button0 - No thanks'), 0)

    'Google Logo'
    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.FrameLayout8'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.EditText0 - Search or type web address'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.TextView0 - Facebook'), 0)

    Mobile.tap(findTestObject('Apps/Chrome/android.widget.EditText0 - Search or type web address'), 0)

    Mobile.setText(findTestObject('Browser/Add Delete Bookmarks on Chrome/android.widget.EditText0 - Search or type web address'), 
        'https://rokitphones.com/uk/rokit-support/', 0)

    'Tick on keyboard'
    Mobile.tapAtPosition(990, 1930)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Browser/Email Hyperlink Opens App/android.view.View6 - How can we help you'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Browser/Email Hyperlink Opens App/android.widget.TextView0 - Contact us'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Browser/Email Hyperlink Opens App/android.widget.TextView1 - By Email'), 
        0)

    Mobile.tap(findTestObject('Browser/Email Hyperlink Opens App/android.widget.TextView1 - By Email'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Browser/Email Hyperlink Opens App/android.widget.Button0 - OK'), 0, 
        FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Browser/Email Hyperlink Opens App/android.widget.Button0 - OK'), 0)
    }
    
    if (Mobile.verifyElementNotVisible(findTestObject('Browser/Email Hyperlink Opens App/android.widget.TextView0 - Compose'), 
        0, FailureHandling.OPTIONAL)) {
        if (Mobile.verifyElementVisible(findTestObject('Browser/Email Hyperlink Opens App/android.widget.Button0 - OK'), 
            0, FailureHandling.OPTIONAL)) {
            Mobile.tap(findTestObject('Browser/Email Hyperlink Opens App/android.widget.Button0 - OK'), 0)
        } else {
            Mobile.tap(findTestObject('Browser/Email Hyperlink Opens App/android.widget.TextView1 - By Email'), 0)
        }
    }
    
    Mobile.verifyElementVisible(findTestObject('Browser/Email Hyperlink Opens App/android.widget.TextView0 - Compose'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Browser/Email Hyperlink Opens App/android.widget.MultiAutoCompleteTextView0 - uksupportrokit.com'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('Browser/Email Hyperlink Opens App/android.widget.EditText1 - Compose email'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('E-mail Hyperlink Opens App', '', TestLinkAPIResults.TEST_PASSED)

