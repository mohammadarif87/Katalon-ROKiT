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

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Home screen - Icon labels/android.widget.TextView0 - Play Store'), 
    3)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Home screen - Icon labels/android.widget.TextView0 - Internet'), 
    3)

Mobile.swipe(512, 1700, 512, 300)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Drawer Settings - Icon labels/android.widget.TextView0 - Calculator'), 
    3)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Drawer Settings - Icon labels/android.widget.TextView0 - Calendar'), 
    3)

Mobile.pressHome()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHold(findTestObject('Customisation/Home screen/Add icon to Home screen/android.view.ViewGroup0'), 1, 3)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Add icon to Home screen/android.widget.TextView0 - Home settings'), 
    3)

Mobile.tap(findTestObject('Customisation/Home screen/Add icon to Home screen/android.widget.TextView0 - Home settings'), 
    0)

Mobile.swipe(512, 1700, 512, 300)

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

'Icon labels ON'
driver.findElementByXPath('//android.widget.Switch[@instance = \'6\'][contains(@text, \'ON\')]').isDisplayed()

'Press Icon labels to turn OFF (under Drawer settings)'
Mobile.tapAndHoldAtPosition(990, 1975, 0)

'Icon labels OFF'
driver.findElementByXPath('//android.widget.Switch[@instance = \'6\'][contains(@text, \'OFF\')]').isDisplayed()

Mobile.pressHome()

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Home screen - Icon labels/android.widget.TextView0 - Play Store'), 
    3)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Home screen - Icon labels/android.widget.TextView0 - Internet'), 
    3)

Mobile.swipe(512, 1700, 512, 300)

Mobile.verifyElementNotVisible(findTestObject('Customisation/Home screen/Drawer Settings - Icon labels/android.widget.TextView0 - Calculator'), 
    3)

Mobile.verifyElementNotVisible(findTestObject('Customisation/Home screen/Drawer Settings - Icon labels/android.widget.TextView0 - Calendar'), 
    3)

Mobile.pressHome()

Mobile.comment('Enable the Icon labels')

Mobile.tapAndHold(findTestObject('Customisation/Home screen/Add icon to Home screen/android.view.ViewGroup0'), 1, 3)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Add icon to Home screen/android.widget.TextView0 - Home settings'), 
    3)

Mobile.tap(findTestObject('Customisation/Home screen/Add icon to Home screen/android.widget.TextView0 - Home settings'), 
    0)

Mobile.swipe(512, 1700, 512, 300)

Mobile.tapAndHoldAtPosition(990, 1975, 0)

'Icon labels ON'
driver.findElementByXPath('//android.widget.Switch[@instance = \'6\'][contains(@text, \'ON\')]').isDisplayed()

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Drawer Settings - Icon labels', '', TestLinkAPIResults.TEST_PASSED)

