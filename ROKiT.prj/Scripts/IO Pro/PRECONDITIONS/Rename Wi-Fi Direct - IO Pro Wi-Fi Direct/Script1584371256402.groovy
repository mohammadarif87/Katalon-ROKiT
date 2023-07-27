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

if (Mobile.verifyElementNotVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView10 - WiFi preferences'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.swipe(startX, startY, endX, endY)
}

Mobile.swipe(startX, startY, endX, endY)

if (Mobile.verifyElementNotVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView10 - WiFi preferences'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.swipe(startX, startY, endX, endY)
}

Mobile.swipe(startX, startY, endX, endY)

if (Mobile.verifyElementNotVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView10 - WiFi preferences'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.swipe(startX, startY, endX, endY)
}

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView10 - WiFi preferences'), 
    0)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView10 - WiFi preferences'), 0)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView6 - Advanced'), 0)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView6 - Advanced'), 0)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView9 - WiFi Direct'), 0)

if (Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - IO Pro Wi-Fi Direct'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - IO Pro Wi-Fi Direct'), 
        0)

    Mobile.closeApplication()
} else {
    Mobile.tapAtPosition(780, 130)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Rename Wi-Fi Direct/android.widget.TextView0 - Rename device'), 
        0)

    Mobile.tapAtPosition(520, 1030)

    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    Mobile.tapAndHoldAtPosition(1010, 1800, 3)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Rename Wi-Fi Direct/android.widget.EditText0'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Preconditions/Rename Wi-Fi Direct/android.widget.EditText0'), 'IO Pro Wi-Fi Direct', 
        0)

    Mobile.tap(findTestObject('Preconditions/Rename Wi-Fi Direct/android.widget.Button1 - OK'), 0)

    Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - IO Pro Wi-Fi Direct'), 
        0)

    Mobile.closeApplication()
}

