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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

Mobile.comment('Run in parallel execution with Reject Call with SMS (SIM 2)')

Mobile.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Delete Messages'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    'Show Keypad button'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView5 - 4'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView1 - 2'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView5 - 4'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView5 - 4'), 0)

    Mobile.tap(findTestObject('Call/CS Fallback Incoming Call (SIM 2 - EE)/Place Call CS Fallback (SIM 2 EE) using IO 3D/android.widget.TextView0 - 1'), 
        0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView9 - 6'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView15 - 9'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView13 - 8'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView1 - 2'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView13 - 8'), 0)

    Mobile.verifyElementVisible(findTestObject('Call/CS Fallback Incoming Call (SIM 2 - EE)/Place Call CS Fallback (SIM 2 EE) using IO 3D/android.widget.EditText0 - (424) 416-9828'), 
        0)

    'Call button'
    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2 (1)'), 0)

    'Select SIM 1 to call from'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageView0'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageView0'), 0)

    Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementNotVisible(findTestObject('Call/Receive Call SIM 1 O2-UK TMO-US/Place Call to DUT 1(SIM 1 O2-UK MINT-US) using IO 3D/android.widget.TextView0 - Calling via T-Mobile'), 
        5)

    'Georgia changes to timer after connection'
    Mobile.verifyElementNotVisible(findTestObject('Call/Receive Call SIM 1 O2-UK TMO-US/Place Call to DUT 1(SIM 1 O2-UK MINT-US) using IO 3D/android.widget.TextView0 - Georgia'), 
        0)

    'End Call button'
    Mobile.tapAtPosition(360, 1210)

    'Dial pad button'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 5)

    Mobile.pressHome()

    Mobile.tapAtPosition(240, 1220)

    not_run: Mobile.verifyElementVisible(findTestObject('Phone App/Reject Call with SMS/android.widget.TextView3 - Messages'), 
        0)

    AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

    driver.findElementById('com.google.android.apps.messaging:id/searchbar').isDisplayed()

    Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Phone App/Reject Call with SMS/android.widget.FrameLayout3'), 60)

    Mobile.tap(findTestObject('Phone App/Reject Call with SMS/android.widget.FrameLayout3'), 0)

    Mobile.verifyElementVisible(findTestObject('Call/Rejact Call with SMS (SIM 2)/android.widget.TextView0 - (424) 416-9828'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Phone App/Reject Call with SMS/android.widget.TextView1 - Ill call you later.'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Call/Rejact Call with SMS (SIM 2)/android.widget.TextView0 -   via T-Mobile'), 
        0)
} else {
    'Dial pad button'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 0)

    '0 on keypad'
    Mobile.tapAtPosition(370, 1100)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView15 - 9'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView13 - 8'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView7 - 5'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView3 - 3'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView9 - 6'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView3 - 3'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView1 - 2'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView1 - 2'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView5 - 4'), 0)

    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call to DUT 1 (SIM 1 O2-UK)/android.widget.EditText0 - 07985 363224'), 
        0)

    'Call button'
    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2 (1)'), 0)

    'Select SIM 1 to call from'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageView0'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageView0'), 0)

    Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementNotVisible(findTestObject('Phone App/Place Call to DUT 1 (SIM 1 O2-UK)/android.widget.TextView0 - Calling via O2 - UK'), 
        5)

    'United Kingdom changes to timer after connection'
    Mobile.verifyElementNotVisible(findTestObject('Phone App/Place Call to DUT 1 (SIM 1 O2-UK)/android.widget.TextView2 - United Kingdom'), 
        0)

    'End Call button'
    Mobile.tapAtPosition(360, 1210)

    'Dial pad button'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 5)

    Mobile.pressHome()

    Mobile.tapAtPosition(240, 1220)

    'Messaging app Header'
    if (Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView0 - Messages'), 
        0, FailureHandling.OPTIONAL)) {
        'Messages header'
        Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView0 - Messages'), 
            3)
    } else {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Search'), 3)
    }
    
    Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.FrameLayout4'), 60)

    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.FrameLayout4'), 0)

    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 2 EE)/android.widget.TextView11 - 07985 363224'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Phone App/Reject Call with SMS/android.widget.TextView1 - Ill call you later.'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Phone App/Reject Call with SMS/android.widget.TextView3 -   via O2 - UK'), 
        0)
}

Mobile.closeApplication()

