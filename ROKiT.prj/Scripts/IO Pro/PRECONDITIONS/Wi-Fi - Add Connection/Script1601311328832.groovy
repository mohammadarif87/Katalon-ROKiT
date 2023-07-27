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

not_run: WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings'
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

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView2 - WiFi'), 0)

Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView2 - WiFi'), 0)

Mobile.comment('Reconnect to the network')

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    if (Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Long Press from Quick Settings/android.widget.TextView0 - MySpectrumWiFi20-2G'), 
        0, FailureHandling.OPTIONAL)) {
        not_run: if (Mobile.verifyElementNotVisible(findTestObject('Network/Wi-Fi/Wi-Fi Long Press from Quick Settings/android.widget.TextView0 - MySpectrumWiFi20-2G'), 
            0, FailureHandling.OPTIONAL)) {
            Mobile.swipe(512, 1400, 512, 600)
        }
        
        not_run: if (Mobile.verifyElementNotVisible(findTestObject('Network/Wi-Fi/Wi-Fi Long Press from Quick Settings/android.widget.TextView0 - MySpectrumWiFi20-2G'), 
            0, FailureHandling.OPTIONAL)) {
            Mobile.swipe(512, 1400, 512, 600)
        }
        
        Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Long Press from Quick Settings/android.widget.TextView0 - MySpectrumWiFi20-2G'), 
            5)

        Mobile.tap(findTestObject('Network/Wi-Fi/Wi-Fi Long Press from Quick Settings/android.widget.TextView0 - MySpectrumWiFi20-2G'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView1 - Security'), 
            0)

        Mobile.setText(findTestObject('System Settings/Network and internet/Wi-Fi/Forget Network/android.widget.EditText0'), 
            'modernlight945', 0)

        'Password is masked (*****)'
        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Forget Network/android.widget.EditText0 - '), 
            0)

        Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.CheckBox0 - Show password'), 
            0)

        Mobile.tap(findTestObject('Settings/Network and Internet/Forget Network/android.widget.CheckBox0 - Show password'), 
            0)

        'Password is now displayed'
        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Forget Network/android.widget.EditText0 - modernlight945'), 
            0)

        Mobile.tap(findTestObject('Settings/Network and Internet/Forget Network/android.widget.Button1 - CONNECT'), 0)

        Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Long Press from Quick Settings/android.widget.TextView0 - MySpectrumWiFi20-2G'), 
            0)
    } else {
        not_run: if (Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Forget Network/android.widget.TextView0 - ROK - Wireless WiFi'), 
            0, FailureHandling.OPTIONAL)) {
            Mobile.swipe(512, 1400, 512, 600)
        }
        
        not_run: if (Mobile.verifyElementNotVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Forget Network/android.widget.TextView0 - ROK - Wireless WiFi'), 
            0, FailureHandling.OPTIONAL)) {
            Mobile.swipe(512, 1400, 512, 600)
        }
        
        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Forget Network/android.widget.TextView0 - ROK - Wireless WiFi'), 
            5)

        Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Forget Network/android.widget.TextView0 - ROK - Wireless WiFi'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView1 - Security'), 
            0)

        Mobile.setText(findTestObject('System Settings/Network and internet/Wi-Fi/Forget Network/android.widget.EditText0 (1)'), 
            'rokitfone', 0)

        'Password is masked (*****)'
        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Forget Network/android.widget.EditText0 -  (1)'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.CheckBox0 - Show password'), 
            0)

        Mobile.tap(findTestObject('Settings/Network and Internet/Forget Network/android.widget.CheckBox0 - Show password'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Forget Network/android.widget.EditText0 - rokitfone'), 
            0)

        Mobile.tap(findTestObject('Settings/Network and Internet/Forget Network/android.widget.Button1 - CONNECT'), 0)

        Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Forget Network/android.widget.TextView0 - ROK - Wireless WiFi'), 
            0)
    }
} else if (userName == 'User') {
    if (Mobile.verifyElementNotVisible(findTestObject('Network/Wi-Fi/Wi-Fi List/android.widget.TextView3 - TALKTALKAA45DA'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.swipe(512, 1400, 512, 600)
    }
    
    if (Mobile.verifyElementNotVisible(findTestObject('Network/Wi-Fi/Wi-Fi List/android.widget.TextView3 - TALKTALKAA45DA'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.swipe(512, 1400, 512, 600)
    }
    
    Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi List/android.widget.TextView3 - TALKTALKAA45DA'), 20)

    Mobile.tap(findTestObject('Network/Wi-Fi/Wi-Fi List/android.widget.TextView3 - TALKTALKAA45DA'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView1 - Security'), 
        0)

    'Password field'
    Mobile.setText(findTestObject('Settings/Network and Internet/Forget Network/android.widget.EditText0'), '8T3R9PMG', 
        0)

    'Password is masked'
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.EditText0 - '), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.CheckBox0 - Show password'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Forget Network/android.widget.CheckBox0 - Show password'), 
        0)

    'Password is now displayed'
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.EditText0 - 8T3R9PMG'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Forget Network/android.widget.Button1 - CONNECT'), 0)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi List/android.widget.TextView3 - TALKTALKAA45DA'), 0)
} else if (userName == 'ROKiT') {
    if (Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView6 - ROKiT Test 5G'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.swipe(512, 1400, 512, 600)
    }
    
    if (Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView6 - ROKiT Test 5G'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.swipe(512, 1400, 512, 600)
    }
    
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView6 - ROKiT Test 5G'), 
        0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView6 - ROKiT Test 5G'), 
        0, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView0 - ROKiT Test 5G'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView1 - Security'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView2 - WPAWPA2 PSK'), 
        0)

    'Password field'
    Mobile.setText(findTestObject('Settings/Network and Internet/Forget Network/android.widget.EditText0'), 'qetuotuo', 
        0)

    'Password is masked'
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.EditText0 - '), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.CheckBox0 - Show password'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Forget Network/android.widget.CheckBox0 - Show password'), 
        0)

    'Password is now displayed'
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.EditText0 - qetuotuo'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Forget Network/android.widget.Button1 - CONNECT'), 0)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView3 - ROKiT Test 5G'), 
        0)
} else if (userName == 'Ovi') {
    if (Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView6 - ROKiT Test 5G'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.swipe(512, 1400, 512, 600)
    }
    
    if (Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView6 - ROKiT Test 5G'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.swipe(512, 1400, 512, 600)
    }
    
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView6 - ROKiT Test 5G'), 
        0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView6 - ROKiT Test 5G'), 
        0, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView0 - ROKiT Test 5G'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView1 - Security'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView2 - WPAWPA2 PSK'), 
        0)

    'Password field'
    Mobile.setText(findTestObject('Settings/Network and Internet/Forget Network/android.widget.EditText0'), 'qetuotuo', 
        0)

    'Password is masked'
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.EditText0 - '), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.CheckBox0 - Show password'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Forget Network/android.widget.CheckBox0 - Show password'), 
        0)

    'Password is now displayed'
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.EditText0 - qetuotuo'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Forget Network/android.widget.Button1 - CONNECT'), 0)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView3 - ROKiT Test 5G'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Forget Network/android.widget.TextView4 - Connected'), 
    15)

Mobile.pressHome()

