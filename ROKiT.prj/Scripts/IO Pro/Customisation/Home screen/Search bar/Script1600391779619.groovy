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

'Search bar'
Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Search bar/android.widget.FrameLayout0'), 3)

'Google icon (G)'
Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Search bar/android.widget.ImageView0'), 3)

'microphone icon'
Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Search bar/android.widget.ImageButton0'), 3)

Mobile.tapAndHold(findTestObject('Customisation/Home screen/Add icon to Home screen/android.view.ViewGroup0'), 1, 3)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Add icon to Home screen/android.widget.TextView0 - Home settings'), 
    3)

Mobile.tap(findTestObject('Customisation/Home screen/Add icon to Home screen/android.widget.TextView0 - Home settings'), 
    0)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Home app - Launch Pad/android.widget.TextView0 - Search bar'), 
    3)

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

'Search bar ON'
driver.findElementByXPath('//android.widget.Switch[@instance = \'3\'][contains(@text, \'ON\')]').isDisplayed()

Mobile.tap(findTestObject('Customisation/Home screen/Home app - Launch Pad/android.widget.TextView0 - Search bar'), 3)

'Search bar OFF'
driver.findElementByXPath('//android.widget.Switch[@instance = \'3\'][contains(@text, \'OFF\')]').isDisplayed()

Mobile.pressHome()

'Search bar'
Mobile.verifyElementNotVisible(findTestObject('Customisation/Home screen/Search bar/android.widget.FrameLayout0'), 3)

'Google icon (G)'
Mobile.verifyElementNotVisible(findTestObject('Customisation/Home screen/Search bar/android.widget.ImageView0'), 3)

'microphone icon'
Mobile.verifyElementNotVisible(findTestObject('Customisation/Home screen/Search bar/android.widget.ImageButton0'), 3)

Mobile.comment('Enable the Search bar ')

Mobile.tapAndHold(findTestObject('Customisation/Home screen/Add icon to Home screen/android.view.ViewGroup0'), 1, 3)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Add icon to Home screen/android.widget.TextView0 - Home settings'), 
    3)

Mobile.tap(findTestObject('Customisation/Home screen/Add icon to Home screen/android.widget.TextView0 - Home settings'), 
    0)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Home app - Launch Pad/android.widget.TextView0 - Search bar'), 
    3)

Mobile.tap(findTestObject('Customisation/Home screen/Home app - Launch Pad/android.widget.TextView0 - Search bar'), 3)

'Search bar ON'
driver.findElementByXPath('//android.widget.Switch[@instance = \'3\'][contains(@text, \'ON\')]').isDisplayed()

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Search bar', '', TestLinkAPIResults.TEST_PASSED)

