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

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - System'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - System'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - Advanced'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - Advanced'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - Developer options'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - Developer options'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - Stay awake'), 
    0)

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.Switch0 - ON'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.comment('If Stay awake is ON, then check it displays ON')

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.Switch0 - ON'), 
        0)
} else {
    Mobile.comment('Else if Stay awake is OFF then turn it on')

    Mobile.tap(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - Stay awake'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.Switch0 - ON'), 
        0)
}

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Sleep Time/Set sleep to 15 seconds'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.pressHome()

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - Phone'), 
    0)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Sleep Time/Set sleep to 10 minutes'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('udid') : 'IOPRO0123456789A', ('platformName') : 'Android']], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Stay awake', '', TestLinkAPIResults.TEST_PASSED)

