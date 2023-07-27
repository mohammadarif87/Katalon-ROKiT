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
        3)

    Mobile.tap(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google'), 3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Data management/android.widget.TextView0 - Rokit Phones'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Data management/android.widget.TextView0 - rokitphones715gmail.com'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google (1)'), 
        3)
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
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Account services'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Ads'), 3)

Mobile.scrollToText('On-device sharing')

Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Chromebook'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Backup'), 
    3)

Mobile.tap(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Backup'), 3)

Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Back up to Google Drive'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/Google/Backup/android.widget.Switch0 - ON (1)'), 3)

Mobile.tap(findTestObject('System Settings/Google/Backup/android.widget.Switch0 - ON (1)'), 3)

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Backup/android.widget.TextView0 - Turn off and delete backup'), 
        60)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Backup/android.widget.TextView0 - This devices backup for rokitphones715gmail.com will be permanently deleted from Google Drive.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Backup/android.widget.Button0 - CANCEL'), 3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Backup/android.widget.Button0 - TURN OFF  DELETE (1)'), 
        3)

    Mobile.tap(findTestObject('System Settings/Google/Backup/android.widget.Button0 - TURN OFF  DELETE (1)'), 3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Backup/android.widget.Switch0 - OFF'), 3)

    Mobile.tap(findTestObject('System Settings/Google/Backup/android.widget.Switch0 - OFF'), 3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Backup/android.widget.Switch0 - ON'), 3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Account (1)'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Backup/android.widget.TextView0 - rokitphones715gmail.com'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - IO Pro backup'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google Photos'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Contacts (2)'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.Button0 - Back up now'), 
        3)

    Mobile.tap(findTestObject('System Settings/Google/Backup/android.widget.Button0 - Back up now'), 3)
} else {
    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Backup/android.widget.TextView0 - Turn off and delete backup'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Backup/android.widget.TextView0 - This devices backup for rokittest1gmail.com will be permanently deleted from Google Drive.'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Backup/android.widget.Button0 - CANCEL'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Backup/android.widget.Button0 - TURN OFF AND DELETE'), 
        0)

    Mobile.tap(findTestObject('System Settings/Google/Backup/android.widget.Button0 - TURN OFF AND DELETE'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Backup/android.widget.Switch0 - OFF'), 0)

    Mobile.tap(findTestObject('System Settings/Google/Backup/android.widget.Switch0 - OFF'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Backup/android.widget.Switch0 - ON'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Account (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - rokittest1gmail.com (2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - IO Pro backup'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google Photos'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Contacts (2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.Button0 - Back up now'), 
        0)

    Mobile.tap(findTestObject('System Settings/Google/Backup/android.widget.Button0 - Back up now'), 0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Google Backup', '', TestLinkAPIResults.TEST_PASSED)

