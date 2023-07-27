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

import testlink.api.java.client.TestLinkAPIResults

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView15 - System'), 
    0)

Mobile.tap(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView15 - System'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView9 - Advanced'), 
    0)

Mobile.tap(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView9 - Advanced'), 0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView16 - About phone'), 
    0)

Mobile.tap(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView16 - About phone'), 
    0)

Mobile.swipe(512, 1400, 512, 600)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Serial Number/android.widget.TextView6 - Model  hardware'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Serial Number/android.widget.TextView7 - Model IO Pro'), 
    0)

Mobile.tap(findTestObject('Settings/System/About Phone/View Serial Number/android.widget.TextView6 - Model  hardware'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Serial Number/android.widget.TextView0 - Model  hardware'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Serial Number/android.widget.TextView1 - Model'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Serial Number/android.widget.TextView2 - IO Pro'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Serial Number/android.widget.TextView3 - Serial number'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Serial Number/android.widget.TextView4 - IOPRO0123456789A'), 
    0)

Mobile.tap(findTestObject('Settings/System/About Phone/View Serial Number/android.widget.Button0 - OK'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'("View Serial number", "", TestLinkAPIResults.TEST_PASSED)