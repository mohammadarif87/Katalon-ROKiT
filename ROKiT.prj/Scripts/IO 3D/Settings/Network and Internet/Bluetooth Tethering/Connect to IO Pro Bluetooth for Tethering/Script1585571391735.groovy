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
import testlink.api.java.client.TestLinkAPIResults as TestLinkAPIResults
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

Mobile.comment('Test case required IO 3D to have manually been paired previously')

WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Turn off Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)', ('deviceId') : '0123456789ABCDEF'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Turn Off Mobile Data from Quick Settings'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Turn on Bluetooth'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)', ('deviceId') : '0123456789ABCDEF'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView4 - Connected devices'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView4 - Connected devices'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView1 - Bluetooth'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView1 - Bluetooth'), 
        0)

    'Bluetooth Header'
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView0 - Bluetooth'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView3 - Paired devices'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView4 - IO Pro Automation'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView5 - Pair new device'), 
        0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView5 - Connected'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView4 - IO Pro Automation'), 
            0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
    }
    
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView5 - Connected'), 
        0)

    'Settings Cog'
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.ImageView1'), 
        0)

    'Settings Cog'
    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.ImageView1'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView0 - Paired devices'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView2 - Use for'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.CheckBox0 - Internet access'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.CheckBox0 - Internet access'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView0 - Disable profile'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView0 - Disable profile'), 
            3)

        Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.Button0 - CANCEL'), 
            3)

        Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.Button0 - CANCEL'), 
            0)
    }
    
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.Button1 - OK'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView4 - IO Pro Automation'), 
        0)

    if (Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView5 - Connected'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView4 - IO Pro Automation'), 
            0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
    }
    
    Mobile.comment('Open Chrome whilst connected to Bluetooth tethering device')

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage2, 
        appActivity2)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.TextView0 - Welcome to Chrome'), 4)

    'Chrome Logo'
    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.ImageView0'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Chrome App Pre-Installed/android.widget.TextView0 - By using Chrome you agree to the Google Terms of Service and the Google Chrome and Chrome OS Additional Terms of Service.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.CheckBox0 - Help make Chrome better by sending usage statistics and crash reports to Google.'), 
        3)

    Mobile.tap(findTestObject('Apps/Chrome/android.widget.CheckBox0 - Help make Chrome better by sending usage statistics and crash reports to Google.'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.Button0 - Accept  continue'), 3)

    Mobile.tap(findTestObject('Apps/Chrome/android.widget.Button0 - Accept  continue'), 0)

    Mobile.verifyElementVisible(findTestObject('Browser/Accept Cookies/android.widget.Button0 - No thanks'), 5)

    Mobile.tap(findTestObject('Browser/Accept Cookies/android.widget.Button0 - No thanks'), 0)

    'Google Logo'
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.FrameLayout7'), 
        5)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.EditText0 - Search or type web address'), 
        0)

    Mobile.setText(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.EditText0 - Search or type web address (1)'), 
        'bbc.com', 3)

    Mobile.tapAtPosition(670, 1270)

    'Connecting to bbc.co.uk using Bluetooth tethering'
    Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

    'BBC Logo'
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.view.View15 - BBC'), 
        60)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView4 - Connected devices'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView4 - Connected devices'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView1 - Bluetooth'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView1 - Bluetooth'), 
        0)

    'Bluetooth Header'
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView0 - Bluetooth'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView3 - Paired devices'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView4 - IO Pro Automation'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView5 - Pair new device'), 
        0)

    if (Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView5 - Connected'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView4 - IO Pro Automation'), 
            0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
    }
    
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView5 - Connected'), 
        0)

    'Settings Cog'
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.ImageView1'), 
        0)

    'Settings Cog'
    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.ImageView1'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView0 - Paired devices'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView2 - Use for'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.CheckBox0 - Internet access'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.CheckBox0 - Internet access'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView0 - Disable profile'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView0 - Disable profile'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.Button0 - CANCEL'), 
            0)

        Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.Button0 - CANCEL'), 
            0)
    }
    
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.Button1 - OK'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView4 - IO Pro Automation'), 
        0)

    if (Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView5 - Connected'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView4 - IO Pro Automation'), 
            0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
    }
    
    Mobile.comment('Open Chrome whilst connected to Bluetooth tethering device')

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage2, 
        appActivity2)

    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.TextView0 - Welcome to Chrome'), 0)

    'Chrome Logo'
    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.ImageView0'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Chrome App Pre-Installed/android.widget.TextView0 - By using Chrome you agree to the Google Terms of Service and the Google Chrome and Chrome OS Additional Terms of Service.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.CheckBox0 - Help make Chrome better by sending usage statistics and crash reports to Google.'), 
        0)

    Mobile.tap(findTestObject('Apps/Chrome/android.widget.CheckBox0 - Help make Chrome better by sending usage statistics and crash reports to Google.'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.Button0 - Accept  continue'), 0)

    Mobile.tap(findTestObject('Apps/Chrome/android.widget.Button0 - Accept  continue'), 0)

    Mobile.verifyElementVisible(findTestObject('Browser/Accept Cookies/android.widget.Button0 - No thanks'), 5)

    Mobile.tap(findTestObject('Browser/Accept Cookies/android.widget.Button0 - No thanks'), 0)

    'Google Logo'
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.FrameLayout7'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.EditText0 - Search or type web address'), 
        0)

    Mobile.setText(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.EditText0 - Search or type web address (1)'), 
        'bbc.co.uk', 0)

    Mobile.tapAtPosition(670, 1270)

    'Connecting to bbc.co.uk using Bluetooth tethering'
    Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.view.View20 - Welcome to the BBC'), 
        60)

    not_run: if (Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.webkit.WebView0 - BBC - Home'), 
        15, FailureHandling.OPTIONAL)) {
        'Refresh website'
        Mobile.swipe(512, 230, 512, 1000)

        Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

        if (Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.webkit.WebView0 - BBC - Home'), 
            15, FailureHandling.OPTIONAL)) {
            AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

            driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

            Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

            driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

            Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

            driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

            Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

            driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

            Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

            'BBC website'
            Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.webkit.WebView0 - BBC - Home'), 
                15)
        }
    } else {
        'BBC website'
        not_run: Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Connect to IO Pro Wi-Fi Hotspot/android.webkit.WebView0 - BBC - Home'), 
            15)
    }
    
    Mobile.comment('Disconnect from IO Pro Bluetooth')

    not_run: Mobile.pressHome()

    not_run: Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    not_run: Mobile.swipe(500, 1000, 500, 200)

    not_run: Mobile.swipe(500, 1000, 500, 200)

    not_run: Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView13 - Settings'), 
        0)

    not_run: Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView13 - Settings'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView4 - Connected devices'), 
        0)

    not_run: Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView4 - Connected devices'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView1 - Bluetooth'), 
        0)

    not_run: Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView1 - Bluetooth'), 
        0)

    'Bluetooth Header'
    not_run: Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView0 - Bluetooth'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView4 - IO Pro Automation'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView5 - Connected'), 
        0)

    not_run: Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView4 - IO Pro Automation'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.TextView0 - Disconnect device'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.Button0 - CANCEL'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.Button1 - OK'), 
        0)

    not_run: Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Connect to IO Pro Bluetooth for Tethering/android.widget.Button1 - OK'), 
        0)

    not_run: Mobile.pressHome()
}

Mobile.pressHome()

