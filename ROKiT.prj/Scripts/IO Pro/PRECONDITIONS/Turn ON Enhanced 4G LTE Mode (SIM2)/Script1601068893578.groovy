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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Phone App/3G Fallback (SIM 1 O2-UK)/android.widget.TextView3 - Network  Internet'), 
    3)

Mobile.tap(findTestObject('Phone App/3G Fallback (SIM 1 O2-UK)/android.widget.TextView3 - Network  Internet'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn OFF Enhanced 4G LTE Mode/android.widget.TextView0 - Mobile network'), 
    3)

Mobile.tap(findTestObject('Preconditions/Turn OFF Enhanced 4G LTE Mode/android.widget.TextView0 - Mobile network'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn OFF Enhanced 4G LTE Mode (SIM2)/android.widget.TextView0 - ATT'), 
    3)

Mobile.tap(findTestObject('Preconditions/Turn OFF Enhanced 4G LTE Mode (SIM2)/android.widget.TextView0 - ATT'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn OFF Enhanced 4G LTE Mode/android.widget.TextView0 - Advanced'), 
    3)

Mobile.tap(findTestObject('Preconditions/Turn OFF Enhanced 4G LTE Mode/android.widget.TextView0 - Advanced'), 0)

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

'Check Enhanced 4G LTE Mode OFF'
driver.findElementByXPath('//android.widget.Switch[@instance = \'2\'][contains(@text, \'OFF\')]').isDisplayed()

not_run: Mobile.getText(findTestObject('Preconditions/Turn OFF Enhanced 4G LTE Mode/android.widget.Switch0 - ON'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn OFF Enhanced 4G LTE Mode/android.widget.TextView0 - Enhanced 4G LTE Mode'), 
    3)

Mobile.tap(findTestObject('Preconditions/Turn OFF Enhanced 4G LTE Mode/android.widget.TextView0 - Enhanced 4G LTE Mode'), 
    0)

'Check Enhanced 4G LTE Mode ON'
driver.findElementByXPath('//android.widget.Switch[@instance = \'2\'][contains(@text, \'ON\')]').isDisplayed()

Mobile.pressHome()

