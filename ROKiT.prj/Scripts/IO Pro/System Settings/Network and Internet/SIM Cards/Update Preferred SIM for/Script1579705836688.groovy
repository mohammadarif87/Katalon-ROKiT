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

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 0)

Mobile.tap(findTestObject('Settings/Network and Internet/SIM Cards/android.widget.TextView9 - SIM cards'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/android.widget.TextView0 - SIM cards'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/android.widget.TextView2 - SIM slot 1'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/SIM Cards/Update Preferred SIM for/android.widget.TextView0 - T-Mobile - 14787777307'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/android.widget.Switch0 - ON'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/android.widget.TextView4 - SIM slot 2'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/SIM Cards/Update Preferred SIM for/android.widget.TextView0 - ATT - 14244169828'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/android.widget.Switch1 - ON'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView6 - Preferred SIM for'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView7 - Mobile data'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView0 - Select a SIM for data'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/SIM Cards/Update Preferred SIM for/android.widget.TextView0 - T-Mobile (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/SIM Cards/Update Preferred SIM for/android.widget.TextView0 - ATT'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/SIM Cards/Update Preferred SIM for/android.widget.TextView0 - T-Mobile (1)'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView9 - Calls'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView0 - Call with'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView1 - Ask every time'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/SIM Cards/Update Preferred SIM for/android.widget.TextView0 - T-Mobile (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/SIM Cards/Update Preferred SIM for/android.widget.TextView0 - ATT'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView1 - Ask every time'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView11 - SMS messages'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView0 - Select SIM card'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/SIM Cards/Update Preferred SIM for/android.widget.TextView0 - T-Mobile (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/SIM Cards/Update Preferred SIM for/android.widget.TextView0 - ATT'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView1 - Ask every time'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/SIM Cards/Update Preferred SIM for/android.widget.TextView0 - T-Mobile (1)'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/android.widget.TextView3 - O2 - UK'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/android.widget.Switch0 - ON'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/android.widget.TextView4 - SIM slot 2'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/android.widget.TextView5 - EE - 07985363224'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/android.widget.Switch1 - ON'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView6 - Preferred SIM for'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView7 - Mobile data'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView0 - Select a SIM for data'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView1 - O2 - UK'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView3 - EE'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView1 - O2 - UK'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView9 - Calls'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView0 - Call with'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView1 - Ask every time'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView3 - O2 - UK'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView5 - EE'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView1 - Ask every time'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView11 - SMS messages'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView0 - Select SIM card'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView1 - O2 - UK'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView3 - EE'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView1 - Ask every time'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/SIM Cards/Update Preferred SIM for/android.widget.TextView1 - O2 - UK'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Update preferred SIM for', '', TestLinkAPIResults.TEST_PASSED)

