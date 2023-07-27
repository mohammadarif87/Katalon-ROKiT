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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Bluetooth'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Rename Bluetooth - IO Pro Automation/android.widget.TextView6 - Connected devices'), 
    0)

Mobile.tap(findTestObject('Preconditions/Rename Bluetooth - IO Pro Automation/android.widget.TextView6 - Connected devices'), 
    0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Rename Bluetooth - IO Pro Automation/android.widget.TextView7 - Connection preferences'), 
    0)

Mobile.tap(findTestObject('Preconditions/Rename Bluetooth - IO Pro Automation/android.widget.TextView7 - Connection preferences'), 
    0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Rename Bluetooth - IO Pro Automation/android.widget.TextView2 - Bluetooth'), 
    0)

Mobile.tap(findTestObject('Preconditions/Rename Bluetooth - IO Pro Automation/android.widget.TextView2 - Bluetooth'), 0)

'Bluetooth Header'
Mobile.verifyElementVisible(findTestObject('Preconditions/Rename Bluetooth - IO Pro Automation/android.widget.TextView0 - Bluetooth'), 
    0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Rename Bluetooth - IO Pro Automation/android.widget.TextView3 - Device name'), 
    0)

if (Mobile.verifyElementVisible(findTestObject('Preconditions/Rename Bluetooth - IO Pro Automation/android.widget.TextView4 - IO Pro Automation'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Preconditions/Rename Bluetooth - IO Pro Automation/android.widget.TextView4 - IO Pro Automation'), 
        0)

    Mobile.closeApplication()
} else {
    Mobile.tap(findTestObject('Preconditions/Rename Bluetooth - IO Pro Automation/android.widget.TextView3 - Device name'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Rename Bluetooth - IO Pro Automation/android.widget.TextView0 - Rename this device'), 
        0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tapAndHoldAtPosition(1010, 1800, 3)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Rename Wi-Fi Direct/android.widget.EditText0'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Preconditions/Rename Bluetooth - IO Pro Automation/android.widget.EditText0'), 'IO Pro Automation', 
        0)

    Mobile.tap(findTestObject('Preconditions/Rename Bluetooth - IO Pro Automation/android.widget.Button1 - RENAME'), 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Rename Bluetooth - IO Pro Automation/android.widget.TextView4 - IO Pro Automation'), 
        0)

    Mobile.closeApplication()
}

