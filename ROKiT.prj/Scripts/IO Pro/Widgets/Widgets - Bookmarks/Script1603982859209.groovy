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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Widgets/Widgets - Bookmarks/android.widget.TextView6 - Chrome bookmarks'), 0)

Mobile.verifyElementVisible(findTestObject('Widgets/Widgets - Bookmarks/android.widget.TextView7 - 3  2'), 0)

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

Point chromeBookmark = driver.findElementByXPath('//android.widget.TextView[@text = \'Chrome bookmarks\']').getCenter()

new TouchAction(driver).press(point(chromeBookmark)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).moveTo(point(
        400, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).release().perform()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Widgets/Widgets - Bookmarks/android.widget.TextView0 - Mobile bookmarks'), 0)

Mobile.verifyElementVisible(findTestObject('Widgets/Widgets - Bookmarks/android.widget.TextView1 - Suggested Bookmarks'), 
    0)

'Bookmark Widget'
Mobile.verifyElementVisible(findTestObject('Widgets/Widgets - Bookmarks/android.widget.ListView0'), 0)

bookmarkHeight = Mobile.getElementHeight(findTestObject('Widgets/Widgets - Bookmarks/android.widget.ListView0'), 0)

//println(bookmarkHeight)
Mobile.tapAndHold(findTestObject('Widgets/Widgets - Bookmarks/android.widget.TextView1 - Suggested Bookmarks'), 2, 0)

'Bottom drag handle'
Mobile.verifyElementVisible(findTestObject('Widgets/Widgets - Bookmarks/android.widget.ImageView3'), 0)

Point bottomDragHandle = driver.findElementByXPath('//android.widget.ImageView[@instance = \'3\']').getCenter()

new TouchAction(driver).press(point(bottomDragHandle)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).moveTo(
    point(425, 800)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).release().perform()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Tap on widget to remove handles'
Mobile.tapAtPosition(400, 700)

bookmarkHeightAdjusted = Mobile.getElementHeight(findTestObject('Widgets/Widgets - Bookmarks/android.widget.ListView0'), 
    0)

//println(bookmarkHeightAdjusted)
'If adjusted height is more than original height then test case will fail'
if (bookmarkHeightAdjusted < bookmarkHeight) {
    println('Height decreased successfully')
} else {
    Mobile.closeApplication()
}

Mobile.verifyElementVisible(findTestObject('Widgets/Widgets - Bookmarks/android.widget.TextView1 - Suggested Bookmarks'), 
    0)

Mobile.tap(findTestObject('Widgets/Widgets - Bookmarks/android.widget.TextView1 - ROKiT Home'), 0)

if (Mobile.verifyElementVisible(findTestObject('Widgets/Widgets - Bookmarks/android.widget.TextView0 - Browse faster. Use less data.'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Widgets/Widgets - Bookmarks/android.widget.TextView0 - Browse faster. Use less data.'), 
        0)

    Mobile.tap(findTestObject('Widgets/Widgets - Bookmarks/android.widget.Button0 - No thanks'), 0)
}

Mobile.verifyElementVisible(findTestObject('Widgets/Widgets - Bookmarks/android.widget.EditText0 - rokit.com'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.pressHome()

'Bookmark Widget'
Mobile.verifyElementVisible(findTestObject('Widgets/Widgets - Bookmarks/android.widget.ListView0'), 0)

Mobile.comment('Remove Widget from Home Screen')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Point bookmarkWidget = driver.findElementByXPath('//android.widget.ListView[@instance = \'0\']').getCenter()

new TouchAction(driver).press(point(bookmarkWidget)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).moveTo(point(
        550, 150)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).release().perform()

'Internet Search'
Mobile.verifyElementNotVisible(findTestObject('Widgets/Widgets - Bookmarks/android.widget.ListView0'), 0)

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Widgets - Bookmarks', '', TestLinkAPIResults.TEST_PASSED)

