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
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.scrollToText('Digital Wellbeing & parental controls', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.TextView0 - Digital Wellbeing  parental controls'), 
    3)

Mobile.tap(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.TextView0 - Digital Wellbeing  parental controls'), 
    3)

Mobile.delay(3)

Mobile.swipe(550, 1700, 550, 400)

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

'Show icon in the app list OFF by default'
driver.findElementByXPath('//android.widget.Switch[@instance = \'0\'][contains(@text, \'OFF\')]').isDisplayed()

'Tap button'
driver.findElementByXPath('//android.widget.Switch[@instance = \'0\'][contains(@text, \'OFF\')]').click()

'Verify button turn ON'
driver.findElementByXPath('//android.widget.Switch[@instance = \'0\'][contains(@text, \'ON\')]').isDisplayed()

Mobile.delay(5)

Mobile.pressHome()

Mobile.delay(3)

Mobile.swipe(550, 1700, 550, 400)

Mobile.delay(5)

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/Show icon in the app list/android.widget.TextView0 - Digital Wellbeing'), 
    3)

Mobile.delay(3)

Mobile.swipe(550, 1700, 550, 400)

Mobile.swipe(550, 1700, 550, 400)

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/Show icon in the app list/android.widget.TextView0 - Settings'), 
    3)

Mobile.tap(findTestObject('System Settings/Digital Wellbeing/Show icon in the app list/android.widget.TextView0 - Settings'), 
    3)

Mobile.swipe(550, 1700, 550, 400)

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/Show icon in the app list/android.widget.TextView0 - Digital Wellbeing  parental controls'), 
    3)

Mobile.tap(findTestObject('System Settings/Digital Wellbeing/Show icon in the app list/android.widget.TextView0 - Digital Wellbeing  parental controls'), 
    3)

Mobile.delay(3)

Mobile.swipe(550, 1700, 550, 400)

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/Show icon in the app list/android.widget.Switch0 - Show icon in the app list ON'), 
    3)

Mobile.tap(findTestObject('System Settings/Digital Wellbeing/Show icon in the app list/android.widget.Switch0 - Show icon in the app list ON'), 
    3)

'Verify Show icon in the app list OFF'
driver.findElementByXPath('//android.widget.Switch[@instance = \'0\'][contains(@text, \'OFF\')]').isDisplayed()

Mobile.pressHome()

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Show icon in the app list', '', TestLinkAPIResults.TEST_PASSED)

