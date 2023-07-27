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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('About Phone/Baseband Version/android.widget.TextView15 - System'), 0)

Mobile.tap(findTestObject('About Phone/Baseband Version/android.widget.TextView15 - System'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Baseband Version/android.widget.TextView9 - Advanced'), 0)

Mobile.tap(findTestObject('About Phone/Baseband Version/android.widget.TextView9 - Advanced'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Baseband Version/android.widget.TextView16 - About phone'), 0)

Mobile.tap(findTestObject('About Phone/Baseband Version/android.widget.TextView16 - About phone'), 0)

Mobile.scrollToText('Build number', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('About Phone/About phone - IP Address/android.widget.TextView7 - IP address'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'ROKiT') {
    //Mobile.verifyElementVisible(findTestObject('About Phone/About phone - IP Address/android.widget.TextView0 - fe804491dbfffe4656a6192.168.1.492605e000152a15a4491dbfffe4656a62605e000152a15ae1b7150d45d53c162605e000152a15a184 (1)'),
    //	3)
} else if (userName == 'Ovi') {
    Mobile.verifyElementVisible(findTestObject('About Phone/About phone - IP Address/android.widget.TextView0 - fe80ca0e80fffe21a032192.168.8.104fd10e953c319800ca0e80fffe21a032fd10e953c319800e58f3ae22a496b67'), 
        3)
} else if (userName == 'Aiden') {
    if (Mobile.verifyElementVisible(findTestObject('About Phone/About phone - IP Address/android.widget.TextView0 - fe804491dbfffe4656a6192.168.86.100'), 
        3, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('About Phone/About phone - IP Address/android.widget.TextView0 - fe804491dbfffe4656a6192.168.86.100'), 
            0)
    } else {
        Mobile.verifyElementVisible(findTestObject('About Phone/About phone - IP Address/android.widget.TextView0 - fe804491dbfffe4656a6192.168.1.492605e000152a15a4491dbfffe4656a62605e000152a15a80087a73284a7fcc2605e000152a15abb4'), 
            3)
    }
} else if (userName == 'User') {
    Mobile.verifyElementVisible(findTestObject('About Phone/About phone - IP Address/android.widget.TextView8 - fe80ca0e80fffed3efef'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('About phone - IP Address', '', 
    TestLinkAPIResults.TEST_PASSED)

