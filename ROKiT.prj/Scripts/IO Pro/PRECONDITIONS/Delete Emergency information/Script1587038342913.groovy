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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('About Phone/Baseband Version/android.widget.TextView15 - System'), 0)

Mobile.tap(findTestObject('About Phone/Baseband Version/android.widget.TextView15 - System'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Baseband Version/android.widget.TextView9 - Advanced'), 0)

Mobile.tap(findTestObject('About Phone/Baseband Version/android.widget.TextView9 - Advanced'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Baseband Version/android.widget.TextView16 - About phone'), 0)

Mobile.tap(findTestObject('About Phone/Baseband Version/android.widget.TextView16 - About phone'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Emergency information'), 
    0)

Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Emergency information'), 0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Emergency information/android.widget.TextView0 - Edit information (1)'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Delete Emergency information/android.widget.TextView0 - Edit information (1)'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Edit information'), 
        0)

    Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Edit information'), 0)
}

Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Emergency information/android.widget.TextView0 - Name'), 
    0)

Mobile.tap(findTestObject('Preconditions/Delete Emergency information/android.widget.TextView0 - Name'), 0)

Mobile.clearText(findTestObject('Preconditions/Delete Emergency information/android.widget.EditText0 - Automation Test'), 
    0)

'Tap on "Name" to reveal the "OK" button. "OK" button is masked by auto-fill'
Mobile.tap(findTestObject('Preconditions/Delete Emergency information/android.widget.TextView0 - Name (2)'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Emergency information/android.widget.Button0 - OK'), 0)

Mobile.tap(findTestObject('Preconditions/Delete Emergency information/android.widget.Button0 - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Emergency information/android.widget.TextView0 - Address'), 
    0)

Mobile.tap(findTestObject('Preconditions/Delete Emergency information/android.widget.TextView0 - Address'), 0)

Mobile.clearText(findTestObject('Preconditions/Delete Emergency information/android.widget.EditText0 - Automation Test (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Emergency information/android.widget.Button0 - OK (1)'), 
    0)

Mobile.tap(findTestObject('Preconditions/Delete Emergency information/android.widget.Button0 - OK (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Emergency information/android.widget.TextView0 - Blood type'), 
    0)

Mobile.tap(findTestObject('Preconditions/Delete Emergency information/android.widget.TextView0 - Blood type'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Emergency information/android.widget.CheckedTextView0 - Unknown'), 
    0)

Mobile.tap(findTestObject('Preconditions/Delete Emergency information/android.widget.CheckedTextView0 - Unknown'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Emergency information/android.widget.TextView0 - Allergies'), 
    0)

Mobile.tap(findTestObject('Preconditions/Delete Emergency information/android.widget.TextView0 - Allergies'), 0)

Mobile.clearText(findTestObject('Preconditions/Delete Emergency information/android.widget.EditText0 - Automation Test (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Emergency information/android.widget.Button0 - OK (1)'), 
    0)

Mobile.tap(findTestObject('Preconditions/Delete Emergency information/android.widget.Button0 - OK (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Emergency information/android.widget.TextView0 - Medications'), 
    0)

Mobile.tap(findTestObject('Preconditions/Delete Emergency information/android.widget.TextView0 - Medications'), 0)

Mobile.clearText(findTestObject('Preconditions/Delete Emergency information/android.widget.EditText0 - Automation Test (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Emergency information/android.widget.Button0 - OK (1)'), 
    0)

Mobile.tap(findTestObject('Preconditions/Delete Emergency information/android.widget.Button0 - OK (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Emergency information/android.widget.TextView0 - Organ donor'), 
    0)

Mobile.tap(findTestObject('Preconditions/Delete Emergency information/android.widget.TextView0 - Organ donor'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Emergency information/android.widget.CheckedTextView0 - Unknown (1)'), 
    0)

Mobile.tap(findTestObject('Preconditions/Delete Emergency information/android.widget.CheckedTextView0 - Unknown (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Emergency information/android.widget.TextView0 - Medical notes'), 
    0)

Mobile.tap(findTestObject('Preconditions/Delete Emergency information/android.widget.TextView0 - Medical notes'), 0)

Mobile.clearText(findTestObject('Preconditions/Delete Emergency information/android.widget.EditText0 - Automation Test (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Emergency information/android.widget.Button0 - OK (1)'), 
    0)

Mobile.tap(findTestObject('Preconditions/Delete Emergency information/android.widget.Button0 - OK (1)'), 0)

Mobile.closeApplication()

