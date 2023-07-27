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

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView9 - Advanced'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView9 - Advanced'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView9 - Input assistance'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView10 - Spell checker'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView11 - Gboard spell checker'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView0 - Autofill service'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView12 - Auto-fill service'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView13 - Google'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView14 - Personal dictionary'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView10 - Spell checker'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView0 - Spell checker'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView2 - Use spell checker'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.Switch0 - ON'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView3 - Languages'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView4 - Use system languages'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView5 - Default spell checker'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView6 - Gboard spell checker'), 
    0)

Mobile.pressBack()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

if (userName == 'Aiden') {
    Mobile.tap(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView0 - Autofill service'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView0 - Autofill service (1)'), 
        0)
} else {
    Mobile.tap(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView12 - Auto-fill service'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView0 - Auto-fill service'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView1 - None'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView2 - Google'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView2 - Google'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.Button1 - OK'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.Button1 - OK'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView3 - Add service'), 
    0)

Mobile.pressBack()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView14 - Personal dictionary'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView14 - Personal dictionary'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Input Assistance/android.widget.TextView0 - Personal dictionary'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Input Assistance', '', TestLinkAPIResults.TEST_PASSED)

