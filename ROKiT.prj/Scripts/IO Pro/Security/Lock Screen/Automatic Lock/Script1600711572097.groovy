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

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('About Phone/Baseband Version/android.widget.TextView15 - System'), 3)

Mobile.tap(findTestObject('About Phone/Baseband Version/android.widget.TextView15 - System'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Baseband Version/android.widget.TextView9 - Advanced'), 3)

Mobile.tap(findTestObject('About Phone/Baseband Version/android.widget.TextView9 - Advanced'), 0)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Automatic Lock/android.widget.TextView0 - Developer options'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Automatic Lock/android.widget.TextView0 - Developer options'), 0)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Automatic Lock/android.widget.TextView0 - Stay awake'), 
    3)

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

'Stay awake ON by default'
driver.findElementByXPath('//android.widget.Switch[@instance = \'1\'][contains(@text, \'ON\')]').isDisplayed()

Mobile.tap(findTestObject('Security/Lock screen/Automatic Lock/android.widget.TextView0 - Stay awake'), 3)

'Stay awake ON by default'
driver.findElementByXPath('//android.widget.Switch[@instance = \'1\'][contains(@text, \'OFF\')]').isDisplayed()

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Sleep Time/Set sleep to 15 seconds'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(16, FailureHandling.STOP_ON_FAILURE)

AndroidDriver<MobileElement> mobileDriver = MobileDriverFactory.getDriver()

mobileDriver.pressKey(new KeyEvent(AndroidKey.POWER))

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Home screen - Icon labels/android.widget.TextView0 - Play Store'), 
    3)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Home screen - Icon labels/android.widget.TextView0 - Internet'), 
    3)

Mobile.comment('Stay awake turn ON')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('About Phone/Baseband Version/android.widget.TextView15 - System'), 3)

Mobile.tap(findTestObject('About Phone/Baseband Version/android.widget.TextView15 - System'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Baseband Version/android.widget.TextView9 - Advanced'), 3)

Mobile.tap(findTestObject('About Phone/Baseband Version/android.widget.TextView9 - Advanced'), 0)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Automatic Lock/android.widget.TextView0 - Developer options'), 
    3)

Mobile.tap(findTestObject('Security/Lock screen/Automatic Lock/android.widget.TextView0 - Developer options'), 0)

Mobile.verifyElementVisible(findTestObject('Security/Lock screen/Automatic Lock/android.widget.TextView0 - Stay awake'), 
    3)

AndroidDriver<MobileElement> driverEnable = MobileDriverFactory.getDriver()

'Stay awake OFF'
driverEnable.findElementByXPath('//android.widget.Switch[@instance = \'1\'][contains(@text, \'OFF\')]').isDisplayed()

Mobile.tap(findTestObject('Security/Lock screen/Automatic Lock/android.widget.TextView0 - Stay awake'), 3)

'Stay awake turn ON'
driverEnable.findElementByXPath('//android.widget.Switch[@instance = \'1\'][contains(@text, \'ON\')]').isDisplayed()

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Sleep Time/Set sleep to 10 minutes'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Automatic Lock', '', TestLinkAPIResults.TEST_PASSED)

