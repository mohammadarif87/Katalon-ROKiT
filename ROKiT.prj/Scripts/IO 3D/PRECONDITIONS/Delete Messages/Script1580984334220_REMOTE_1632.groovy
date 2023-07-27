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

Mobile.comment('If Messages app fails to load with this test, it needs to be updated via Play Store')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

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

if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - New Spam protection'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.Button2 - OK'), 0)
}

'Messages header'
Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView0 - Messages'), 0)

'Search button'
Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView1'), 0)

'Three dots'
Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.ImageView0'), 0)

'Start chat button'
not_run: Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 
    0)

not_run: Mobile.delay(10)

while (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.FrameLayout4'), 0, FailureHandling.OPTIONAL)) {
    Mobile.comment('If there is a message then tap into it and delete it')

    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.FrameLayout4'), 0)

    Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

    '3 dots in the top right'
    Mobile.tapAtPosition(680, 100)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - Delete'), 0)

    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - Delete'), 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Delete this conversation'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView1 - This action cannot be undone.'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.Button1 - Delete'), 0)

    WebUI.delay(3)
}

not_run: while (Mobile.verifyElementVisible(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.FrameLayout0'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.comment('If there is a message then tap into it and delete it')

    not_run: Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.FrameLayout3'), 0)

    Mobile.tap(findTestObject('Preconditions/Send SMS to IO 3D SIM 1/android.widget.FrameLayout0'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    '3 dots in the top right'
    Mobile.tapAtPosition(680, 100)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - Delete'), 0)

    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - Delete'), 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Delete this conversation'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView1 - This action cannot be undone.'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.Button1 - Delete'), 0)

    WebUI.delay(3)
}

Mobile.closeApplication()

