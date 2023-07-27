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

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView2 - WiFi'), 0)

Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView2 - WiFi'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView2 - Use WiFi'), 0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    if (Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Long Press from Quick Settings/android.widget.TextView0 - MySpectrumWiFi20-2G'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Long Press from Quick Settings/android.widget.TextView0 - MySpectrumWiFi20-2G'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Connected'), 
            0)

        Mobile.tap(findTestObject('Network/Wi-Fi/Wi-Fi Long Press from Quick Settings/android.widget.TextView0 - MySpectrumWiFi20-2G'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/View Network Details/android.widget.TextView0 - Network details'), 
            0)
    } else {
        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/View Network Details/android.widget.TextView0 - ROK - Wireless WiFi'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/View Network Details/android.widget.TextView0 - Connected'), 
            0)

        Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/View Network Details/android.widget.TextView0 - ROK - Wireless WiFi'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/View Network Details/android.widget.TextView0 - Network details'), 
            0)
    }
} else if (userName == 'User') {
    Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi List/android.widget.TextView3 - TALKTALKAA45DA'), 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Connected'), 0)

    Mobile.tap(findTestObject('Network/Wi-Fi/Wi-Fi List/android.widget.TextView3 - TALKTALKAA45DA'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView0 - Network details'), 
        0)
} else if (userName == 'Ovi') {
    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView3 - ROKiT Test 5G'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Connected'), 0)

    Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView3 - ROKiT Test 5G'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView0 - Network details'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView3 - ROKiT Test 5G'), 
        0)
} else if (userName == 'ROKiT') {
    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView3 - ROKiT Test 5G'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Connected'), 0)

    Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView3 - ROKiT Test 5G'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView0 - Network details'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView3 - ROKiT Test 5G'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView4 - Connected'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.Button0 - FORGET'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView5 - Signal strength'), 
    0)

if (Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView6 - Excellent'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView6 - Excellent'), 
        0)
}

if (Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/View Network Details/android.widget.TextView0 - Good'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/View Network Details/android.widget.TextView0 - Good'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView7 - Frequency'), 
    0)

if (Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView8 - 5 GHz'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView8 - 5 GHz'), 
        0)
}

if (Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/View Network Details/android.widget.TextView0 - 2.4 GHz'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/View Network Details/android.widget.TextView0 - 2.4 GHz'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView9 - Security'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView10 - WPAWPA2 PSK'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView11 - Advanced'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView14 - MAC address'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView16 - IP address'), 
    0)

Mobile.swipe(512, 1400, 512, 400)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView12 - Gateway'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView13 - 192.168.0.1'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView14 - Subnet mask'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView15 - 255.255.255.0'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView16 - DNS'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView17 - 192.168.0.1'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView18 - Link speed'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/View Network Details/android.widget.TextView20 - IPv6 addresses'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('View Network details', '', TestLinkAPIResults.TEST_PASSED)

