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
    3)

Mobile.tap(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.TextView0 - Digital Wellbeing  parental controls'), 
    3)

if (Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/Manage Notifications/android.widget.Button0 - Show your data'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/Manage Notifications/android.widget.Button0 - Show your data'), 
        0)

    Mobile.tap(findTestObject('System Settings/Digital Wellbeing/Manage Notifications/android.widget.Button0 - Show your data'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.view.ViewGroup0'), 
    3)

'Pie chart showing time spent on apps'
Mobile.tap(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.view.ViewGroup0'), 3)

Mobile.pressBack()

if (Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.TextView0 - Unlock'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.TextView0 - Unlock'), 
        3)
}

if (Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.TextView5 - Unlocks'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.TextView5 - Unlocks'), 
        3)
}

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.TextView0 - Settings (1)'), 
    5)

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.TextView0 - Notifications'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.TextView0 - Ways to disconnect'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.TextView0 - Dashboard'), 
    3)

Mobile.swipe(550, 1700, 550, 400)

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.TextView3 - Bedtime mode'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.TextView0 - Focus mode'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.TextView0 - Reduce interruptions'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.TextView0 - Manage notifications'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.TextView0 - Do Not Disturb'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.Switch0 - Show icon in the app list OFF'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/Digital Wellbeing/View Digital Wellbeing/android.widget.TextView0 - Parental controls'), 
    3)

Mobile.pressHome()

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('View Digital Wellbeing', '', TestLinkAPIResults.TEST_PASSED)

