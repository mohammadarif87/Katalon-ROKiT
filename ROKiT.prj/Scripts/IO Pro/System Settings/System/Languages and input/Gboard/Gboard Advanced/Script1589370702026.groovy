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

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Advanced/android.widget.TextView0 - Advanced'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Advanced/android.widget.TextView0 - Advanced (1)'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Advanced/android.widget.TextView0 - Advanced (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Advanced/android.widget.TextView0 - Show app icon'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Advanced/android.widget.TextView0 - Display application icon in the launcher'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

    'Gboard OFF by default'
    driver.findElementByXPath('//android.widget.Switch[@instance = \'2\'][contains(@text, \'OFF\')]').isDisplayed()

    driver.findElementByXPath('//android.widget.Switch[@instance = \'2\'][contains(@text, \'OFF\')]').click()
} else {
    'Toggle on/off'
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Advanced/android.widget.Switch0 - OFF'), 
        0)

    'Toggle on/off'
    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Advanced/android.widget.Switch0 - OFF'), 
        0)
}

Mobile.pressHome()

Mobile.delay(5)

Mobile.swipe(550, 1900, 550, 300)

Mobile.delay(3)

Mobile.swipe(550, 1900, 550, 1200)

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Advanced/android.widget.TextView0 - Gboard'), 
    3)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Advanced/android.widget.TextView0 - Gboard'), 
    0)

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Advanced/android.widget.TextView0 - Advanced (2)'), 
    3)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Advanced/android.widget.TextView0 - Advanced (2)'), 
    0)

if (userName == 'Aiden') {
    AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

    'Gboard ON'
    driver.findElementByXPath('//android.widget.Switch[@instance = \'2\'][contains(@text, \'ON\')]').isDisplayed()

    driver.findElementByXPath('//android.widget.Switch[@instance = \'2\'][contains(@text, \'ON\')]').click()

    'Check Gboard OFF'
    driver.findElementByXPath('//android.widget.Switch[@instance = \'2\'][contains(@text, \'OFF\')]').isDisplayed()

    not_run: Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Advanced/android.widget.TextView0 - Show app icon (1)'), 
        3)

    not_run: Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Advanced/android.widget.TextView0 - Show app icon (1)'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Advanced/android.widget.TextView0 - Show app icon (1)'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Languages and input/Gboard/Gboard Advanced/android.widget.TextView0 - Show app icon (1)'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Gboard > Advanced', '', TestLinkAPIResults.TEST_PASSED)

