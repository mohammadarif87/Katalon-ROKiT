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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Close All Recent Apps'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
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
    Mobile.verifyElementVisible(findTestObject('Browser/Accept Cookies/android.widget.Button0 - No thanks'), 5)

    Mobile.tap(findTestObject('Browser/Accept Cookies/android.widget.Button0 - No thanks'), 0)
} else {
    if (Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.Button0 - No thanks'), 0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.Button0 - No thanks'), 0)

        Mobile.tap(findTestObject('Apps/Chrome/android.widget.Button0 - No thanks'), 0)
    }
}

'Google Logo'
Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.FrameLayout8'), 0)

Mobile.tap(findTestObject('Browser/Open Web Page/android.widget.EditText0 - Search or type web address'), 0)

Mobile.setText(findTestObject('Browser/Chrome/Downloads/android.widget.EditText0 - Search or type web address'), 'https://file-examples-com.github.io/uploads/2017/10/file_example_JPG_100kB.jpg', 
    0)

'Enter on Keyboard'
Mobile.tapAtPosition(1000, 1940)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(540, 1090, 2)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - Download image'), 0)

Mobile.tap(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - Download image'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - Chrome needs storage access to download files.'), 
    0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.Button0 - Continue'), 0)

Mobile.tap(findTestObject('Browser/Chrome/Downloads/android.widget.Button0 - Continue'), 0)

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - Allow Chrome to access photos media and files on your device (1)'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - Allow Chrome to access photos media and files on your device'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.Button0 - DENY'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.Button0 - ALLOW'), 0)

Mobile.tap(findTestObject('Browser/Chrome/Downloads/android.widget.Button0 - ALLOW'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.pressHome()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(530, 1450, 530, 440)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - Files'), 0)

Mobile.tap(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - Files'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - Downloads'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - file_example_JPG_100kB.jpg'), 
    0)

Mobile.tap(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - file_example_JPG_100kB.jpg'), 0)

if (Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - Open with Gallery'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - Open with Gallery'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.Button0 - JUST ONCE'), 3)

    Mobile.tap(findTestObject('Browser/Chrome/Downloads/android.widget.Button0 - JUST ONCE'), 0)
} else {
    Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - Gallery'), 3)

    Mobile.tap(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - Gallery'), 3)

    Mobile.tap(findTestObject('Browser/Chrome/Downloads/android.widget.Button0 - JUST ONCE'), 0)
}

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete All Albums From Gallery - US/android.widget.TextView0 - Allow Gallery to access photos media and files on your device'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete All Albums From Gallery - US/android.widget.TextView0 - Allow Gallery to access photos media and files on your device'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Apps/Gallery/android.widget.Button1 - ALLOW'), 0)

        Mobile.tap(findTestObject('Apps/Gallery/android.widget.Button1 - ALLOW'), 0)
    }
} else {
    if (Mobile.verifyElementVisible(findTestObject('Apps/Gallery/android.widget.TextView0 - Allow Gallery to access photos media and files on your device'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Apps/Gallery/android.widget.TextView0 - Allow Gallery to access photos media and files on your device'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Apps/Gallery/android.widget.Button1 - ALLOW'), 0)

        Mobile.tap(findTestObject('Apps/Gallery/android.widget.Button1 - ALLOW'), 0)
    }
}

'Picture displayed in Gallery'
Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.FrameLayout3'), 0)

Mobile.comment('Delete image')

Mobile.pressBack()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - file_example_JPG_100kB.jpg'), 
    0)

Mobile.tapAndHold(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - file_example_JPG_100kB.jpg'), 2, 0)

'Delete icon'
Mobile.tap(findTestObject('Browser/Chrome/Downloads/android.widget.TextView2'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - Delete file_example_JPG_100kB.jpg'), 
    0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.Button0 - CANCEL'), 0)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.Button1 - OK'), 0)

Mobile.tap(findTestObject('Browser/Chrome/Downloads/android.widget.Button1 - OK'), 0)

Mobile.pressHome()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(530, 1450, 530, 440)

Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - Files'), 0)

Mobile.tap(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - Files'), 0)

Mobile.verifyElementNotVisible(findTestObject('Browser/Chrome/Downloads/android.widget.TextView0 - file_example_JPG_100kB.jpg'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Downloads', '', TestLinkAPIResults.TEST_PASSED)

