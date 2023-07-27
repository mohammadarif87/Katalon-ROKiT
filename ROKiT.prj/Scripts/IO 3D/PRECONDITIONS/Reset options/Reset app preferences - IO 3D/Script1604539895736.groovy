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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.scrollToText('System')

Mobile.verifyElementVisible(findTestObject('Preconditions/Reset options/Reset app preferences/android.widget.TextView0 - System'), 
    0)

Mobile.tap(findTestObject('Preconditions/Reset options/Reset app preferences/android.widget.TextView0 - System'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Reset options/Reset app preferences/android.widget.TextView0 - Reset options'), 
    0)

Mobile.tap(findTestObject('Preconditions/Reset options/Reset app preferences/android.widget.TextView0 - Reset options'), 
    0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Reset options/Reset app preferences/android.widget.TextView0 - Reset app preferences'), 
    0)

Mobile.tap(findTestObject('Preconditions/Reset options/Reset app preferences/android.widget.TextView0 - Reset app preferences'), 
    0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Reset options/Reset app preferences/android.widget.TextView0 - Reset app preferences (1)'), 
    0)

Mobile.tap(findTestObject('Preconditions/Reset options/Reset app preferences/android.widget.Button0 - RESET APPS'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

