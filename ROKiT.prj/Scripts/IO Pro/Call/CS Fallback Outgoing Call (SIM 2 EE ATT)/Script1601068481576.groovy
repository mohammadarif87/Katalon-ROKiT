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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Clear All Notifications'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 2 (EE)(ATT)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn OFF Enhanced 4G LTE Mode (SIM2)'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    'Show Keypad button'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    '0 on Dial pad'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 0)

    Mobile.tapAtPosition(200, 1450)

    not_run: Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView5 - 4'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

    Mobile.tap(findTestObject('Call/Place Call CS Fallback (SIM 1 O2-UK) using IO 3D/android.widget.TextView0 - 3'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView5 - 4'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView5 - 4'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

    Mobile.tap(findTestObject('Call/Place Call CS Fallback (SIM 1 O2-UK) using IO 3D/android.widget.TextView0 - 3'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 0)

    Mobile.verifyElementVisible(findTestObject('Call/Place Call SIM 1 O2-UK TMO-US/Place Call (SIM 1 O2-UK TMO-US)/android.widget.EditText0 - (747) 344-7370'), 
        0)
} else {
    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    'Show Keypad button'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    '0 on Dial pad'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 0)

    'Tap at Position because sometimes the call button was being pressed instead of 0'
    Mobile.tapAtPosition(545, 1645)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView7 - 5'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView0 - 1'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView7 - 5'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView9 - 6'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView5 - 4'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView0 - 1'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView5 - 4'), 0)

    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.EditText0 - 07515 064104'), 
        0)
}

Mobile.openNotifications()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 450, 540, 1800)

'4G Icon'
if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 4G'), 
    10, FailureHandling.OPTIONAL)) {
    Mobile.closeNotifications()
}

'H+ Icon'
if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - H'), 
    5, FailureHandling.OPTIONAL)) {
    Mobile.closeNotifications()
}

Mobile.closeNotifications()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'Call button'
Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2 (1)'), 0)

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Call/CS Fallback Outgoing Call (SIM 1 O2-UK)/android.widget.TextView0 - Choose SIM for this call'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Call/CS Fallback Outgoing Call (SIM2 EE ATT)/android.widget.TextView0 - ATT'), 
        3)

    Mobile.tap(findTestObject('Call/CS Fallback Outgoing Call (SIM2 EE ATT)/android.widget.TextView0 - ATT'), 3)

    not_run: Mobile.tap(findTestObject('Call/CS Fallback Outgoing Call (SIM2 EE ATT)/android.widget.ImageView0'), 0)

    Mobile.verifyElementVisible(findTestObject('Call/CS Fallback Outgoing Call (SIM2 EE ATT)/android.widget.TextView0 - Calling via ATT'), 
        5)
} else {
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView0 - Choose a SIM for this call'), 
        0)

    'SIM 2 EE'
    Mobile.tap(findTestObject('Phone App/Place Call (SIM 2 EE)/android.widget.LinearLayout5'), 0)

    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 2 EE)/android.widget.TextView0 - Calling via EE'), 
        0)
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.openNotifications()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 450, 540, 1800)

'4G Icon'
Mobile.verifyElementNotVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 4G'), 
    0)

Mobile.closeNotifications()

'End Call button'
Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton0'), 0)

Mobile.openNotifications()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 450, 540, 1800)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'4G Icon'
if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 4G'), 
    10, FailureHandling.OPTIONAL)) {
    Mobile.closeNotifications()
}

'H+ Icon'
if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - H'), 
    5, FailureHandling.OPTIONAL)) {
    Mobile.closeNotifications()
}

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn ON Enhanced 4G LTE Mode (SIM2)'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 1 (O2 - UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], 
        FailureHandling.STOP_ON_FAILURE)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('CS Fallback Outgoing Call (SIM 2)', 'SIM 2 = EE', 
    TestLinkAPIResults.TEST_PASSED)

