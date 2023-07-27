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

Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.TextView4 - Mobile network'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.TextView4 - Mobile network'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Mobile Network/Add and Reset APN/android.widget.TextView0 - T-MOBILE'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.TextView9 - Advanced'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.TextView9 - Advanced'), 
        0)

    Mobile.swipe(512, 1400, 512, 600)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Mobile Network/Add and Reset APN/android.widget.TextView0 - Access Point Names'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/Mobile Network/Add and Reset APN/android.widget.TextView0 - Access Point Names'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Mobile Network/Add and Reset APN/android.widget.TextView0 - T-Mobile US 260'), 
        3)

    not_run: Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Mobile Network/Add and Reset APN/android.widget.TextView0 - fast.t-mobile.com'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.TextView1 - O2 - UK'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.TextView9 - Advanced'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.TextView9 - Advanced'), 
        0)

    Mobile.swipe(512, 1400, 512, 600)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.TextView14 - Access point names'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Mobile Network/View Mobile Network/android.widget.TextView14 - Access point names'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView3 - O2 Pay Monthly'), 
        0)
}

Mobile.comment('Add new APN')

'Add Icon'
Mobile.tap(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView1'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView0 - Edit access point'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView2 - Name'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView0 - Name'), 
    0)

Mobile.setText(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.EditText0'), 
    'Automation APN', 0)

Mobile.tap(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.Button1 - OK'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView4 - APN'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView0 - APN'), 
    0)

Mobile.setText(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.EditText0'), 
    'Automation', 0)

Mobile.tap(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.Button1 - OK'), 
    0)

'3 dots in the corner'
Mobile.tap(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.ImageButton1'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView0 - Save'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView5 - Automation APN'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView6 - Automation'), 
    0)

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Mobile Network/Add and Reset APN/android.widget.TextView0 - T-Mobile US 260'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Mobile Network/Add and Reset APN/android.widget.TextView0 - fast.t-mobile.com'), 
        0)

    Mobile.comment('Reset APN to Default')

    '3 dots in the corner'
    Mobile.tap(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.ImageButton1'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView0 - Reset to default'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView5 - Automation APN'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView6 - Automation'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Mobile Network/Add and Reset APN/android.widget.TextView0 - T-Mobile US 260'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Mobile Network/Add and Reset APN/android.widget.TextView0 - fast.t-mobile.com'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView3 - O2 Pay Monthly'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView4 - mobile.o2.co.uk'), 
        0)

    Mobile.comment('Reset APN to Default')

    '3 dots in the corner'
    Mobile.tap(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.ImageButton1'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView0 - Reset to default'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView5 - Automation APN'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView6 - Automation'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView3 - O2 Pay Monthly'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/Add and Reset APN/android.widget.TextView4 - mobile.o2.co.uk'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Add and Reset APN', '', TestLinkAPIResults.TEST_PASSED)

