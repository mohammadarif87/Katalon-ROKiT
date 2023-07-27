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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.scrollToText('Google')

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google'), 
        3)

    Mobile.tap(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google'), 3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Data management/android.widget.TextView0 - Rokit Phones'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Data management/android.widget.TextView0 - rokitphones715gmail.com'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google (1)'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.Button0 - Manage your Google Account'), 
        3)

    Mobile.swipe(550, 1700, 550, 900)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Ads'), 
        4)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Backup'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Chromebook'), 
        3)

    Mobile.swipe(550, 1700, 550, 400)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Data management/android.widget.TextView0 - Data  messaging'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Device connections'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - On-device sharing'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Parental controls'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Security (1)'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Set up  restore'), 
        3)

    Mobile.tap(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Set up  restore'), 3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Restore contacts'), 
        3)

    Mobile.tap(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Restore contacts'), 3)

    Mobile.tap(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Restore contacts (1)'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - From account'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - rokitphones715gmail.com'), 
        3)

    Mobile.tap(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - rokitphones715gmail.com'), 
        3)

    not_run: Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Choose account'), 
        5)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Rokit Phones'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - rokitphones715gmail.com (1)'), 
        3)

    Mobile.tap(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Rokit Phones'), 3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Google Contacts'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Your Google contacts automatically sync to your devices (1)'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Device backup'), 
        3)

    not_run: Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Rokit - IO 3D'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Rokit - IO Pro'), 
        3)
} else {
    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.scrollToText('Google')

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google'), 
        0)

    Mobile.tap(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - ROKiT Test'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - rokittest1gmail.com'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.Button0 - Manage your Google Account'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Ads'), 
        0)

    Mobile.swipe(550, 1700, 550, 400)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Backup'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Chromebook'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Data and messaging'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Device connections'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - On-device sharing'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Parental controls'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Security (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Set up and restore'), 
        0)

    Mobile.tap(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Set up and restore'), 
        0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Restore contacts'), 
        0)

    Mobile.tap(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Restore contacts'), 0)

    if (Mobile.verifyElementNotVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - From account'), 
        10, FailureHandling.OPTIONAL)) {
        Mobile.swipe(512, 350, 512, 1200)

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Restore contacts'), 
            0)

        Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)
    }
    
    'Header'
    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Restore contacts (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - From account'), 
        10)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - rokittest1gmail.com'), 
        0)

    Mobile.tap(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - rokittest1gmail.com'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Choose account'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView1 - ROKiT Test'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView2 - rokittest1gmail.com'), 
        0)

    Mobile.tap(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView1 - ROKiT Test'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Google Contacts'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Your Google Contacts automatically sync to your devices'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Device backup'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Rokit - IO 3D'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Restore Contacts/android.widget.TextView0 - Rokit - IO Pro'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Restore Contacts', '', TestLinkAPIResults.TEST_PASSED)

