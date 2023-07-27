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

'Connect manually to IO 3D then disconnect before running'
Mobile.comment('Connect manually to IO 3D then disconnect before executing')

'IO 3D'
WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)', ('deviceId') : '0123456789ABCDEF'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

'IO Pro'
WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Rename Wi-Fi Direct - IO Pro Wi-Fi Direct'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Search Wi-Fi Direct - IO 3D'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

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
    3)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - Network  Internet'), 3)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView2 - WiFi'), 3)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView2 - WiFi'), 3)

while (Mobile.verifyElementNotVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView10 - WiFi preferences'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.swipe(startX, startY, endX, endY)
}

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView10 - WiFi preferences'), 
    3)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView10 - WiFi preferences'), 3)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView6 - Advanced'), 3)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView6 - Advanced'), 3)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView9 - WiFi Direct'), 3)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - IO Pro Wi-Fi Direct'), 
    3)

Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Direct/android.widget.TextView8 - IO 3D Wi-Fi Direct'), 
    3)

Mobile.tap(findTestObject('Network/Wi-Fi/Wi-Fi Direct/android.widget.TextView8 - IO 3D Wi-Fi Direct'), 3)

Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Direct/android.widget.TextView6 - Connected'), 30)

Mobile.tap(findTestObject('Network/Wi-Fi/Wi-Fi Direct/android.widget.TextView8 - IO 3D Wi-Fi Direct'), 3)

Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Direct/android.widget.TextView0 - Disconnect'), 3)

Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Direct/android.widget.TextView1 - If you disconnect your connection with IO 3D Wi-Fi Direct will end.'), 
    3)

Mobile.tap(findTestObject('Network/Wi-Fi/Wi-Fi Direct/android.widget.Button1 - OK'), 3)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Wi-Fi Direct', '', TestLinkAPIResults.TEST_PASSED)

