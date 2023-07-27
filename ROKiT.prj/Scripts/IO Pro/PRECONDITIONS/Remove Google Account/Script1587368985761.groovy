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

Mobile.scrollToText('Accounts', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView7 - Accounts'), 0)

Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.widget.TextView7 - Accounts'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView0 - Accounts'), 0)

if (Mobile.verifyElementVisible(findTestObject('Preconditions/Remove Google Account/android.widget.TextView0 - Accounts for Rokit'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Preconditions/Remove Google Account/android.widget.TextView0 - Accounts for Rokit'), 
        0)
}

if (Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView2 - Accounts for Owner'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView2 - Accounts for Owner'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView3 - Add account'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView4 - Automatically sync data'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView5 - Let apps refresh data automatically'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.Switch0 - ON'), 0)

if (Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView4 - Google'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.widget.TextView4 - Google'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Remove Account/android.widget.TextView3 - Google Account'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Remove Account/android.widget.Button0 - REMOVE ACCOUNT'), 
        0)

    Mobile.tap(findTestObject('Settings/Accounts/Remove Account/android.widget.Button0 - REMOVE ACCOUNT'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Remove Account/android.widget.TextView0 - Remove account'), 
        0)

    userName = System.getProperty('user.name')

    if (userName == 'Aiden') {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Remove Google Account/android.widget.TextView0 - Removing this account will delete all of its messages contacts and other data from the phone'), 
            0)
    } else {
        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Remove Account/android.widget.TextView1 - Removing this account will delete all of its messages contacts and other data from the phone'), 
            0)
    }
    
    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Remove Account/android.widget.Button0 - CANCEL'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Remove Account/android.widget.Button1 - REMOVE ACCOUNT'), 
        0)

    Mobile.tap(findTestObject('Settings/Accounts/Remove Account/android.widget.Button1 - REMOVE ACCOUNT'), 0)

    Mobile.closeApplication()
} else {
    Mobile.closeApplication()
}

