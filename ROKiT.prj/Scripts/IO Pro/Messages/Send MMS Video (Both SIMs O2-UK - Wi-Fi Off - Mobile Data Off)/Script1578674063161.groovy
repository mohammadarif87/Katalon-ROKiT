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
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Mobile Data SIM 1 (O2 - UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Set SMS to SIM 1 (O2-UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

'IO Pro'
WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Messages'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

'IO 3D'
WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Delete Messages'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Camera Photo and Video'), [('appPackage') : 'com.freeme.camera'
        , ('appActivity') : '.CameraActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete All Albums From Gallery'), [('appPackage') : 'com.freeme.gallery'
        , ('appActivity') : 'com.cooliris.media.Gallery', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Take Camera Video'), [('appPackage') : 'com.freeme.camera', ('appActivity') : '.CameraActivity'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView0 - Messages just got better'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView3 - Use Messages without chat features'), 
        0)

    Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView3 - Use Messages without chat features'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.Button0 - Start chat'), 0)

Mobile.tap(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.Button0 - Start chat'), 0)

Mobile.hideKeyboard()

Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.TextView5 - Auto O2 Fav'), 
    0)

Mobile.tap(findTestObject('Messages/Call Contact via Messages/android.widget.TextView5 - Auto O2 Fav'), 0)

'View Gallery in Messages'
Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.ImageView1'), 0)

Mobile.tap(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.ImageView1'), 0)

'Select the picture already saved on the device'
Mobile.tap(findTestObject('Messages/Send MMS Picture to IO Pro/android.widget.FrameLayout9'), 0)

'Picture thumbnail in the message'
Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.LinearLayout5'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'SMS has changed to MMS'
Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.TextView2 - MMS'), 0)

'SMS has changed to MMS'
Mobile.tap(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.TextView2 - MMS'), 0)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    if (Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.TextView0 - Now  MMS'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.TextView0 - Now  MMS'), 
            20)
    } else {
        not_run: Mobile.verifyElementVisible(findTestObject('Messages/Send MMS Picture(Both SIMs O2-UK - Wi-Fi OFF - Mobile Data Off)/android.widget.TextView0 - Not sent. Tap to try again.'), 
            10)

        Mobile.verifyElementVisible(findTestObject('Messages/Send MMS Picture(Both SIMs O2-UK - Wi-Fi OFF - Mobile Data Off)/android.widget.TextView0 - Waiting for connection'), 
            0)

        Mobile.delay(90, FailureHandling.STOP_ON_FAILURE)

        if (Mobile.verifyElementNotVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.TextView0 - Now  MMS'), 
            0, FailureHandling.OPTIONAL)) {
            AndroidDriver<MobileElement> driver1 = MobileDriverFactory.getDriver()

            driver1.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

            Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

            driver1.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

            Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

            driver1.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

            Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

            driver1.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

            Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

            driver1.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

            Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

            driver1.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

            Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)
        }
        
        Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.TextView0 - Now  MMS'), 
            90)
    }
    
    Mobile.verifyElementVisible(findTestObject('Messages/Receive Audio MMS from IO Pro/android.widget.TextView0 -   via T-Mobile'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.TextView0 - Now  MMS'), 
        10)

    Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.TextView2 -   via O2 - UK'), 
        0)
}

WebUI.callTestCase(findTestCase('IO 3D/Messages/Receive Video MMS from IO Pro'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 1 (O2 - UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('udid') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Send Video MMS (Both SIMs, Wi-Fi Off, Mobile Data Off)', 
    'SIM 1 = O2-UK \n SIM 2 = EE', TestLinkAPIResults.TEST_PASSED)

