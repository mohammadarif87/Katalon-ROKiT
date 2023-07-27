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
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.scrollToText('Security & location', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Security/android.widget.TextView5 - Security  location'), 3)

Mobile.tap(findTestObject('Security/android.widget.TextView5 - Security  location'), 3)

Mobile.verifyElementVisible(findTestObject('Security/android.widget.TextView10 - Screen lock'), 3)

Mobile.tap(findTestObject('Security/android.widget.TextView10 - Screen lock'), 3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify None screen lock from Settings/android.widget.TextView0 - Swipe'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify None screen lock from Settings/android.widget.TextView0 - None'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify None screen lock from Settings/android.widget.TextView0 - None'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify None screen lock from Settings/android.widget.TextView0 - None (1)'), 
    3)

Mobile.pressHome()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()

driver.lockDevice()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

AndroidDriver<MobileElement> mobileDriver = MobileDriverFactory.getDriver()

mobileDriver.pressKey(new KeyEvent(AndroidKey.POWER))

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Play store app on Home screen'
Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Home screen - Icon labels/android.widget.TextView0 - Play Store'), 
    3)

'Internet app on Home screen'
Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Home screen - Icon labels/android.widget.TextView0 - Internet'), 
    3)

Mobile.comment('Set back to Swipe screen')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.scrollToText('Security & location', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Security/android.widget.TextView5 - Security  location'), 3)

Mobile.tap(findTestObject('Security/android.widget.TextView5 - Security  location'), 3)

Mobile.verifyElementVisible(findTestObject('Security/android.widget.TextView10 - Screen lock'), 3)

Mobile.tap(findTestObject('Security/android.widget.TextView10 - Screen lock'), 3)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Verify None screen lock from Settings/android.widget.TextView0 - Swipe'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Verify None screen lock from Settings/android.widget.TextView0 - Swipe'), 
    3)

Mobile.verifyElementVisible(findTestObject('Security/android.widget.TextView11 - Swipe'), 3)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Verify None screen lock from Settings', 
    '', TestLinkAPIResults.TEST_PASSED)

