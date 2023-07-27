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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.TextView0 - Welcome to Chrome'), 0)

'Chrome Logo'
Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.ImageView0'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Chrome App Pre-Installed/android.widget.TextView0 - By using Chrome you agree to the Google Terms of Service and the Google Chrome and Chrome OS Additional Terms of Service.'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.CheckBox0 - Help make Chrome better by sending usage statistics and crash reports to Google.'), 
    0)

Mobile.tap(findTestObject('Apps/Chrome/android.widget.CheckBox0 - Help make Chrome better by sending usage statistics and crash reports to Google.'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.Button0 - Accept  continue'), 0)

Mobile.tap(findTestObject('Apps/Chrome/android.widget.Button0 - Accept  continue'), 0)

not_run: Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.TextView0 - Turn on sync'), 0)

not_run: Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.TextView1 - Sync your passwords history and more on all devices'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Browser/Accept Cookies/android.widget.Button0 - No thanks'), 5)

    Mobile.tap(findTestObject('Browser/Accept Cookies/android.widget.Button0 - No thanks'), 0)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.Button0 - No thanks'), 0)

    Mobile.tap(findTestObject('Apps/Chrome/android.widget.Button0 - No thanks'), 0)
}

'Google Logo'
Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.FrameLayout8'), 0)

Mobile.tap(findTestObject('Browser/Open Web Page/android.widget.EditText0 - Search or type web address'), 0)

Mobile.setText(findTestObject('Browser/Chrome/Open Maps (GPS)/android.widget.EditText0 - Search or type web address'), 'google.co.uk/maps', 
    0)

'Enter on Keyboard'
Mobile.tapAtPosition(1000, 1940)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open YouTube/android.widget.Button0 - NO THANKS'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open YouTube/android.widget.Button0 - NO THANKS'), 0)

    Mobile.tap(findTestObject('Browser/Chrome/Open YouTube/android.widget.Button0 - NO THANKS'), 0)
}

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Maps (GPS)/android.view.View0 - Directions'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Maps (GPS)/android.widget.Button0 - Drive'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Maps (GPS)/android.widget.Button0 - Walk'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Maps (GPS)/android.widget.Button0 - Bike'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Maps (GPS)/android.view.View0 - Public transport'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Maps (GPS)/android.widget.Button0 - All'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Maps (GPS)/android.widget.Button0 - Bus'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Maps (GPS)/android.widget.Button0 - Metro'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Maps (GPS)/android.widget.Button0 - Train'), 0)

'Your Location button'
Mobile.tapAtPosition(840, 1250)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Maps (GPS)/android.widget.TextView0 - www.google.co.uk wants to use your devices location'), 
    0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Maps (GPS)/android.widget.Button0 - Block'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Maps (GPS)/android.widget.Button0 - Allow'), 0)

Mobile.tap(findTestObject('Browser/Chrome/Open Maps (GPS)/android.widget.Button0 - Allow'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Tap on Search Bar'
Mobile.tapAtPosition(500, 350)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'Tap on Search Bar'
Mobile.tapAtPosition(650, 1780)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'Tap on Search Bar'
Mobile.tapAtPosition(385, 1480)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'Tap on Search Bar'
Mobile.tapAtPosition(810, 1480)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'Tap on Search Bar'
Mobile.tapAtPosition(220, 1620)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'Tap on Search Bar'
Mobile.tapAtPosition(490, 1480)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'Tap on Search Bar'
Mobile.tapAtPosition(920, 1480)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'Tap on Search Bar'
Mobile.tapAtPosition(970, 1620)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'Enter on Keyboard'
Mobile.tapAtPosition(1000, 1940)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Maps (GPS)/android.view.View0 - Bristol'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Maps (GPS)/android.widget.Button0 - Directions'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Maps (GPS)/android.widget.Button0 - Start'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Open Maps (GPS)', '', TestLinkAPIResults.TEST_PASSED)

