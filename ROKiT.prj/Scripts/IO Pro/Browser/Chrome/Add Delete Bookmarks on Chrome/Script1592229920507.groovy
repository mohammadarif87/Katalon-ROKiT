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

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Browser/Accept Cookies/android.widget.Button0 - No thanks'), 0)

    Mobile.tap(findTestObject('Browser/Accept Cookies/android.widget.Button0 - No thanks'), 0)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.Button0 - No thanks'), 0)

    Mobile.tap(findTestObject('Apps/Chrome/android.widget.Button0 - No thanks'), 0)
}

'Google Logo'
Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.FrameLayout8'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.EditText0 - Search or type web address'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.TextView0 - Facebook'), 0)

Mobile.tap(findTestObject('Apps/Chrome/android.widget.EditText0 - Search or type web address'), 0)

Mobile.setText(findTestObject('Browser/Add Delete Bookmarks on Chrome/android.widget.EditText0 - Search or type web address'), 
    'rokitphones.com', 0)

'Tick on keyboard'
Mobile.tapAtPosition(990, 1930)

'3 dots in the corner'
Mobile.verifyElementVisible(findTestObject('Browser/Add Delete Bookmarks on Chrome/android.widget.ImageButton3'), 0)

'3 dots in the corner'
Mobile.tap(findTestObject('Browser/Add Delete Bookmarks on Chrome/android.widget.ImageButton3'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Add Delete Bookmarks on Chrome/android.widget.TextView2 - Bookmarks'), 
    0)

'Star icon'
Mobile.verifyElementVisible(findTestObject('Browser/Add Delete Bookmarks on Chrome/android.widget.ImageButton1'), 0)

'Star icon'
Mobile.tap(findTestObject('Browser/Add Delete Bookmarks on Chrome/android.widget.ImageButton1'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'3 dots in the corner'
Mobile.verifyElementVisible(findTestObject('Browser/Add Delete Bookmarks on Chrome/android.widget.ImageButton3'), 0)

'3 dots in the corner'
Mobile.tap(findTestObject('Browser/Add Delete Bookmarks on Chrome/android.widget.ImageButton3'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Add Delete Bookmarks on Chrome/android.widget.TextView2 - Bookmarks'), 
    0)

Mobile.tap(findTestObject('Browser/Add Delete Bookmarks on Chrome/android.widget.TextView2 - Bookmarks'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Browser/Add Delete Bookmarks on Chrome/android.widget.TextView0 - Mobile bookmarks'), 
    0)

Mobile.verifyElementVisible(findTestObject('Browser/Add Delete Bookmarks on Chrome/android.widget.TextView4 - ROKiT Telecommunications'), 
    0)

Mobile.verifyElementVisible(findTestObject('Browser/Add Delete Bookmarks on Chrome/android.widget.TextView5 - rokitphones.com'), 
    0)

'3 dots next to ROKiT Phones Bookmark'
Mobile.verifyElementVisible(findTestObject('Browser/Add Delete Bookmarks on Chrome/android.widget.ImageButton2'), 0)

'3 dots next to ROKiT Phones bookmark'
Mobile.tap(findTestObject('Browser/Add Delete Bookmarks on Chrome/android.widget.ImageButton2'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Add Delete Bookmarks on Chrome/android.widget.TextView3 - Delete'), 
    0)

Mobile.tap(findTestObject('Browser/Add Delete Bookmarks on Chrome/android.widget.TextView3 - Delete'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Add/Delete Bookmarks on Chrome', '', TestLinkAPIResults.TEST_PASSED)

