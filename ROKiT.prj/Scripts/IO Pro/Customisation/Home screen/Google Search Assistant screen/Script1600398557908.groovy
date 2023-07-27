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

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(10, 100, 1000, 0)

Mobile.pressHome()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(10, 100, 1000, 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Search bar'
Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Google Search Assistant screen/android.widget.RelativeLayout0'), 
    3)

'Google icon "G"'
Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Google Search Assistant screen/android.widget.LinearLayout0'), 
    3)

'Updates icon'
Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Google Search Assistant screen/android.widget.ImageView0'), 
    3)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    'Account icon'
    Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Google Search Assistant screen/android.widget.TextView0 - Keep up with your favorite topics'), 
        3)
} else {
    'Account icon'
    Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Google Search Assistant screen/android.widget.TextView1 - Keep up with your favourite topics'), 
        3)
}

Mobile.pressHome()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHold(findTestObject('Customisation/Home screen/Add icon to Home screen/android.view.ViewGroup0'), 1, 3)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Add icon to Home screen/android.widget.TextView0 - Home settings'), 
    3)

Mobile.tap(findTestObject('Customisation/Home screen/Add icon to Home screen/android.widget.TextView0 - Home settings'), 
    0)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Home app - Launch Pad/android.widget.TextView0 - Google Search Assistant screen'), 
    3)

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

'Google Search Assistant screen ON'
driver.findElementByXPath('//android.widget.Switch[@instance = \'5\'][contains(@text, \'ON\')]').isDisplayed()

Mobile.tap(findTestObject('Customisation/Home screen/Home app - Launch Pad/android.widget.TextView0 - Google Search Assistant screen'), 
    3)

'Google Search Assistant screen OFF'
driver.findElementByXPath('//android.widget.Switch[@instance = \'5\'][contains(@text, \'OFF\')]').isDisplayed()

Mobile.pressHome()

if (Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Google Search Assistant screen/android.widget.RelativeLayout0'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.swipe(10, 100, 1000, 0)
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Enable the Google Assistant screen')

Mobile.tapAndHold(findTestObject('Customisation/Home screen/Add icon to Home screen/android.view.ViewGroup0'), 1, 3)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Add icon to Home screen/android.widget.TextView0 - Home settings'), 
    3)

Mobile.tap(findTestObject('Customisation/Home screen/Add icon to Home screen/android.widget.TextView0 - Home settings'), 
    0)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Home app - Launch Pad/android.widget.TextView0 - Google Search Assistant screen'), 
    3)

Mobile.tap(findTestObject('Customisation/Home screen/Home app - Launch Pad/android.widget.TextView0 - Google Search Assistant screen'), 
    3)

'Google Search Assistant screen ON'
driver.findElementByXPath('//android.widget.Switch[@instance = \'5\'][contains(@text, \'ON\')]').isDisplayed()

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Google Search Assistant screen', '', TestLinkAPIResults.TEST_PASSED)

