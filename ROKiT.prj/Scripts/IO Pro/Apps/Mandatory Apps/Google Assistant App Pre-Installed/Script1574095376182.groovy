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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.pressHome()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(200, 1100, 900, 1100)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

while (Mobile.verifyElementNotVisible(findTestObject('Apps/Google Assistant App Pre-Installed/android.widget.ImageButton2'), 
    0, FailureHandling.OPTIONAL)) {
    'Swipe left'
    Mobile.swipe(900, 1100, 200, 1100)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Swipe right'
    Mobile.swipe(200, 1100, 900, 1100)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Swipe down to refresh assistant page'
    Mobile.swipe(520, 300, 520, 1300)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)
}

'Microphone icon'
Mobile.verifyElementVisible(findTestObject('Apps/Google Assistant App Pre-Installed/android.widget.ImageButton2'), 3)

'Microphone icon'
Mobile.tap(findTestObject('Apps/Google Assistant App Pre-Installed/android.widget.ImageButton2'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Google Assistant App Pre-Installed/android.widget.TextView0 - Listening'), 
    5)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Apps/Google Assistant App Pre-Installed/android.widget.TextView0 - Say Hey Google or tap mic'), 
    5, FailureHandling.OPTIONAL) || Mobile.verifyElementVisible(findTestObject('Apps/Google Assistant App Pre-Installed/android.widget.TextView0 - Listen for music'), 
    5)) {
    Mobile.pressHome()
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Google Assistant App Pre-Installed', '', 
    TestLinkAPIResults.TEST_PASSED)

