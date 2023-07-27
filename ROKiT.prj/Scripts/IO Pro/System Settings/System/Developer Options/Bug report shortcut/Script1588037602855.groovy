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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - System'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - System'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - Advanced'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - Advanced'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - Developer options'), 
    3)

Mobile.tap(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - Developer options'), 
    0)

Mobile.scrollToText('Bug report shortcut')

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.TextView0 - Bug report shortcut'), 
    5)

Mobile.tap(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.TextView0 - Bug report shortcut'), 
    3)

Mobile.pressHome()

AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()

AndroidDriver<MobileElement> mobileDriver = MobileDriverFactory.getDriver()

mobileDriver.longPressKey(new KeyEvent(AndroidKey.POWER))

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.TextView0 - Take bug report'), 
    5)

Mobile.tap(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.TextView0 - Take bug report'), 
    3)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn OFF Bug report shortcut'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Clear All Notifications'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.openNotifications()

not_run: Mobile.delay(90)

Mobile.waitForElementPresent(findTestObject('Object Repository/System Settings/System/Developer Options/Bug report shortcut/android.widget.TextView0 - Tap to share your bug report'), 
    110)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.TextView0 - Tap to share your bug report'), 
    10)

Mobile.closeNotifications()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.pressHome()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

AndroidDriver<MobileElement> driverGmail = MobileDriverFactory.getDriver()

Mobile.openNotifications()

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.TextView0 - Tap to share your bug report'), 
    10)

Mobile.tap(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.TextView15 - Tap to share your bug report'), 
    0)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

if (driverGmail.findElementsById('android:id/text1').isEmpty()) {
    'Tap on prompt'
    Mobile.tapAtPosition(910, 1370)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    'Tap Gmail on Share Bug Report prompt'
    driverGmail.findElementByXPath('//android.widget.TextView[contains(@text, \'Gmail\')][@resource-id = \'android:id/text1\']').click()
} else {
    'Tap Gmail on Share Bug Report prompt'
    driverGmail.findElementByXPath('//android.widget.TextView[contains(@text, \'Gmail\')][@resource-id = \'android:id/text1\']').click()
}

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.TextView0 - Smart Compose'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.TextView0 - Smart Compose'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.Button0 - OK'), 
        3)

    Mobile.tap(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.Button0 - OK'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.TextView0 - Compose'), 
    10)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Take bug report/android.widget.EditText1 - Build info emu-user 9 PPR1.180610.011 a288433363 release-keysSerial number IOPRO0123456789A'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Bug report shortcut', '', TestLinkAPIResults.TEST_PASSED)

