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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - Network  Internet'), 0)

Mobile.tap(findTestObject('Preconditions/Rename WiFi Hotspot/android.widget.TextView0 - Hotspot  tethering'), 0)

Mobile.tap(findTestObject('Preconditions/Rename WiFi Hotspot/android.widget.TextView0 - WiFi hotspot'), 0)

if (Mobile.verifyElementVisible(findTestObject('Preconditions/Rename WiFi Hotspot/android.widget.TextView0 - IO Pro Hotspot'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Preconditions/Rename WiFi Hotspot/android.widget.TextView0 - IO Pro Hotspot'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Preconditions/Rename WiFi Hotspot/android.widget.TextView0 - Hotspot name'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Rename WiFi Hotspot/android.widget.TextView0 - Hotspot name'), 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Rename WiFi Hotspot/android.widget.TextView0 - Hotspot name (1)'), 
        0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.tapAndHoldAtPosition(1010, 1800, 3)

    Mobile.setText(findTestObject('Preconditions/Rename WiFi Hotspot/android.widget.EditText0'), 'IO Pro Hotspot', 0)

    Mobile.tap(findTestObject('Preconditions/Rename WiFi Hotspot/android.widget.Button0 - OK'), 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Rename WiFi Hotspot/android.widget.TextView0 - IO Pro Hotspot'), 
        0)
}

Mobile.comment('Change Hotspot Password')

Mobile.verifyElementVisible(findTestObject('Preconditions/Rename WiFi Hotspot/android.widget.TextView7 - Hotspot password'), 
    0)

Mobile.tap(findTestObject('Preconditions/Rename WiFi Hotspot/android.widget.TextView7 - Hotspot password'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Rename WiFi Hotspot/android.widget.TextView0 - Hotspot password'), 
    3)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(1000, 1790, 4)

Mobile.verifyElementVisible(findTestObject('Preconditions/Rename WiFi Hotspot/android.widget.EditText0 (1)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Preconditions/Rename WiFi Hotspot/android.widget.EditText0 (1)'), 'testpassword', 0)

Mobile.tap(findTestObject('Preconditions/Rename WiFi Hotspot/android.widget.Button1 - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Rename WiFi Hotspot/android.widget.TextView0 - IO Pro Hotspot'), 
    0)

Mobile.closeApplication()

