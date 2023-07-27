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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
    0)

Mobile.swipe(512, 900, 512, 200)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView20 - Advanced'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView20 - Advanced'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(512, 900, 512, 200)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.TextView16 - Emergency alerts'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.TextView16 - Emergency alerts'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.TextView0 - Emergency alerts'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.TextView1 - Allow alerts'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.TextView2 - Receive emergency notifications'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.Switch0 - ON'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.TextView4 - AMBER alerts'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.Switch1 - ON'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.TextView6 - Extreme threats'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.Switch2 - ON'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.TextView8 - Severe threats'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.Switch3 - ON'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.TextView1 - Allow alerts'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.Switch1 - OFF'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.Switch2 - OFF'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.Switch3 - OFF'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.TextView1 - Allow alerts'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.Switch1 - ON'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.Switch2 - ON'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.Switch3 - ON'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.TextView10 - Required monthly test'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.Switch4 - OFF'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.TextView12 - Emergency alert history'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.TextView12 - Emergency alert history'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.TextView0 - Emergency alert history'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Emergency Alerts/android.widget.TextView1 - There are no active alerts in your area. You can change the Alert settings using the Settings menu option.'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Advanced - Emergency alerts', '', TestLinkAPIResults.TEST_PASSED)

