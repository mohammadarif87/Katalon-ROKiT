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
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import static io.appium.java_client.touch.offset.PointOption.point
import io.appium.java_client.MobileBy as MobileBy
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.touch.WaitOptions as WaitOptions
import java.time.Duration as Duration
import java.util.concurrent.TimeUnit as TimeUnit

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

if (Mobile.verifyElementVisible(findTestObject('Preconditions/Add Language - Espanol Estados Unidos/android.widget.TextView0 - Network  internet'), 
    0, FailureHandling.OPTIONAL)) {
    not_run: Mobile.verifyElementVisible(findTestObject('Preconditions/Add Language - Espanol Estados Unidos/android.widget.TextView0 - Network  internet'), 
        5)

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

    not_run: Mobile.dragAndDrop(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Espaol (Estados Unidos)'), 
        findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - English (United States)'), 
        10)

    //driver = new AndroidDriver<MobileElement>()
    AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

    new TouchAction(driver).press(point(1000, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(point(
            1000, 300)).release().perform()

    userName = System.getProperty('user.name')

    if (userName == 'Aiden') {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - English (United States)'), 
            3)
    } else {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView2 - English (United Kingdom)'), 
            0)

        not_run: Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView4 - English (United Kingdom)'), 
            0)
    }
    
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView4 - Espaol (Estados Unidos)'), 
        0)

    'Espanol title'
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - Preferencias de idioma'), 
        0)

    'Espanol Add a language'
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.Button0 - Agregar un idioma'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Preconditions/Add Language - Espanol Estados Unidos/android.widget.TextView0 - Internet y red'), 
        5)
}

Mobile.closeApplication()

