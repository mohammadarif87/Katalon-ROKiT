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

Mobile.swipe(550, 1700, 550, 400)

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.TextView0 - Digital Wellbeing  parental controls'), 
    0)

Mobile.tap(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.TextView0 - Digital Wellbeing  parental controls'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(550, 1700, 550, 400)

if (Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/Manage Notifications/android.widget.Button0 - Show your data'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/Manage Notifications/android.widget.Button0 - Show your data'), 
        0)

    Mobile.tap(findTestObject('System Settings/Digital Wellbeing/Manage Notifications/android.widget.Button0 - Show your data'), 
        0)
}

Mobile.scrollToText('Manage notifications', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/Manage Notifications/android.widget.TextView0 - Manage notifications'), 
    0)

Mobile.tap(findTestObject('System Settings/Digital Wellbeing/Manage Notifications/android.widget.TextView0 - Manage notifications'), 
    0)

while (Mobile.verifyElementNotVisible(findTestObject('System Settings/Digital Wellbeing/Manage Notifications/android.widget.TextView0 - Google Play Store'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.swipe(512, 1700, 512, 1500)
}

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/Manage Notifications/android.widget.TextView0 - Google Play Store'), 
    0)

Mobile.tapAtPosition(1030, 155)

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/Manage Notifications/android.widget.TextView0 - Show system'), 
    0)

Mobile.tap(findTestObject('System Settings/Digital Wellbeing/Manage Notifications/android.widget.TextView0 - Show system'), 
    0)

while (Mobile.verifyElementNotVisible(findTestObject('System Settings/Digital Wellbeing/Manage Notifications/android.widget.TextView0 - SimProcessor'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.swipe(512, 1700, 512, 1200)
}

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/Manage Notifications/android.widget.TextView0 - SimProcessor'), 
    0)

Mobile.pressHome()

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Manage Notifications', '', TestLinkAPIResults.TEST_PASSED)

