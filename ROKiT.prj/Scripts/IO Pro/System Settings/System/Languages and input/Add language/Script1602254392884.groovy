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

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Languages'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Languages'), 
    0)

if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Espaol (Estados Unidos)'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.comment('If Espaol language is already added')

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Espaol (Estados Unidos)'), 
        0)
} else {
    Mobile.comment('Else if Espaol language isn\'t added')

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.Button0 - Add a language'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Languages and input/Add language/android.widget.Button0 - Add a language'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0'), 0)

    Mobile.setText(findTestObject('System Settings/System/Languages and input/Add language/android.widget.EditText0 - Type language name'), 
        'Spanish', 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Espaol'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Espaol'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView3 - Estados Unidos'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView3 - Estados Unidos'), 
        0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView4 - Espaol (Estados Unidos)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Language preferences'), 
        0)
}

not_run: Mobile.dragAndDrop(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Espaol (Estados Unidos)'), 
    findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - English (United States)'), 
    10)

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

'Drag and Drop with Coordinates'
not_run: new TouchAction(driver).press(point(1000, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(
    point(1000, 300)).release().perform()

Point dragHandleBottom = driver.findElementByXPath('//android.widget.ImageView[@instance = \'1\']').getCenter()

Point dragHandleTop = driver.findElementByXPath('//android.widget.ImageView[@instance = \'0\']').getCenter()

Point dragHandleTopOffset = dragHandleTop.moveBy(0, -22)

new TouchAction(driver).press(point(dragHandleBottom)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(
    point(dragHandleTopOffset)).release().perform()

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - English (United States)'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView2 - English (United Kingdom)'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView4 - Espaol (Estados Unidos)'), 
    0)

'Espanol header'
Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Preferencias de idioma'), 
    0)

'Espanol Add a language'
Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.Button0 - Agregar un idioma'), 
    0)

Mobile.comment('Switch back to English and delete Espanol')

'Drag and Drop with Coordinates'
not_run: new TouchAction(driver).press(point(1000, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(
    point(1000, 300)).release().perform()

new TouchAction(driver).press(point(dragHandleBottom)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(
    point(dragHandleTopOffset)).release().perform()

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.Button0 - Add a language'), 
    0)

'3 dots'
Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.ImageButton1'), 
    0)

'3 dots'
Mobile.tap(findTestObject('System Settings/System/Languages and input/Add language/android.widget.ImageButton1'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Remove'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Remove'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Add language/android.widget.CheckBox1 - Espaol (Estados Unidos)'), 
    0)

'Delete button'
Mobile.tap(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView1'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Remove selected language'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView1 - Text will be displayed in another language.'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Add language/android.widget.Button1 - OK'), 0)

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - English (United States)'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView2 - English (United Kingdom)'), 
        0)
}

Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView4 - Espaol (Estados Unidos)'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Add language', '', TestLinkAPIResults.TEST_PASSED)

