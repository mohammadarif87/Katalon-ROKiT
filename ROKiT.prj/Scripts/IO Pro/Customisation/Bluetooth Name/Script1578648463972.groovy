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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Bluetooth'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Rename Bluetooth - IO Pro Automation'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Customisation/Bluetooth Name/android.widget.TextView6 - Connected devices'), 
    0)

Mobile.tap(findTestObject('Customisation/Bluetooth Name/android.widget.TextView6 - Connected devices'), 0)

Mobile.verifyElementVisible(findTestObject('Customisation/Bluetooth Name/android.widget.TextView7 - Connection preferences'), 
    0)

Mobile.tap(findTestObject('Customisation/Bluetooth Name/android.widget.TextView7 - Connection preferences'), 0)

Mobile.verifyElementVisible(findTestObject('Customisation/Bluetooth Name/android.widget.TextView2 - Bluetooth'), 0)

Mobile.tap(findTestObject('Customisation/Bluetooth Name/android.widget.TextView2 - Bluetooth'), 0)

Mobile.verifyElementVisible(findTestObject('Customisation/Bluetooth Name/android.widget.TextView3 - Device name'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Rename Bluetooth - IO Pro Automation/android.widget.TextView4 - IO Pro Automation'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Bluetooth Name', '', TestLinkAPIResults.TEST_PASSED)

