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
    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView0 - Enter your phone number for the following SIM to finish setting up chat features'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView0 - Enter your phone number for the following SIM to finish setting up chat features'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView1 - SIM 1'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 
            0)

        Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 0)
    }
    
    'Messaging app Header'
    if (Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView0 - Messages'), 
        0, FailureHandling.OPTIONAL)) {
        'Messages header'
        Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView0 - Messages'), 
            3)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - New Spam protection'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.Button2 - OK'), 0)
    }
    
    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    'SMS message'
    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.FrameLayout4'), 3)

    'SMS message'
    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.FrameLayout4'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS Reply from IO Pro SIM 2/android.widget.TextView0 - (424) 416-9828'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.TextView1 - This is an automated test SMS (2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/SMS Reply from notifications/android.widget.TextView2 - This is an automated reply'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('Messages/SMS Reply from notifications/android.widget.TextView4 -   via O2 - UK'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS Reply from IO Pro SIM 2/android.widget.TextView0 -   via T-Mobile'), 
        0)
} else {
    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView0 - Enter your phone number for the following SIM to finish setting up chat features'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView0 - Enter your phone number for the following SIM to finish setting up chat features'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView1 - SIM 1'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 
            0)

        Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.Button0 - Cancel'), 0)
    }
    
    'Messaging app Header'
    if (Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView0 - Messages'), 
        0, FailureHandling.OPTIONAL)) {
        'Messages header'
        Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView0 - Messages'), 
            3)
    } else {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Search'), 3)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - New Spam protection'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.Button2 - OK'), 0)
    }
    
    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    'SMS message'
    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.FrameLayout4'), 0)

    'SMS message'
    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.FrameLayout4'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.TextView4 - 07985 363224'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.TextView1 - This is an automated test SMS (2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/SMS Reply from notifications/android.widget.TextView2 - This is an automated reply'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/SMS Reply from notifications/android.widget.TextView4 -   via O2 - UK'), 
        0)
}

Mobile.closeApplication()
