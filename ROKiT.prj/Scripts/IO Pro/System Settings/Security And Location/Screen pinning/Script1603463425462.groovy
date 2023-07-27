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
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import io.appium.java_client.MultiTouchAction as MultiTouchAction
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.touch.WaitOptions as WaitOptions
import static io.appium.java_client.touch.offset.PointOption.point
import java.time.Duration as Duration

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.scrollToText('Security & location')

Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/View Security status/android.widget.TextView0 - Security  location'), 
    0)

Mobile.tap(findTestObject('System Settings/Security And Location/View Security status/android.widget.TextView0 - Security  location'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/View Screen lock/android.widget.TextView0 - Screen lock'), 
    0)

Mobile.scrollToText('Advanced')

Mobile.tap(findTestObject('Settings/Security And Location/Screen pinning/android.widget.TextView15 - Advanced'), 0)

Mobile.scrollToText('Screen pinning')

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Screen pinning/android.widget.TextView15 - Screen pinning'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Screen pinning/android.widget.TextView16 - Off'), 
    0)

Mobile.tap(findTestObject('Settings/Security And Location/Screen pinning/android.widget.TextView15 - Screen pinning'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Screen pinning/android.widget.TextView0 - Screen pinning'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Screen pinning/android.widget.TextView2 - Off'), 
    0)

Mobile.tap(findTestObject('Settings/Security And Location/Screen pinning/android.widget.TextView2 - Off'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Screen pinning/android.widget.TextView2 - On'), 
    0)

AndroidDriver<MobileElement> androidDriver = MobileDriverFactory.getDriver()

androidDriver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

'Settings icon in Recent View'
Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Screen pinning/android.view.View4'), 0)

'Settings icon in Recent View'
Mobile.tap(findTestObject('Settings/Security And Location/Screen pinning/android.view.View4'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Screen pinning/android.widget.TextView0 - Settings'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Screen pinning/android.widget.TextView1 - App info'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Screen pinning/android.widget.TextView2 - Split screen'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Screen pinning/android.widget.TextView3 - Pin'), 
    0)

Mobile.tap(findTestObject('Settings/Security And Location/Screen pinning/android.widget.TextView3 - Pin'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Got It button on the warning'
Mobile.tapAtPosition(840, 1860)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.pressHome()

'Extras folder from Home Screen is not displayed'
Mobile.verifyElementNotVisible(findTestObject('Apps/Extras Bookmarks/android.widget.TextView1 - Extras'), 3)

'Google folder from Home screen is not displayed'
Mobile.verifyElementNotVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Google'), 
    3)

AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()

//
//backButton = driver.longPressKey(new KeyEvent(AndroidKey.BACK))
//
//overviewButton = driver.longPressKey(new KeyEvent(AndroidKey.APP_SWITCH))
//
//MultiTouchAction multiTouch = new MultiTouchAction(driver)
//
//TouchAction action1 = new TouchAction(driver)
//
//TouchAction action2 = new TouchAction(driver)
//
//action1.press(backButton).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).release()
//
//action2.press(overviewButton).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).release()
//
//multiTouch.add(action1).add(action2).perform()
//
//multiTouch.add(action1, action2).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).release().perform()
TouchAction actionOne = new TouchAction(driver)

actionOne.press(point(290, 2100))

actionOne.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))

actionOne.release()

TouchAction actionTwo = new TouchAction(driver)

actionTwo.press(point(820, 2100))

actionTwo.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))

actionTwo.release()

MultiTouchAction action = new MultiTouchAction(driver)

action.add(actionOne)

action.add(actionTwo)

action.perform()

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Screen pinning/android.widget.TextView2 - On'), 
    0)

Mobile.tap(findTestObject('Settings/Security And Location/Screen pinning/android.widget.TextView2 - On'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Security And Location/Screen pinning/android.widget.TextView2 - Off'), 
    0)

Mobile.pressHome()

'Extras folder from Home Screen is displayed'
Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.TextView1 - Extras'), 3)

'Google folder from Home screen is displayed'
Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Google'), 
    3)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Screen pinning', '', TestLinkAPIResults.TEST_PASSED)

