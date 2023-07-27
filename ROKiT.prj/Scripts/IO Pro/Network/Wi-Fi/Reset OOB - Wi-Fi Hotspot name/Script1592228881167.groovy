import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import testlink.api.java.client.TestLinkAPIResults as TestLinkAPIResults

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - Network  Internet'), 0)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView7 - Hotspot  tethering'), 
    0)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView7 - Hotspot  tethering'), 0)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView0 - Hotspot  tethering'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/android.widget.TextView2 - WiFi hotspot'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/android.widget.TextView2 - WiFi hotspot'), 
    0)

Mobile.verifyElementVisible(findTestObject('Network/Hotspot and Tethering/Reset OOB/android.widget.TextView0 - WiFi hotspot'), 
    0)

Mobile.verifyElementVisible(findTestObject('Network/Hotspot and Tethering/Reset OOB/android.widget.TextView9 - Advanced'), 
    0)

Mobile.tap(findTestObject('Network/Hotspot and Tethering/Reset OOB/android.widget.TextView9 - Advanced'), 0)

Mobile.verifyElementVisible(findTestObject('Network/Hotspot and Tethering/Reset OOB/android.widget.TextView13 - Reset OOB'), 
    0)

Mobile.tap(findTestObject('Network/Hotspot and Tethering/Reset OOB/android.widget.TextView13 - Reset OOB'), 0)

Mobile.verifyElementVisible(findTestObject('Network/Hotspot and Tethering/Reset OOB/android.widget.TextView0 - Reset OOB'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Network/Hotspot and Tethering/Reset OOB/android.widget.TextView0 - Reset network SSID security and password to default ( out-of-box configuration for WPS )'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Network/Hotspot and Tethering/Reset OOB/android.widget.TextView1 - Reset network SSID security and password to default (out-of-the-box configuration for WPS)'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Network/Hotspot and Tethering/Reset OOB/android.widget.Button0 - CANCEL'), 0)

Mobile.verifyElementVisible(findTestObject('Network/Hotspot and Tethering/Reset OOB/android.widget.Button1 - RESET OOB'), 
    0)

Mobile.tap(findTestObject('Network/Hotspot and Tethering/Reset OOB/android.widget.Button1 - RESET OOB'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'IO Pro Hotspot name changed'
Mobile.verifyElementVisible(findTestObject('Network/Hotspot and Tethering/Reset OOB/android.widget.TextView4 - IO Pro_'), 
    0)

Mobile.closeApplication()

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Rename Wifi Hotspot Name and Password - IO Pro Hotspot'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Reset OOB - Wi-Fi Hotspot name', '', TestLinkAPIResults.TEST_PASSED)

