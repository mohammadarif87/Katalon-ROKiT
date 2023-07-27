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

Mobile.setText(findTestObject('Browser/Chrome/Open Pictures/android.widget.EditText0 - Search or type web address'), 'flickr.com/photos', 
    0)

'Enter on Keyboard'
Mobile.tapAtPosition(1000, 1940)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Pictures/android.view.View0 - Flickr logo. If you click it youll go home'), 
    3)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Pictures/android.widget.TextView0 - Explore'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Pictures/android.widget.TextView0 - Trending'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Pictures/android.widget.TextView0 - Events'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'1st Image'
Mobile.waitForElementPresent(findTestObject('Browser/Chrome/Open Pictures/android.view.View25'), 0)

'2nd Image'
Mobile.waitForElementPresent(findTestObject('Browser/Chrome/Open Pictures/android.view.View27'), 0)

Mobile.swipe(530, 1450, 530, 440)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(530, 440, 530, 1450)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Open Pictures', '', TestLinkAPIResults.TEST_PASSED)

