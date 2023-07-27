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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

'Swipe in Settings'
device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 2

int endX = startX

int startY = device_Height * 0.85 // starts almost at the bottom of the screen

int endY = device_Height * 0.5 // stops scrolling almost at the top of the screen

Mobile.verifyElementVisible(findTestObject('Apps/Google Contacts Sync/android.widget.TextView8 - Apps  notifications'), 
    0)

Mobile.tap(findTestObject('Apps/Google Contacts Sync/android.widget.TextView8 - Apps  notifications'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Google Contacts Sync/android.widget.LinearLayout27'), 0)

'See all apps button'
Mobile.tap(findTestObject('Apps/Google Contacts Sync/android.widget.LinearLayout27'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Google Contacts Sync/android.widget.TextView0 - App info'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Google Contacts Sync/android.widget.TextView1 - All apps'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Google Contacts Sync/android.widget.TextView2 - 3D Camera'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Google Contacts Sync/android.widget.TextView4 - 3D Gallery'), 0)

'3 dots in the top right'
Mobile.tap(findTestObject('Apps/Google Contacts Sync/android.widget.ImageButton1'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Google Contacts Sync/android.widget.TextView0 - Show system'), 0)

Mobile.tap(findTestObject('Apps/Google Contacts Sync/android.widget.TextView0 - Show system'), 0)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

if (Mobile.verifyElementNotVisible(findTestObject('Apps/Google Contacts Sync/android.widget.TextView10 - Google Contacts Sync'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.swipe(startX, startY, endX, endY)
}

if (Mobile.verifyElementNotVisible(findTestObject('Apps/Google Contacts Sync/android.widget.TextView10 - Google Contacts Sync'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.swipe(startX, startY, endX, endY)
}

Mobile.verifyElementVisible(findTestObject('Apps/Google Contacts Sync/android.widget.TextView10 - Google Contacts Sync'), 
    0)

Mobile.tap(findTestObject('Apps/Google Contacts Sync/android.widget.TextView10 - Google Contacts Sync'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Google Contacts Sync/android.widget.TextView2 - Google Contacts Sync'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/Google Contacts Sync/android.widget.TextView3 - Installed'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Google Contacts Sync/android.widget.Button0 - DISABLE'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Contacts Sync Adapter App Pre-Installed', 
    '', TestLinkAPIResults.TEST_PASSED)

