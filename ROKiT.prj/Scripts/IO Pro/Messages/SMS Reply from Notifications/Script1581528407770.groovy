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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Set SMS to SIM 1 (O2-UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 1 (O2 - UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('udid') : 'IOPRO0123456789A', ('platformName') : 'Android']], 
    FailureHandling.STOP_ON_FAILURE)

'IO Pro'
Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Messages'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Clear All Notifications'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('IO 3D/Messages/Send SMS to IO Pro SIM 1'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.pressHome()

Mobile.openNotifications()

Mobile.verifyElementVisible(findTestObject('Messages/SMS Reply from notifications/android.widget.TextView3 - Messages'), 
    60)

Mobile.verifyElementVisible(findTestObject('Messages/SMS Reply from notifications/android.widget.TextView8 - Auto O2 Fav'), 
    0)

Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.TextView9 - This is an automated test SMS'), 
    0)

Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.Button1 - MARK AS READ'), 
    0)

Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.Button2 - REPLY'), 
    0)

Mobile.tap(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.Button2 - REPLY'), 0)

Mobile.setText(findTestObject('Messages/SMS Reply from notifications/android.widget.EditText0'), 'This is an automated reply', 
    0)

Mobile.verifyElementVisible(findTestObject('Messages/SMS Reply from notifications/android.widget.EditText0 - This is an automated reply'), 
    0)

'Send button'
Mobile.tap(findTestObject('Messages/SMS Reply from notifications/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.Button1 - MARK AS READ'), 0)

Mobile.closeNotifications()

Mobile.callTestCase(findTestCase('IO 3D/Messages/Receive SMS from IO Pro Notifications'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('SMS Reply from Notifications', 'SIM 1 = O2-UK\nSIM 2 = EE', 
    TestLinkAPIResults.TEST_PASSED)

