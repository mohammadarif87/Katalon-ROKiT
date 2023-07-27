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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.scrollToText('Storage')

Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView5 - Storage'), 0)

Mobile.tap(findTestObject('Settings/Storage/View Storage/android.widget.TextView5 - Storage'), 0)

'Header'
Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView0 - Storage'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView3 - Used of 64 GB'), 0)

'Percentage Usage graph'
Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.view.View0'), 0)

'Space used information'
Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.LinearLayout7'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView5 - Photos  videos'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView7 - Music  audio'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView9 - Games'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView11 - Movie  TV apps'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView13 - Other apps'), 0)

Mobile.tap(findTestObject('Settings/Storage/View Storage/android.widget.TextView5 - Photos  videos'), 0)

'Header'
Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView0 - Photos  videos'), 0)

not_run: Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView1 - Photos'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView3 - Images'), 0)

not_run: Mobile.tap(findTestObject('Settings/Storage/View Storage/android.widget.TextView1 - Photos'), 0)

'Header'
not_run: Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView0 - Storage'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView2 - Photos'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.Button0 - CLEAR STORAGE'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView4 - Space used'), 
    0)

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView7 - Music  audio'), 0)

Mobile.tap(findTestObject('Settings/Storage/View Storage/android.widget.TextView7 - Music  audio'), 0)

'Header'
Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView0 - Music  audio'), 0)

not_run: Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView1 - Google Play Music'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView3 - Audio files'), 0)

not_run: Mobile.tap(findTestObject('Settings/Storage/View Storage/android.widget.TextView1 - Google Play Music'), 0)

'Header'
not_run: Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView0 - Storage'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView2 - Google Play Music'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.Button0 - CLEAR STORAGE'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView4 - Space used'), 
    0)

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView11 - Movie  TV apps'), 
    0)

Mobile.tap(findTestObject('Settings/Storage/View Storage/android.widget.TextView11 - Movie  TV apps'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView0 - Movie  TV apps'), 0)

not_run: Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView1 - YouTube'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView3 - ROKFLiX 3D'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView5 - Google Play Movies  TV'), 
    0)

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView13 - Other apps'), 0)

Mobile.tap(findTestObject('Settings/Storage/View Storage/android.widget.TextView13 - Other apps'), 0)

'Header'
Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView0 - Apps storage'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView1 - Google Play services'), 
    0)

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(512, 1000, 512, 200)

Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView13 - Files'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView15 - System'), 0)

Mobile.tap(findTestObject('Settings/Storage/View Storage/android.widget.TextView15 - System'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.TextView0 - System includes files used to run Android version 9'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Storage/View Storage/android.widget.Button0 - OK'), 0)

Mobile.tap(findTestObject('Settings/Storage/View Storage/android.widget.Button0 - OK'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('View Storage', '', TestLinkAPIResults.TEST_PASSED)

