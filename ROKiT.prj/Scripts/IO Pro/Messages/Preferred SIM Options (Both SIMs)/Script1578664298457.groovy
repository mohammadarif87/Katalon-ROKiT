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

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 0)

Mobile.verifyElementVisible(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView9 - SIM cards'), 
    0)

Mobile.tap(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView9 - SIM cards'), 0)

Mobile.verifyElementVisible(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView11 - SMS messages'), 
    0)

Mobile.tap(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView11 - SMS messages'), 0)

Mobile.verifyElementVisible(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView0 - Select SIM card'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    'SIM 1 Icon'
    Mobile.verifyElementVisible(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.ImageView0 (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView0 - T-Mobile'), 
        0)

    'SIM 2 Icon'
    Mobile.verifyElementVisible(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.ImageView0 (2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView0 - ATT'), 
        0)

    Mobile.tap(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView0 - ATT'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView0 - ATT (1)'), 
        0)

    Mobile.tap(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView0 - ATT (1)'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView0 - T-Mobile'), 
        0)

    Mobile.tap(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView0 - T-Mobile'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView0 - T-Mobile (1)'), 
        0)
} else {
    'SIM 1 Icon'
    Mobile.verifyElementVisible(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.ImageView0'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView1 - O2 - UK'), 
        0)

    'SIM 2 Icon'
    Mobile.verifyElementVisible(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.ImageView1'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView3 - EE'), 
        0)

    Mobile.tap(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView3 - EE'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView12 - EE'), 
        0)

    Mobile.tap(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView12 - EE'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView1 - O2 - UK'), 
        0)

    Mobile.tap(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView1 - O2 - UK'), 0)

    Mobile.verifyElementVisible(findTestObject('Messages/Preferred SIM Options (Both SIMs)/android.widget.TextView12 - O2 - UK'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Preffered SIM Options (Both SIMs)', '', 
    TestLinkAPIResults.TEST_PASSED)

