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

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView15 - System'), 
    0)

Mobile.tap(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView15 - System'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView9 - Advanced'), 
    0)

Mobile.tap(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView9 - Advanced'), 0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView16 - About phone'), 
    0)

Mobile.tap(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView16 - About phone'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView11 - Legal information'), 
    0)

Mobile.tap(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView11 - Legal information'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View Legal Information/android.widget.TextView0 - Third-party licenses'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/About Phone/View Legal Information/android.widget.TextView0 - Third-party licenses'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View Legal Information/android.widget.TextView0 - Third-party licenses (1)'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView2 - Third-party licences'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView2 - Third-party licences'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView0 - Third-party licences'), 
        0)
}

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView3 - Google legal'), 
    0)

Mobile.tap(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView3 - Google legal'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView0 - Google legal'), 
    0)

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View Legal Information/android.widget.TextView0 - System WebView licenses'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/About Phone/View Legal Information/android.widget.TextView0 - System WebView licenses'), 
        0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View Legal Information/android.widget.TextView0 - System WebView licenses (1)'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View Legal Information/android.widget.TextView0 - Credits'), 
        0)

    Mobile.pressBack()

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView5 - Wallpapers'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View Legal Information/android.widget.TextView0 - Satellite imagery providers2014 CNES  Astrium DigitalGlobe Bluesky'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView4 - System WebView licences'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView4 - System WebView licences'), 
        0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView0 - System WebView licences'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.view.View0 - Credits'), 
        0)

    Mobile.pressBack()

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView5 - Wallpapers'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView6 - Satellite imagery providers2014 CNESAstrium DigitalGlobe Bluesky'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('View Legal information', '', TestLinkAPIResults.TEST_PASSED)

