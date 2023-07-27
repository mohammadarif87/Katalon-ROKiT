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

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView2 - Assist  voice input'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView3 - Google'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView2 - Assist  voice input'), 
    0)

'Header'
Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView0 - Assist  voice input'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView2 - Assist app'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView3 - Google (1)'), 
    0)

'Back Button'
Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.ImageButton0'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView5 - Browser app'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView6 - Chrome'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView5 - Browser app'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView0 - Browser app'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView1 - Chrome'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView2 - Internet'), 
    0)

'Back Button'
Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.ImageButton0'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView8 - Home app'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView9 - LaunchPad'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView10 - Phone app'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView11 - Phone'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView13 - SMS app'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView14 - Messages'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Advanced - Default apps', '', TestLinkAPIResults.TEST_PASSED)

