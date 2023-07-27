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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Set SMS to SIM 1 (O2-UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

'IO PRO'
WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Messages'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

'IO 3D'
WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Delete Messages'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - New Spam protection'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.Button2 - OK'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Messages just got better'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - Use Messages without chat features'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Use Messages without chat features (1)'), 
            0)

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Use Messages without chat features (1)'), 
            0)
    }
    
    Mobile.tap(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.TextView5 - Auto O2 Fav'), 
        0)

    Mobile.tap(findTestObject('Messages/Call Contact via Messages/android.widget.TextView5 - Auto O2 Fav'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.MultiAutoCompleteTextView0 - Auto O2 Fav'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Text messagefrom T-Mobile'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Text messagefrom T-Mobile'), 
            0)

        Mobile.setText(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Text messagefrom T-Mobile'), 
            'This is an automated test SMS', 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Chat messagefrom T-Mobile'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Chat messagefrom T-Mobile'), 
            0)

        Mobile.setText(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Chat messagefrom T-Mobile'), 
            'This is an automated test SMS', 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Chat (T-Mobile)'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Chat (T-Mobile)'), 
            0)

        Mobile.setText(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Chat (T-Mobile)'), 
            'This is an automated test SMS', 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 2/android.widget.EditText0 - Text (T-Mobile)'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 2/android.widget.EditText0 - Text (T-Mobile)'), 
            0)

        Mobile.setText(findTestObject('Preconditions/Send SMS to IO 3D SIM 2/android.widget.EditText0 - Text (T-Mobile)'), 
            'This is an automated test SMS', 0)
    }
    
    'Tap and Hold the SMS button'
    Mobile.tapAndHold(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.LinearLayout5'), 0, 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.TextView0 - T-Mobile'), 
        5)

    'O2-UK SIM 1 icon'
    Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.ImageView0'), 0)

    'Send SMS button'
    Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.LinearLayout7'), 0)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.TextView0 - Now  Delivered'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.getText(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.TextView0 - Now  Delivered'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.TextView0 - Now  SMS'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.TextView0 - Now  SMS'), 
            5)
    }
    
    Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.TextView0 -   via T-Mobile'), 
        0)

    Mobile.callTestCase(findTestCase('IO 3D/Messages/Receive SMS from IO Pro via O2-UK'), [('appPackage') : 'com.google.android.apps.messaging'
            , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
                , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - New Spam protection'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.Button2 - OK'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Messages just got better'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - Use Messages without chat features'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Use Messages without chat features (1)'), 
            0)

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Use Messages without chat features (1)'), 
            0)
    }
    
    Mobile.tap(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.TextView5 - Auto O2 Fav'), 
        0)

    Mobile.tap(findTestObject('Messages/Call Contact via Messages/android.widget.TextView5 - Auto O2 Fav'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.MultiAutoCompleteTextView0 - Auto O2 Fav'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Send Contact to IO Pro SIM 1/android.widget.EditText0 - Text (O2 - UK)'), 
        0, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Messages/Send Contact to IO Pro SIM 1/android.widget.EditText0 - Text (O2 - UK)'), 'This is an automated test SMS', 
        0)

    'Tap and Hold the SMS button'
    Mobile.tapAndHold(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.LinearLayout5'), 0, 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView2 - O2 - UK'), 
        0)

    'O2-UK SIM 1 icon'
    Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.ImageView0'), 0)

    'Send SMS button'
    Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.LinearLayout7'), 0)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView3 - Now  SMS'), 
        5)

    Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView4 -   via O2 - UK'), 
        0)

    Mobile.callTestCase(findTestCase('IO 3D/Messages/Receive SMS from IO Pro via O2-UK'), [('appPackage') : 'com.google.android.apps.messaging'
            , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
                , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Send SMS (Both SIMs)', 'SIM 1 = O2-UK', 
    TestLinkAPIResults.TEST_PASSED)

