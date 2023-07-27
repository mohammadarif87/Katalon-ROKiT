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

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account - US'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)
}

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

Mobile.scrollToText('Add contact', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('About Phone/Add Emergency contact/android.widget.TextView0 - Add contact'), 
    0)

Mobile.tap(findTestObject('About Phone/Add Emergency contact/android.widget.TextView0 - Add contact'), 0)

Mobile.scrollToText('Automation Test Emergency')

Mobile.verifyElementVisible(findTestObject('About Phone/Add Emergency contact/android.widget.TextView0 - Automation Test Emergency (4)'), 
    0)

Mobile.tap(findTestObject('About Phone/Add Emergency contact/android.widget.TextView0 - Automation Test Emergency (4)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Add Emergency contact/android.widget.TextView0 - Automation Test Emergency (5)'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/Add Emergency contact/android.widget.TextView0 - Mobile  1 234-5'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('About Phone/Add Emergency contact/android.widget.TextView0 - Mobile  12345 (1)'), 
        0)
}

Mobile.pressHome()

Mobile.delay(3)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(3)

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

Mobile.swipe(540, 1800, 540, 300)

while (Mobile.verifyElementNotVisible(findTestObject('About Phone/Edit Emergency information/android.widget.Button0 - EMERGENCY (1)'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.swipe(540, 1800, 540, 300)
}

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

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/Emergency information (Call via Lockscreen)/android.widget.TextView4 - CONTACTS'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/Emergency information (Call via Lockscreen)/android.widget.TextView4 - CONTACTS'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/About Phone/Emergency information (Call via Lockscreen)/android.widget.TextView4 - CONTACTS'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('About Phone/Add Emergency contact/android.widget.TextView0 - Emergency contacts'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/Add Emergency contact/android.widget.TextView0 - Automation Test Emergency (3)'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/Add Emergency contact/android.widget.TextView0 - Mobile  1 234-5'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('About Phone/Add Emergency contact/android.widget.TextView0 - Mobile  12345 (1)'), 
        0)
}

'Back button\r\n'
Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.ImageButton0'), 0)

while (Mobile.verifyElementNotVisible(findTestObject('About Phone/Edit Emergency information/android.widget.Button0 - EMERGENCY (1)'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.pressBack()

    Mobile.swipe(540, 1800, 540, 300)
}

Mobile.verifyElementVisible(findTestObject('About Phone/Edit Emergency information/android.widget.Button0 - EMERGENCY (1)'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('About Phone/Edit Emergency information/android.widget.EditText0 (2)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('About Phone/Edit Emergency information/android.widget.EditText0 (2)'), 'test', 0)

'"OK" Button on keyboard'
Mobile.tapAtPosition(1010, 1920)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Password Lock Screen'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Emergency contact'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Add Emergency contact', '', TestLinkAPIResults.TEST_PASSED)

