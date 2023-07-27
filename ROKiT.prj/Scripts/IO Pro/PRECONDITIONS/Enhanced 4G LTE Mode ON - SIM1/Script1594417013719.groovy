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

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Enhanced 4G LTE Mode OFF/android.widget.TextView0 - Mobile network'), 
    0)

Mobile.tap(findTestObject('Preconditions/Enhanced 4G LTE Mode OFF/android.widget.TextView0 - Mobile network'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Enhanced 4G LTE Mode OFF/android.widget.TextView0 - Advanced'), 
    0)

Mobile.tap(findTestObject('Preconditions/Enhanced 4G LTE Mode OFF/android.widget.TextView0 - Advanced'), 0)

if (Mobile.verifyElementVisible(findTestObject('Preconditions/Enhanced 4G LTE Mode OFF/android.widget.Switch0 - ON'), 0, FailureHandling.OPTIONAL)) {
    Mobile.comment('If VoLTE is ON, then check it is ON')

    Mobile.verifyElementVisible(findTestObject('Preconditions/Enhanced 4G LTE Mode OFF/android.widget.Switch0 - ON'), 5)
} else {
    Mobile.comment('Else if VoLTE is OFF then turn it ON')

    Mobile.verifyElementVisible(findTestObject('Preconditions/Enhanced 4G LTE Mode OFF/android.widget.TextView0 - Enhanced 4G LTE Mode'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Enhanced 4G LTE Mode OFF/android.widget.TextView0 - Use LTE services to improve voice and other communications (recommended)'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Enhanced 4G LTE Mode OFF/android.widget.TextView0 - Enhanced 4G LTE Mode'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Enhanced 4G LTE Mode OFF/android.widget.Switch0 - OFF'), 5)
}

Mobile.closeApplication()

