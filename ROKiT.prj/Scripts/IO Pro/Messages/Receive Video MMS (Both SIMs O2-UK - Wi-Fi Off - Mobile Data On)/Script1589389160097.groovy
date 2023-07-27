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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 1 (O2 - UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], 
    FailureHandling.STOP_ON_FAILURE)

'IO Pro'
WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Messages'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

'IO 3D'
WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Delete All Albums From Gallery'), [('appPackage') : 'com.android.gallery3d'
        , ('appActivity') : '.app.GalleryActivity', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO 3D/Messages/Send MMS Video to IO Pro'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView0 - Messages just got better'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView3 - Use Messages without chat features'), 
        0)

    Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView3 - Use Messages without chat features'), 
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

if (Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView0 - Enter your phone number for the following SIM to finish setting up chat features'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView0 - Enter your phone number for the following SIM to finish setting up chat features'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView1 - SIM 1'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 
        0)

    Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 0)
}

Mobile.verifyElementVisible(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.TextView0 - Auto O2 Fav'), 
    0)

if (Mobile.verifyElementVisible(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.TextView1 - Video'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.TextView1 - Video'), 
        0)

    Mobile.tap(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.TextView0 - Auto O2 Fav'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.TextView3 - Auto O2 Fav'), 
        0)

    'Video in message'
    Mobile.verifyElementVisible(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.ImageView1 (1)'), 
        10)

    Mobile.closeApplication()
} else {
    Mobile.tap(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.TextView0 - Auto O2 Fav'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.TextView3 - Auto O2 Fav'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.TextView1 - Tap to download'), 
        0)

    'Download icon for video'
    Mobile.verifyElementVisible(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.FrameLayout6'), 
        0)

    'Download icon for video'
    Mobile.tap(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.FrameLayout6'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    'Video in message'
    Mobile.verifyElementVisible(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.ImageView1 (1)'), 
        10)

    Mobile.pressBack()

    Mobile.verifyElementVisible(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.TextView1 - Video'), 
        0)

    Mobile.closeApplication()
}

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Receive Video MMS (Both SIMs, Wi-Fi Off, Mobile Data On)', 
    'SIM 1 = O2-UK \n SIM 2 = EE', TestLinkAPIResults.TEST_PASSED)

