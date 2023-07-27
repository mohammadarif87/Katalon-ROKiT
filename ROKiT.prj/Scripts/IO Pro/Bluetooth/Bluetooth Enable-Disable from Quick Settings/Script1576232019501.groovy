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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Bluetooth'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Clear All Notifications'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.pressHome()

Mobile.openNotifications()

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

    'Check Bluetooth turn OFF from Quick Settings'
    driver.findElementByXPath('//android.widget.Switch[@instance = \'1\'][contains(@text, \'Off\')]').isDisplayed()

    'Turn ON the Bluetooth'
    Mobile.tap(findTestObject('Bluetooth/Bluetooth Long Press from Quick Settings/android.widget.ImageView0'), 0, FailureHandling.STOP_ON_FAILURE)

    'Check Bluetooth turn ON from Quick Settings'
    driver.findElementByXPath('//android.widget.Switch[@instance = \'1\'][contains(@text, \'On\')]').isDisplayed()

    'Turn ON the Bluetooth'
    Mobile.tap(findTestObject('Bluetooth/Bluetooth Long Press from Quick Settings/android.widget.ImageView0'), 0, FailureHandling.STOP_ON_FAILURE)

    'Check Bluetooth turn OFF from Quick Settings'
    driver.findElementByXPath('//android.widget.Switch[@instance = \'1\'][contains(@text, \'Off\')]').isDisplayed()
} else {
    Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Enable-Disable from Quick Settings/android.widget.Switch1 - Off'), 
        0)

    Mobile.tap(findTestObject('Bluetooth/Bluetooth Enable-Disable from Quick Settings/android.widget.FrameLayout13'), 0)

    Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Enable-Disable from Quick Settings/android.widget.Switch1 - On'), 
        0)

    Mobile.tap(findTestObject('Bluetooth/Bluetooth Enable-Disable from Quick Settings/android.widget.FrameLayout13'), 0)

    Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Enable-Disable from Quick Settings/android.widget.Switch1 - Off'), 
        0)
}

Mobile.pressHome()

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Bluetooth Enable/Disable from Quick Settings', 
    '', TestLinkAPIResults.TEST_PASSED)

