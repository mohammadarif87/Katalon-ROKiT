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

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Edit information'), 
    0)

Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Edit information'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Medical information'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Name'), 0)

Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Name'), 0)

Mobile.setText(findTestObject('About Phone/Edit Emergency information/android.widget.EditText0'), 'Automation Test', 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.Button0 - OK'), 0)

Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.Button0 - OK'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Address'), 
    0)

Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Address'), 0)

Mobile.setText(findTestObject('About Phone/Edit Emergency information/android.widget.EditText0 (1)'), 'Automation Test', 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.Button0 - OK (1)'), 0)

Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.Button0 - OK (1)'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Blood type'), 
    0)

Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Blood type'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.CheckedTextView0 - O'), 
    0)

Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.CheckedTextView0 - O'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Allergies'), 
    0)

Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Allergies'), 0)

Mobile.setText(findTestObject('About Phone/Edit Emergency information/android.widget.EditText0 (1)'), 'Automation Test', 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.Button0 - OK (1)'), 0)

Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.Button0 - OK (1)'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Medications'), 
    0)

Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Medications'), 0)

Mobile.setText(findTestObject('About Phone/Edit Emergency information/android.widget.EditText0 (1)'), 'Automation Test', 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.Button0 - OK (1)'), 0)

Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.Button0 - OK (1)'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Organ donor'), 
    0)

Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Organ donor'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.CheckedTextView0 - No'), 
    0)

Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.CheckedTextView0 - No'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Medical notes'), 
    0)

Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Medical notes'), 0)

Mobile.setText(findTestObject('About Phone/Edit Emergency information/android.widget.EditText0 (1)'), 'Automation Test', 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.Button0 - OK (1)'), 0)

Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.Button0 - OK (1)'), 0)

Mobile.pressBack()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(512, 300, 512, 1600)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Name (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Automation Test'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Address (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Automation Test (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Blood type (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - O'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Allergies (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Automation Test (2)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Medications (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Automation Test (3)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Organ donor (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - No'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Medical notes (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Automation Test (4)'), 
    0)

Mobile.pressHome()

Mobile.delay(3)

Mobile.swipe(540, 1800, 540, 450)

Mobile.swipe(540, 1800, 540, 450)

Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Settings'), 0)

Mobile.scrollToText('Security & location')

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.TextView0 - Security  location'), 0)

Mobile.tap(findTestObject('Security/Password/android.widget.TextView0 - Security  location'), 0)

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.TextView0 - Screen lock'), 0)

Mobile.tap(findTestObject('Security/Password/android.widget.TextView0 - Screen lock'), 0)

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.TextView0 - Password'), 0)

Mobile.tap(findTestObject('Security/Password/android.widget.TextView0 - Password'), 0)

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.Button0 - YES'), 0)

Mobile.tap(findTestObject('Security/Password/android.widget.Button0 - YES'), 0)

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.Button0 - OK'), 0)

Mobile.tap(findTestObject('Security/Password/android.widget.Button0 - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.EditText0'), 0)

Mobile.tap(findTestObject('Security/Password/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Security/Password/android.widget.EditText0'), 'test', 0)

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.Button0 - NEXT'), 0)

Mobile.tap(findTestObject('Security/Password/android.widget.Button0 - NEXT'), 0)

Mobile.setText(findTestObject('Security/Password/android.widget.EditText0'), 'test', 0)

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.Button0 - CONFIRM'), 0)

Mobile.tap(findTestObject('Security/Password/android.widget.Button0 - CONFIRM'), 0)

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.RadioButton0 - Show all notification content'), 
    0)

Mobile.tap(findTestObject('Security/Password/android.widget.RadioButton0 - Show all notification content'), 0)

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.Button0 - DONE'), 0)

Mobile.tap(findTestObject('Security/Password/android.widget.Button0 - DONE'), 0)

Mobile.pressHome()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

AndroidDriver<MobileElement> mobileDriver = MobileDriverFactory.getDriver()

mobileDriver.pressKey(new KeyEvent(AndroidKey.POWER))

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

mobileDriver.pressKey(new KeyEvent(AndroidKey.POWER))

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 1800, 540, 450)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.Button0 - EMERGENCY (1)'), 
    0)

Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.Button0 - EMERGENCY (1)'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

'Tap on EMERGENCY INFORMATION\r\n'
Mobile.tapAtPosition(550, 250)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'Tap again on EMERGENCY INFORMATION to open\r\n'
Mobile.tapAtPosition(550, 250)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Emergency information (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Automation Test (5)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Address (2)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Automation Test (6)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Blood type (2)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - O (1)'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Allergies (2)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Automation Test (7)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Medications (2)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Automation Test (8)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Organ donor (2)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - No (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.TextView0 - Medical notes (2)'), 
    0)

'Back button\r\n'
Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.ImageButton0'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('About Phone/Edit Emergency information/android.widget.EditText0 (2)'), 'test', 0)

'"OK" Button on keyboard'
Mobile.tapAtPosition(1010, 1920)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Password Lock Screen'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Emergency information'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Edit Emergency information', '', TestLinkAPIResults.TEST_PASSED)

