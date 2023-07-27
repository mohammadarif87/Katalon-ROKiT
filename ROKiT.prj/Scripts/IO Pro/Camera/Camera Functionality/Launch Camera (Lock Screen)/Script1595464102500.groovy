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
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete All Albums From Gallery'), [('appPackage') : 'com.freeme.gallery'
        , ('appActivity') : 'com.cooliris.media.Gallery', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Set Lock Screen - PIN 1111'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.comment('View Lock Screen Message')

AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()

driver.lockDevice()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

AndroidDriver<MobileElement> mobileDriver = MobileDriverFactory.getDriver()

mobileDriver.pressKey(new KeyEvent(AndroidKey.POWER))

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(900, 1950, 500, 1600)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Shutter Button'
Mobile.tapAndHoldAtPosition(535, 1875, 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Switch Camera button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageButton1'), 3)

'Video Mode button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView4'), 0)

'Video Mode button'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView4'), 0)

'Shutter button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

'Shutter button - start recording'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

Mobile.delay(6, FailureHandling.STOP_ON_FAILURE)

'Shutter button - stop recording'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

'Gallery button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView1'), 0)

'Gallery button'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView1'), 0)

'Date and Time on Lock Screen'
Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.RelativeLayout1'), 
    0)

while (Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView1 - 1'), 
    3, FailureHandling.OPTIONAL)) {
    Mobile.swipe(512, 1800, 512, 800)
}

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView1 - 1'), 
    3)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView1 - 1'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView1 - 1'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView1 - 1'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView1 - 1'), 
    0)

'Tick Button'
Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.ImageButton1'), 
    3)

'Tick Button'
Mobile.tap(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.ImageButton1'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Gallery button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView1'), 0)

'Gallery button'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView1'), 0)

Mobile.swipe(995, 1000, 550, 1000)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(995, 1000, 550, 1000)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(995, 1000, 550, 1000)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off PIN Lock Screen'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Launch Camera (Lock Screen)', 
    '', TestLinkAPIResults.TEST_PASSED)

