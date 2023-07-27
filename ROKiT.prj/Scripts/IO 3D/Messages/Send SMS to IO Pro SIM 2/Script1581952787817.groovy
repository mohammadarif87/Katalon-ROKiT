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

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

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
    
    if (Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView0 - Select a country'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.pressBack()

        Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 
            0)

        Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 0)
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
    
    Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 3)

    Mobile.tap(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.MultiAutoCompleteTextView0 - Type a name phone number or email'), 
        0, FailureHandling.STOP_ON_FAILURE)

    'IO Pro SIM 2'
    Mobile.setText(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.MultiAutoCompleteTextView0 - Type a name phone number or email'), 
        '4244169828', 0)

    'Tap the tick on the Keyboard'
    Mobile.tapAtPosition(670, 1300)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO Pro SIM 2/android.widget.EditText0 - Text (T-Mobile)'), 
        0)

    Mobile.setText(findTestObject('Preconditions/Send SMS to IO Pro SIM 2/android.widget.EditText0 - Text (T-Mobile)'), 
        'This is an automated test SMS', 0)

    'Tap and Hold the SMS button'
    Mobile.tapAndHold(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.LinearLayout5'), 0, 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO Pro SIM 2/android.widget.TextView0 - T-Mobile'), 
        3)

    'T-Mobile SIM1 icon'
    Mobile.tap(findTestObject('Preconditions/Send SMS to IO Pro SIM 2/android.widget.ImageView0'), 0)

    'Send SMS button'
    Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.LinearLayout7'), 0)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO Pro SIM 2/android.widget.TextView0 - Now  SMS'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO Pro SIM 2/android.widget.TextView0 -   via T-Mobile'), 
        0)

    Mobile.comment('TODO - Change this to state \'via EE\'')

    not_run: Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView4 -   via O2 - UK'), 
        0)
} else {
    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

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
    
    if (Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView0 - Select a country'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.pressBack()

        Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 
            0)

        Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 0)
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
    
    Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 0)

    Mobile.tap(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.MultiAutoCompleteTextView0 - Type a name phone number or email'), 
        0, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.MultiAutoCompleteTextView0 - Type a name phone number or email'), 
        '07985363224', 0)

    'Tap the tick on the Keyboard'
    Mobile.tapAtPosition(670, 1300)

    Mobile.verifyElementVisible(findTestObject('Messages/Send Contact to IO Pro SIM 1/android.widget.EditText0 - Text (O2 - UK)'), 
        0)

    Mobile.setText(findTestObject('Messages/Send Contact to IO Pro SIM 1/android.widget.EditText0 - Text (O2 - UK)'), 'This is an automated test SMS', 
        0)

    'Tap and Hold the SMS button'
    Mobile.tapAndHold(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.LinearLayout5'), 0, 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView3 - EE'), 
        0)

    'EE SIM 2 icon'
    Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.ImageView1'), 0)

    'Send SMS button'
    Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.LinearLayout7'), 0)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView3 - Now  SMS'), 
        5)

    Mobile.comment('TODO - Change this to state \'via EE\'')

    not_run: Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView4 -   via O2 - UK'), 
        0)
}

Mobile.closeApplication()

