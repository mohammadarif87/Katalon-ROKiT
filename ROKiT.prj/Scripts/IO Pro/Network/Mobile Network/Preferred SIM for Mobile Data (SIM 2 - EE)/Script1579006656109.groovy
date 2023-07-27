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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 2 (EE)(ATT)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Check Mobile Data works with YouTube')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementNotVisible(findTestObject('Network/Preferred SIM for Mobile Data (SIM 1 - O2-UK)/android.widget.TextView12 - No connection'), 
    0)

Mobile.verifyElementVisible(findTestObject('Network/Preferred SIM for Mobile Data (SIM 1 - O2-UK)/android.view.ViewGroup5'), 
    0)

Mobile.tap(findTestObject('Network/Preferred SIM for Mobile Data (SIM 1 - O2-UK)/android.view.ViewGroup5'), 0)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementNotVisible(findTestObject('Network/Preferred SIM for Mobile Data (SIM 1 - O2-UK)/android.widget.TextView12 - No connection'), 
    0)

Mobile.comment('Check Mobile Data works with Browser')

Mobile.pressHome()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(725, 1830)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.TextView0 - Browse faster. Use less data.'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.TextView0 - Browse faster. Use less data.'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.Button1 - Turn on Lite mode'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.Button0 - No thanks'), 0)

    Mobile.tap(findTestObject('Apps/Extras Bookmarks/android.widget.Button0 - No thanks'), 0)
}

'Home Button'
Mobile.verifyElementVisible(findTestObject('Network/Preferred SIM for Mobile Data (SIM 1 - O2-UK)/android.widget.ImageButton0'), 
    3)

'Home Button'
Mobile.tap(findTestObject('Network/Preferred SIM for Mobile Data (SIM 1 - O2-UK)/android.widget.ImageButton0'), 0)

'Google Logo'
Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.FrameLayout8'), 0)

Mobile.tap(findTestObject('Browser/Open Web Page/android.widget.EditText0 - Search or type web address'), 0)

Mobile.setText(findTestObject('Browser/Open Web Page/android.widget.EditText0 - Search or type web address (1)'), 'red hippopotamus', 
    0)

'Enter on Keyboard'
Mobile.tapAtPosition(1000, 1940)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Browser/Search/android.view.View1 - Google'), 0)

if (Mobile.verifyElementVisible(findTestObject('Browser/Search/android.view.View7 - Before you continue'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Browser/Search/android.view.View7 - Before you continue'), 0)

    Mobile.tap(findTestObject('Browser/Search/android.widget.Button1 - I agree'), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    not_run: Mobile.swipe(512, 1800, 512, 400)

    not_run: Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    not_run: Mobile.tap(findTestObject('Browser/Search/android.widget.Button1 - I agree (1)'), 0)

    not_run: Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

Mobile.verifyElementVisible(findTestObject('Browser/Search/android.widget.EditText0 - red hippopotamus'), 0)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 1 (O2 - UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Preferred SIM for Mobile Data (SIM 2)', 
    '', TestLinkAPIResults.TEST_PASSED)

