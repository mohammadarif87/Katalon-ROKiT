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

'IO 3D'
WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Turn off Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)', ('udid') : '0123456789ABCDEF', ('platformName') : 'Android']], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 1 (O2 - UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Rename Wifi Hotspot Name and Password - IO Pro Hotspot'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - Network  Internet'), 
    3)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - Network  Internet'), 3)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView7 - Hotspot  tethering'), 
    3)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView7 - Hotspot  tethering'), 3)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView0 - Hotspot  tethering'), 
    3)

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

'Verify USB tethering OFF by default'
driver.findElementByXPath('//android.widget.Switch[@instance = \'0\'][contains(@text, \'OFF\')]').isDisplayed()

'Verify Bluetooth tethering OFF by default'
driver.findElementByXPath('//android.widget.Switch[@instance = \'1\'][contains(@text, \'OFF\')]').isDisplayed()

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView2 - WiFi hotspot'), 
    3)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView2 - WiFi hotspot'), 3)

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView0 - WiFi hotspot'), 
    3)

'Verify Wi-Fi hotspot toggle switch OFF'
driver.findElementByXPath('//android.widget.Switch[@instance = \'0\'][contains(@text, \'OFF\')]').isDisplayed()

Mobile.comment('Hotspot Name')

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView3 - Hotspot name'), 
    3)

Mobile.verifyElementText(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - IO Pro Hotspot'), 'IO Pro Hotspot')

Mobile.comment('Password')

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView7 - Hotspot password'), 
    3)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView7 - Hotspot password'), 
    3)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView0 - Hotspot password'), 
    3)

not_run: Mobile.tapAndHoldAtPosition(1010, 1800, 3)

'Clear displayed text on the dialog (Hotspot password)'
Mobile.clearText(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.EditText0'), 
    10)

Mobile.setText(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.EditText0'), 
    'testpassword', 3)

Mobile.verifyElementText(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.EditText0 - testpassword'), 
    'testpassword')

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.Button1 - OK'), 
    3)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView9 - Advanced'), 
    3)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView9 - Turn off hotspot automatically'), 
    3)

'Verify Turn off hotspot automatically ON default'
driver.findElementByXPath('//android.widget.Switch[@instance = \'1\'][contains(@text, \'ON\')]').isDisplayed()

Mobile.comment('Wi-Fi Hotspot turn off in 10 mins after turn on if no device connected')

if (Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Turn Off Hotspot Automatically/android.widget.Switch1 - OFF'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi Hotspot Settings/android.widget.TextView9 - Turn off hotspot automatically'), 
        3)

    'Verify Wi-Fi hotspot turn ON'
    driver.findElementByXPath('//android.widget.Switch[@instance = \'0\'][contains(@text, \'ON\')]').isDisplayed()

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Turn Off Hotspot Automatically/android.widget.Switch1 - ON'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Turn Off Hotspot Automatically/android.widget.Switch1 - ON'), 
        3)

    'Verify Wi-Fi hotspot turned ON'
    driver.findElementByXPath('//android.widget.Switch[@instance = \'1\'][contains(@text, \'ON\')]').isDisplayed()
}

if (Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Turn Off Hotspot Automatically/android.widget.Switch0 - OFF'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Turn Off Hotspot Automatically/android.widget.Switch0 - OFF'), 
        3)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Turn Off Hotspot Automatically/android.widget.TextView2 - Off'), 
        3)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Turn Off Hotspot Automatically/android.widget.TextView2 - On'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Turn Off Hotspot Automatically/android.widget.Switch0 - ON'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Turn Off Hotspot Automatically/android.widget.TextView2 - On'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Turn Off Hotspot Automatically/android.widget.Switch0 - ON'), 
        0)
}

'Wi-Fi hotspot header'
Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Turn Off Hotspot Automatically/android.widget.TextView0 - WiFi hotspot (1)'), 
    3)

Mobile.comment('While loop will check every 30 seconds if Hotspot has automatically turned off')

while (Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Turn Off Hotspot Automatically/android.widget.Switch0 - OFF'), 
    3, FailureHandling.OPTIONAL) && Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Turn Off Hotspot Automatically/android.widget.TextView2 - Off'), 
    3, FailureHandling.OPTIONAL)) {
    Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText('Connected users', FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Hotspot and Tethering/Turn off Hotspot Automatically/android.widget.TextView0 - Connected users'), 
        3)

    Mobile.verifyElementText(findTestObject('System Settings/Network and internet/Hotspot and Tethering/Turn off Hotspot Automatically/android.widget.TextView0 - 0'), 
        '0')

    Mobile.scrollToText('Hotspot name', FailureHandling.STOP_ON_FAILURE)
}

Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Turn Off Hotspot Automatically/android.widget.TextView2 - On'), 
    15)

Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Turn Off Hotspot Automatically/android.widget.Switch0 - ON'), 
    5)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Turn Off Hotspot Automatically/android.widget.Switch0 - OFF'), 
    3)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Turn Off Hotspot Automatically/android.widget.TextView2 - Off'), 
    3)

'Verify Wi-Fi hotspot turned OFF'
driver.findElementByXPath('//android.widget.Switch[@instance = \'0\'][contains(@text, \'OFF\')]').isDisplayed()

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Turn off hotspot automatically', '', TestLinkAPIResults.TEST_PASSED)

