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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
        3)

    Mobile.scrollToText('Accounts', FailureHandling.STOP_ON_FAILURE)

    //    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView2 - Accounts for Owner'), 0)
    //    not_run: Mobile.verifyElementVisible(findTestObject('System Settings/Account/android.widget.TextView0 - Accounts for Rokit'), 0)
    //    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView7 - Accounts'), 0)
    //    Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.widget.TextView7 - Accounts'), 0)
    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView0 - Accounts'), 3)

    Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.widget.TextView0 - Accounts'), 3)

    if (Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView2 - Accounts for Owner'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView2 - Accounts for Owner'), 
            3)
    } else {
        Mobile.verifyElementVisible(findTestObject('System Settings/Account/Remove Account/android.widget.TextView0 - Accounts for Rokit'), 
            3)
    }
    
    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView3 - Add account'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView4 - Automatically sync data'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView5 - Let apps refresh data automatically'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.Switch0 - ON'), 3)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Add Google Account - US/android.widget.TextView0 - rokitphones715gmail.com'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView4 - Google'), 3)

    Mobile.tap(findTestObject('System Settings/Account/android.widget.TextView0 - rokitphones715gmail.com'), 3)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView0 - Google'), 3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Account/android.widget.TextView0 - rokitphones715gmail.com (1)'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView3 - Google Account'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Account/android.widget.TextView0 - Info security  personalization'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.Button0 - REMOVE ACCOUNT'), 
        3)

    Mobile.tap(findTestObject('Settings/Accounts/View Account/android.widget.TextView3 - Google Account'), 3)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.Button0 - Get started'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/Account/android.widget.TextView0 - Welcome Rokit'), 
            3)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.Button0 - Get started'), 
            3)

        Mobile.tap(findTestObject('Settings/Accounts/View Account/android.widget.Button0 - Get started'), 3)
    }
    
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('System Settings/Account/android.widget.TextView0 - Rokit Phones'), 3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Account/android.widget.TextView0 - rokitphones715gmail.com (2)'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView10 - Account'), 3)

    Mobile.tap(findTestObject('Settings/Accounts/View Account/android.widget.TextView10 - Account'), 3)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView12 - Search'), 3)

    Mobile.tap(findTestObject('Settings/Accounts/View Account/android.widget.TextView12 - Search'), 3)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView13 - Help'), 3)

    Mobile.tap(findTestObject('Settings/Accounts/View Account/android.widget.TextView13 - Help'), 3)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView6 - Menu'), 3)

    Mobile.tap(findTestObject('Settings/Accounts/View Account/android.widget.TextView6 - Menu'), 3)

    Mobile.pressHome()
} else {
    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
        0)

    Mobile.scrollToText('Accounts', FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView7 - Accounts'), 0)

    Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.widget.TextView7 - Accounts'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView0 - Accounts'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView2 - Accounts for Owner'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView3 - Add account'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView4 - Automatically sync data'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView5 - Let apps refresh data automatically'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.Switch0 - ON'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView3 - rokittest1gmail.com'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView4 - Google'), 0)

    Mobile.tap(findTestObject('Settings/Accounts/View Account/android.widget.TextView3 - rokittest1gmail.com'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView0 - Google'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView2 - rokittest1gmail.com'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView3 - Google Account'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView4 - Info security and personalisation'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.Button0 - REMOVE ACCOUNT'), 
        0)

    Mobile.tap(findTestObject('Settings/Accounts/View Account/android.widget.TextView3 - Google Account'), 0)

    Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.Button0 - Get started'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView0 - Welcome ROKiT'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.Button0 - Get started'), 
            0)

        Mobile.tap(findTestObject('Settings/Accounts/View Account/android.widget.Button0 - Get started'), 0)
    }
    
    Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView0 - ROKiT Test'), 
        10)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView1 - rokittest1gmail.com'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView10 - Account'), 0)

    Mobile.tap(findTestObject('Settings/Accounts/View Account/android.widget.TextView10 - Account'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView12 - Search'), 0)

    Mobile.tap(findTestObject('Settings/Accounts/View Account/android.widget.TextView12 - Search'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView13 - Help'), 0)

    Mobile.tap(findTestObject('Settings/Accounts/View Account/android.widget.TextView13 - Help'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/View Account/android.widget.TextView6 - Menu'), 0)

    Mobile.tap(findTestObject('Settings/Accounts/View Account/android.widget.TextView6 - Menu'), 0)

    not_run: WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Remove Google Account'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('View Account', '', TestLinkAPIResults.TEST_PASSED)

