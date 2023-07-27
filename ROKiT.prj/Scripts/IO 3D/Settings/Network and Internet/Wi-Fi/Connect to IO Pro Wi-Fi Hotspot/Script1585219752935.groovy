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

int startY = device_Height * 0.85 // starts almost at the bottom of the screen

int endY = device_Height * 0.5 // stops scrolling almost at the top of the screen

Mobile.tap(findTestObject('APN/IO 3D/O2 Pay Monthly APN - IO 3D/android.widget.TextView1 - Network  Internet'), 0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.TextView1 - WiFi'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.TextView2 - IO Pro Hotspot'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.TextView2 - IO Pro Hotspot'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.TextView0 - IO Pro Hotspot'), 
    0)

Mobile.setText(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.EditText0'), 
    'testpassword', 0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.Button1 - CONNECT'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.TextView2 - IO Pro Hotspot'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.TextView3 - Connected'), 
    15)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.TextView2 - IO Pro Hotspot'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.TextView1 - IO Pro Hotspot'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.TextView2 - Connected'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.Button0 - FORGET'), 
    0)

