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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('udid') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.TextView0 - Allow ROKiT Hub to access this devices location'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button0 - DENY'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 3)

    Mobile.tap(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.TextView0 - Allow ROKiT Hub to make and manage phone calls'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button0 - DENY'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 3)

    Mobile.tap(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 3)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.TextView0 - Allow ROKiT Hub to access this devices location'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button0 - DENY'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 0)

    Mobile.tap(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.TextView0 - Allow ROKiT Hub to make and manage phone calls'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button0 - DENY'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 0)

    Mobile.tap(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 0)
}

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

'Check ROKiT Hub logo on Home page'
driver.findElementById('com.missioncontrol.rokaccount:id/iv_login_logo').isDisplayed()

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App launch from App drawer/android.widget.TextView0 - Access your ROKiT services'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App launch from App drawer/android.widget.Button0 - Sign Up'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App launch from App drawer/android.widget.Button0 - Login'), 
    3)

'Check version display on the bottom of page'
driver.findElementById('com.missioncontrol.rokaccount:id/splashVersion').isDisplayed()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Verify UI on main page of ROKiT app', 
    '', TestLinkAPIResults.TEST_PASSED)

