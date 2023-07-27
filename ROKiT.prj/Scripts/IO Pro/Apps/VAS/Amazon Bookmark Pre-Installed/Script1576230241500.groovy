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

Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.TextView1 - Extras'), 0)

Mobile.tap(findTestObject('Apps/Extras Bookmarks/android.widget.TextView1 - Extras'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.TextView0 - Amazon'), 0)

Mobile.tap(findTestObject('Apps/Extras Bookmarks/android.widget.TextView0 - Amazon'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.TextView0 - Browse faster. Use less data.'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.TextView0 - Browse faster. Use less data.'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.Button1 - Turn on Lite mode'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.Button0 - No thanks'), 0)

    Mobile.tap(findTestObject('Apps/Extras Bookmarks/android.widget.Button0 - No thanks'), 0)
}

if (Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.EditText1 - httpswww.amazon.com'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Apps/VAS/android.widget.TextView0 - Turn on sync'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/VAS/android.widget.Button0 - No thanks'), 0)

    Mobile.tap(findTestObject('Apps/VAS/android.widget.Button0 - No thanks'), 0)

    not_run: Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.Button2 - Sign in'), 0)
}

if (Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.EditText1 - amazon.com'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.Button2 - Sign in'), 0)
}

Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.webkit.WebView0 - Amazon.com Online Shopping for Electronics Apparel Computers Books DVDs  more'), 
    3)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Amazon Bookmark Pre-Installed', '', TestLinkAPIResults.TEST_PASSED)

