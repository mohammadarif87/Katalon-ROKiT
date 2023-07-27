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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

    'Show Keypad button'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

    '0 on Dial pad'
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

    Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

    'Call button'
    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2 (1)'), 0)

    'Select SIM 1 to call from'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageView0'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageView0'), 0)
} else {
    Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

    'Show Keypad button'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

    '0 on Dial pad'
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

    Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

    'Call button'
    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2 (1)'), 0)

    'Select SIM 1 to call from'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageView0'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageView0'), 0)
}

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

