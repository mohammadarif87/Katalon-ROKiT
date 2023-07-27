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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Rename Wifi Hotspot Name and Password - IO Pro Hotspot'), [('appPackage') : 'com.android.settings'
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

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView7 - Hotspot  tethering'), 
    0)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView7 - Hotspot  tethering'), 0)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView0 - Hotspot  tethering'), 
    0)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView2 - WiFi hotspot'), 
    0)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView2 - WiFi hotspot'), 0)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView0 - WiFi hotspot'), 
    0)

Mobile.comment('Hotspot Name')

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView3 - Hotspot name'), 
    0)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - IO Pro Hotspot'), 
    0)

Mobile.comment('Password')

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView7 - Hotspot password'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView7 - Hotspot password'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView0 - Hotspot password'), 
    0)

Mobile.tapAndHoldAtPosition(1010, 1800, 3)

Mobile.setText(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.EditText0'), 
    'testpassword', 0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.EditText0 - testpassword'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.Button1 - OK'), 
    0)

Mobile.comment('Security')

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView5 - Security'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView6 - WPA2 PSK'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView5 - Security'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView0 - Security'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.CheckedTextView0 - WPA2 PSK'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.CheckedTextView1 - None'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.CheckedTextView1 - None'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView6 - None'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView9 - Advanced'), 
    0)

Mobile.comment('Turn off Hotspot automatically')

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView9 - Turn off hotspot automatically'), 
    0)

Mobile.comment('AP Bands')

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Hotspot and Tethering/Wi-Fi Hotspot Settings/android.widget.TextView0 - AP Band'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/Hotspot and Tethering/Wi-Fi Hotspot Settings/android.widget.TextView0 - AP Band'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Hotspot and Tethering/Wi-Fi Hotspot Settings/android.widget.TextView0 - AP Band (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Hotspot and Tethering/Wi-Fi Hotspot Settings/android.widget.CheckBox0 - 2.4 GHz Band'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Hotspot and Tethering/Wi-Fi Hotspot Settings/android.widget.CheckBox0 - 5.0 GHz Band'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/Hotspot and Tethering/Wi-Fi Hotspot Settings/android.widget.Button0 - APPLY'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView11 - AP band'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView11 - AP band'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView0 - AP band'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.CheckBox0 - 2.4 GHz band'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.CheckBox1 - 5.0 GHz band'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.Button1 - APPLY'), 
        0)
}

Mobile.comment('Maximum Connections')

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView15 - Maximum connections'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView16 - 6 users'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView15 - Maximum connections'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView0 - Maximum connections'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.CheckedTextView0 - 1 user'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.CheckedTextView1 - 2 users'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.CheckedTextView2 - 3 users'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.CheckedTextView3 - 4 users'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.CheckedTextView4 - 5 users'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.CheckedTextView5 - 6 users'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.CheckedTextView6 - 7 users'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.CheckedTextView7 - 8 users'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.CheckedTextView8 - 9 users'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.CheckedTextView9 - 10 users'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.CheckedTextView5 - 6 users'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView16 - 6 users'), 
    0)

Mobile.comment('Reset OOB')

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView13 - Reset OOB'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView13 - Reset OOB'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView0 - Reset OOB'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Hotspot and Tethering/Wi-Fi Hotspot Settings/android.widget.TextView0 - Reset network SSID security and password to default ( out-of-box configuration for WPS )'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView1 - Reset network SSID security and password to default (out-of-the-box configuration for WPS)'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.Button0 - CANCEL'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.Button1 - RESET OOB'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.Button1 - RESET OOB'), 
    0)

'Hotspot Name is Reset'
Mobile.verifyElementNotVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - IO Pro Hotspot'), 
    0)

'Security is set to WPA2 PSK after Reset'
Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView5 - Security'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView6 - WPA2 PSK'), 
    0)

Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView6 - None'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Wi-Fi hotspot settings', '', TestLinkAPIResults.TEST_PASSED)

