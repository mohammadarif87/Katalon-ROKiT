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
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Set Lock Screen - PIN 1111'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()

driver.lockDevice()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

AndroidDriver<MobileElement> mobileDriver = MobileDriverFactory.getDriver()

mobileDriver.pressKey(new KeyEvent(AndroidKey.POWER))

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Date and Time on Lock Screen'
Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.RelativeLayout1'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    dateLocal = new Date()

    dateFormat = new SimpleDateFormat('EEE, MMM d')

    timeFormat = new SimpleDateFormat('hmm')

    presentDate = dateFormat.format(dateLocal)

    presentTime = timeFormat.format(dateLocal)

    println(presentDate)

    println(presentTime)

    Mobile.scrollToText(presentDate, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText(presentTime, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(500, 1800, 500, 400)
} else {
    dateLocal = new Date()

    dateFormat = new SimpleDateFormat('EEE d MMM')

    timeFormat = new SimpleDateFormat('HHmm')

    presentDate = dateFormat.format(dateLocal)

    presentTime = timeFormat.format(dateLocal)

    println(presentDate)

    println(presentTime)

    Mobile.scrollToText(presentDate, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText(presentTime, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(500, 1800, 500, 400)
}

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView1 - 1'), 
    0)

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
    0)

'Tick Button'
Mobile.tap(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.ImageButton1'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off PIN Lock Screen'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Date Lock Screen', '', TestLinkAPIResults.TEST_PASSED)

