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

Mobile.comment('YOU MIGHT HAVE TO MANUALLY DELETE THE WORD FROM GBOARD')

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

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Delete word/android.widget.TextView0 - ROKiTIOPro'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Delete word/android.widget.TextView0 - ROKiTIOPro'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Delete word/android.widget.TextView0 - ROKiTIOPro'), 
        0)

    'Delete word'
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Delete word/android.widget.TextView0'), 
        0)

    'Delete word'
    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Delete word/android.widget.TextView0'), 
        0)

    'Back'
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Delete word/android.widget.ImageButton0'), 
        0)

    'Back\r\n'
    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Delete word/android.widget.ImageButton0'), 
        0)
} else {
    'Add word button'
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.TextView0'), 
        0)

    'Add word button'
    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.TextView0'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.EditText0 - Type a word (2)'), 
        0)

    Mobile.setText(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.EditText0 - Type a word (2)'), 
        'ROKiTIOPro', 0)

    'Back'
    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Add word/android.widget.ImageButton0 (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Delete word/android.widget.TextView0 - ROKiTIOPro'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Delete word/android.widget.TextView0 - ROKiTIOPro'), 
        0)

    'Delete word'
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Delete word/android.widget.TextView0'), 
        0)

    'Delete word'
    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Delete word/android.widget.TextView0'), 
        0)

    'Back'
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Delete word/android.widget.ImageButton0'), 
        0)

    'Back\r\n'
    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Dictionary Delete word/android.widget.ImageButton0'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Gboard > Dictionary Delete word', '', 
    TestLinkAPIResults.TEST_PASSED)

