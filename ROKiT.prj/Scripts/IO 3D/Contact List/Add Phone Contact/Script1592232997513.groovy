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
    'Contacts icon'
    Mobile.tapAtPosition(600, 230)

    if (Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView2 - ROKiT Automation'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView2 - ROKiT Automation'), 
            0)

        Mobile.closeApplication()
    } else {
        'Show Keypad button'
        Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 
            0)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView5 - 4'), 0)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView13 - 8'), 0)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

        Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.TextView0 - 3'), 0)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 0)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

        Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.EditText0 - (478) 777-7307'), 
            0)

        Mobile.pressBack()

        Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView26 - Create new contact'), 
            5)

        Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.TextView26 - Create new contact'), 0)

        if (Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView0 - Store the contact to'), 
            0, FailureHandling.OPTIONAL)) {
            Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView0 - Store the contact to'), 
                3)

            Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView1 - Phone contact'), 
                3)

            Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.TextView1 - Phone contact'), 0)
        }
        
        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView1 - Saving to'), 
            3)

        Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView2 - Phone contact'), 
            3)

        Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.EditText0 - First name'), 
            3, FailureHandling.STOP_ON_FAILURE)

        Mobile.setText(findTestObject('Contact List/Add Phone Contact/android.widget.EditText0 - First name'), 'ROKiT Automation', 
            0)

        Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.Button0 - SAVE'), 3)

        Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.Button0 - SAVE'), 0)

        Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView10 - ROKiT Automation'), 
            5)

        Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - (478) 777-7307'), 
            0)
    }
} else {
    'Contacts icon'
    Mobile.tapAtPosition(600, 230)

    for (def index : (0..10)) {
        if (Mobile.verifyElementNotVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView2 - ROKiT Automation'), 
            0, FailureHandling.OPTIONAL)) {
            Mobile.swipe(350, 1100, 350, 700)
        } else {
            break
        }
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView2 - ROKiT Automation'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView2 - ROKiT Automation'), 
            0)

        Mobile.closeApplication()
    } else {
        'Show Keypad button'
        Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.ImageButton0 (2)'), 0)

        Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.ImageButton0 (2)'), 0)

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        '0 on Dial pad'
        Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 
            0)

        'Tap at Position because sometimes the call button was being pressed instead of 0'
        Mobile.tapAtPosition(350, 1100)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView11 - 7'), 0)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView15 - 9'), 0)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView0 - 1'), 0)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView0 - 1'), 0)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView0 - 1'), 0)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView0 - 1'), 0)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView0 - 1'), 0)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView0 - 1'), 0)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView0 - 1'), 0)

        Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView0 - 1'), 0)

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
        
        Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView1 - Saving to'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView2 - Phone contact'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.EditText0 - First name'), 
            0, FailureHandling.STOP_ON_FAILURE)

        Mobile.setText(findTestObject('Contact List/Add Phone Contact/android.widget.EditText0 - First name'), 'ROKiT Automation', 
            0)

        Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.Button0 - SAVE'), 0)

        Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.Button0 - SAVE'), 0)

        Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView10 - ROKiT Automation'), 
            0)

        Mobile.closeApplication()
    }
}

