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

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Gboard Google voice typing'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Virtual keyboard'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Virtual keyboard'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Virtual keyboard (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Multilingual typing'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Gboard'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Gboard'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Settings'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.TextView0 - Dictionary'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.TextView0 - Dictionary'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.TextView0 - Personal dictionary'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.TextView0 - Personal dictionary'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.TextView0 - English (US)'), 
        5)

    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.TextView0 - English (US)'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.TextView0 - English (UK)'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.TextView0 - English (UK)'), 
        0)
}

'Add word button'
Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.TextView0'), 
    0)

'Add word button'
Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.TextView0'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.EditText0 - Type a word (2)'), 
    0)

Mobile.setText(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.EditText0 - Type a word (2)'), 
    'ROKiTIOPro', 3)

'Back'
Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.ImageButton0 (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.TextView0 - ROKiTIOPro'), 
    0)

Mobile.pressHome()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Messages Icon on Home Screen'
Mobile.tapAtPosition(350, 1840)

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

not_run: Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.Button0 - Start chat'), 
    0)

not_run: Mobile.tap(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.Button0 - Start chat'), 
    0)

'Start chat button'
Mobile.tapAtPosition(820, 1900)

Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.TextView5 - Auto O2 Fav'), 
    0)

Mobile.tap(findTestObject('Messages/Call Contact via Messages/android.widget.TextView5 - Auto O2 Fav'), 0)

if (userName == 'Aiden') {
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
    'Auto O2 Fav Contact'
    Mobile.tap(findTestObject('Messages/Send Contact to IO Pro SIM 1/android.widget.EditText0 - Text (O2 - UK)'), 0)

    Mobile.setText(findTestObject('Messages/Send Contact to IO Pro SIM 1/android.widget.EditText0 - Text (O2 - UK)'), 'rokitio', 
        0)
}

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'ROKiTIOPro on keyboard suggestion'
Mobile.tapAtPosition(540, 1340)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.EditText0 - ROKiTIOPro'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Gboard > Dictionary Add word', '', TestLinkAPIResults.TEST_PASSED)

