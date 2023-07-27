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
    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView11 - Swipe'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView10 - Screen lock'), 0)

    'Header'
    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView0 - Choose screen lock'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView3 - Swipe'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView4 - Current screen lock'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView6 - PIN'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView6 - PIN'), 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView0 - Secure start-up'), 
        2)

    Mobile.tap(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.Button0 - NO'), 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView0 - Set screen lock'), 
        2)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView2 - PIN must be at least 4 digits'), 
        0)

    Mobile.setText(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.EditText0'), '1111', 0)

    Mobile.tap(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.Button0 - NEXT'), 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView0 - Re-enter your PIN'), 
        2)

    Mobile.setText(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.EditText0'), '1111', 0)

    Mobile.tap(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.Button1 - CONFIRM'), 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView0 - Notifications'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.RadioButton0 - Show all notification content'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.RadioButton1 - Hide sensitive content'), 
        0)

    userName = System.getProperty('user.name')

    if (userName == 'Aiden') {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.RadioButton0 - Dont show notifications at all'), 
            0)
    } else {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.RadioButton2 - Dont show notifications at all'), 
            0)
    }
    
    Mobile.tap(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.RadioButton0 - Show all notification content'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.Button0 - DONE'), 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView10 - Screen lock'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView11 - PIN'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView11 - PIN'), 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView0 - Re-enter your PIN'), 
        2)

    Mobile.setText(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.EditText0'), '1111', 0)

    'Enter on Keypad'
    Mobile.tapAtPosition(830, 1940)

    'Header'
    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView0 - Choose screen lock'), 
        2)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView6 - PIN'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView6 - Current screen lock'), 
        0)

    Mobile.closeApplication()
} else if (Mobile.verifyElementVisible(findTestObject('Preconditions/Set Lock Screen - PIN 1111/android.widget.TextView11 - PIN'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.closeApplication()
}

