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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView0 - Messages just got better'), 
    0, FailureHandling.OPTIONAL)) {
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

Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 3)

Mobile.tap(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 3)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.MultiAutoCompleteTextView0 - Type a name phone number or email'), 
        3)

    'MINT SIM'
    Mobile.setText(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.MultiAutoCompleteTextView0 - Type a name phone number or email'), 
        '7473447370', 0)

    'Tap the tick on the Keyboard'
    Mobile.tapAtPosition(1000, 1950)

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
    Mobile.tapAndHold(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.LinearLayout5'), 1, 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.TextView0 - T-Mobile'), 
        5)

    Mobile.tap(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.TextView0 - T-Mobile'), 3)

    'Send SMS button'
    Mobile.tap(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.ImageView0'), 3)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.TextView0 - Now  Delivered'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.getText(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.TextView0 - Now  Delivered'), 
            3)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.TextView0 - Now  SMS'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.TextView0 - Now  SMS'), 
            5)
    }
    
    Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.TextView0 -   via T-Mobile'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.MultiAutoCompleteTextView0 - Type a name phone number or email address'), 
        0, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.MultiAutoCompleteTextView0 - Type a name phone number or email address'), 
        '07515064104', 0)

    'Tap the tick on the Keyboard'
    Mobile.tapAtPosition(1000, 1950)

    Mobile.verifyElementVisible(findTestObject('Messages/Send Contact to IO Pro SIM 1/android.widget.EditText0 - Text (O2 - UK)'), 
        0)

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
}

Mobile.closeApplication()

