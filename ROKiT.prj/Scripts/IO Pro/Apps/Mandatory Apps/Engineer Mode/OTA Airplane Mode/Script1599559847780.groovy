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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Close All Recent Apps'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

'Show Keypad button'
Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

'0 on Dial pad'
Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 0)

'\'*\''
Mobile.tapAtPosition(195, 1665)

'\'#\''
Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 -  (1)'), 0)

'\'*\''
Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - '), 0)

'\'#\''
Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 -  (1)'), 0)

Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - 6'), 0)

Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - 4'), 0)

Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - 6'), 0)

Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - 6'), 0)

Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - 3'), 0)

'\'#\''
Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 -  (1)'), 0)

'\'*\''
Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - '), 0)

'\'#\''
Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 -  (1)'), 0)

'\'*\''
Mobile.tap(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - '), 0)

'Header'
Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - EngineerMode'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Engineer Mode/android.widget.TextView0 - Telephony'), 3)

Mobile.scrollToText('OTA Airplane Mode')

Mobile.verifyElementVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView9 - OTA Airplane Mode'), 
    3)

Mobile.tap(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView9 - OTA Airplane Mode'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView0 - OTA Airplane Mode'), 
    3)

'Airplane default last time'
Mobile.verifyElementVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.EditText0 - 1.0'), 3)

Mobile.openNotifications()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(512, 200, 512, 800)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView0 - T-MOBILE  ATT'), 
        3)

    AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

    'Airplane mode OFF by default'
    driver.findElementByXPath('//android.widget.Switch[@instance = \'7\'][contains(@text, \'Off\')]').isDisplayed()

    'Airplane mode click'
    driver.findElementByXPath('//android.widget.Switch[@instance = \'7\'][contains(@text, \'Off\')]').click()

    'Check Airplane mode On'
    driver.findElementByXPath('//android.widget.Switch[@instance = \'7\'][contains(@text, \'On\')]').isDisplayed()

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    'Airplane mode strings on SPN'
    driver.findElementByXPath('//android.widget.TextView[contains(@text, \'Airplane mode\')][@resource-id = \'com.android.systemui:id/qs_carrier_text\']').isDisplayed()

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    'Airplane mode On'
    driver.findElementByXPath('//android.widget.Switch[@instance = \'7\'][contains(@text, \'On\')]').isDisplayed()

    'Airplane mode click'
    driver.findElementByXPath('//android.widget.Switch[@instance = \'7\'][contains(@text, \'On\')]').click()

    'Check Airplane mode Off'
    driver.findElementByXPath('//android.widget.Switch[@instance = \'7\'][contains(@text, \'Off\')]').isDisplayed()

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView0 - T-MOBILE  ATT'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView13 - O2 - UK  EE'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView11 - Aeroplane mode'), 
        0)

    Mobile.tap(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView11 - Aeroplane mode'), 0)

    Mobile.verifyElementNotVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView13 - O2 - UK  EE'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView13 - Aeroplane mode'), 
        0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView13 - Aeroplane mode'), 
        0)

    Mobile.tap(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView11 - Aeroplane mode'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView13 - O2 - UK  EE'), 
        0)
}

Mobile.closeNotifications()

Mobile.verifyElementVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.CheckBox0 - Enable the feature'), 
    3)

'Enable to OTA Airplane Mode'
Mobile.tap(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.CheckBox0 - Enable the feature'), 0)

Mobile.openNotifications()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(512, 200, 512, 800)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

if (userName == 'Aiden') {
    AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

    'Airplane mode OFF'
    driver.findElementByXPath('//android.widget.Switch[@instance = \'7\'][contains(@text, \'Off\')]').isDisplayed()

    'Airplane mode click'
    driver.findElementByXPath('//android.widget.Switch[@instance = \'7\'][contains(@text, \'Off\')]').click()

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView0 - T-MOBILE  ATT'), 
        5)

    'Check Airplane mode Off - After Enabled the feature'
    driver.findElementByXPath('//android.widget.Switch[@instance = \'7\'][contains(@text, \'Off\')]').isDisplayed()
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView11 - Aeroplane mode'), 
        0)

    'Aeroplane mode enabled but the feature turns it off'
    Mobile.tap(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView11 - Aeroplane mode'), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView13 - O2 - UK  EE'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView13 - Aeroplane mode'), 
        0)
}

Mobile.closeNotifications()

Mobile.verifyElementVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.CheckBox0 - Enable the feature'), 
    3)

'Disable the OTA Airplane feature'
Mobile.tap(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.CheckBox0 - Enable the feature'), 0)

Mobile.openNotifications()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(512, 200, 512, 800)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView0 - T-MOBILE  ATT'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView0 - Airplane mode'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView13 - O2 - UK  EE'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('Apps/Engineer Mode/OTA Airplane Mode/android.widget.TextView13 - Aeroplane mode'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('OTA Airplane Mode', '', TestLinkAPIResults.TEST_PASSED)

