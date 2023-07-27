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
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], 
        FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], 
        FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Download Network Cell Info App'), [('appPackage') : 'com.android.vending'
        , ('appActivity') : '.AssetBrowserActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Android Market/App in DUT Settings/android.widget.TextView0 - Apps  notifications'), 
    3)

Mobile.tap(findTestObject('Android Market/App in DUT Settings/android.widget.TextView0 - Apps  notifications'), 0)

Mobile.verifyElementVisible(findTestObject('Android Market/App in DUT Settings/android.widget.TextView0 - Network Cell Info Lite'), 
    3)

Mobile.tap(findTestObject('Android Market/App in DUT Settings/android.widget.TextView0 - Network Cell Info Lite'), 0)

Mobile.verifyElementVisible(findTestObject('Android Market/App in DUT Settings/android.widget.TextView0 - Permissions'), 
    3)

Mobile.verifyElementVisible(findTestObject('Android Market/App in DUT Settings/android.widget.TextView0 - No permissions granted'), 
    0)

Mobile.verifyElementVisible(findTestObject('Android Market/App in DUT Settings/android.widget.TextView0 - Storage'), 3)

Mobile.tap(findTestObject('Android Market/App in DUT Settings/android.widget.TextView0 - Advanced'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(512, 1700, 512, 300)

Mobile.verifyElementVisible(findTestObject('Android Market/App in DUT Settings/android.widget.TextView0 - version 5.0.23'), 
    3)

Mobile.closeApplication()

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Uninstall Network Cell Info App'), [('appPackage') : 'com.android.vending'
        , ('appActivity') : '.AssetBrowserActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('App in DUT Settings', '', TestLinkAPIResults.TEST_PASSED)

