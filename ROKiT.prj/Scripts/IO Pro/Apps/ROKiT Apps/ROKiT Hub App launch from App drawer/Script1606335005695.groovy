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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('udid') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.pressHome()

Mobile.swipe(538, 1567, 538, 750)

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App launch from App drawer/android.widget.EditText0 -   Search apps'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App launch from App drawer/android.widget.TextView0 - ROKiT Hub'), 
    3)

Mobile.tap(findTestObject('Apps/ROKiT Apps/ROKiT Hub App launch from App drawer/android.widget.TextView0 - ROKiT Hub'), 
    3)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.TextView0 - Allow ROKiT Hub to access this devices location'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.TextView0 - Allow ROKiT Hub to access this devices location'), 
        0)
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Verify open ROKiT Hub', '', TestLinkAPIResults.TEST_PASSED)

