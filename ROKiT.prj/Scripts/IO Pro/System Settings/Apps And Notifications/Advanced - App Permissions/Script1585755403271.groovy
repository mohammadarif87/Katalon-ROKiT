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

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
    0)

Mobile.swipe(512, 900, 512, 200)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView20 - Advanced'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - Default Apps/android.widget.TextView20 - Advanced'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(512, 900, 512, 200)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.TextView14 - App permissions'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.TextView14 - App permissions'), 
    0)

'Header'
Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.TextView0 - App permissions'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.TextView7 - Camera'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.TextView7 - Camera'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.TextView2 - 3D Camera'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.Switch0 - ON'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.TextView3 - 3D Gallery'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.Switch1 - ON'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.TextView4 - 3DFV'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.Switch2 - ON'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.TextView5 - Camera'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.Switch3 - ON'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.TextView5 - Camera'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.TextView0 - If you deny this permission basic features of your device may no longer function as intended.'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.Button1 - DENY ANYWAY'), 
    0)

'Camera is now off'
Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.Switch3 - OFF'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.pressHome()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(512, 1000, 512, 300)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.TextView7 - Camera (1)'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.TextView7 - Camera (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.TextView0 - Allow Camera to take pictures and record video'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.Button1 - ALLOW'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.TextView5 - Camera'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.Switch3 - ON'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.TextView5 - Camera'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.TextView0 - If you deny this permission basic features of your device may no longer function as intended.'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Advanced - App Permissions/android.widget.Button0 - CANCEL'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Advanced - App permissions', '', TestLinkAPIResults.TEST_PASSED)

