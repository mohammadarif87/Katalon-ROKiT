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
import testlink.api.java.client.TestLinkAPIResults as TestLinkAPIResults
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

'Launch Internet app on Home screen'
CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

not_run: Mobile.pressHome()

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'Internet App location on home screen'
not_run: Mobile.tapAtPosition(400, 1300)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.TextView0 - Chrome with Karma'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App on Home Screen/android.widget.TextView0 - Weve removed all the trackers and data harvesters leaving just the good bits.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App on Home Screen/android.widget.Button0 - Yes please'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.TextView0 - Chromium with Karma'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.TextView1 - Weve removed all the trackers and data harvesters leaving just the good bits.'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.Button0 - Yes please'), 0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Internet App on Home Screen', '', TestLinkAPIResults.TEST_PASSED)

