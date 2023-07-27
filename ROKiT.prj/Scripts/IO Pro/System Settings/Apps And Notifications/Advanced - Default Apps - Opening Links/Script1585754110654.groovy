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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
    0)

Mobile.swipe(512, 900, 512, 200)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView20 - Advanced'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView20 - Advanced'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView20 - Default apps'), 
    5)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView20 - Default apps'), 
    0)

'Header'
Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView0 - Default apps'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView16 - Opening links'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView16 - Opening links'), 
    0)

'Header'
Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView0 - Opening links'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView3 - Instant Apps'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView4 - Open links in apps even if theyre not installed'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.Switch0 - ON'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView5 - Instant Apps preferences'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView5 - Instant Apps preferences'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView0 - Google Play Instant'), 
    0)

'Back button'
Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.ImageButton0'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView7 - 3D Gallery'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView8 - Dont open supported links'), 
    0)

Mobile.swipe(512, 1000, 512, 200)

Mobile.swipe(512, 1000, 512, 200)

Mobile.swipe(512, 1000, 512, 200)

Mobile.swipe(512, 1000, 512, 200)

Mobile.swipe(512, 1000, 512, 200)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView17 - YouTube'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView18 - Open youtu.be and other URLs'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView17 - YouTube'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView0 - Open by default'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView2 - YouTube'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView5 - Open supported links'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView6 - Open in this app'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView5 - Open supported links'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.CheckedTextView0 - Open in this app'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.CheckedTextView1 - Ask every time'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.CheckedTextView2 - Dont open in this app'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.CheckedTextView0 - Open in this app'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView7 - Supported links'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView8 - Open youtu.be and other URLs'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView7 - Supported links'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView0 - Supported links'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView1 - youtu.be'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView2 - m.youtube.com'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView3 - youtube.com'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps - Opening Links/android.widget.TextView4 - www.youtube.com'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Advanced - Default apps - Opening links', 
    '', TestLinkAPIResults.TEST_PASSED)

