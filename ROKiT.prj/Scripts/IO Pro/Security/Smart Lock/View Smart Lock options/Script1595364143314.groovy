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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Set Lock Screen - PIN 1111'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.scrollToText('Security & location')

Mobile.verifyElementVisible(findTestObject('Security/Smart Lock/View Smart Lock options/android.widget.TextView0 - Security  location'), 
    3)

Mobile.tap(findTestObject('Security/Smart Lock/View Smart Lock options/android.widget.TextView0 - Security  location'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Smart Lock/View Smart Lock options/android.widget.TextView0 - Smart Lock'), 
    3)

Mobile.tap(findTestObject('Security/Smart Lock/View Smart Lock options/android.widget.TextView0 - Smart Lock'), 3)

Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView0 - Re-enter your PIN'), 
    3)

Mobile.setText(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.EditText0'), '1111', 0)

'Enter on Keypad'
Mobile.tapAtPosition(830, 1940)

Mobile.verifyElementVisible(findTestObject('Security/Smart Lock/View Smart Lock options/android.widget.TextView0 - Smart Lock (1)'), 
    3)

if (Mobile.verifyElementVisible(findTestObject('Security/Smart Lock/View Smart Lock options/android.widget.Button0 - UNDERSTOOD'), 
    3, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Security/Smart Lock/View Smart Lock options/android.widget.Button0 - UNDERSTOOD'), 3)
}

Mobile.verifyElementVisible(findTestObject('Security/Smart Lock/View Smart Lock options/android.widget.TextView0 - On-body detection'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Smart Lock/View Smart Lock options/android.widget.TextView0 - Keep your device unlocked while its on you'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Smart Lock/View Smart Lock options/android.widget.TextView0 - Trusted places'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Smart Lock/View Smart Lock options/android.widget.TextView0 - Add location where device should be unlocked'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Smart Lock/View Smart Lock options/android.widget.TextView0 - Trusted devices'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Smart Lock/View Smart Lock options/android.widget.TextView0 - Add device to keep this one unlocked when its nearby'), 
    3)

'Back button'
Mobile.tap(findTestObject('Security/Smart Lock/View Smart Lock options/android.widget.ImageButton0'), 3)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off PIN Lock Screen'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('View Smart Lock options', '', TestLinkAPIResults.TEST_PASSED)

