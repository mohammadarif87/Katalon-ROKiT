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
    'Show Keypad button'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    '4 on Dial pad'
    Mobile.tapAtPosition(210, 1260)

    not_run: Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView5 - 4'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView13 - 8'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

    Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.TextView0 - 3'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 0)

    Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.TextView0 - 5'), 0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.EditText0 - (478) 777-7305'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView26 - Create new contact'), 
        0)

    Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.TextView26 - Create new contact'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView0 - Create new contact (2)'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView0 - Create new contact (2)'), 
            0)

        Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.TextView0 - Create new contact (2)'), 0)

        not_run: Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.ImageView0'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView0 - Store the contact to'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView0 - Store the contact to'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView1 - Phone contact'), 
            0)

        Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.TextView1 - Phone contact'), 0)
    }
    
    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView1 - Saving to'), 0)

    Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.TextView1 - Saving to'), 0)

    Mobile.tap(findTestObject('Contact List/Add SIM 1 Contact/android.widget.TextView0 - ATT'), 0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add SIM 1 Contact/android.widget.TextView0 - ATT (1)'), 0)

    Mobile.setText(findTestObject('Contact List/Add SIM 1 Contact/android.widget.EditText0 - Name'), 'Automation SIM 2', 
        0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.Button0 - SAVE'), 3)

    Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.Button0 - SAVE'), 0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add SIM 2 Contact/android.widget.TextView9 - Automation SIM 2'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView0 - (478) 777-7305'), 
        0)
} else {
    'Show Keypad button'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    '0 on Dial pad'
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 0)

    'Tap at Position because sometimes the call button was being pressed instead of 0'
    Mobile.tapAtPosition(545, 1645)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView15 - 9'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView0 - 1'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView1 - 2'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView1 - 2'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView5 - 4'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView5 - 4'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView0 - 1'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView13 - 8'), 0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.EditText0 - 07912 244108'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView26 - Create new contact'), 
        0)

    Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.TextView26 - Create new contact'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView0 - Store the contact to'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView0 - Store the contact to'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView1 - Phone contact'), 
            0)

        Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.TextView1 - Phone contact'), 0)
    }
    
    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView1 - Saving to'), 0)

    Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.TextView1 - Saving to'), 0)

    Mobile.tap(findTestObject('Contact List/Add SIM 2 Contact/android.widget.TextView2 - EE'), 0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add SIM 2 Contact/android.widget.TextView2 - EE (1)'), 0)

    Mobile.setText(findTestObject('Contact List/Add SIM 1 Contact/android.widget.EditText0 - Name'), 'Automation SIM 2', 
        0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.Button0 - SAVE'), 0)

    Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.Button0 - SAVE'), 0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add SIM 2 Contact/android.widget.TextView9 - Automation SIM 2'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView2 - 07912 244108'), 
        0)
}

Mobile.comment('Delete the contact just added')

'3 dots in the top right'
Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.ImageButton0'), 0)

'3 dots in the top right'
Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.ImageButton0'), 0)

Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView1 - Delete'), 0)

Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.TextView1 - Delete'), 0)

Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView0 - Delete this contact'), 
    0)

Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.Button0 - CANCEL'), 0)

Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.Button1 - DELETE'), 0)

Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.Button1 - DELETE'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('SIM 2 Contact', '', TestLinkAPIResults.TEST_PASSED)

