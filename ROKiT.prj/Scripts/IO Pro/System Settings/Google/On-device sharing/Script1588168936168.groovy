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

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account - US'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.scrollToText('Google')

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google'), 
        0)

    Mobile.tap(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Data management/android.widget.TextView0 - Rokit Phones'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Data management/android.widget.TextView0 - rokitphones715gmail.com'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google (1)'), 
        0)
} else {
    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.scrollToText('Google')

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google'), 
        0)

    Mobile.tap(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - ROKiT Test'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - rokittest1gmail.com'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google (1)'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.Button0 - Manage your Google Account'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Account services'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Ads'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Backup'), 
    0)

Mobile.scrollToText('On-device sharing')

Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Chromebook'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Device connections'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - On-device sharing'), 
    0)

Mobile.tap(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - On-device sharing'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Show content from'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('System Settings/Google/On-device sharing/android.widget.TextView0 - Keep notes'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Google/On-device sharing/android.widget.Switch0 - ON (2)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Google/On-device sharing/android.widget.Switch0 - ON (3)'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('On-device sharing', '', TestLinkAPIResults.TEST_PASSED)

