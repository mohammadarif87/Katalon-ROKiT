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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()

AndroidDriver<MobileElement> mobileDriver = MobileDriverFactory.getDriver()

mobileDriver.longPressKey(new KeyEvent(AndroidKey.POWER))

not_run: Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.TextView0 - Take bug report'), 
    0)

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.TextView0 - Take bug report'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.comment('If Bug Report Shortcut is ON')

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.TextView0 - Take bug report'), 
        0)

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - System'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - System'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - Advanced'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - Advanced'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - Developer options'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Developer Options/Stay awake/android.widget.TextView0 - Developer options'), 
        0)

    Mobile.scrollToText('Bug report shortcut')

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.TextView0 - Bug report shortcut'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.TextView0 - Bug report shortcut'), 
        0)
} else {
    Mobile.comment('Else if Bug Report Shortcut is OFF')

    Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Developer Options/Bug report shortcut/android.widget.TextView0 - Take bug report'), 
        0)
}

Mobile.closeApplication()

