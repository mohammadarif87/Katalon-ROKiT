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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('udid') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

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

Mobile.scrollToText('Internet')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Widgets/Verify Internet Widget/android.widget.TextView4 - Internet search'), 
    0)

Mobile.verifyElementVisible(findTestObject('Widgets/Verify Internet Widget/android.widget.TextView5 - 4  1'), 0)

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

Point internetSearchWidget = driver.findElementByXPath('//android.widget.TextView[@text = \'Internet search\']').getCenter()

new TouchAction(driver).press(point(internetSearchWidget)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).moveTo(
    point(500, 500)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).release().perform()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Internet Search'
Mobile.verifyElementVisible(findTestObject('Widgets/Verify Internet Widget/android.widget.TextView0'), 0)

'Internet Search'
Mobile.tap(findTestObject('Widgets/Verify Internet Widget/android.widget.TextView0'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Widgets/Verify Internet Widget/android.widget.EditText0 - Search'), 'rokit phones', 0)

'Tick on Keyboard'
Mobile.tapAtPosition(1000, 1950)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'3 dots'
Mobile.verifyElementVisible(findTestObject('Widgets/Verify Internet Widget/android.widget.ImageButton4'), 0)

'3 dots'
Mobile.tap(findTestObject('Widgets/Verify Internet Widget/android.widget.ImageButton4'), 0)

Mobile.verifyElementVisible(findTestObject('Widgets/Verify Internet Widget/android.widget.TextView9 - Settings'), 0)

Mobile.tap(findTestObject('Widgets/Verify Internet Widget/android.widget.TextView9 - Settings'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(512, 1700, 512, 300)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Widgets/Verify Internet Widget/android.widget.TextView0 - About'), 0)

    Mobile.verifyElementVisible(findTestObject('Widgets/Verify Internet Widget/android.widget.TextView0 - Rate this App'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Widgets/Verify Internet Widget/android.widget.TextView10 - About Karma'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Widgets/Verify Internet Widget/android.widget.TextView11 - Rate Karma Browser'), 
        0)
}

Mobile.pressHome()

Mobile.comment('Remove Widget from Home Screen')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Point internetSearchWidgetOnHomeScreen = driver.findElementByXPath('//android.widget.TextView[@resource-id = \'com.libertyvaults.rokit:id/title\']').getCenter()

new TouchAction(driver).press(point(internetSearchWidgetOnHomeScreen)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(
            5))).moveTo(point(550, 150)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).release().perform()

'Internet Search'
Mobile.verifyElementNotVisible(findTestObject('Widgets/Verify Internet Widget/android.widget.TextView0'), 0)

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Verify Internet Widgets', '', TestLinkAPIResults.TEST_PASSED)

