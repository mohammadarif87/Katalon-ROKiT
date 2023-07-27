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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Close All Recent Apps'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

'Show Keypad button'
Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

'0 on Dial pad'
Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 0)

'\'*\''
Mobile.tapAtPosition(195, 1665)

'\'*\''
not_run: Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - '), 0)

'\'#\''
Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 -  (1)'), 0)

'\'*\''
Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - '), 0)

'\'#\''
Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 -  (1)'), 0)

Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - 6'), 0)

Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - 4'), 0)

Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - 6'), 0)

Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - 6'), 0)

Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - 3'), 0)

'\'#\''
Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 -  (1)'), 0)

'\'*\''
Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - '), 0)

'\'#\''
Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 -  (1)'), 0)

'\'*\''
Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - '), 0)

'Header'
Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - EngineerMode'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - Telephony'), 0)

Mobile.scrollToText('Network Selecting')

Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - Network Selecting'), 
    3)

Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - Network Selecting'), 0)

'Header'
Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - SIM Select'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - SIM1'), 3)

Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - SIM1'), 0)

'Header'
Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - Network Selecting (1)'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - Set preferred network type'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - LTEUMTSGSM'), 0)

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - SIM2'), 0)

Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - SIM2'), 0)

'Header'
Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - Network Selecting (1)'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - Set preferred network type'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - LTEUMTSGSM'), 3)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Network Selecting', '', TestLinkAPIResults.TEST_PASSED)

