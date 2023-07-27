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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.swipe(540, 1800, 540, 450)

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.TextView0 - Security  location'), 3)

Mobile.tap(findTestObject('Security/Password/android.widget.TextView0 - Security  location'), 3)

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.TextView0 - Screen lock'), 3)

Mobile.tap(findTestObject('Security/Password/android.widget.TextView0 - Screen lock'), 3)

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.TextView0 - Password'), 3)

Mobile.tap(findTestObject('Security/Password/android.widget.TextView0 - Password'), 3)

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.Button0 - YES'), 3)

Mobile.tap(findTestObject('Security/Password/android.widget.Button0 - YES'), 3)

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.Button0 - OK'), 3)

Mobile.tap(findTestObject('Security/Password/android.widget.Button0 - OK'), 3)

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.EditText0'), 3)

Mobile.tap(findTestObject('Security/Password/android.widget.EditText0'), 3)

Mobile.setText(findTestObject('Security/Password/android.widget.EditText0'), 'test', 3)

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.Button0 - NEXT'), 3)

Mobile.tap(findTestObject('Security/Password/android.widget.Button0 - NEXT'), 3)

Mobile.setText(findTestObject('Security/Password/android.widget.EditText0'), 'test',3)

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.Button0 - CONFIRM'), 3)

Mobile.tap(findTestObject('Security/Password/android.widget.Button0 - CONFIRM'), 3)

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.RadioButton0 - Show all notification content'), 
    3)

Mobile.tap(findTestObject('Security/Password/android.widget.RadioButton0 - Show all notification content'), 3)

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.Button0 - DONE'), 3)

Mobile.tap(findTestObject('Security/Password/android.widget.Button0 - DONE'), 3)

Mobile.pressHome()

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

driver.pressKey(new KeyEvent(AndroidKey.POWER))

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

driver.pressKey(new KeyEvent(AndroidKey.POWER))

Mobile.verifyElementVisible(findTestObject('Security/Password/android.widget.RelativeLayout0'), 3)

Mobile.swipe(540, 1800, 540, 450)

Mobile.setText(findTestObject('Security/Password/android.widget.EditText0 (1)'), 'test', 3)

'"OK" Button on keyboard'
Mobile.tapAtPosition(1010, 1920)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Password Lock Screen'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.pressHome()

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Verify Password screen lock from Settings', 
    '', TestLinkAPIResults.TEST_PASSED)

