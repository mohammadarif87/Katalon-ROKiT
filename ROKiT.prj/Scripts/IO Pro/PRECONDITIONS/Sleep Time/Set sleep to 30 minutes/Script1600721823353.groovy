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

Mobile.scrollToText('Display')

Mobile.verifyElementVisible(findTestObject('Preconditions/Sleep Time/Set sleep to 30 seconds/android.widget.TextView0 - Display'), 
    3)

Mobile.tap(findTestObject('Preconditions/Sleep Time/Set sleep to 30 seconds/android.widget.TextView0 - Display'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Sleep Time/Set sleep to 30 seconds/android.widget.TextView0 - Advanced'), 
    3)

Mobile.tap(findTestObject('Preconditions/Sleep Time/Set sleep to 30 seconds/android.widget.TextView0 - Advanced'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Sleep Time/Set sleep to 30 seconds/android.widget.TextView0 - Sleep'), 
    3)

Mobile.tap(findTestObject('Preconditions/Sleep Time/Set sleep to 30 seconds/android.widget.TextView0 - Sleep'), 0)

Mobile.tap(findTestObject('Preconditions/Sleep Time/android.widget.CheckedTextView0 - 30 minutes'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Sleep Time/android.widget.TextView0 - After 30 minutes of inactivity'), 
    3)

Mobile.closeApplication()

