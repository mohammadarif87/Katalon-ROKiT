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

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Set SMS to SIM 1 (O2-UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Messages'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.tap(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.TextView5 - Auto O2 Fav'), 
        0)

    Mobile.tap(findTestObject('Messages/Call Contact via Messages/android.widget.TextView5 - Auto O2 Fav'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.MultiAutoCompleteTextView0 - Auto O2 Fav'), 
        0)

    not_run: if (Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Text messagefrom T-Mobile'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Text messagefrom T-Mobile'), 
            0)
    }
    
    not_run: if (Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Chat messagefrom T-Mobile'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Chat messagefrom T-Mobile'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Chat (T-Mobile)'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Chat (T-Mobile)'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 2/android.widget.EditText0 - Text (T-Mobile)'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 2/android.widget.EditText0 - Text (T-Mobile)'), 
            0)
    }
    
    'Call icon in Messages'
    Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.TextView3'), 0)

    'Call icon in Messages'
    Mobile.tap(findTestObject('Messages/Call Contact via Messages/android.widget.TextView3'), 0)

    'Contact number in Phone dialler app'
    Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.EditText0 - (747) 344-7370'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.TextView21 - All contacts'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.TextView22 - Auto O2 Fav'), 
        0)

    'Call button on Phone app'
    Mobile.tap(findTestObject('Messages/Call Contact via Messages/android.widget.ImageButton2'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.TextView0 - Choose SIM for this call'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.TextView0 - T-Mobile'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.TextView0 - 1 478-777-7307'), 
        3)

    'SIM 1 - O2-UK'
    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageView0'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.TextView0 - Calling via T-Mobile'), 
        3)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    'End call button'
    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton0'), 0)
} else {
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

    'Call icon in Messages'
    Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.TextView3'), 0)

    'Call icon in Messages'
    Mobile.tap(findTestObject('Messages/Call Contact via Messages/android.widget.TextView3'), 0)

    'Contact number in Phone dialler app'
    Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.EditText0 - 07515 064104'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.TextView21 - All contacts'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.TextView22 - Auto O2 Fav'), 
        0)

    'Call button on Phone app'
    Mobile.tap(findTestObject('Messages/Call Contact via Messages/android.widget.ImageButton2'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.TextView0 - Choose a SIM for this call'), 
        0)

    'SIM 1 - O2-UK'
    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageView0'), 0)

    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView0 - Calling via O2 - UK'), 
        0)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    'End call button'
    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton0'), 0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Call via Messages', '', TestLinkAPIResults.TEST_PASSED)

