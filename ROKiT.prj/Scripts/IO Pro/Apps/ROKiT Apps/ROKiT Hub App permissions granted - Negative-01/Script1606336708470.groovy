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

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.TextView0 - Allow ROKiT Hub to access this devices location'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button0 - DENY'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 3)

    not_run: Mobile.tap(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 3)

    Mobile.tap(findTestObject('Apps/ROK Launch Control/android.widget.Button0 - DENY'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.TextView0 - Allow ROKiT Hub to make and manage phone calls'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button0 - DENY'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 3)

    not_run: Mobile.tap(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 3)

    Mobile.tap(findTestObject('Apps/ROK Launch Control/android.widget.Button0 - DENY'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.TextView0 - Essential permissions are required for authenticating device information.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - CANCEL'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - OKAY'), 
        0)

    Mobile.tap(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - CANCEL'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.TextView0 - ROKiT Hub requires the Phone permission to continue. Select SETTINGS to open Settings and allow.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - SETTINGS'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - CLOSE'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - OK'), 
        0)

    Mobile.tap(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - OK'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.TextView0 - Essential permissions are required for authenticating device information.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - CANCEL'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - OKAY'), 
        0)

    Mobile.tap(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - CANCEL'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.TextView0 - ROKiT Hub requires the Phone permission to continue. Select SETTINGS to open Settings and allow.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - SETTINGS'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - CLOSE'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - OK'), 
        0)

    Mobile.tap(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - CLOSE'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.TextView0 - Allow ROKiT Hub to access this devices location'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button0 - DENY'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 0)

    not_run: Mobile.tap(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 0)

    Mobile.tap(findTestObject('Apps/ROK Launch Control/android.widget.Button0 - DENY'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.TextView0 - Allow ROKiT Hub to make and manage phone calls'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button0 - DENY'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 0)

    not_run: Mobile.tap(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 0)

    Mobile.tap(findTestObject('Apps/ROK Launch Control/android.widget.Button0 - DENY'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.TextView0 - Essential permissions are required for authenticating device information.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - CANCEL'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - OKAY'), 
        0)

    Mobile.tap(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - CANCEL'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.TextView0 - ROKiT Hub requires the Phone permission to continue. Select SETTINGS to open Settings and allow.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - SETTINGS'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - CLOSE'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - OK'), 
        0)

    Mobile.tap(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - OK'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.TextView0 - Essential permissions are required for authenticating device information.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - CANCEL'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - OKAY'), 
        0)

    Mobile.tap(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - CANCEL'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.TextView0 - ROKiT Hub requires the Phone permission to continue. Select SETTINGS to open Settings and allow.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - SETTINGS'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - CLOSE'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - OK'), 
        0)

    Mobile.tap(findTestObject('Apps/ROKiT Apps/ROKiT Hub App permissions granted-Negative-01/android.widget.Button0 - CLOSE'), 
        3)
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Verify permissions granted - Negative-01', 
    '', TestLinkAPIResults.TEST_PASSED)

