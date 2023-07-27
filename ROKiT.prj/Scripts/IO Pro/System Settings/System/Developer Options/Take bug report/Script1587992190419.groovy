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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Clear All Notifications'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - System'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - System'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Advanced'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Advanced'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Developer options'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Developer options'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.TextView5 - Take bug report'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.TextView5 - Take bug report'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.TextView0 - Take bug report'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.CheckedTextView0 - Interactive report'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.CheckedTextView0 - Interactive report'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.CheckedTextView1 - Full report'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.Button0 - REPORT'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.Button0 - REPORT'), 0)

Mobile.openNotifications()

Mobile.delay(90, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.TextView15 - Tap to share your bug report'), 
    90)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.TextView15 - Tap to share your bug report'), 
    0)

Mobile.closeNotifications()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.pressHome()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

AndroidDriver<MobileElement> driverGmail = MobileDriverFactory.getDriver()

Mobile.openNotifications()

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.TextView15 - Tap to share your bug report'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.TextView15 - Tap to share your bug report'), 
    0)

'Tap on prompt'
not_run: Mobile.tapAtPosition(910, 1370)

not_run: Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tapAtPosition(550, 1860)

'Gmail'
not_run: Mobile.tapAtPosition(160, 1300)

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.CheckBox0 - Dont show again (1)'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.CheckBox0 - Dont show again (1)'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.CheckBox0 - Dont show again (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.Button0 - OK'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.Button0 - OK'), 0)
}

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Tab Gmail on Share Bug Report prompt'
driverGmail.findElementByXPath('//android.widget.TextView[contains(@text, \'Gmail\')][@resource-id = \'android:id/text1\']').click()

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.TextView0 - Smart Compose'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.TextView0 - Smart Compose'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.Button0 - Got it'), 
        3)

    Mobile.tap(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.Button0 - Got it'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.TextView0 - Compose'), 
    10)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.EditText1 - Build info emu-user 9 PPR1.180610.011 a288433363 release-keysSerial number IOPRO0123456789A'), 
    3)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Take bug report', '', TestLinkAPIResults.TEST_PASSED)

