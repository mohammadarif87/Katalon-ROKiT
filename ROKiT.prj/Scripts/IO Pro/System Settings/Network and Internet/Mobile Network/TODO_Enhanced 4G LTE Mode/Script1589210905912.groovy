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

int startY = device_Height * 0.85 // starts almost at the bottom of the screen

int endY = device_Height * 0.5 // stops scrolling almost at the top of the screen

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.TextView4 - Mobile network'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.TextView4 - Mobile network'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.TextView1 - O2 - UK'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.TextView2 - EE'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.TextView3 - Mobile data'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.TextView5 - Roaming'), 
    0)

'Roaming is Off by default'
Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.Switch1 - OFF'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.TextView7 - App data usage'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.TextView9 - Advanced'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.TextView9 - Advanced'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.TextView11 - Enhanced 4G LTE Mode'), 
    0)

'Enhanced 4G LTE Mode enabled by default'
Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.Switch2 - ON'), 
    0)

Mobile.closeApplication()

