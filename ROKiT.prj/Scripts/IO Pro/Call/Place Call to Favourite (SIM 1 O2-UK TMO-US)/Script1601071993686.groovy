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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

'Favourite contact is displaying'
Mobile.verifyElementVisible(findTestObject('Phone App/Place Call to Favourite (SIM 1 O2-UK)/android.widget.RelativeLayout0'), 
    0)

Mobile.verifyElementVisible(findTestObject('Phone App/Place Call to Favourite (SIM 1 O2-UK)/android.widget.TextView0 - Auto O2 Fav'), 
    0)

Mobile.tap(findTestObject('Phone App/Place Call to Favourite (SIM 1 O2-UK)/android.widget.TextView0 - Auto O2 Fav'), 0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Call/CS Fallback Outgoing Call (SIM 1 O2-UK)/android.widget.TextView0 - Choose SIM for this call'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Call/CS Fallback Outgoing Call (SIM 1 O2-UK)/android.widget.TextView0 - T-Mobile'), 
        3)

    Mobile.tap(findTestObject('Call/CS Fallback Outgoing Call (SIM 1 O2-UK)/android.widget.ImageView0'), 0)
} else {
    Mobile.verifyElementVisible(findTestObject('Phone App/Place Call to Favourite (SIM 1 O2-UK)/android.widget.TextView0 - Choose a SIM for this call'), 
        0)

    Mobile.tap(findTestObject('Phone App/Place Call to Favourite (SIM 1 O2-UK)/android.widget.TextView1 - O2 - UK'), 0)

    Mobile.tap(findTestObject('Phone App/Place Call to Favourite (SIM 1 O2-UK)/android.widget.TextView0 - Calling via O2 - UK'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Phone App/Place Call to Favourite (SIM 1 O2-UK)/android.widget.TextView1 - Auto O2 Fav'), 
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

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Place Call to Favourite (SIM 1)', 'SIM 1 = O2-UK\nSIM 2 = EE', 
    TestLinkAPIResults.TEST_PASSED)

