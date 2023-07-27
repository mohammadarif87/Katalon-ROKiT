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

not_run: WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Messages'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.tap(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 0)

    Mobile.hideKeyboard()

    not_run: device_Height = Mobile.getDeviceHeight()

    not_run: device_Width = Mobile.getDeviceWidth()

    not_run: int startX = device_Width / 2

    not_run: int endX = startX

    not_run: int startY = device_Height * 0.95 // starts almost at the bottom of the screen

    not_run: int endY = device_Height * 0.1 // stops scrolling almost at the top of the screen

    'Swipe up on contact list'
    not_run: Mobile.swipe(startX, startY, endX, endY)

    Mobile.setText(findTestObject('Messages/ARMADILLO-154/android.widget.MultiAutoCompleteTextView0 - Type a name phone number or email address'), 
        '7473447370', 0)

    'Send to 07763310321'
    Mobile.verifyElementVisible(findTestObject('Messages/ARMADILLO-154/android.widget.FrameLayout3'), 0)

    'Send to 07763310321'
    Mobile.tap(findTestObject('Messages/ARMADILLO-154/android.widget.FrameLayout3'), 0)

    for (def SendSMS : (0..1000)) {
        Mobile.setText(findTestObject('Messages/ARMADILLO-154/android.widget.EditText0 - Text messagefrom O2 - UK'), 'Test', 
            0)

        for (def Tap : (0..100)) {
            Mobile.tapAtPosition(820, 1350)

            Mobile.tapAtPosition(250, 1350)
        }
        
        Mobile.tap(findTestObject('Messages/ARMADILLO-154/android.widget.TextView2 - SMS'), 0)

        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
    }
} else {
    Mobile.tap(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 0)

    Mobile.hideKeyboard()

    not_run: device_Height = Mobile.getDeviceHeight()

    not_run: device_Width = Mobile.getDeviceWidth()

    not_run: int startX = device_Width / 2

    not_run: int endX = startX

    not_run: int startY = device_Height * 0.95 // starts almost at the bottom of the screen

    not_run: int endY = device_Height * 0.1 // stops scrolling almost at the top of the screen

    'Swipe up on contact list'
    not_run: Mobile.swipe(startX, startY, endX, endY)

    Mobile.setText(findTestObject('Messages/ARMADILLO-154/android.widget.MultiAutoCompleteTextView0 - Type a name phone number or email address'), 
        '07763310321', 0)

    'Send to 07763310321'
    Mobile.verifyElementVisible(findTestObject('Messages/ARMADILLO-154/android.widget.FrameLayout3'), 0)

    'Send to 07763310321'
    Mobile.tap(findTestObject('Messages/ARMADILLO-154/android.widget.FrameLayout3'), 0)

    for (def SendSMS : (0..1000)) {
        Mobile.setText(findTestObject('Messages/ARMADILLO-154/android.widget.EditText0 - Text messagefrom O2 - UK'), 'Test', 
            0)

        for (def Tap : (0..100)) {
            Mobile.tapAtPosition(820, 1350)

            Mobile.tapAtPosition(250, 1350)
        }
        
        Mobile.tap(findTestObject('Messages/ARMADILLO-154/android.widget.TextView2 - SMS'), 0)

        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
    }
}

