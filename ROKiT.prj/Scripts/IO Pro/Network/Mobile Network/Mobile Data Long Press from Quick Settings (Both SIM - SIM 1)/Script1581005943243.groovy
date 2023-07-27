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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

'Swipe in Settings'
device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 2

int endX = startX

int startY = device_Height * 0.85 // starts almost at the bottom of the screen

int endY = device_Height * 0.5 // stops scrolling almost at the top of the screen

Mobile.pressHome()

Mobile.openNotifications()

Mobile.swipe(540, 450, 540, 1800)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Enable-Disable from Quick Settings/android.widget.TextView9 - Mobile data'), 
    0)

Mobile.tapAndHold(findTestObject('Network/Mobile Network/Mobile Data Enable-Disable from Quick Settings/android.widget.TextView9 - Mobile data'), 
    2, 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.TextView0 - Data usage'), 
    0)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.TextView5 - 2.00 GB data warning'), 
    0)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.TextView7 - Data Saver'), 
    0)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.TextView8 - Off'), 
    0)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.TextView10 - Mobile data'), 
    0)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.TextView11 - App data usage'), 
    0)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.TextView12 - Data warning  limit'), 
    0)

Mobile.swipe(startX, startY, endX, endY)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.TextView14 - Temporary data service'), 
    0)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.TextView13 - WiFi data usage'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'("Mobile Data Long Press (Both SIM)", "", TestLinkAPIResults.TEST_PASSED)