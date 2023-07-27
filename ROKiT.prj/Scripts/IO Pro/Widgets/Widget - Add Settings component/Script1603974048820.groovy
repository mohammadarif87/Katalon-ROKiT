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
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.touch.WaitOptions as WaitOptions
import java.time.Duration as Duration
import java.util.concurrent.TimeUnit as TimeUnit
import org.openqa.selenium.Point as Point
import static io.appium.java_client.touch.offset.PointOption.point

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.pressHome()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(550, 900, 2)

Mobile.verifyElementVisible(findTestObject('Widgets/Verify Internet Widget/android.widget.TextView1 - Widgets'), 0)

Mobile.tap(findTestObject('Widgets/Verify Internet Widget/android.widget.TextView1 - Widgets'), 0)

Mobile.swipe(512, 1700, 512, 200)

Mobile.swipe(512, 1700, 512, 200)

Mobile.swipe(512, 1700, 512, 200)

Mobile.swipe(512, 1700, 512, 200)

Mobile.scrollToText('Settings shortcut')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Widgets/Widget - Add Settings component/android.widget.TextView12 - Settings shortcut'), 
    0)

Mobile.verifyElementVisible(findTestObject('Widgets/Widget - Add Settings component/android.widget.TextView13 - 1  1'), 
    0)

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

Point settingsShortcut = driver.findElementByXPath('//android.widget.TextView[@text = \'Settings shortcut\']').getCenter()

new TouchAction(driver).press(point(settingsShortcut)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).moveTo(
    point(500, 500)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).release().perform()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Settings Shortcut header'
Mobile.verifyElementVisible(findTestObject('Widgets/Widget - Add Settings component/android.widget.TextView0 - Settings shortcut'), 
    0)

Mobile.verifyElementVisible(findTestObject('Widgets/Widget - Add Settings component/android.widget.TextView3 - Battery'), 
    0)

Mobile.tap(findTestObject('Widgets/Widget - Add Settings component/android.widget.TextView3 - Battery'), 0)

'Battery on Homescreen'
Mobile.verifyElementVisible(findTestObject('Widgets/Widget - Add Settings component/android.widget.TextView0 - Battery'), 
    0)

'Battery on Homescreen'
Mobile.tap(findTestObject('Widgets/Widget - Add Settings component/android.widget.TextView0 - Battery'), 0)

'Settings Battery header'
Mobile.verifyElementVisible(findTestObject('Widgets/Widget - Add Settings component/android.widget.TextView0 - Battery (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('Widgets/Widget - Add Settings component/android.widget.TextView8 - Battery Saver'), 
    0)

Mobile.verifyElementVisible(findTestObject('Widgets/Widget - Add Settings component/android.widget.TextView10 - Adaptive Battery'), 
    0)

Mobile.verifyElementVisible(findTestObject('Widgets/Widget - Add Settings component/android.widget.TextView12 - Battery percentage'), 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.pressHome()

Mobile.verifyElementVisible(findTestObject('Widgets/Widget - Add Settings component/android.widget.TextView3 - Battery'), 
    0)

Mobile.comment('Remove Widget from Home Screen')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Point batteryWidgetOnHomeScreen = driver.findElementByXPath('//android.widget.TextView[@text = \'Battery\']').getCenter()

new TouchAction(driver).press(point(batteryWidgetOnHomeScreen)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).moveTo(
    point(550, 150)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).release().perform()

'Internet Search'
Mobile.verifyElementNotVisible(findTestObject('Widgets/Widget - Add Settings component/android.widget.TextView3 - Battery'), 
    0)

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Widget - Add Settings component', '', 
    TestLinkAPIResults.TEST_PASSED)

