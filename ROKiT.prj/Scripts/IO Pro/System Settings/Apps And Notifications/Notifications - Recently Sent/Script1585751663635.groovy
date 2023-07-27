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

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - Recently Sent/android.widget.TextView20 - Notifications'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Notifications - Recently Sent/android.widget.TextView20 - Notifications'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - Recently Sent/android.widget.TextView9 - Recently sent'), 
    0)

'First App in Recently Sent'
Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - Recently Sent/android.widget.LinearLayout14'), 
    0)

'Second App in Recently Sent'
Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - Recently Sent/android.widget.LinearLayout19'), 
    0)

'Third App in Recently Sent'
Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - Recently Sent/android.widget.LinearLayout24'), 
    0)

Mobile.scrollToText('See all from last 7 days', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - Recently Sent/android.widget.TextView16 - See all from last 7 days'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Notifications - Recently Sent/android.widget.TextView16 - See all from last 7 days'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - Recently Sent/android.widget.TextView1 - Most recent'), 
    6)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Notifications - Recently Sent/android.widget.TextView1 - Most recent'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - Recently Sent/android.widget.CheckedTextView0 - Most recent'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - Recently Sent/android.widget.CheckedTextView1 - Most frequent'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Notifications - Recently Sent/android.widget.CheckedTextView1 - Most frequent'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - Recently Sent/android.widget.TextView1 - Most frequent'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Notifications - Recently sent', '', TestLinkAPIResults.TEST_PASSED)

