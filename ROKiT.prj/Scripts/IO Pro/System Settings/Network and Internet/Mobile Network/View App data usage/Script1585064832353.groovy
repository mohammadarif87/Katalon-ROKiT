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

Mobile.verifyElementVisible(findTestObject('Phone App/3G Fallback (SIM 1 O2-UK)/android.widget.TextView3 - Network  Internet'), 
    3)

Mobile.tap(findTestObject('Phone App/3G Fallback (SIM 1 O2-UK)/android.widget.TextView3 - Network  Internet'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Mobile Data (O2 - UK)/android.widget.TextView4 - Mobile network'), 
    3)

Mobile.tap(findTestObject('Preconditions/Turn on Mobile Data (O2 - UK)/android.widget.TextView4 - Mobile network'), 0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.tap(findTestObject('System Settings/Network and internet/Mobile Network/Add and Reset APN/android.widget.TextView0 - T-MOBILE'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View App data usage/android.widget.TextView7 - App data usage'), 
        3)

    Mobile.tap(findTestObject('Settings/Network and Internet/Mobile Network/View App data usage/android.widget.TextView7 - App data usage'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View App data usage/android.widget.TextView4 - 2.0 GBwarning'), 
        3)

    'Graph'
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View App data usage/android.view.View0'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Mobile Network/View App data usage/android.widget.TextView0 - Carrier data accounting may differ from device accounting'), 
        3)
} else {
    Mobile.tap(findTestObject('Preconditions/Turn on Mobile Data (O2 - UK)/android.widget.TextView1 - O2 - UK'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View App data usage/android.widget.TextView7 - App data usage'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Mobile Network/View App data usage/android.widget.TextView7 - App data usage'), 
        0)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View App data usage/android.widget.TextView4 - 2.0 GBwarning'), 
        10)

    'Graph'
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View App data usage/android.view.View0'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Mobile Network/View App data usage/android.widget.TextView7 - Operator data accounting may differ from device accounting'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('View App data usage', '', TestLinkAPIResults.TEST_PASSED)

