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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView2 - WiFi'), 0)

Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView2 - WiFi'), 0)

if (Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.Switch0 - ON'), 0, FailureHandling.OPTIONAL)) {
    Mobile.comment('If Wi-Fi is ON, then check it is ON and connected to ROKiT Test 5G')

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.Switch0 - ON'), 0)

    not_run: Mobile.waitForElementPresent(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView3 - ROKiT Test 5G'), 
        10)

    not_run: Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView3 - ROKiT Test 5G'), 
        0)

    Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Connected'), 30)
} else {
    Mobile.comment('Else if Wi-Fi is OFF then turn it on and check it connects to ROKiT Test 5G')

    Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.Switch0 - OFF'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    not_run: Mobile.waitForElementPresent(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView3 - ROKiT Test 5G'), 
        10)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.Switch0 - ON'), 0)

    not_run: Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView3 - ROKiT Test 5G'), 
        0)

    Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Connected'), 30)
}

Mobile.closeApplication()

