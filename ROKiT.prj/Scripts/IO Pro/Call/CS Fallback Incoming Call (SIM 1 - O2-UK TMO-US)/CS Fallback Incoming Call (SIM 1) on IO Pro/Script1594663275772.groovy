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

Mobile.comment('Run in parallel execution with Place Call CS Fallback (SIM 1 O2-UK) using IO 3D')

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Clear All Notifications'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
            , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
                , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 1 (O2 - UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn OFF Enhanced 4G LTE Mode (SIM1)'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('udid') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Clear All Notifications'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
            , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
                , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 1 (O2 - UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)
}

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

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

Mobile.comment('Answer Call')

Mobile.openNotifications()

'Waiting for Answer Call button'
Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.Button2 - ANSWER'), 300)

'Tap Answer Call button'
Mobile.tap(findTestObject('Phone App/Receive a call/android.widget.Button2 - ANSWER'), 0)

Mobile.closeNotifications()

'Mute'
Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView2'), 0)

'Keypad'
Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView3'), 0)

'Speaker'
Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView4'), 0)

'Add call'
Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView5'), 0)

'Hold'
Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView6'), 0)

Mobile.openNotifications()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 450, 540, 1800)

'4G Icon'
Mobile.verifyElementNotVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 4G'), 
    0)

'H+ Icon'
if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - H'), 
    5, FailureHandling.OPTIONAL)) {
    Mobile.closeNotifications()
}

'H Icon'
if (Mobile.verifyElementVisible(findTestObject('Phone App/3G Fallback (SIM 1 O2-UK)/android.widget.TextView10 - H'), 0, 
    FailureHandling.OPTIONAL)) {
    Mobile.closeNotifications()
}

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

if (userName == 'Aiden') {
    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn ON Enhanced 4G LTE Mode (SIM1)'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('udid') : 'IOPRO0123456789A', ('platformName') : 'Android']], 
        FailureHandling.STOP_ON_FAILURE)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('CS Fallback Incoming Call (SIM 1)', 
    'SIM 1 = O2-UK\nSIM 2 = EE', TestLinkAPIResults.TEST_PASSED)

