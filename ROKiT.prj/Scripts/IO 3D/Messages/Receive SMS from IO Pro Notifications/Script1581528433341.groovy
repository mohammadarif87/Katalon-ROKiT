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

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

'SMS message'
Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.FrameLayout4'), 0)

'SMS message'
Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.FrameLayout4'), 0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    not_run: Mobile.verifyElementVisible(findTestObject('Messages/SMS Reply from notifications/android.widget.TextView0 - Auto O2 Fav'), 
        5)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.TextView1 - This is an automated test SMS (2)'), 
        5)

    Mobile.verifyElementVisible(findTestObject('Messages/SMS Reply from notifications/android.widget.TextView2 - This is an automated reply'), 
        5)

    Mobile.verifyElementVisible(findTestObject('Messages/SMS Reply from notifications/android.widget.TextView0 -   via T-Mobile'), 
        5)
} else {
    Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.TextView4 - 07912 244108'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.TextView1 - This is an automated test SMS (2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/SMS Reply from notifications/android.widget.TextView2 - This is an automated reply'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/SMS Reply from notifications/android.widget.TextView4 -   via O2 - UK'), 
        0)
}

Mobile.closeApplication()

