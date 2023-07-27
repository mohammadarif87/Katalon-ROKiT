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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Remove Google Account'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Backup/android.widget.TextView0 - System'), 0)

Mobile.tap(findTestObject('System Settings/System/Backup/android.widget.TextView0 - System'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Backup/android.widget.TextView0 - Backup'), 0)

Mobile.tap(findTestObject('System Settings/System/Backup/android.widget.TextView0 - Backup'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Backup/android.widget.TextView0 - Back up to Google Drive'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Backup/android.widget.TextView0 - Back up to Google Drive'), 0)

Mobile.verifyElementText(findTestObject('System Settings/System/Backup/android.widget.TextView0 - Turn off and delete backup'), 
    'Turn off and delete backup?')

Mobile.verifyElementVisible(findTestObject('System Settings/System/Backup/android.widget.TextView0 - This devices backup data in Google Drive will be permanently deleted.'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Backup/android.widget.Button0 - CANCEL'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Backup/android.widget.TextView0 - Account'), 0)

Mobile.tap(findTestObject('System Settings/System/Backup/android.widget.TextView0 - Account'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('System Settings/System/Backup/android.webkit.WebView0'), 0)

Mobile.pressBack()

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Backup', '', TestLinkAPIResults.TEST_PASSED)

