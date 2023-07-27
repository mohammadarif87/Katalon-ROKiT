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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Bluetooth'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Rename Bluetooth - IO Pro Automation'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Remove Google Account'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('udid') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - Network  Internet'), 0)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView7 - Hotspot  tethering'), 
    0)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView7 - Hotspot  tethering'), 0)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView0 - Hotspot  tethering'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView6 - Bluetooth tethering'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Hotspot and Tethering/Bluetooth Tethering/android.widget.TextView0 - Share phones internet connection via Bluetooth'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView7 - Share phones Internet connection via Bluetooth'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.Switch1 - OFF'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView6 - Bluetooth tethering'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.Switch1 - ON'), 
    0)

'IO 3D'
WebUI.callTestCase(findTestCase('IO 3D/Settings/Network and Internet/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering'), 
    [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '8.1.0'
            , ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)', ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], 
    FailureHandling.STOP_ON_FAILURE)

'IO 3D'
WebUI.callTestCase(findTestCase('IO 3D/Settings/Network and Internet/Bluetooth Tethering/Turn on Bluetooth Tethering'), 
    [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '8.1.0'
            , ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)', ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], 
    FailureHandling.STOP_ON_FAILURE)

'IO 3D'
WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Turn On Mobile Data from Quick Settings'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Bluetooth'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Bluetooth'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('udid') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Mobile Data SIM 1 (O2 - UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Bluetooth/android.widget.TextView6 - Connected devices'), 
    0)

Mobile.tap(findTestObject('Preconditions/Turn on Bluetooth/android.widget.TextView6 - Connected devices'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView2 - Currently connected'), 
    0)

if (Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView5 - IO 3D Automation'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView5 - IO 3D Automation'), 
        3)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView5 - IO 3D Automation'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView0 - Device details'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView3 - IO 3D Automation'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView4 - Internet access'), 
        3)

    if (Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.Switch0 - OFF'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView4 - Internet access'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.Switch0 - ON'), 
            0)
    }
    
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.Switch0 - ON'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView6 - Previously connected devices'), 
        3)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView6 - Previously connected devices'), 
        0)

    'Header'
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView0 - Previously connected devices'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView2 - IO 3D Automation'), 
        5)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView2 - IO 3D Automation'), 
        0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    'Back button'
    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.ImageButton0'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView2 - Currently connected'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView5 - IO 3D Automation'), 
        10)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView5 - IO 3D Automation'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView0 - Device details'), 
        5)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView3 - IO 3D Automation'), 
        5)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView4 - Internet access'), 
        5)

    if (Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.Switch0 - OFF'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView4 - Internet access'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.Switch0 - ON'), 
            0)
    }
    
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.Switch0 - ON'), 
        0)
}

Mobile.pressHome()

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage2, 
    appActivity2)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.TextView0 - Welcome to Chrome'), 4)

'Chrome Logo'
Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.ImageView0'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Chrome App Pre-Installed/android.widget.TextView0 - By using Chrome you agree to the Google Terms of Service and the Google Chrome and Chrome OS Additional Terms of Service.'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.CheckBox0 - Help make Chrome better by sending usage statistics and crash reports to Google.'), 
    4)

Mobile.tap(findTestObject('Apps/Chrome/android.widget.CheckBox0 - Help make Chrome better by sending usage statistics and crash reports to Google.'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.Button0 - Accept  continue'), 4)

Mobile.tap(findTestObject('Apps/Chrome/android.widget.Button0 - Accept  continue'), 3)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Browser/Accept Cookies/android.widget.Button0 - No thanks'), 5)

    Mobile.tap(findTestObject('Browser/Accept Cookies/android.widget.Button0 - No thanks'), 3)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.Button0 - No thanks'), 0)

    Mobile.tap(findTestObject('Apps/Chrome/android.widget.Button0 - No thanks'), 0)
}

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

'Google Logo'
Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.FrameLayout7'), 
    3)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.EditText0 - Search or type web address'), 
    3)

if (userName == 'Aiden') {
    Mobile.setText(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.EditText0 - Search or type web address (1)'), 
        'bbc.com', 3)
} else {
    Mobile.setText(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.EditText0 - Search or type web address (1)'), 
        'bbc.co.uk', 0)
}

'Enter on Keyboard'
Mobile.tapAtPosition(1000, 1940)

'Connecting to bbc.co.uk using Bluetooth tethering'
Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.view.View20 - Welcome to the BBC'), 
    60)

'BBC website'
Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.webkit.WebView0 - BBC - Home'), 
    15)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Bluetooth'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

'IO 3D'
WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)', ('deviceId') : '0123456789ABCDEF'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

'IO Pro'
WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data from Quick Settings'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Bluetooth Tethering', '', TestLinkAPIResults.TEST_PASSED)

