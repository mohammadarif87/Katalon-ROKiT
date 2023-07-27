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
if (Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView0 - Messages'), 0, FailureHandling.OPTIONAL)) {
    'Messages header'
    Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView0 - Messages'), 3)
} else {
    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Search'), 3)
}

if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - New Spam protection'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.Button2 - OK'), 0)
}

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

'Message is present'
Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.FrameLayout4'), 0)

'Message is present'
Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.FrameLayout4'), 0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    if (Mobile.verifyElementVisible(findTestObject('Messages/Receive Audio MMS from IO Pro/android.widget.TextView0 - (478) 777-7307'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Messages/Receive Audio MMS from IO Pro/android.widget.TextView0 - (478) 777-7307'), 
            0)
    } else {
        Mobile.getText(findTestObject('Messages/Receive Audio MMS from IO Pro/android.widget.TextView0 - ROKiT Automation'), 
            0)
    }
    
    'Picture MMS displayed'
    Mobile.verifyElementVisible(findTestObject('Messages/Receive Picture MMS from IO Pro/android.widget.ImageView0'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive Picture MMS from IO Pro/android.widget.TextView0 -   via T-Mobile'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.TextView4 - 07912 244108'), 
        0)

    'Picture MMS displayed'
    Mobile.verifyElementVisible(findTestObject('Messages/Receive Picture MMS from IO Pro/android.widget.ImageView1'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive Picture MMS from IO Pro/android.widget.TextView2 -   via O2 - UK'), 
        0)
}

Mobile.closeApplication()

