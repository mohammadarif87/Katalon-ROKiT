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

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Clear All Notifications'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.pressHome()

Mobile.openNotifications()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('USB/View USB Preferences/android.widget.TextView0 - Android System'), 0)
} else {
    Mobile.verifyElementVisible(findTestObject('USB/View USB Preferences/android.widget.TextView11 - Android system'), 0)
}

Mobile.tap(findTestObject('USB/View USB Preferences/android.widget.TextView8 - Charging this device via USB'), 0)

Mobile.tap(findTestObject('USB/View USB Preferences/android.widget.TextView8 - Tap for more options.'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('USB/View USB Preferences/android.widget.TextView0 - USB Preferences (1)'), 0, 
    FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('USB/View USB Preferences/android.widget.TextView3 - USB controlled by (1)'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('USB/View USB Preferences/android.widget.TextView4 - Connected device (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('USB/View USB Preferences/android.widget.TextView5 - This device (1)'), 0)

Mobile.verifyElementVisible(findTestObject('USB/View USB Preferences/android.widget.TextView6 - Use USB for (1)'), 0)

if (userName == 'Aiden') {
    Mobile.getText(findTestObject('USB/View USB Preferences/android.widget.TextView0 - File Transfer'), 0)
} else {
    Mobile.verifyElementVisible(findTestObject('USB/View USB Preferences/android.widget.TextView7 - File transfer (1)'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('USB/View USB Preferences/android.widget.TextView8 - USB tethering (1)'), 0)

Mobile.verifyElementVisible(findTestObject('USB/View USB Preferences/android.widget.TextView9 - MIDI (1)'), 0)

Mobile.verifyElementVisible(findTestObject('USB/View USB Preferences/android.widget.TextView10 - PTP (1)'), 0)

Mobile.verifyElementVisible(findTestObject('USB/View USB Preferences/android.widget.TextView11 - No data transfer (1)'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('View USB Preferences', '', TestLinkAPIResults.TEST_PASSED)

