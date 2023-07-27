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

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.pressHome()

Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.TextView1 - Extras'), 3)

Mobile.tap(findTestObject('Apps/Extras Bookmarks/android.widget.TextView1 - Extras'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Apps/Facebook Bookmark Pre-Installed/android.widget.TextView0 - Amazon'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Facebook Bookmark Pre-Installed/android.widget.TextView0 - Facebook'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/Facebook Bookmark Pre-Installed/android.widget.EditText0 - Extras'), 3)

Mobile.tap(findTestObject('Apps/Facebook Bookmark Pre-Installed/android.widget.TextView0 - Facebook'), 3)

not_run: CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, 
    appPackageF, appActivityF)

'Facebook Icon'
not_run: Mobile.tapAtPosition(920, 940)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.TextView0 - Browse faster. Use less data.'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.TextView0 - Browse faster. Use less data.'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.Button1 - Turn on Lite mode'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.Button0 - No thanks'), 0)

    Mobile.tap(findTestObject('Apps/Extras Bookmarks/android.widget.Button0 - No thanks'), 0)
}

if (Mobile.verifyElementVisible(findTestObject('Apps/Facebook Bookmark Pre-Installed/android.widget.TextView0 - Welcome to Chrome'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Apps/Facebook Bookmark Pre-Installed/android.widget.TextView0 - Welcome to Chrome'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Facebook Bookmark Pre-Installed/android.widget.TextView0 - By using Chrome you agree to the Google Terms of Service and the Google Chrome and Chrome OS Additional Terms of Service.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Facebook Bookmark Pre-Installed/android.widget.CheckBox0 - Help make Chrome better by sending usage statistics and crash reports to Google.'), 
        3)

    Mobile.tap(findTestObject('Apps/Facebook Bookmark Pre-Installed/android.widget.CheckBox0 - Help make Chrome better by sending usage statistics and crash reports to Google.'), 
        3)

    Mobile.tap(findTestObject('Apps/Facebook Bookmark Pre-Installed/android.widget.Button0 - Accept  continue'), 3)
}

if (Mobile.verifyElementVisible(findTestObject('Apps/VAS/android.widget.TextView0 - Turn on sync'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Apps/VAS/android.widget.TextView0 - Turn on sync'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/VAS/android.widget.Button0 - No thanks'), 0)

    Mobile.tap(findTestObject('Apps/VAS/android.widget.Button0 - No thanks'), 0)

    not_run: Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.Button0 - Log In'), 0)
}

if (Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.EditText2 - m.facebook.com'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.Button0 - Log In'), 0)
}

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Apps/VAS/android.webkit.WebView0 - Facebook - Log In or Sign Up'), 3)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.webkit.WebView0 - Facebook  log in or sign up'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Facebook Bookmark Pre-Installed', '', 
    TestLinkAPIResults.TEST_PASSED)

