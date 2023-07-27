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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Language - Espanol Estados Unidos'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('udid') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.scrollToText('Sistema')

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView15 - Sistema'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView15 - Sistema'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView2 - Idiomas y entradas'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView2 - Idiomas y entradas'), 
    0)

'Header'
Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView0 - Idiomas y entradas'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView2 - Idiomas'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView2 - Idiomas'), 
    0)

'Header'
Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView0 - Preferencias de idioma'), 
    0)

'Add a language'
Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.Button0 - Agregar un idioma'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView2 - Espaol (Estados Unidos)'), 
    0)

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

'3 dots'
Mobile.tap(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.ImageButton1'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView0 - Quitar'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView0 - Quitar'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.CheckBox0 - Espaol (Estados Unidos)'), 
    0)

'Delete'
Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView1'), 
    0)

'Delete'
Mobile.tap(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView1'), 0)

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView0 - Quitar el idioma seleccionado (1)'), 
        4)

    not_run: Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView0 - El texto se mostrar en otro idioma.'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView0 - Quitar el idioma seleccionado'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView1 - El texto se mostrar en otro idioma.'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.Button1 - ACEPTAR'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.Button1 - ACEPTAR'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView0 - Language preferences'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.Button0 - Add a language'), 
    0)

'Header'
Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView0 - Preferencias de idioma'), 
    0)

'Add a language'
Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.Button0 - Agregar un idioma'), 
    0)

Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Languages and input/Remove Language/android.widget.TextView2 - Espaol (Estados Unidos)'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Remove language', '', TestLinkAPIResults.TEST_PASSED)

