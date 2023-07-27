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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Reset options/Reset app preferences'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - System'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - System'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Advanced'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Advanced'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Developer options'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Developer options'), 
    0)

Mobile.scrollToText('System Tracing')

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - System Tracing'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - System Tracing'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Record trace'), 
    0)

'System Tracing ON'
Mobile.tap(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Record trace'), 
    0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'System Tracing OFF'
Mobile.tap(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Record trace'), 
    0)

Mobile.openNotifications()

not_run: Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Trace saved'), 
    3)

Mobile.tap(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Tap to share your trace'), 
    0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Share with Gmail (1)'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Share with Gmail (1)'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.Button0 - JUST ONCE (3)'), 
        0)
} else if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView2 - Gmail'), 
    4, FailureHandling.OPTIONAL)) {
    not_run: Mobile.swipe(527, 1928, 556, 1641)

    'Gmail'
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView2 - Gmail'), 
        4)

    'Gmail'
    Mobile.tap(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView2 - Gmail'), 
        4)

    'JUST ONCE'
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.Button0 - JUST ONCE (4)'), 
        4)

    'JUST ONCE'
    Mobile.tap(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.Button0 - JUST ONCE (4)'), 
        4)
} else {
    'Gmail'
    not_run: Mobile.tapAtPosition(300, 1300)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'JUST ONCE'
    Mobile.tapAtPosition(700, 1500)
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.TextView0 - Smart Compose'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.TextView0 - Smart Compose'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.Button0 - Got it'), 
        3)

    Mobile.tap(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.Button0 - Got it'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Compose'), 
    10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Compose'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.pressBack()
}

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Welcome to Gmail'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.pressBack()

    not_run: Mobile.getText(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Welcome to Gmail'), 
        0)
}

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Compose'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.pressBack()
}

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Compose'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.pressBack()
}

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView8 - Show quick settings tile'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView8 - Show quick settings tile'), 
        0)

    'Quick settings ON'
    Mobile.tap(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView8 - Show quick settings tile'), 
        0)
} else if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Show Quick Settings tile'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Show Quick Settings tile'), 
        0)

    'Quick settings ON'
    Mobile.tap(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Show Quick Settings tile'), 
        0)
}

Mobile.openNotifications()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(512, 200, 512, 1000)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView3 - Record trace'), 
    4)

Mobile.closeNotifications()

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView8 - Show quick settings tile'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView8 - Show quick settings tile'), 
        0)

    'Quick settings OFF'
    Mobile.tap(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView8 - Show quick settings tile'), 
        0)
} else if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Show Quick Settings tile'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Show Quick Settings tile'), 
        0)

    'Quick settings OFF'
    Mobile.tap(findTestObject('System Settings/System/Developer Options/System Tracing/android.widget.TextView0 - Show Quick Settings tile'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('System Tracing', '', TestLinkAPIResults.TEST_PASSED)

