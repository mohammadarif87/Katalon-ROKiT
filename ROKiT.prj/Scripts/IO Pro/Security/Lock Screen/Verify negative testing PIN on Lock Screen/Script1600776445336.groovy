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

Mobile.scrollToText('Security & location', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - Security  location'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - Security  location'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - Screen lock'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - Screen lock'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - PIN'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - PIN'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - Secure start-up'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.Button0 - NO'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.Button0 - NO'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - Set screen lock'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - For security set PIN'), 
    3)

Mobile.setText(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.EditText0'), 
    '1111', 3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.Button0 - NEXT'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.Button0 - NEXT'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - Re-enter your PIN'), 
    3)

Mobile.setText(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.EditText0'), 
    '1111', 3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.Button0 - CLEAR'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.Button0 - CONFIRM'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.Button0 - CONFIRM'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.RadioButton0 - Show all notification content'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.RadioButton0 - Hide sensitive content'), 
    3)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.RadioButton0 - Dont show notifications at all'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.RadioButton0 - Dont show notifications at all'), 
        3)
}

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.Button0 - DONE'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.Button0 - DONE'), 
    3)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

AndroidDriver<MobileElement> mobileDriver = MobileDriverFactory.getDriver()

mobileDriver.pressKey(new KeyEvent(AndroidKey.POWER))

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

mobileDriver.pressKey(new KeyEvent(AndroidKey.POWER))

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 1800, 540, 450)

Mobile.tap(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - 1'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - 1'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - 1'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 2'), 
    3)

'Enter button on keyboard'
Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.ImageButton0'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - Wrong PIN'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 1'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 2'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 3'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 3'), 
    3)

'Enter button on keyboard'
Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.ImageButton0'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - Wrong PIN'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 1'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 2'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 3'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 2'), 
    3)

'Enter button on keyboard'
Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.ImageButton0'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - Wrong PIN'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 1'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 1'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 1'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 2'), 
    3)

'Enter button on keyboard'
Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.ImageButton0'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - Wrong PIN'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 1'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 4'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 7'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 5'), 
    3)

'Enter button on keyboard'
Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.ImageButton0'), 
    3)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'"Try again in 30 seconds" text'
Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - Try again'), 
    3)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 1'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 1'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 1'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify negative testing PIN on Lock Screen/android.widget.TextView0 - 1'), 
    3)

'Enter button on keyboard\r\n'
Mobile.tap(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.ImageButton0'), 
    3)

Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView10 - Screen lock'), 
    3)

Mobile.tap(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView10 - Screen lock'), 3)

Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView0 - Re-enter your PIN'), 
    3)

Mobile.setText(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.EditText0'), '1111', 3)

'Enter on Keypad'
Mobile.tapAtPosition(830, 1940)

'Header'
Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView0 - Choose screen lock'), 
    3)

Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView3 - Swipe'), 
    3)

Mobile.tap(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView3 - Swipe'), 3)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView0 - Remove device protection'), 
    3)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView1 - Device protection features will not work without your PIN.'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.Button0 - CANCEL'), 
    3)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.Button1 - YES REMOVE'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.Button0 - YES REMOVE'), 
    3)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Verify negative testing PIN on Lock Screen', 
    '', TestLinkAPIResults.TEST_PASSED)

