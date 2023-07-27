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

WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Delete Messages'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementNotVisible(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 
        0, FailureHandling.OPTIONAL)) {
        AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

        driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
    }
    
    Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.Button0 - Start chat'), 
        0)

    Mobile.tap(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.Button0 - Start chat'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.MultiAutoCompleteTextView0 - Type a name phone number or email'), 
        0, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.MultiAutoCompleteTextView0 - Type a name phone number or email'), 
        '4787777307', 0)

    'Tick on Keyboard'
    Mobile.tapAtPosition(670, 1290)

    'Microphone icon'
    Mobile.verifyElementVisible(findTestObject('Messages/Send Audio MMS to IO Pro/android.widget.FrameLayout4'), 5)

    'Microphone icon'
    Mobile.tapAndHold(findTestObject('Messages/Send Audio MMS to IO Pro/android.widget.FrameLayout4'), 10, 0)

    'Audio thumbnail in the message'
    Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.LinearLayout5'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Messages/Send MMS Picture to IO Pro/android.widget.TextView2 - MMS'), 
        0, FailureHandling.OPTIONAL)) {
        'SMS has changed to MMS'
        Mobile.verifyElementVisible(findTestObject('Messages/Send MMS Picture to IO Pro/android.widget.TextView2 - MMS'), 
            3)

        'SMS has changed to MMS'
        Mobile.tap(findTestObject('Messages/Send MMS Picture to IO Pro/android.widget.TextView2 - MMS'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Messages/Send MMS Audio to IO Pro/android.widget.EditText0 - Add text'), 
        0, FailureHandling.OPTIONAL)) {
        'Send Audio'
        Mobile.verifyElementVisible(findTestObject('Messages/Send MMS Audio to IO Pro/android.widget.EditText0 - Add text'), 
            3)

        'Send Button'
        Mobile.tap(findTestObject('Messages/Send MMS Audio to IO Pro/android.widget.ImageView0'), 0)
    }
    
    Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('Messages/Send MMS Picture to IO Pro/android.widget.TextView0 - Now  MMS'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Messages/Send MMS Picture to IO Pro/android.widget.TextView0 - Now  MMS'), 
            30)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Messages/Receive Audio MMS from IO Pro/android.widget.TextView0 - Now  Delivered'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Messages/Receive Audio MMS from IO Pro/android.widget.TextView0 - Now  Delivered'), 
            30)
    }
    
    Mobile.verifyElementVisible(findTestObject('Messages/Receive Audio MMS from IO Pro/android.widget.TextView0 -   via T-Mobile'), 
        3)
} else {
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
    
    if (Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView0 - Enter your phone number for the following SIM to finish setting up chat features'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView0 - Enter your phone number for the following SIM to finish setting up chat features'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView1 - SIM 1'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 
            0)

        Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - New Spam protection'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.Button2 - OK'), 0)
    }
    
    if (Mobile.verifyElementNotVisible(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 
        0, FailureHandling.OPTIONAL)) {
        AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

        driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
    }
    
    Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.Button0 - Start chat'), 
        0)

    Mobile.tap(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.Button0 - Start chat'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.MultiAutoCompleteTextView0 - Type a name phone number or email'), 
        0, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.MultiAutoCompleteTextView0 - Type a name phone number or email'), 
        '07912244108', 0)

    'Tick on Keyboard'
    Mobile.tapAtPosition(670, 1290)

    Mobile.verifyElementVisible(findTestObject('Messages/Send Contact to IO Pro SIM 1/android.widget.EditText0 - Text (O2 - UK)'), 
        0)

    'Microphone icon'
    Mobile.verifyElementVisible(findTestObject('Messages/Send Audio MMS to IO Pro/android.widget.FrameLayout4'), 0)

    'Microphone icon'
    Mobile.tapAndHold(findTestObject('Messages/Send Audio MMS to IO Pro/android.widget.FrameLayout4'), 10, 0)

    'Audio thumbnail in the message'
    Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.LinearLayout5'), 0)

    'SMS has changed to MMS'
    Mobile.verifyElementVisible(findTestObject('Messages/Send MMS Picture to IO Pro/android.widget.TextView2 - MMS'), 0)

    'SMS has changed to MMS'
    Mobile.tap(findTestObject('Messages/Send MMS Picture to IO Pro/android.widget.TextView2 - MMS'), 0)

    Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Messages/Send MMS Picture to IO Pro/android.widget.TextView0 - Now  MMS'), 
        30)
}

Mobile.closeApplication()

