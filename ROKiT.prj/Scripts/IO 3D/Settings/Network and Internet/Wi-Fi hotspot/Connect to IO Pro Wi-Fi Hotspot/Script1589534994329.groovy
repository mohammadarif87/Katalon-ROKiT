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

WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)', ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView2 - WiFi'), 0)

Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView2 - WiFi'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.TextView4 - IO Pro Hotspot'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.TextView4 - IO Pro Hotspot'), 
    0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.EditText0 (1)'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.TextView0 - IO Pro Hotspot (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.EditText0 (1)'), 
        0, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.EditText0 (1)'), 
        'testpassword', 0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.Button1 - CONNECT (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.TextView3 - Connected (1)'), 
        10)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.TextView4 - IO Pro Hotspot'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.TextView4 - IO Pro Hotspot'), 
        0)
}

if (Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/android.widget.TextView3 - Connected'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/android.widget.TextView3 - Connected'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.TextView4 - IO Pro Hotspot'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.TextView0 - Network info'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.TextView1 - IO Pro Hotspot (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.widget.TextView2 - Connected (1)'), 
    0)

Mobile.closeApplication()

