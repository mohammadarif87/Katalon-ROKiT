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

Mobile.pressHome()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(550, 900, 2)

Mobile.tap(findTestObject('Customisation/Home Screen test/android.widget.TextView0 - Home settings'), 0)

Mobile.verifyElementVisible(findTestObject('Customisation/Home Screen test/android.widget.TextView0 - Home settings (1)'), 
    0)

Mobile.swipe(512, 1700, 512, 500)

Mobile.verifyElementVisible(findTestObject('Customisation/Home Screen test/android.widget.TextView2 - Allow Homescreen rotation'), 
    0)

Mobile.verifyElementVisible(findTestObject('Customisation/Home Screen test/android.widget.TextView6 - Scroll wallpaper'), 
    0)

Mobile.verifyElementVisible(findTestObject('Customisation/Home Screen test/android.widget.TextView8 - Add icon to Home screen'), 
    0)

Mobile.verifyElementVisible(findTestObject('Customisation/Home Screen test/android.widget.TextView10 - Search bar'), 0)

Mobile.verifyElementVisible(findTestObject('Customisation/Home Screen test/android.widget.TextView11 - Icon labels'), 0)

Mobile.verifyElementVisible(findTestObject('Customisation/Home Screen test/android.widget.TextView12 - Google Search Assistant screen'), 
    0)

Mobile.verifyElementVisible(findTestObject('Customisation/Home Screen test/android.widget.TextView14 - Icon labels'), 0)

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

'Allow Homescreen rotation OFF'
driver.findElementByXPath('//android.widget.Switch[@instance = \'0\'][contains(@text, \'OFF\')]').isDisplayed()

'Scroll Wallpaper ON'
driver.findElementByXPath('//android.widget.Switch[@instance = \'1\'][contains(@text, \'ON\')]').isDisplayed()

'Add icon to Home screen ON'
driver.findElementByXPath('//android.widget.Switch[@instance = \'2\'][contains(@text, \'ON\')]').isDisplayed()

'Search bar ON'
driver.findElementByXPath('//android.widget.Switch[@instance = \'3\'][contains(@text, \'ON\')]').isDisplayed()

'Home Screen Icon labels ON'
driver.findElementByXPath('//android.widget.Switch[@instance = \'4\'][contains(@text, \'ON\')]').isDisplayed()

'Google Search Assistant screen ON'
driver.findElementByXPath('//android.widget.Switch[@instance = \'5\'][contains(@text, \'ON\')]').isDisplayed()

'Drawer Icon labels ON'
driver.findElementByXPath('//android.widget.Switch[@instance = \'6\'][contains(@text, \'ON\')]').isDisplayed()

Mobile.closeApplication()

