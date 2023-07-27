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

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Offline speech recognition - Installed', 
    '', TestLinkAPIResults.TEST_PASSED)

