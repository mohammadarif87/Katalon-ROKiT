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
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

Mobile.comment('Run in parallel execution with Receive a Call on IO 3D from SIM 2')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    'Show Keypad button'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    '0 on Dial pad'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 0)

    not_run: Mobile.tap(findTestObject('Call/Place Call CS Fallback (SIM 1 O2-UK) using IO 3D/android.widget.TextView0 - 3'), 
        0)

    not_run: Mobile.tapAtPosition(885, 1085)

    not_run: Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView0 - 1'), 0)

    not_run: Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 0)

    not_run: Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

    not_run: Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView15 - 9'), 0)

    not_run: Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView7 - 5'), 0)

    not_run: Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView1 - 2'), 0)

    not_run: Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView1 - 2'), 0)

    not_run: Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 0)

    not_run: Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView13 - 8'), 0)

    not_run: Mobile.verifyElementVisible(findTestObject('Call/Place Call SIM 2/android.widget.EditText0 - (310) 795-2208'), 
        0)

    AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

    driver.findElementById('com.android.dialer:id/digits').sendKeys('17473447370')

    'Call button'
    not_run: Mobile.tap(findTestObject('Call/Place Call SIM 2/android.widget.ImageButton0'), 0)

    Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

    'Call button'
    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2 (1)'), 0)

    Mobile.verifyElementVisible(findTestObject('Call/Place Call SIM 1 O2-UK TMO-US/Place Call (SIM 1 O2-UK TMO-US)/android.widget.TextView0 - Choose SIM for this call'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('Call/Place Call SIM 1 O2-UK TMO-US/Place Call (SIM 1 O2-UK TMO-US)/android.widget.TextView0 - T-Mobile'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Call/Place Call SIM 2/android.widget.TextView0 - ATT'), 0)

    Mobile.verifyElementVisible(findTestObject('Call/Place Call SIM 2/android.widget.TextView0 - 1 424-416-9828'), 0)

    Mobile.tap(findTestObject('Call/Place Call SIM 2/android.widget.TextView0 - ATT'), 0)

    not_run: Mobile.verifyElementVisible(findTestObject('Call/Place Call SIM 1 O2-UK TMO-US/Place Call (SIM 1 O2-UK TMO-US)/android.widget.TextView0 - 1 478-777-7307'), 
        0)

    'SIM1 T-Mobile'
    not_run: Mobile.tap(findTestObject('Call/Place Call SIM 1 O2-UK TMO-US/Place Call (SIM 1 O2-UK TMO-US)/android.widget.TextView0 - T-Mobile'), 
        0)

    'SIM 1 - T-Mobile to MINT on IO 3D'
    not_run: Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageView0'), 0)

    not_run: Mobile.verifyElementVisible(findTestObject('Call/Place Call SIM 1 O2-UK TMO-US/Place Call (SIM 1 O2-UK TMO-US)/android.widget.TextView0 - Calling via T-Mobile'), 
        15)

    Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

    'Mute'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.LinearLayout4'), 0)

    'Keypad'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.LinearLayout5'), 0)

    'Speaker'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.LinearLayout6'), 0)

    'Add call'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.LinearLayout7'), 0)

    'Hold'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.LinearLayout8'), 0)

    'End call button'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton0'), 3)

    'End call button'
    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton0'), 0)
} else {
    'Dial pad button'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    '0 on Dial pad'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 0)

    'Tap at Position because sometimes the call button was being pressed instead of 0'
    Mobile.tapAtPosition(545, 1645)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView7 - 5'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView0 - 1'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView7 - 5'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView9 - 6'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView5 - 4'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView0 - 1'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView5 - 4'), 0)

    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.EditText0 - 07515 064104'), 
        0)

    'Call button'
    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2 (1)'), 0)

    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView0 - Choose a SIM for this call'), 
        0)

    'SIM 2 EE'
    Mobile.tap(findTestObject('Phone App/Place Call (SIM 2 EE)/android.widget.LinearLayout5'), 0)

    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 2 EE)/android.widget.TextView0 - Calling via EE'), 
        0)

    Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementNotVisible(findTestObject('Phone App/Place Call (SIM 2 EE)/android.widget.TextView0 - Calling via EE'), 
        5)

    'Mute'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.LinearLayout4'), 0)

    'Keypad'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.LinearLayout5'), 0)

    'Speaker'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.LinearLayout6'), 0)

    'Add call'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.LinearLayout7'), 0)

    'Hold'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.LinearLayout8'), 0)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    'End call button'
    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton0'), 0)
}

Mobile.closeApplication()

