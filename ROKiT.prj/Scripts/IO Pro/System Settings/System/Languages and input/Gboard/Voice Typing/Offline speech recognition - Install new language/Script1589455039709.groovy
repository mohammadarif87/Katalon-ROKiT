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

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Google Voice typing - Support/android.widget.TextView0 - Automatic'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Google Voice typing - Support/android.widget.TextView0 - Google voice typing'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Google Voice typing - Support/android.widget.TextView0 - Google voice typing'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Google Voice typing - Support/android.widget.TextView0 - Voice'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Auto-update/android.widget.TextView0 - Offline speech recognition'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Auto-update/android.widget.TextView0 - Offline speech recognition'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Auto-update/android.widget.TextView0 - Download Languages'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Auto-update/android.widget.TextView0 - INSTALLED'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.TextView0 - English (US)'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.TextView0 - English (UK)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.TextView0 - English (US)'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.TextView0 - ALL'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.TextView0 - ALL'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.TextView0 - Deutsch (Deutschland)'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.TextView0 - Deutsch (Deutschland)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.TextView0 - Deutsch (Deutschland) (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.Button0 - CANCEL'), 
    0)

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.Button0 - DOWNLOAD'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.Button0 - DOWNLOAD'), 
        3)

    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.Button0 - DOWNLOAD'), 
        0)

    Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)
}

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.Button0 - UNINSTALL (1)'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.Button0 - UNINSTALL (1)'), 
        3)

    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.Button0 - CANCEL (2)'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.TextView0 - INSTALLED'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.TextView0 - INSTALLED'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.TextView0 - Deutsch (Deutschland) (2)'), 
    30)

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.TextView0 - English (US)'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.TextView0 - English (UK)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.TextView0 - English (US)'), 
        0)
}

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.TextView0 - Deutsch (Deutschland) (3)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.Button0 - CANCEL (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.Button0 - UNINSTALL'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.Button0 - UNINSTALL'), 
    0)

Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Languages and input/Gboard/Voice Typing/Offline speech recognition - Install new language/android.widget.TextView0 - Deutsch (Deutschland) (2)'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Offline speech recognition - Install new language', 
    '', TestLinkAPIResults.TEST_PASSED)

