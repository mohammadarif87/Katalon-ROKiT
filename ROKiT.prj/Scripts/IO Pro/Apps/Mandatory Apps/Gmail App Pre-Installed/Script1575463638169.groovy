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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Remove Google Account'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.ImageView0'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.TextView0 - Welcome to Gmail'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.TextView1 - One app for all of your email'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.TextView2 - SKIP'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.ImageView1'), 3)

Mobile.tap(findTestObject('Apps/Gmail/android.widget.ImageView1'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.ImageView0 (1)'), 3)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.TextView0 - Gmail lets you get right to the good stuff by sorting out Promotional and Social emails.'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.TextView0 - Gmail lets you get straight to the good stuff by sorting out Promotional and Social emails.'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.TextView2 - SKIP'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.TextView2 - DONE'), 3)

Mobile.tap(findTestObject('Apps/Gmail/android.widget.TextView2 - DONE'), 0)

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.TextView0 - You can now add all your email addresses. Learnmore'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.TextView0 - You can now add all of your email addresses. Learnmore'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.TextView1 - Add an email address'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.TextView2 - TAKE ME TO GMAIL'), 0)

Mobile.tap(findTestObject('Apps/Gmail/android.widget.TextView1 - Add an email address'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.TextView0 - Set up email'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.TextView1 - Google'), 3)

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.TextView2 - Outlook Hotmail and Live US'), 3)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.TextView2 - Outlook Hotmail and Live'), 0)
}

Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.TextView3 - Yahoo'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.TextView4 - Exchange and Office 365'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Gmail/android.widget.TextView5 - Other'), 3)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Gmail App Pre-Installed', '', TestLinkAPIResults.TEST_PASSED)

