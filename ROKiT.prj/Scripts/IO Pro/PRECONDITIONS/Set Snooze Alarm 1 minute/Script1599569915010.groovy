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

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView0 - ALARM'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView1 - CLOCK'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView2 - TIMER'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView3 - STOPWATCH'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Set Snooze Alarm 1 minute/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Preconditions/Set Snooze Alarm 1 minute/android.widget.ImageView0'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Set Snooze Alarm 1 minute/android.widget.TextView1 - Settings'), 
    0)

Mobile.tap(findTestObject('Preconditions/Set Snooze Alarm 1 minute/android.widget.TextView1 - Settings'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Set Snooze Alarm 1 minute/android.widget.TextView12 - Snooze length'), 
    0)

Mobile.tap(findTestObject('Preconditions/Set Snooze Alarm 1 minute/android.widget.TextView12 - Snooze length'), 0)

Mobile.swipe(512, 400, 512, 1800)

Mobile.tap(findTestObject('Preconditions/Set Snooze Alarm 1 minute/android.widget.CheckedTextView0 - 1 minute'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Set Snooze Alarm 1 minute/android.widget.TextView13 - 1 minute'), 
    0)

Mobile.pressBack()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

