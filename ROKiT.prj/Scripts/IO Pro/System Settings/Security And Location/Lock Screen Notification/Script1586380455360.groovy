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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Messages'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Set Lock Screen - PIN 1111'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.comment('Set to Show All Notifications on Lock Screen')

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
    0)

Mobile.scrollToText('Security & location')

Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/View Security status/android.widget.TextView0 - Security  location'), 
    0)

Mobile.tap(findTestObject('System Settings/Security And Location/View Security status/android.widget.TextView0 - Security  location'), 
    0)

'Header'
Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Notification/android.widget.TextView0 - Security  location'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Notification/android.widget.TextView12 - Lock screen preferences'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Notification/android.widget.TextView13 - Show all notification content'), 
    0)

Mobile.tap(findTestObject('Settings/Security And Location/Lock Screen Notification/android.widget.TextView12 - Lock screen preferences'), 
    0)

'Header'
Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Notification/android.widget.TextView0 - Lock screen preferences'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Notification/android.widget.TextView2 - On lock screen'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView2 - On lock screen'), 
    0)

'Pop up header'
Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView0 - On lock screen'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.CheckedTextView0 - Show all notification content'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/Lock Screen Notification/android.widget.CheckedTextView0 - Dont show notifications at all'), 
        0)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.CheckedTextView0 - Show all notification content'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView3 - Show all notification content'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView3 - Dont show notifications at all'), 
        0)

    WebUI.callTestCase(findTestCase('IO 3D/Messages/Send SMS to IO Pro SIM 1'), [('appPackage') : 'com.google.android.apps.messaging'
            , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
                , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.comment('View Notification of SMS')

    Mobile.pressHome()

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.openNotifications()

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView3 - Messages'), 
        0)

    'Notification MSG'
    not_run: Mobile.tap(findTestObject('Settings/Security And Location/Lock Screen Notification/android.widget.Button0'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView8 - Auto O2 Fav'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView8 - Auto O2 Fav'), 
            3)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/Lock Screen Notification/android.widget.TextView0 - mint'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/Lock Screen Notification/android.widget.TextView0 - mint'), 
            3)
    }
    
    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView9 - This is an automated test SMS'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.Button1 - MARK AS READ'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.Button2 - REPLY'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.CheckedTextView1 - Dont show notifications at all'), 
        0)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.CheckedTextView0 - Show all notification content'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView3 - Show all notification content'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView3 - Dont show notifications at all'), 
        0)

    WebUI.callTestCase(findTestCase('IO 3D/Messages/Send SMS to IO Pro SIM 1'), [('appPackage') : 'com.google.android.apps.messaging'
            , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
                , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.comment('View Notification of SMS')

    Mobile.pressHome()

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.openNotifications()

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView3 - Messages'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView8 - Auto O2 Fav'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView9 - This is an automated test SMS'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.Button1 - MARK AS READ'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.Button2 - REPLY'), 
        0)
}

Mobile.closeNotifications()

Mobile.comment('View notification of SMS on Lock Screen')

AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()

driver.lockDevice()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

AndroidDriver<MobileElement> mobileDriver = MobileDriverFactory.getDriver()

mobileDriver.pressKey(new KeyEvent(AndroidKey.POWER))

//driver.unlockDevice()
not_run: Mobile.unlockScreen()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView0 - Messages'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView5 - Auto O2 Fav'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView6 - This is an automated test SMS'), 
    0)

'Date and Time on Lock Screen'
Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.RelativeLayout1'), 
    0)

Mobile.swipe(512, 1800, 512, 800)

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

Mobile.swipe(512, 1800, 512, 800)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(512, 1800, 512, 800)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView19 - Settings'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView19 - Settings'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Security & location')

Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/View Security status/android.widget.TextView0 - Security  location'), 
    0)

Mobile.tap(findTestObject('System Settings/Security And Location/View Security status/android.widget.TextView0 - Security  location'), 
    0)

'Header'
Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Notification/android.widget.TextView0 - Security  location'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Notification/android.widget.TextView12 - Lock screen preferences'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Notification/android.widget.TextView13 - Show all notification content'), 
    0)

Mobile.tap(findTestObject('Settings/Security And Location/Lock Screen Notification/android.widget.TextView12 - Lock screen preferences'), 
    0)

'Header'
Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Notification/android.widget.TextView0 - Lock screen preferences'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Notification/android.widget.TextView2 - On lock screen'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView2 - On lock screen'), 
    0)

'Pop up header'
Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView0 - On lock screen'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.CheckedTextView0 - Show all notification content'), 
    0)

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/Lock Screen Notification/android.widget.CheckedTextView0 - Dont show notifications at all'), 
        0)

    Mobile.tap(findTestObject('System Settings/Security And Location/Lock Screen Notification/android.widget.CheckedTextView0 - Dont show notifications at all'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/Lock Screen Notification/android.widget.TextView0 - Dont show notifications at all'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView3 - Dont show notifications at all'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Lock Screen Notification/android.widget.TextView0 - Dont show notifications at all'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.CheckedTextView0 - Show all notification content'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.CheckedTextView1 - Dont show notifications at all'), 
        0)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.CheckedTextView1 - Dont show notifications at all'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView3 - Dont show notifications at all'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView3 - Show all notification content'), 
        0)
}

Mobile.pressHome()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.openNotifications()

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView3 - Messages'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView8 - Auto O2 Fav'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView9 - This is an automated test SMS'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.Button1 - MARK AS READ'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.Button2 - REPLY'), 
    0)

Mobile.closeNotifications()

driver.lockDevice()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

mobileDriver.pressKey(new KeyEvent(AndroidKey.POWER))

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView0 - Messages'), 
    0)

not_run: if (userName == 'Aiden') {
    Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView9 - This is an automated test SMS'), 
        0)
} else {
}

Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView5 - Auto O2 Fav'), 
    0)

Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView6 - This is an automated test SMS'), 
    0)

'Date and Time on Lock Screen'
Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.RelativeLayout1'), 
    0)

Mobile.swipe(512, 1800, 512, 800)

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

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Lock Screen notification', '', TestLinkAPIResults.TEST_PASSED)

