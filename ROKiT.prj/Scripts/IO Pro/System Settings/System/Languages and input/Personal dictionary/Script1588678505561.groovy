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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Remove Google Account'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Messages'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - System'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - System'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Languages input'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Languages input'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView9 - Advanced'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView9 - Advanced'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView14 - Personal dictionary'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView14 - Personal dictionary'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView0 - Personal dictionary'), 
    0)

'Add Word Button'
Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView2'), 
    0)

'Add Word Button'
Mobile.tap(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView2'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView0 - Add to dictionary'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.EditText0 - Type a word'), 
    0)

Mobile.setText(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.EditText0 - Type a word'), 
    'ROKiTIOPro', 0)

'Back'
Mobile.tap(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.ImageButton0'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView3 - ROKiTIOPro'), 
    0)

Mobile.pressHome()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage2, 
    appActivity2)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

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

if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - New Spam protection'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.Button2 - OK'), 0)
}

'Start chat button'
not_run: Mobile.tapAtPosition(820, 1900)

Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 0)

Mobile.tap(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.setText(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Delete word/android.widget.MultiAutoCompleteTextView0 - Type a name phone number or email'), 
        'Auto O2 Fav', 0)

    Mobile.tapAtPosition(1030, 1990, FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Text messagefrom T-Mobile'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Text messagefrom T-Mobile'), 
            0)

        Mobile.setText(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Text messagefrom T-Mobile'), 
            'rokitio', 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Chat messagefrom T-Mobile'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Chat messagefrom T-Mobile'), 
            0)

        Mobile.setText(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Chat messagefrom T-Mobile'), 
            'rokitio', 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Chat (T-Mobile)'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Chat (T-Mobile)'), 
            0)

        Mobile.setText(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.EditText0 - Chat (T-Mobile)'), 
            'rokitio', 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 2/android.widget.EditText0 - Text (T-Mobile)'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 2/android.widget.EditText0 - Text (T-Mobile)'), 
            0)

        Mobile.setText(findTestObject('Preconditions/Send SMS to IO 3D SIM 2/android.widget.EditText0 - Text (T-Mobile)'), 
            'rokitio', 0)
    }
} else {
    Mobile.setText(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.MultiAutoCompleteTextView0 - Type a name phone number or email address'), 
        'Auto O2 Fav', 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Auto O2 Fav Contact'
    Mobile.tap(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.FrameLayout3'), 
        0)

    Mobile.setText(findTestObject('Messages/Send Contact to IO Pro SIM 1/android.widget.EditText0 - Text (O2 - UK)'), 'rokitio', 
        0)
}

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'ROKiTIOPro on keyboard suggestion'
Mobile.tapAtPosition(540, 1340)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.EditText0 - ROKiTIOPro'), 
    0)

Mobile.closeApplication()

Mobile.comment('Check the word on Gboard')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - System'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - System'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Languages input'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Languages input'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView5 - Virtual keyboard'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView5 - Virtual keyboard'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView0 - Virtual keyboard'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView2 - Gboard'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView2 - Gboard'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView8 - Dictionary'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView8 - Dictionary'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView0 - Dictionary'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView1 - Personal dictionary'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView1 - Personal dictionary'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView0 - Personal dictionary (1)'), 
    0)

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.TextView0 - English (US)'), 
        5)

    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.TextView0 - English (US)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView0 - English (US)'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.TextView0 - English (UK)'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.TextView0 - English (UK)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView0 - English (UK)'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView2 - ROKiTIOPro'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView2 - ROKiTIOPro'), 
    0)

'Delete button'
Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView1'), 
    0)

'Delete button'
Mobile.tap(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView1'), 0)

'Back button'
Mobile.tap(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.ImageButton0 (1)'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'Back button'
Mobile.tap(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.ImageButton0 (1)'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'Back button'
Mobile.tap(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.ImageButton0 (1)'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'Back button'
Mobile.tap(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.ImageButton0 (1)'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'Back button'
Mobile.tap(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.ImageButton0 (1)'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView9 - Advanced'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView9 - Advanced'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView14 - Personal dictionary'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView14 - Personal dictionary'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView0 - Personal dictionary'), 
    0)

Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView3 - ROKiTIOPro'), 
    0, FailureHandling.OPTIONAL)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Personal dictionary', '', TestLinkAPIResults.TEST_PASSED)

