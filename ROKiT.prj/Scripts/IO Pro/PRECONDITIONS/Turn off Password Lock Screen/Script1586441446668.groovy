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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Phone App/3G Fallback (SIM 1 O2-UK)/android.widget.TextView3 - Network  Internet'), 
    0)

Mobile.swipe(512, 1000, 512, 200)

Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView8 - Security  location'), 
    0)

Mobile.tap(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView8 - Security  location'), 0)

'Header'
Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView0 - Security  location'), 
    0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView10 - Screen lock'), 
    0)

if (Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView11 - Swipe'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.closeApplication()
} else if (Mobile.verifyElementNotVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView11 - Swipe'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView10 - Screen lock'), 0)

    Mobile.setText(findTestObject('Preconditions/Turn off Password Lock Screen/android.widget.EditText0'), 'test', 0)

    'Enter on Keypad'
    Mobile.tapAtPosition(990, 1930)

    'Header'
    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView0 - Choose screen lock'), 
        2)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView3 - Swipe'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView3 - Swipe'), 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn off Password Lock Screen/android.widget.TextView0 - Remove device protection'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn off Password Lock Screen/android.widget.TextView0 - Device protection features will not work without your password.'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn off Password Lock Screen/android.widget.Button0 - YES REMOVE'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Turn off Password Lock Screen/android.widget.Button0 - YES REMOVE'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Notifications - On Lock Screen/android.widget.TextView11 - Swipe'), 
        0)
}

