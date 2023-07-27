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

'IO PRO'
Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Messages'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.openNotifications()

    Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

    'Waiting for Answer Call button'
    Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.Button2 - ANSWER'), 75)

    Mobile.verifyElementVisible(findTestObject('Call/Reject with SMS (SIM 1)/android.widget.TextView0 - Incoming call via T-Mobile'), 
        60)

    Mobile.tap(findTestObject('Call/Reject with SMS (SIM 1)/android.widget.TextView0 - Incoming call via T-Mobile'), 0)

    'Answer Call button'
    Mobile.verifyElementVisible(findTestObject('Phone App/Reject Call with SMS/android.widget.FrameLayout7'), 0)

    'Swipe on the SMS icon'
    device_Height = Mobile.getDeviceHeight()

    device_Width = Mobile.getDeviceWidth()

    int startX = device_Width / 12

    int endX = startX

    int startY = device_Height * 0.95 // starts almost at the bottom of the screen

    int endY = device_Height * 0.1 // stops scrolling almost at the top of the screen

    Mobile.swipe(startX, startY, endX, endY)

    //Mobile.swipe(85, 2100, 0, -2100)
    '\'I\'ll call you later\' message'
    Mobile.verifyElementVisible(findTestObject('Phone App/Reject Call with SMS/android.widget.LinearLayout1'), 5)

    Mobile.tap(findTestObject('Phone App/Reject Call with SMS/android.widget.LinearLayout1'), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.pressHome()

    Mobile.comment('View the SMS in Messages and then Delete the thread')

    Mobile.tapAtPosition(360, 1845)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - New Spam protection'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.Button2 - OK'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Messages just got better'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - Use Messages without chat features'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Use Messages without chat features (1)'), 
            0)

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Use Messages without chat features (1)'), 
            0)
    }
    
    Mobile.verifyElementVisible(findTestObject('Phone App/Reject Call with SMS/android.widget.TextView1 - You Ill call you later.'), 
        0)

    Mobile.tap(findTestObject('Phone App/Reject Call with SMS/android.widget.TextView1 - You Ill call you later.'), 0)

    Mobile.verifyElementVisible(findTestObject('Call/Reject with SMS (SIM 1)/android.widget.TextView0 -   via T-Mobile'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Reject Call with SMS/android.widget.TextView1 - Ill call you later.'), 
        0) // starts almost at the bottom of the screen
    // stops scrolling almost at the top of the screen
    //Mobile.swipe(85, 2100, 0, -2100)
} else {
    Mobile.openNotifications()

    Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

    'Waiting for Answer Call button'
    Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.Button2 - ANSWER'), 75)

    Mobile.verifyElementVisible(findTestObject('Phone App/Reject Call with SMS/android.widget.TextView5 - Incoming call via O2 - UK'), 
        60)

    Mobile.tap(findTestObject('Phone App/Reject Call with SMS/android.widget.TextView5 - Incoming call via O2 - UK'), 0)

    'Answer Call button'
    Mobile.verifyElementVisible(findTestObject('Phone App/Reject Call with SMS/android.widget.FrameLayout7'), 0)

    'Swipe on the SMS icon'
    device_Height = Mobile.getDeviceHeight()

    device_Width = Mobile.getDeviceWidth()

    int startX = device_Width / 12

    int endX = startX

    int startY = device_Height * 0.95

    int endY = device_Height * 0.1

    Mobile.swipe(startX, startY, endX, endY)

    '\'I\'ll call you later\' message'
    Mobile.verifyElementVisible(findTestObject('Phone App/Reject Call with SMS/android.widget.LinearLayout1'), 5)

    Mobile.tap(findTestObject('Phone App/Reject Call with SMS/android.widget.LinearLayout1'), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.pressHome()

    Mobile.comment('View the SMS in Messages and then Delete the thread')

    Mobile.tapAtPosition(360, 1845)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - New Spam protection'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.Button2 - OK'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Messages just got better'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - Use Messages without chat features'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Use Messages without chat features (1)'), 
            0)

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Use Messages without chat features (1)'), 
            0)
    }
    
    Mobile.verifyElementVisible(findTestObject('Phone App/Reject Call with SMS/android.widget.TextView1 - You Ill call you later.'), 
        0)

    Mobile.tap(findTestObject('Phone App/Reject Call with SMS/android.widget.TextView1 - You Ill call you later.'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Reject Call with SMS/android.widget.TextView4 - Auto O2 Fav'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Reject Call with SMS/android.widget.TextView1 - Ill call you later.'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Reject Call with SMS (SIM 1)', 'SIM 1 = O2-UK\nSIM 2 = EE', 
    TestLinkAPIResults.TEST_PASSED)

