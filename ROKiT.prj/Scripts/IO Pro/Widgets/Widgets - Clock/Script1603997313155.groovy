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
import java.text.SimpleDateFormat as SimpleDateFormat

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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Widgets/Widgets - Clock/android.widget.TextView13 - Digital clock'), 0)

Mobile.verifyElementVisible(findTestObject('Widgets/Widgets - Clock/android.widget.TextView14 - 3  2'), 0)

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

Point digitalClock = driver.findElementByXPath('//android.widget.TextView[@text = \'Digital clock\']').getCenter()

new TouchAction(driver).press(point(digitalClock)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).moveTo(point(
        400, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).release().perform()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Clock Widget on Homescreen'
Mobile.verifyElementVisible(findTestObject('Widgets/Widgets - Clock/android.widget.LinearLayout3'), 0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    dateLocal = new Date()

    timeFormat = new SimpleDateFormat('h:m')

    dateFormat = new SimpleDateFormat('EEE, MMM d')

    presentDate = dateFormat.format(dateLocal)

    presentTime = timeFormat.format(dateLocal)

    println(presentDate)

    println(presentTime)

    'Current Date appears on Widget'
    Mobile.scrollToText(presentDate, FailureHandling.STOP_ON_FAILURE)

    'Current Time appears on Widget'
    Mobile.scrollToText(presentTime, FailureHandling.STOP_ON_FAILURE)
} else {
    dateLocal = new Date()

    timeFormat = new SimpleDateFormat('HH:mm')

    dateFormat = new SimpleDateFormat('EEE d MMM')

    presentDate = dateFormat.format(dateLocal)

    presentTime = timeFormat.format(dateLocal)

    'Current Date appears on Widget'
    Mobile.scrollToText(presentDate, FailureHandling.STOP_ON_FAILURE)

    'Current Time appears on Widget'
    Mobile.scrollToText(presentTime, FailureHandling.STOP_ON_FAILURE)
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.pressHome()

'Clock Widget'
Mobile.verifyElementVisible(findTestObject('Widgets/Widgets - Clock/android.widget.LinearLayout3'), 0)

Mobile.comment('Remove Widget from Home Screen')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Point clockWidget = driver.findElementByXPath('//android.widget.LinearLayout[@resource-id = \'com.android.deskclock:id/digital_widget\']').getCenter()

new TouchAction(driver).press(point(clockWidget)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).moveTo(point(
        550, 150)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).release().perform()

'Internet Search'
Mobile.verifyElementNotVisible(findTestObject('Widgets/Widgets - Clock/android.widget.LinearLayout3'), 0)

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Widgets - Clock', '', TestLinkAPIResults.TEST_PASSED)

