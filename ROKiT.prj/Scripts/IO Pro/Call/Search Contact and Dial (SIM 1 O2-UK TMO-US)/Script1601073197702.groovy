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
import testlink.api.java.client.TestLinkAPIResults as TestLinkAPIResults
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Phone App/Search Contact and Dial (SIM 2 EE)/android.widget.TextView2 - Search contacts'), 
    0)

Mobile.tap(findTestObject('Phone App/Search Contact and Dial (SIM 2 EE)/android.widget.TextView2 - Search contacts'), 0)

Mobile.setText(findTestObject('Phone App/Search Contact and Dial (SIM 2 EE)/android.widget.EditText0 - Search contacts'), 
    'auto o2', 0)

Mobile.verifyElementVisible(findTestObject('Phone App/Search Contact and Dial (SIM 1 O2-UK)/android.widget.TextView1 - Auto O2 Fav'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Call/Search Contact and Dial (SIM 1 O2-UK TMO-US)/android.widget.TextView0 - (747) 344-7370'), 
        3)

    'Tap Auto O2 Fav contact that is displayed'
    Mobile.tap(findTestObject('Phone App/Search Contact and Dial (SIM 2 EE)/android.view.ViewGroup2'), 0)

    Mobile.verifyElementVisible(findTestObject('Call/Search Contact and Dial (SIM 1 O2-UK TMO-US)/android.widget.TextView0 - Choose SIM for this call'), 
        3)

    Mobile.tap(findTestObject('Call/Search Contact and Dial (SIM 1 O2-UK TMO-US)/android.widget.TextView0 - T-Mobile'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Call/Search Contact and Dial (SIM 1 O2-UK TMO-US)/android.widget.TextView0 - Calling via T-Mobile'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Phone App/Search Contact and Dial (SIM 1 O2-UK)/android.widget.TextView3 - 07515 064104'), 
        0)

    'Tap Auto O2 Fav contact that is displayed'
    Mobile.tap(findTestObject('Phone App/Search Contact and Dial (SIM 2 EE)/android.view.ViewGroup2'), 0)

    Mobile.verifyElementVisible(findTestObject('Phone App/Search Contact and Dial (SIM 2 EE)/android.widget.TextView0 - Choose a SIM for this call'), 
        0)

    'SIM 1 O2'
    Mobile.tap(findTestObject('Phone App/Search Contact and Dial (SIM 1 O2-UK)/android.widget.TextView1 - O2 - UK'), 0)

    Mobile.verifyElementVisible(findTestObject('Phone App/Search Contact and Dial (SIM 1 O2-UK)/android.widget.TextView0 - Calling via O2 - UK'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Phone App/Search Contact and Dial (SIM 1 O2-UK)/android.widget.TextView1 - Auto O2 Fav (1)'), 
    0)

'Mute'
Mobile.verifyElementVisible(findTestObject('Phone App/Search Contact and Dial (SIM 2 EE)/android.widget.LinearLayout4'), 
    0)

'Keypad'
Mobile.verifyElementVisible(findTestObject('Phone App/Search Contact and Dial (SIM 2 EE)/android.widget.LinearLayout5'), 
    0)

'Speaker'
Mobile.verifyElementVisible(findTestObject('Phone App/Search Contact and Dial (SIM 2 EE)/android.widget.LinearLayout6 (1)'), 
    0)

'Add call'
Mobile.verifyElementVisible(findTestObject('Phone App/Search Contact and Dial (SIM 2 EE)/android.widget.LinearLayout7'), 
    0)

'Change SIM'
Mobile.verifyElementVisible(findTestObject('Phone App/Search Contact and Dial (SIM 2 EE)/android.widget.LinearLayout8'), 
    0)

'End Call'
Mobile.verifyElementVisible(findTestObject('Phone App/Search Contact and Dial (SIM 2 EE)/android.widget.ImageButton0'), 
    0)

'End Call'
Mobile.tap(findTestObject('Phone App/Search Contact and Dial (SIM 2 EE)/android.widget.ImageButton0'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Search Contact and Dial', 'SIM 1 = O2-UK\nSIM 2 = EE', 
    TestLinkAPIResults.TEST_PASSED)

