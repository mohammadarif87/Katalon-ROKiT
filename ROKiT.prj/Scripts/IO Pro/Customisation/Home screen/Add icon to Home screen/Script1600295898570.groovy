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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('udid') : 'IOPRO0123456789A', ('platformName') : 'Android']], 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.pressHome()

Mobile.tapAndHold(findTestObject('Customisation/Home screen/Add icon to Home screen/android.view.ViewGroup0'), 1, 3)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Add icon to Home screen/android.widget.TextView0 - Home settings'), 
    3)

Mobile.tap(findTestObject('Customisation/Home screen/Add icon to Home screen/android.widget.TextView0 - Home settings'), 
    0)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Add icon to Home screen/android.widget.TextView0 - Add icon to Home screen'), 
    3)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Add icon to Home screen/android.widget.TextView0 - For new apps'), 
    3)

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

'Add icon to Home screen ON by default'
driver.findElementByXPath('//android.widget.Switch[@instance = \'2\'][contains(@text, \'ON\')]').isDisplayed()

Mobile.pressHome()

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Download Network Cell Info App ONLY'), [('appPackage') : 'com.android.vending'
        , ('appActivity') : '.AssetBrowserActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Customisation/Home screen/Add icon to Home screen/android.widget.TextView0 - Network Cell Info Lite'), 
    3)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Uninstall Network Cell Info App'), [('appPackage') : 'com.android.vending'
        , ('appActivity') : '.AssetBrowserActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Add icon to Home screen', '', TestLinkAPIResults.TEST_PASSED)

