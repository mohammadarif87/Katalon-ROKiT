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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 1 (O2 - UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Rename Wifi Hotspot Name and Password - IO Pro Hotspot'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

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

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/android.widget.Switch0 - OFF'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/android.widget.TextView2 - Off'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/android.widget.Switch0 - OFF'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/android.widget.Switch0 - ON'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/android.widget.TextView2 - On'), 
    0)

'IO 3D'
WebUI.callTestCase(findTestCase('IO 3D/Settings/Network and Internet/Wi-Fi hotspot/Connect to IO Pro Wi-Fi Hotspot'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

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

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/android.widget.TextView2 - On'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/android.widget.TextView9 - Advanced'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/android.widget.TextView9 - Advanced'), 
    0)

Mobile.scrollToText('Connected users')

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/android.widget.TextView13 - Connected users'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/android.widget.TextView13 - Connected users'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/android.widget.TextView0 - Connected users'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/android.widget.TextView2 - IO-3D'), 
    0)

Mobile.closeApplication()

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Wi-Fi hotspot tethering function', '', 
    TestLinkAPIResults.TEST_PASSED)

