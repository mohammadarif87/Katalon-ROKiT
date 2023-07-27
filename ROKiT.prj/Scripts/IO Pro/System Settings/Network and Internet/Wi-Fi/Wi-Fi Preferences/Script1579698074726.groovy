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

import testlink.api.java.client.TestLinkAPIResults

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

'Swipe in Settings'
device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 2

int endX = startX

int startY = device_Height * 0.95 // starts almost at the bottom of the screen

int endY = device_Height * 0.1 // stops scrolling almost at the top of the screen

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - Network  Internet'), 0)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView2 - WiFi'), 0)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView2 - WiFi'), 0)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

if (Mobile.verifyElementNotVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView10 - WiFi preferences'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.swipe(startX, startY, endX, endY)
}

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView10 - WiFi preferences'), 
    0)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView10 - WiFi preferences'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Wi-Fi Preferences/android.widget.TextView0 - WiFi preferences'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Wi-Fi Preferences/android.widget.TextView2 - Turn on WiFi automatically'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Wi-Fi Preferences/android.widget.Switch0 - ON'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Wi-Fi Preferences/android.widget.TextView4 - Open network notification'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Wi-Fi Preferences/android.widget.Switch1 - ON'), 
    0)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView6 - Advanced'), 0)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView6 - Advanced'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Wi-Fi Preferences/android.widget.TextView6 - Install certificates'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Wi-Fi Preferences/android.widget.TextView7 - Network rating provider'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Wi-Fi Preferences/android.widget.TextView8 - Google'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Wi-Fi Preferences/android.widget.TextView9 - WiFi Direct'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Wi-Fi Preferences/android.widget.TextView10 - MAC address'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Wi-Fi Preferences/android.widget.TextView12 - IP address'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'("Wi-Fi preferences", "", TestLinkAPIResults.TEST_PASSED)