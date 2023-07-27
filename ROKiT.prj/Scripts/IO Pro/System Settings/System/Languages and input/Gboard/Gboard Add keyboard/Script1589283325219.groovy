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
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Messages'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - System'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - System'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Languages input'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Languages input'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Gboard Google voice typing'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Virtual keyboard'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Virtual keyboard'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Virtual keyboard (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Multilingual typing'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Gboard'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Gboard'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Settings'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - English (US) (QWERTY)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Languages'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Languages'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Languages (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Your keyboard languages and layouts'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - English (US)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - QWERTY'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.Button0 - ADD KEYBOARD'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.Button0 - ADD KEYBOARD'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Add keyboard'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Suggested languages'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - English (US) (1)'), 
        0)

    Mobile.scrollToText('Bulgarian')

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Bulgarian'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Bulgarian'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Bulgarian (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.Button0 - Cancel'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.Button0 - Done'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.Button0 - Done'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Your keyboard languages and layouts'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Bulgarian (3)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Bulgarian (4)'), 
        0)
} else {
    if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView2 - English (UK) (QWERTY) Bulgarian (Bulgarian)'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView2 - English (UK) (QWERTY) Bulgarian (Bulgarian)'), 
            0)
    } else {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - English (UK) (QWERTY)'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Languages'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Languages'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Languages (1)'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Your keyboard languages and layouts'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - English (UK)'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - QWERTY'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.Button0 - ADD KEYBOARD'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.Button0 - ADD KEYBOARD'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Add keyboard'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Suggested languages'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - English (UK) (1)'), 
            0)

        Mobile.scrollToText('Bulgarian')

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Bulgarian'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Bulgarian'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Bulgarian (1)'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.Button0 - Cancel'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.Button0 - Done'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.Button0 - Done'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Your keyboard languages and layouts'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Bulgarian (3)'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Bulgarian (4)'), 
            0)
    }
}

Mobile.pressHome()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Messages Icon on Home Screen'
Mobile.tapAtPosition(350, 1840)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - New Spam protection'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.Button2 - OK'), 0)
}

if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Messages just got better'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - Use Messages without chat features'), 
        0)
}

if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Use Messages without chat features (1)'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Use Messages without chat features (1)'), 
        0)
}

if (Mobile.verifyElementNotVisible(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 0, 
    FailureHandling.OPTIONAL)) {
    AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

    driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
}

'Start chat button'
Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 0)

'Start chat button'
Mobile.tap(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Auto O2 Fav Contact'
Mobile.tapAndHoldAtPosition(580, 1930, 1)

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Change keyboard (1)'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Change Keyboard'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Bulgarian (5)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Bulgarian (6)'), 
    0)

Mobile.pressHome()

Mobile.delay(2)

Mobile.swipe(550, 1900, 550, 300)

Mobile.delay(1)

Mobile.swipe(550, 1900, 550, 300)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Settings (1)'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Settings (1)'), 
    0)

Mobile.delay(2)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - System'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - System'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Languages input'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Languages input'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Gboard Google voice typing'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Virtual keyboard'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Virtual keyboard'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Virtual keyboard (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Multilingual typing'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Gboard'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Gboard'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Settings'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Languages'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Languages'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Languages (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Your keyboard languages and layouts'), 
    0)

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - English (US)'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - English (UK)'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - QWERTY'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Bulgarian (8)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Bulgarian (9)'), 
    0)

'Edit button'
Mobile.tapAtPosition(1015, 170)

'Select checkbox to delete language'
Mobile.tapAtPosition(90, 800)

'Delete button'
Mobile.tapAtPosition(1015, 170)

Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Bulgarian (8)'), 
    0)

Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Add keyboard/android.widget.TextView0 - Bulgarian (9)'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Gboard > Add keyboard', '', TestLinkAPIResults.TEST_PASSED)

