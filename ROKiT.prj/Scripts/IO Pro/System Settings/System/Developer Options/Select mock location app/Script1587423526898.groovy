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

Mobile.comment('Install Mock Locations')

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.TextView5 - Not now'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.TextView5 - Not now'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.TextView8 - Search for apps  games'), 
    10)

Mobile.tap(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.TextView8 - Search for apps  games'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.EditText0 - Search for apps  games (1)'), 
    'Mock Locations', 0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.TextView0 - Mock Locations (fake GPS path) (2)'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.TextView0 - Mock Locations (fake GPS path) (2)'), 
    0)

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.Button0 - Install (1)'), 
    0, FailureHandling.OPTIONAL)) {
    not_run: Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.Button0 - Install'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.Button0 - Install (1)'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.Button0 - Install (1)'), 
        0)

    not_run: Mobile.tap(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.Button0 - Install'), 
        0)

    Mobile.pressHome()

    Mobile.waitForElementPresent(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.TextView0 - Mock Locations (1)'), 
        30)
} else {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.Button1 - Open (1)'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.Button0 - Uninstall (1)'), 
        0)
}

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage1, 
    appActivity1)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.TextView0 - System'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.TextView0 - System'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.TextView0 - Advanced'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.TextView0 - Advanced'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.TextView0 - Developer options'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.TextView0 - Developer options'), 
    0)

Mobile.scrollToText('Select mock location app')

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.TextView0 - Select mock location app'), 
    3)

Mobile.tap(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.TextView0 - Select mock location app'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.TextView0 - Select application'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.TextView0 - Mock Locations'), 
    3)

Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Developer Options/Select mock location app/android.widget.TextView0 - Mock location app Mock Locations'), 
    3)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Select mock location app', '', TestLinkAPIResults.TEST_PASSED)

