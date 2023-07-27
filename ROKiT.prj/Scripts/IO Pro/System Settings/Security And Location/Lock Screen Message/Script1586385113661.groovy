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
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off PIN Lock Screen'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
    0)

Mobile.scrollToText('Security & location')

Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/View Security status/android.widget.TextView0 - Security  location'), 
    0)

Mobile.tap(findTestObject('System Settings/Security And Location/View Security status/android.widget.TextView0 - Security  location'), 
    0)

'Header'
Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Notification/android.widget.TextView0 - Security  location'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Notification/android.widget.TextView12 - Lock screen preferences'), 
    0)

Mobile.tap(findTestObject('Settings/Security And Location/Lock Screen Notification/android.widget.TextView12 - Lock screen preferences'), 
    0)

'Header'
Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Notification/android.widget.TextView0 - Lock screen preferences'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.TextView5 - Lock screen message'), 
    0)

if (Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.TextView6 - Automated Lock Screen Message'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.TextView6 - Automated Lock Screen Message'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.EditText0 - Automated Lock Screen Message'), 
        0)

    Mobile.tap(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.EditText0 - Automated Lock Screen Message'), 
        0, FailureHandling.STOP_ON_FAILURE)

    'Delete on Keyboard'
    Mobile.tapAndHoldAtPosition(990, 1780, 3)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.EditText0 -  Screen Message'), 
        0)

    Mobile.tap(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.EditText0 -  Screen Message'), 
        0)

    'Delete on Keyboard'
    Mobile.tapAndHoldAtPosition(990, 1780, 3)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.EditText0 - e'), 
        0)

    Mobile.tap(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.EditText0 - e'), 0)

    'Delete on Keyboard'
    Mobile.tapAndHoldAtPosition(990, 1780, 1)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    if (userName == 'Aiden') {
        Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/Lock Screen Message/android.widget.EditText0 - E.g. Joes Android.'), 
            0)
    } else {
        Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.EditText0 - e.g. Joes Android.'), 
            0, FailureHandling.STOP_ON_FAILURE)
    }
    
    not_run: Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.EditText0 - e.g. Joes Android.'), 
        0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.Button1 - SAVE'), 0)
}

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.TextView6 - None'), 
    0)

Mobile.tap(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.TextView5 - Lock screen message'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.TextView0 - Lock screen message'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/Lock Screen Message/android.widget.EditText0 - E.g. Joes Android.'), 
        0)

    Mobile.setText(findTestObject('System Settings/Security And Location/Lock Screen Message/android.widget.EditText0 - E.g. Joes Android.'), 
        'Automated Lock Screen Message', 0)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.EditText0 - e.g. Joes Android.'), 
        0, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.EditText0 - e.g. Joes Android.'), 
        'Automated Lock Screen Message', 0)
}

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.Button0 - CANCEL'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.Button1 - SAVE'), 
    0)

Mobile.tap(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.Button1 - SAVE'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.TextView6 - Automated Lock Screen Message'), 
    0)

Mobile.comment('View Lock Screen Message')

AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()

driver.lockDevice()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

AndroidDriver<MobileElement> mobileDriver = MobileDriverFactory.getDriver()

mobileDriver.pressKey(new KeyEvent(AndroidKey.POWER))

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Clock and Date on Lock Screen'
Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.RelativeLayout1'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.TextView4 - Automated Lock Screen Message'), 
    0)

Mobile.swipe(512, 1000, 512, 200)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.TextView5 - Lock screen message'), 
    0)

Mobile.tap(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.TextView5 - Lock screen message'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.EditText0 - Automated Lock Screen Message'), 
    0)

Mobile.tap(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.EditText0 - Automated Lock Screen Message'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Delete on Keyboard'
Mobile.tapAndHoldAtPosition(990, 1780, 3)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.EditText0 -  Screen Message'), 
    0)

Mobile.tap(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.EditText0 -  Screen Message'), 
    0)

'Delete on Keyboard'
Mobile.tapAndHoldAtPosition(990, 1780, 3)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.EditText0 - e'), 
    0)

Mobile.tap(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.EditText0 - e'), 0)

'Delete on Keyboard'
Mobile.tapAndHoldAtPosition(990, 1780, 1)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/Lock Screen Message/android.widget.EditText0 - E.g. Joes Android.'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.EditText0 - e.g. Joes Android.'), 
        0, FailureHandling.STOP_ON_FAILURE)
}

Mobile.tap(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.Button1 - SAVE'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.TextView6 - None'), 
    0)

driver.lockDevice()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

mobileDriver.pressKey(new KeyEvent(AndroidKey.POWER))

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Clock and Date on Lock Screen'
Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.RelativeLayout1'), 
    0)

Mobile.verifyElementNotVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.TextView4 - Automated Lock Screen Message'), 
    0)

Mobile.swipe(512, 1000, 512, 200)

'Header'
Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Notification/android.widget.TextView0 - Lock screen preferences'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.TextView5 - Lock screen message'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Message/android.widget.TextView6 - None'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Lock screen message', '', TestLinkAPIResults.TEST_PASSED)

