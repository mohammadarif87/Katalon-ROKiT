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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

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

'If search term is not displayed, refresh the page'
if (Mobile.verifyElementNotVisible(findTestObject('Browser/Search/android.widget.EditText0 - red hippopotamus'), 3, FailureHandling.OPTIONAL)) {
    '3 dots in top right'
    Mobile.tap(findTestObject('Browser/Chrome/Open Google Pictures/android.widget.ImageButton3'), 3)

    'Refresh icon'
    Mobile.tap(findTestObject('Browser/Chrome/Open Google Pictures/android.widget.ImageButton4'), 3)
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Browser/Search/android.widget.EditText0 - red hippopotamus'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Google Videos/android.widget.TextView0 - VIDEOS'), 
    0)

not_run: Mobile.tap(findTestObject('Browser/Chrome/Open Google Videos/android.widget.TextView0 - VIDEOS'), 0)

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

driver.findElementByXPath('//android.view.View[@content-desc = \'VIDEOS\']').isDisplayed()

driver.findElementByXPath('//android.view.View[@content-desc = \'VIDEOS\']').click()

'1st video'
not_run: Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Google Videos/android.widget.Image1 - Video for red hippopotamus'), 
    0)

'2nd video'
not_run: Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Google Videos/android.view.View0 (1)'), 0)

'1st video'
not_run: Mobile.tap(findTestObject('Browser/Chrome/Open Google Videos/android.view.View0'), 0)

'2nd video'
not_run: Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Google Videos/android.view.View0 (1)'), 0)

'2nd video'
not_run: Mobile.tap(findTestObject('Browser/Chrome/Open Google Videos/android.view.View0 (1)'), 0)

Mobile.delay(5)

AndroidDriver<MobileElement> driverImage = MobileDriverFactory.getDriver()

'Look for 1st and 2nd video'
driverImage.findElementByXPath('//android.view.View[contains(@text, \'Hippopotamus\')]').isDisplayed()

driverImage.findElementByXPath('//android.view.View[contains(@text, \'Could Pablo Escobar\')]').isDisplayed()

driverImage.findElementByXPath('//android.view.View[contains(@text, \'Hippopotamus\')]').click()

if (Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Google Videos/android.widget.FrameLayout13'), 3, FailureHandling.OPTIONAL)) {
    '2nd video playing\r\n'
    Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Google Videos/android.widget.FrameLayout13'), 3)
} else {
    '2nd video playing\r\n'
    Mobile.verifyElementVisible(findTestObject('Browser/Chrome/Open Google Videos/android.view.View0 (1)'), 3)
}

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Open Google Videos', '', TestLinkAPIResults.TEST_PASSED)

