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

not_run: Mobile.swipe(540, 1800, 540, 450)

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

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.Button0 - EMERGENCY'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.Button0 - EMERGENCY'), 3)

not_run: Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.Button0 - EMERGENCY INFORMATION (1)'), 
    3)

not_run: Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.TextView0 - 1'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.TextView0 - 2'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.TextView0 - 3'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.TextView0 - 4'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.TextView0 - 5'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.TextView0 - 6'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.TextView0 - 7'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.TextView0 - 8'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.TextView0 - 9'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.TextView0 - WXYZ'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.TextView0 - 0'), 
    0)

'Call Button on dialler'
not_run: Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.ImageButton0'), 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'"1" button on dialler'
Mobile.tapAtPosition(260, 770)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'"2" button on dialler'
Mobile.tapAtPosition(540, 770)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'"3" button on dialler'
Mobile.tapAtPosition(830, 770)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'"4" button on dialler'
Mobile.tapAtPosition(260, 1030)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'"5" button on dialler'
Mobile.tapAtPosition(540, 1030)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'"6" button on dialler'
Mobile.tapAtPosition(830, 1030)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'"7" button on dialler'
Mobile.tapAtPosition(260, 1270)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'"8" button on dialler'
Mobile.tapAtPosition(540, 1270)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'"9" button on dialler'
Mobile.tapAtPosition(830, 1270)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'"0" button on dialler'
Mobile.tapAtPosition(540, 1520)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Call Button on dialler'
Mobile.tapAtPosition(530, 1800)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.TextView0 - Emergency call'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.TextView1 - Cant call. 1234567890 is not an emergency number.'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.Button0 - OK'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Lockscreen Emergency Dialler/android.widget.Button0 - OK'), 3)

Mobile.pressBack()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 1800, 540, 450)

Mobile.tap(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - 1'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - 1'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - 1'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - 1'), 
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

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.Button1 - YES REMOVE'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.Button0 - CANCEL'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.Button0 - CANCEL'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - PIN'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - Current screen lock'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - Swipe'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.TextView0 - Swipe'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.Button0 - YES REMOVE'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify prompt message on Screen lock from Settings/android.widget.Button0 - YES REMOVE'), 
    3)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Lockscreen Emergency Dialler', '', TestLinkAPIResults.TEST_PASSED)

